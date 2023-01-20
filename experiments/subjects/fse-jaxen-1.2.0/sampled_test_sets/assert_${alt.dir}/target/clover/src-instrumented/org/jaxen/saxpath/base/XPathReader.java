/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ *//*
 * $Header$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Copyright 2000-2002 bob mcwhirter & James Strachan.
 * All rights reserved.
 *
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   * Neither the name of the Jaxen Project nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * ====================================================================
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Jaxen Project and was originally
 * created by bob mcwhirter <bob@werken.com> and
 * James Strachan <jstrachan@apache.org>.  For more information on the
 * Jaxen Project, please see <http://www.jaxen.org/>.
 *
 * $Id$
 */


package org.jaxen.saxpath.base;

import org.jaxen.saxpath.*;
import org.jaxen.saxpath.helpers.DefaultXPathHandler;

import java.util.ArrayList;

/**
 * Implementation of SAXPath's <code>XPathReader</code> which
 * generates callbacks to an <code>XPathHandler</code>.
 *
 * @author bob mcwhirter (bob@werken.com)
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class XPathReader implements org.jaxen.saxpath.XPathReader {public static class __CLR4_0_6672672l1l0dwc6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,8594,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static XPathHandler defaultHandler = new DefaultXPathHandler();
    private ArrayList tokens;
    private XPathLexer lexer;
    private XPathHandler handler;

    /**
     * Create a new <code>XPathReader</code> with a do-nothing
     * <code>XPathHandler</code>.
     */
    public XPathReader() {try{__CLR4_0_6672672l1l0dwc6.R.inc(8030);
        __CLR4_0_6672672l1l0dwc6.R.inc(8031);setXPathHandler(defaultHandler);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    public XPathHandler getXPathHandler() {try{__CLR4_0_6672672l1l0dwc6.R.inc(8032);
        __CLR4_0_6672672l1l0dwc6.R.inc(8033);return this.handler;
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    public void setXPathHandler(XPathHandler handler) {try{__CLR4_0_6672672l1l0dwc6.R.inc(8034);
        __CLR4_0_6672672l1l0dwc6.R.inc(8035);this.handler = handler;
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    public void parse(String xpath) throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8036);
        __CLR4_0_6672672l1l0dwc6.R.inc(8037);setUpParse(xpath);

        __CLR4_0_6672672l1l0dwc6.R.inc(8038);getXPathHandler().startXPath();

        __CLR4_0_6672672l1l0dwc6.R.inc(8039);expr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8040);getXPathHandler().endXPath();

        __CLR4_0_6672672l1l0dwc6.R.inc(8041);if ((((LA(1) != TokenTypes.EOF)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8042)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8043)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8044);XPathSyntaxException ex = createSyntaxException("Unexpected '" + LT(1).getTokenText() + "'");
            __CLR4_0_6672672l1l0dwc6.R.inc(8045);throw ex;
        }

        }__CLR4_0_6672672l1l0dwc6.R.inc(8046);lexer = null;
        __CLR4_0_6672672l1l0dwc6.R.inc(8047);tokens = null;
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    void setUpParse(String xpath) {try{__CLR4_0_6672672l1l0dwc6.R.inc(8048);
        __CLR4_0_6672672l1l0dwc6.R.inc(8049);this.tokens = new ArrayList();
        __CLR4_0_6672672l1l0dwc6.R.inc(8050);this.lexer = new XPathLexer(xpath);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void pathExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8051);
        __CLR4_0_6672672l1l0dwc6.R.inc(8052);getXPathHandler().startPathExpr();

        boolean __CLB4_0_6_bool0=false;__CLR4_0_6672672l1l0dwc6.R.inc(8053);switch (LA(1)) {
            case TokenTypes.DOUBLE:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8054);__CLB4_0_6_bool0=true;}
            case TokenTypes.LITERAL:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8055);__CLB4_0_6_bool0=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8056);filterExpr();

                __CLR4_0_6672672l1l0dwc6.R.inc(8057);if ((((LA(1) == TokenTypes.SLASH || LA(1) == TokenTypes.DOUBLE_SLASH)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8058)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8059)==0&false))) {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8060);XPathSyntaxException ex = createSyntaxException("Node-set expected");
                    __CLR4_0_6672672l1l0dwc6.R.inc(8061);throw ex;
                }

                }__CLR4_0_6672672l1l0dwc6.R.inc(8062);break;
            }
            case TokenTypes.LEFT_PAREN:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8063);__CLB4_0_6_bool0=true;}
            case TokenTypes.DOLLAR:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8064);__CLB4_0_6_bool0=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8065);filterExpr();

                __CLR4_0_6672672l1l0dwc6.R.inc(8066);if ((((LA(1) == TokenTypes.SLASH || LA(1) == TokenTypes.DOUBLE_SLASH)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8067)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8068)==0&false))) {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8069);locationPath(false);
                }
                }__CLR4_0_6672672l1l0dwc6.R.inc(8070);break;
            }
            case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8071);__CLB4_0_6_bool0=true;} {

                __CLR4_0_6672672l1l0dwc6.R.inc(8072);if (((((LA(2) == TokenTypes.LEFT_PAREN
                        &&
                        !isNodeTypeName(LT(1)))
                        ||
                        (LA(2) == TokenTypes.COLON
                                &&
                                LA(4) == TokenTypes.LEFT_PAREN))&&(__CLR4_0_6672672l1l0dwc6.R.iget(8073)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8074)==0&false))) {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8075);filterExpr();

                    __CLR4_0_6672672l1l0dwc6.R.inc(8076);if ((((LA(1) == TokenTypes.SLASH || LA(1) == TokenTypes.DOUBLE_SLASH)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8077)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8078)==0&false))) {{
                        __CLR4_0_6672672l1l0dwc6.R.inc(8079);locationPath(false);
                    }
                }} }else {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8080);locationPath(false);
                }
                }__CLR4_0_6672672l1l0dwc6.R.inc(8081);break;
            }
            case TokenTypes.DOT:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8082);__CLB4_0_6_bool0=true;}
            case TokenTypes.DOT_DOT:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8083);__CLB4_0_6_bool0=true;}
            case TokenTypes.STAR:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8084);__CLB4_0_6_bool0=true;}
            case TokenTypes.AT:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8085);__CLB4_0_6_bool0=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8086);locationPath(false);
                __CLR4_0_6672672l1l0dwc6.R.inc(8087);break;
            }
            case TokenTypes.SLASH:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8088);__CLB4_0_6_bool0=true;}
            case TokenTypes.DOUBLE_SLASH:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8089);__CLB4_0_6_bool0=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8090);locationPath(true);
                __CLR4_0_6672672l1l0dwc6.R.inc(8091);break;
            }
            default:if (!__CLB4_0_6_bool0) {__CLR4_0_6672672l1l0dwc6.R.inc(8092);__CLB4_0_6_bool0=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8093);XPathSyntaxException ex = createSyntaxException("Unexpected '" + LT(1).getTokenText() + "'");
                __CLR4_0_6672672l1l0dwc6.R.inc(8094);throw ex;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8095);getXPathHandler().endPathExpr();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void literal() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8096);
        __CLR4_0_6672672l1l0dwc6.R.inc(8097);Token token = match(TokenTypes.LITERAL);

        __CLR4_0_6672672l1l0dwc6.R.inc(8098);getXPathHandler().literal(token.getTokenText());
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void functionCall() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8099);
        __CLR4_0_6672672l1l0dwc6.R.inc(8100);String prefix = null;
        __CLR4_0_6672672l1l0dwc6.R.inc(8101);String functionName = null;

        __CLR4_0_6672672l1l0dwc6.R.inc(8102);if ((((LA(2) == TokenTypes.COLON)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8103)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8104)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8105);prefix = match(TokenTypes.IDENTIFIER).getTokenText();
            __CLR4_0_6672672l1l0dwc6.R.inc(8106);match(TokenTypes.COLON);
        } }else {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8107);prefix = "";
        }

        }__CLR4_0_6672672l1l0dwc6.R.inc(8108);functionName = match(TokenTypes.IDENTIFIER).getTokenText();

        __CLR4_0_6672672l1l0dwc6.R.inc(8109);getXPathHandler().startFunction(prefix,
                functionName);

        __CLR4_0_6672672l1l0dwc6.R.inc(8110);match(TokenTypes.LEFT_PAREN);

        __CLR4_0_6672672l1l0dwc6.R.inc(8111);arguments();

        __CLR4_0_6672672l1l0dwc6.R.inc(8112);match(TokenTypes.RIGHT_PAREN);

        __CLR4_0_6672672l1l0dwc6.R.inc(8113);getXPathHandler().endFunction();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void arguments() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8114);
        __CLR4_0_6672672l1l0dwc6.R.inc(8115);while ((((LA(1) != TokenTypes.RIGHT_PAREN)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8116)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8117)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8118);expr();

            __CLR4_0_6672672l1l0dwc6.R.inc(8119);if ((((LA(1) == TokenTypes.COMMA)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8120)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8121)==0&false))) {{
                __CLR4_0_6672672l1l0dwc6.R.inc(8122);match(TokenTypes.COMMA);
            } }else {{
                __CLR4_0_6672672l1l0dwc6.R.inc(8123);break;
            }
        }}
    }}finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void filterExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8124);

        __CLR4_0_6672672l1l0dwc6.R.inc(8125);getXPathHandler().startFilterExpr();

        boolean __CLB4_0_6_bool1=false;__CLR4_0_6672672l1l0dwc6.R.inc(8126);switch (LA(1)) {
            case TokenTypes.DOUBLE:if (!__CLB4_0_6_bool1) {__CLR4_0_6672672l1l0dwc6.R.inc(8127);__CLB4_0_6_bool1=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8128);Token token = match(TokenTypes.DOUBLE);

                __CLR4_0_6672672l1l0dwc6.R.inc(8129);getXPathHandler().number(Double.parseDouble(token.getTokenText()));
                __CLR4_0_6672672l1l0dwc6.R.inc(8130);break;
            }
            case TokenTypes.LITERAL:if (!__CLB4_0_6_bool1) {__CLR4_0_6672672l1l0dwc6.R.inc(8131);__CLB4_0_6_bool1=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8132);literal();
                __CLR4_0_6672672l1l0dwc6.R.inc(8133);break;
            }
            case TokenTypes.LEFT_PAREN:if (!__CLB4_0_6_bool1) {__CLR4_0_6672672l1l0dwc6.R.inc(8134);__CLB4_0_6_bool1=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8135);match(TokenTypes.LEFT_PAREN);
                __CLR4_0_6672672l1l0dwc6.R.inc(8136);expr();
                __CLR4_0_6672672l1l0dwc6.R.inc(8137);match(TokenTypes.RIGHT_PAREN);
                __CLR4_0_6672672l1l0dwc6.R.inc(8138);break;
            }
            case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool1) {__CLR4_0_6672672l1l0dwc6.R.inc(8139);__CLB4_0_6_bool1=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8140);functionCall();
                __CLR4_0_6672672l1l0dwc6.R.inc(8141);break;
            }
            case TokenTypes.DOLLAR:if (!__CLB4_0_6_bool1) {__CLR4_0_6672672l1l0dwc6.R.inc(8142);__CLB4_0_6_bool1=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8143);variableReference();
                __CLR4_0_6672672l1l0dwc6.R.inc(8144);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8145);predicates();

        __CLR4_0_6672672l1l0dwc6.R.inc(8146);getXPathHandler().endFilterExpr();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void variableReference() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8147);
        __CLR4_0_6672672l1l0dwc6.R.inc(8148);match(TokenTypes.DOLLAR);

        __CLR4_0_6672672l1l0dwc6.R.inc(8149);String prefix = null;
        __CLR4_0_6672672l1l0dwc6.R.inc(8150);String variableName = null;

        __CLR4_0_6672672l1l0dwc6.R.inc(8151);if ((((LA(2) == TokenTypes.COLON)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8152)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8153)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8154);prefix = match(TokenTypes.IDENTIFIER).getTokenText();
            __CLR4_0_6672672l1l0dwc6.R.inc(8155);match(TokenTypes.COLON);
        } }else {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8156);prefix = "";
        }

        }__CLR4_0_6672672l1l0dwc6.R.inc(8157);variableName = match(TokenTypes.IDENTIFIER).getTokenText();

        __CLR4_0_6672672l1l0dwc6.R.inc(8158);getXPathHandler().variableReference(prefix,
                variableName);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    void locationPath(boolean isAbsolute) throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8159);
        boolean __CLB4_0_6_bool2=false;__CLR4_0_6672672l1l0dwc6.R.inc(8160);switch (LA(1)) {
            case TokenTypes.SLASH:if (!__CLB4_0_6_bool2) {__CLR4_0_6672672l1l0dwc6.R.inc(8161);__CLB4_0_6_bool2=true;}
            case TokenTypes.DOUBLE_SLASH:if (!__CLB4_0_6_bool2) {__CLR4_0_6672672l1l0dwc6.R.inc(8162);__CLB4_0_6_bool2=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8163);if ((((isAbsolute)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8164)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8165)==0&false))) {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8166);absoluteLocationPath();
                } }else {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8167);relativeLocationPath();
                }
                }__CLR4_0_6672672l1l0dwc6.R.inc(8168);break;
            }
            case TokenTypes.AT:if (!__CLB4_0_6_bool2) {__CLR4_0_6672672l1l0dwc6.R.inc(8169);__CLB4_0_6_bool2=true;}
            case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool2) {__CLR4_0_6672672l1l0dwc6.R.inc(8170);__CLB4_0_6_bool2=true;}
            case TokenTypes.DOT:if (!__CLB4_0_6_bool2) {__CLR4_0_6672672l1l0dwc6.R.inc(8171);__CLB4_0_6_bool2=true;}
            case TokenTypes.DOT_DOT:if (!__CLB4_0_6_bool2) {__CLR4_0_6672672l1l0dwc6.R.inc(8172);__CLB4_0_6_bool2=true;}
            case TokenTypes.STAR:if (!__CLB4_0_6_bool2) {__CLR4_0_6672672l1l0dwc6.R.inc(8173);__CLB4_0_6_bool2=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8174);relativeLocationPath();
                __CLR4_0_6672672l1l0dwc6.R.inc(8175);break;
            }
            default:if (!__CLB4_0_6_bool2) {__CLR4_0_6672672l1l0dwc6.R.inc(8176);__CLB4_0_6_bool2=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8177);XPathSyntaxException ex = createSyntaxException("Unexpected '" + LT(1).getTokenText() + "'");
                __CLR4_0_6672672l1l0dwc6.R.inc(8178);throw ex;
            }
        }
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void absoluteLocationPath() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8179);
        __CLR4_0_6672672l1l0dwc6.R.inc(8180);getXPathHandler().startAbsoluteLocationPath();

        boolean __CLB4_0_6_bool3=false;__CLR4_0_6672672l1l0dwc6.R.inc(8181);switch (LA(1)) {
            case TokenTypes.SLASH:if (!__CLB4_0_6_bool3) {__CLR4_0_6672672l1l0dwc6.R.inc(8182);__CLB4_0_6_bool3=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8183);match(TokenTypes.SLASH);

                boolean __CLB4_0_6_bool4=false;__CLR4_0_6672672l1l0dwc6.R.inc(8184);switch (LA(1)) {

                    case TokenTypes.DOT:if (!__CLB4_0_6_bool4) {__CLR4_0_6672672l1l0dwc6.R.inc(8185);__CLB4_0_6_bool4=true;}
                    case TokenTypes.DOT_DOT:if (!__CLB4_0_6_bool4) {__CLR4_0_6672672l1l0dwc6.R.inc(8186);__CLB4_0_6_bool4=true;}
                    case TokenTypes.AT:if (!__CLB4_0_6_bool4) {__CLR4_0_6672672l1l0dwc6.R.inc(8187);__CLB4_0_6_bool4=true;}
                    case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool4) {__CLR4_0_6672672l1l0dwc6.R.inc(8188);__CLB4_0_6_bool4=true;}
                    case TokenTypes.STAR:if (!__CLB4_0_6_bool4) {__CLR4_0_6672672l1l0dwc6.R.inc(8189);__CLB4_0_6_bool4=true;} {
                        __CLR4_0_6672672l1l0dwc6.R.inc(8190);steps();
                        __CLR4_0_6672672l1l0dwc6.R.inc(8191);break;
                    }
                }
                __CLR4_0_6672672l1l0dwc6.R.inc(8192);break;
            }
            case TokenTypes.DOUBLE_SLASH:if (!__CLB4_0_6_bool3) {__CLR4_0_6672672l1l0dwc6.R.inc(8193);__CLB4_0_6_bool3=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8194);getXPathHandler().startAllNodeStep(Axis.DESCENDANT_OR_SELF);
                __CLR4_0_6672672l1l0dwc6.R.inc(8195);getXPathHandler().endAllNodeStep();

                __CLR4_0_6672672l1l0dwc6.R.inc(8196);match(TokenTypes.DOUBLE_SLASH);
                boolean __CLB4_0_6_bool5=false;__CLR4_0_6672672l1l0dwc6.R.inc(8197);switch (LA(1)) {
                    case TokenTypes.DOT:if (!__CLB4_0_6_bool5) {__CLR4_0_6672672l1l0dwc6.R.inc(8198);__CLB4_0_6_bool5=true;}
                    case TokenTypes.DOT_DOT:if (!__CLB4_0_6_bool5) {__CLR4_0_6672672l1l0dwc6.R.inc(8199);__CLB4_0_6_bool5=true;}
                    case TokenTypes.AT:if (!__CLB4_0_6_bool5) {__CLR4_0_6672672l1l0dwc6.R.inc(8200);__CLB4_0_6_bool5=true;}
                    case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool5) {__CLR4_0_6672672l1l0dwc6.R.inc(8201);__CLB4_0_6_bool5=true;}
                    case TokenTypes.STAR:if (!__CLB4_0_6_bool5) {__CLR4_0_6672672l1l0dwc6.R.inc(8202);__CLB4_0_6_bool5=true;} {
                        __CLR4_0_6672672l1l0dwc6.R.inc(8203);steps();
                        __CLR4_0_6672672l1l0dwc6.R.inc(8204);break;
                    }
                    default:if (!__CLB4_0_6_bool5) {__CLR4_0_6672672l1l0dwc6.R.inc(8205);__CLB4_0_6_bool5=true;}
                        __CLR4_0_6672672l1l0dwc6.R.inc(8206);XPathSyntaxException ex = this.createSyntaxException("Location path cannot end with //");
                        __CLR4_0_6672672l1l0dwc6.R.inc(8207);throw ex;
                }
                __CLR4_0_6672672l1l0dwc6.R.inc(8208);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8209);getXPathHandler().endAbsoluteLocationPath();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void relativeLocationPath() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8210);
        __CLR4_0_6672672l1l0dwc6.R.inc(8211);getXPathHandler().startRelativeLocationPath();

        boolean __CLB4_0_6_bool6=false;__CLR4_0_6672672l1l0dwc6.R.inc(8212);switch (LA(1)) {
            case TokenTypes.SLASH:if (!__CLB4_0_6_bool6) {__CLR4_0_6672672l1l0dwc6.R.inc(8213);__CLB4_0_6_bool6=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8214);match(TokenTypes.SLASH);
                __CLR4_0_6672672l1l0dwc6.R.inc(8215);break;
            }
            case TokenTypes.DOUBLE_SLASH:if (!__CLB4_0_6_bool6) {__CLR4_0_6672672l1l0dwc6.R.inc(8216);__CLB4_0_6_bool6=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8217);getXPathHandler().startAllNodeStep(Axis.DESCENDANT_OR_SELF);
                __CLR4_0_6672672l1l0dwc6.R.inc(8218);getXPathHandler().endAllNodeStep();

                __CLR4_0_6672672l1l0dwc6.R.inc(8219);match(TokenTypes.DOUBLE_SLASH);

                __CLR4_0_6672672l1l0dwc6.R.inc(8220);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8221);steps();

        __CLR4_0_6672672l1l0dwc6.R.inc(8222);getXPathHandler().endRelativeLocationPath();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void steps() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8223);
        boolean __CLB4_0_6_bool7=false;__CLR4_0_6672672l1l0dwc6.R.inc(8224);switch (LA(1)) {

            case TokenTypes.DOT:if (!__CLB4_0_6_bool7) {__CLR4_0_6672672l1l0dwc6.R.inc(8225);__CLB4_0_6_bool7=true;}
            case TokenTypes.DOT_DOT:if (!__CLB4_0_6_bool7) {__CLR4_0_6672672l1l0dwc6.R.inc(8226);__CLB4_0_6_bool7=true;}
            case TokenTypes.AT:if (!__CLB4_0_6_bool7) {__CLR4_0_6672672l1l0dwc6.R.inc(8227);__CLB4_0_6_bool7=true;}
            case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool7) {__CLR4_0_6672672l1l0dwc6.R.inc(8228);__CLB4_0_6_bool7=true;}
            case TokenTypes.STAR:if (!__CLB4_0_6_bool7) {__CLR4_0_6672672l1l0dwc6.R.inc(8229);__CLB4_0_6_bool7=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8230);step();
                __CLR4_0_6672672l1l0dwc6.R.inc(8231);break;
            }
            case TokenTypes.EOF:if (!__CLB4_0_6_bool7) {__CLR4_0_6672672l1l0dwc6.R.inc(8232);__CLB4_0_6_bool7=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8233);return;
            }
            default:if (!__CLB4_0_6_bool7) {__CLR4_0_6672672l1l0dwc6.R.inc(8234);__CLB4_0_6_bool7=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8235);XPathSyntaxException ex = createSyntaxException("Expected one of '.', '..', '@', '*', <QName>");
                __CLR4_0_6672672l1l0dwc6.R.inc(8236);throw ex;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8237);do {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8238);if (((((LA(1) == TokenTypes.SLASH)
                    ||
                    (LA(1) == TokenTypes.DOUBLE_SLASH))&&(__CLR4_0_6672672l1l0dwc6.R.iget(8239)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8240)==0&false))) {{
                boolean __CLB4_0_6_bool8=false;__CLR4_0_6672672l1l0dwc6.R.inc(8241);switch (LA(1)) {
                    case TokenTypes.SLASH:if (!__CLB4_0_6_bool8) {__CLR4_0_6672672l1l0dwc6.R.inc(8242);__CLB4_0_6_bool8=true;} {
                        __CLR4_0_6672672l1l0dwc6.R.inc(8243);match(TokenTypes.SLASH);
                        __CLR4_0_6672672l1l0dwc6.R.inc(8244);break;
                    }
                    case TokenTypes.DOUBLE_SLASH:if (!__CLB4_0_6_bool8) {__CLR4_0_6672672l1l0dwc6.R.inc(8245);__CLB4_0_6_bool8=true;} {
                        __CLR4_0_6672672l1l0dwc6.R.inc(8246);getXPathHandler().startAllNodeStep(Axis.DESCENDANT_OR_SELF);
                        __CLR4_0_6672672l1l0dwc6.R.inc(8247);getXPathHandler().endAllNodeStep();

                        __CLR4_0_6672672l1l0dwc6.R.inc(8248);match(TokenTypes.DOUBLE_SLASH);
                        __CLR4_0_6672672l1l0dwc6.R.inc(8249);break;
                    }
                }
            } }else {{
                __CLR4_0_6672672l1l0dwc6.R.inc(8250);return;
            }

            }boolean __CLB4_0_6_bool9=false;__CLR4_0_6672672l1l0dwc6.R.inc(8251);switch (LA(1)) {
                case TokenTypes.DOT:if (!__CLB4_0_6_bool9) {__CLR4_0_6672672l1l0dwc6.R.inc(8252);__CLB4_0_6_bool9=true;}
                case TokenTypes.DOT_DOT:if (!__CLB4_0_6_bool9) {__CLR4_0_6672672l1l0dwc6.R.inc(8253);__CLB4_0_6_bool9=true;}
                case TokenTypes.AT:if (!__CLB4_0_6_bool9) {__CLR4_0_6672672l1l0dwc6.R.inc(8254);__CLB4_0_6_bool9=true;}
                case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool9) {__CLR4_0_6672672l1l0dwc6.R.inc(8255);__CLB4_0_6_bool9=true;}
                case TokenTypes.STAR:if (!__CLB4_0_6_bool9) {__CLR4_0_6672672l1l0dwc6.R.inc(8256);__CLB4_0_6_bool9=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8257);step();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8258);break;
                }
                default:if (!__CLB4_0_6_bool9) {__CLR4_0_6672672l1l0dwc6.R.inc(8259);__CLB4_0_6_bool9=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8260);XPathSyntaxException ex = createSyntaxException("Expected one of '.', '..', '@', '*', <QName>");
                    __CLR4_0_6672672l1l0dwc6.R.inc(8261);throw ex;
                }
            }

        } }while (true);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    void step() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8262);
        __CLR4_0_6672672l1l0dwc6.R.inc(8263);int axis = 0;

        boolean __CLB4_0_6_bool10=false;__CLR4_0_6672672l1l0dwc6.R.inc(8264);switch (LA(1)) {
            case TokenTypes.DOT:if (!__CLB4_0_6_bool10) {__CLR4_0_6672672l1l0dwc6.R.inc(8265);__CLB4_0_6_bool10=true;}
            case TokenTypes.DOT_DOT:if (!__CLB4_0_6_bool10) {__CLR4_0_6672672l1l0dwc6.R.inc(8266);__CLB4_0_6_bool10=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8267);abbrStep();
                __CLR4_0_6672672l1l0dwc6.R.inc(8268);return;
            }
            case TokenTypes.AT:if (!__CLB4_0_6_bool10) {__CLR4_0_6672672l1l0dwc6.R.inc(8269);__CLB4_0_6_bool10=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8270);axis = axisSpecifier();
                __CLR4_0_6672672l1l0dwc6.R.inc(8271);break;
            }
            case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool10) {__CLR4_0_6672672l1l0dwc6.R.inc(8272);__CLB4_0_6_bool10=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8273);if ((((LA(2) == TokenTypes.DOUBLE_COLON)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8274)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8275)==0&false))) {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8276);axis = axisSpecifier();
                } }else {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8277);axis = Axis.CHILD;
                }
                }__CLR4_0_6672672l1l0dwc6.R.inc(8278);break;
            }
            case TokenTypes.STAR:if (!__CLB4_0_6_bool10) {__CLR4_0_6672672l1l0dwc6.R.inc(8279);__CLB4_0_6_bool10=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8280);axis = Axis.CHILD;
                __CLR4_0_6672672l1l0dwc6.R.inc(8281);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8282);nodeTest(axis);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private int axisSpecifier() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8283);
        __CLR4_0_6672672l1l0dwc6.R.inc(8284);int axis = 0;

        boolean __CLB4_0_6_bool11=false;__CLR4_0_6672672l1l0dwc6.R.inc(8285);switch (LA(1)) {
            case TokenTypes.AT:if (!__CLB4_0_6_bool11) {__CLR4_0_6672672l1l0dwc6.R.inc(8286);__CLB4_0_6_bool11=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8287);match(TokenTypes.AT);
                __CLR4_0_6672672l1l0dwc6.R.inc(8288);axis = Axis.ATTRIBUTE;
                __CLR4_0_6672672l1l0dwc6.R.inc(8289);break;
            }
            case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool11) {__CLR4_0_6672672l1l0dwc6.R.inc(8290);__CLB4_0_6_bool11=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8291);Token token = LT(1);

                __CLR4_0_6672672l1l0dwc6.R.inc(8292);axis = Axis.lookup(token.getTokenText());

                __CLR4_0_6672672l1l0dwc6.R.inc(8293);if ((((axis == Axis.INVALID_AXIS)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8294)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8295)==0&false))) {{
                    __CLR4_0_6672672l1l0dwc6.R.inc(8296);throwInvalidAxis(token.getTokenText());
                }

                }__CLR4_0_6672672l1l0dwc6.R.inc(8297);match(TokenTypes.IDENTIFIER);
                __CLR4_0_6672672l1l0dwc6.R.inc(8298);match(TokenTypes.DOUBLE_COLON);

                __CLR4_0_6672672l1l0dwc6.R.inc(8299);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8300);return axis;
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void nodeTest(int axis) throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8301);
        boolean __CLB4_0_6_bool12=false;__CLR4_0_6672672l1l0dwc6.R.inc(8302);switch (LA(1)) {
            case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool12) {__CLR4_0_6672672l1l0dwc6.R.inc(8303);__CLB4_0_6_bool12=true;} {
                boolean __CLB4_0_6_bool13=false;__CLR4_0_6672672l1l0dwc6.R.inc(8304);switch (LA(2)) {
                    case TokenTypes.LEFT_PAREN:if (!__CLB4_0_6_bool13) {__CLR4_0_6672672l1l0dwc6.R.inc(8305);__CLB4_0_6_bool13=true;} {
                        __CLR4_0_6672672l1l0dwc6.R.inc(8306);nodeTypeTest(axis);
                        __CLR4_0_6672672l1l0dwc6.R.inc(8307);break;
                    }
                    default:if (!__CLB4_0_6_bool13) {__CLR4_0_6672672l1l0dwc6.R.inc(8308);__CLB4_0_6_bool13=true;} {
                        __CLR4_0_6672672l1l0dwc6.R.inc(8309);nameTest(axis);
                        __CLR4_0_6672672l1l0dwc6.R.inc(8310);break;
                    }
                }
                __CLR4_0_6672672l1l0dwc6.R.inc(8311);break;
            }
            case TokenTypes.STAR:if (!__CLB4_0_6_bool12) {__CLR4_0_6672672l1l0dwc6.R.inc(8312);__CLB4_0_6_bool12=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8313);nameTest(axis);
                __CLR4_0_6672672l1l0dwc6.R.inc(8314);break;
            }
            default:if (!__CLB4_0_6_bool12) {__CLR4_0_6672672l1l0dwc6.R.inc(8315);__CLB4_0_6_bool12=true;}
                __CLR4_0_6672672l1l0dwc6.R.inc(8316);XPathSyntaxException ex = createSyntaxException("Expected <QName> or *");
                __CLR4_0_6672672l1l0dwc6.R.inc(8317);throw ex;
        }
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void nodeTypeTest(int axis) throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8318);
        __CLR4_0_6672672l1l0dwc6.R.inc(8319);Token nodeTypeToken = match(TokenTypes.IDENTIFIER);
        __CLR4_0_6672672l1l0dwc6.R.inc(8320);String nodeType = nodeTypeToken.getTokenText();

        __CLR4_0_6672672l1l0dwc6.R.inc(8321);match(TokenTypes.LEFT_PAREN);

        __CLR4_0_6672672l1l0dwc6.R.inc(8322);if (((("processing-instruction".equals(nodeType))&&(__CLR4_0_6672672l1l0dwc6.R.iget(8323)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8324)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8325);String piName = "";

            __CLR4_0_6672672l1l0dwc6.R.inc(8326);if ((((LA(1) == TokenTypes.LITERAL)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8327)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8328)==0&false))) {{
                __CLR4_0_6672672l1l0dwc6.R.inc(8329);piName = match(TokenTypes.LITERAL).getTokenText();
            }

            }__CLR4_0_6672672l1l0dwc6.R.inc(8330);match(TokenTypes.RIGHT_PAREN);

            __CLR4_0_6672672l1l0dwc6.R.inc(8331);getXPathHandler().startProcessingInstructionNodeStep(axis,
                    piName);

            __CLR4_0_6672672l1l0dwc6.R.inc(8332);predicates();

            __CLR4_0_6672672l1l0dwc6.R.inc(8333);getXPathHandler().endProcessingInstructionNodeStep();
        } }else {__CLR4_0_6672672l1l0dwc6.R.inc(8334);if (((("node".equals(nodeType))&&(__CLR4_0_6672672l1l0dwc6.R.iget(8335)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8336)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8337);match(TokenTypes.RIGHT_PAREN);

            __CLR4_0_6672672l1l0dwc6.R.inc(8338);getXPathHandler().startAllNodeStep(axis);

            __CLR4_0_6672672l1l0dwc6.R.inc(8339);predicates();

            __CLR4_0_6672672l1l0dwc6.R.inc(8340);getXPathHandler().endAllNodeStep();
        } }else {__CLR4_0_6672672l1l0dwc6.R.inc(8341);if (((("text".equals(nodeType))&&(__CLR4_0_6672672l1l0dwc6.R.iget(8342)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8343)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8344);match(TokenTypes.RIGHT_PAREN);

            __CLR4_0_6672672l1l0dwc6.R.inc(8345);getXPathHandler().startTextNodeStep(axis);

            __CLR4_0_6672672l1l0dwc6.R.inc(8346);predicates();

            __CLR4_0_6672672l1l0dwc6.R.inc(8347);getXPathHandler().endTextNodeStep();
        } }else {__CLR4_0_6672672l1l0dwc6.R.inc(8348);if (((("comment".equals(nodeType))&&(__CLR4_0_6672672l1l0dwc6.R.iget(8349)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8350)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8351);match(TokenTypes.RIGHT_PAREN);

            __CLR4_0_6672672l1l0dwc6.R.inc(8352);getXPathHandler().startCommentNodeStep(axis);

            __CLR4_0_6672672l1l0dwc6.R.inc(8353);predicates();

            __CLR4_0_6672672l1l0dwc6.R.inc(8354);getXPathHandler().endCommentNodeStep();
        } }else {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8355);XPathSyntaxException ex = createSyntaxException("Expected node-type");
            __CLR4_0_6672672l1l0dwc6.R.inc(8356);throw ex;
        }
    }}}}}finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void nameTest(int axis) throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8357);
        __CLR4_0_6672672l1l0dwc6.R.inc(8358);String prefix = null;
        __CLR4_0_6672672l1l0dwc6.R.inc(8359);String localName = null;

        boolean __CLB4_0_6_bool14=false;__CLR4_0_6672672l1l0dwc6.R.inc(8360);switch (LA(2)) {
            case TokenTypes.COLON:if (!__CLB4_0_6_bool14) {__CLR4_0_6672672l1l0dwc6.R.inc(8361);__CLB4_0_6_bool14=true;} {
                boolean __CLB4_0_6_bool15=false;__CLR4_0_6672672l1l0dwc6.R.inc(8362);switch (LA(1)) {
                    case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool15) {__CLR4_0_6672672l1l0dwc6.R.inc(8363);__CLB4_0_6_bool15=true;} {
                        __CLR4_0_6672672l1l0dwc6.R.inc(8364);prefix = match(TokenTypes.IDENTIFIER).getTokenText();
                        __CLR4_0_6672672l1l0dwc6.R.inc(8365);match(TokenTypes.COLON);
                        __CLR4_0_6672672l1l0dwc6.R.inc(8366);break;
                    }
                }
                __CLR4_0_6672672l1l0dwc6.R.inc(8367);break;
            }
        }

        boolean __CLB4_0_6_bool16=false;__CLR4_0_6672672l1l0dwc6.R.inc(8368);switch (LA(1)) {
            case TokenTypes.IDENTIFIER:if (!__CLB4_0_6_bool16) {__CLR4_0_6672672l1l0dwc6.R.inc(8369);__CLB4_0_6_bool16=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8370);localName = match(TokenTypes.IDENTIFIER).getTokenText();
                __CLR4_0_6672672l1l0dwc6.R.inc(8371);break;
            }
            case TokenTypes.STAR:if (!__CLB4_0_6_bool16) {__CLR4_0_6672672l1l0dwc6.R.inc(8372);__CLB4_0_6_bool16=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8373);match(TokenTypes.STAR);
                __CLR4_0_6672672l1l0dwc6.R.inc(8374);localName = "*";
                __CLR4_0_6672672l1l0dwc6.R.inc(8375);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8376);if ((((prefix == null)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8377)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8378)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8379);prefix = "";
        }

        }__CLR4_0_6672672l1l0dwc6.R.inc(8380);getXPathHandler().startNameStep(axis,
                prefix,
                localName);

        __CLR4_0_6672672l1l0dwc6.R.inc(8381);predicates();

        __CLR4_0_6672672l1l0dwc6.R.inc(8382);getXPathHandler().endNameStep();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void abbrStep() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8383);
        boolean __CLB4_0_6_bool17=false;__CLR4_0_6672672l1l0dwc6.R.inc(8384);switch (LA(1)) {
            case TokenTypes.DOT:if (!__CLB4_0_6_bool17) {__CLR4_0_6672672l1l0dwc6.R.inc(8385);__CLB4_0_6_bool17=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8386);match(TokenTypes.DOT);
                __CLR4_0_6672672l1l0dwc6.R.inc(8387);getXPathHandler().startAllNodeStep(Axis.SELF);
                __CLR4_0_6672672l1l0dwc6.R.inc(8388);predicates();
                __CLR4_0_6672672l1l0dwc6.R.inc(8389);getXPathHandler().endAllNodeStep();
                __CLR4_0_6672672l1l0dwc6.R.inc(8390);break;
            }
            case TokenTypes.DOT_DOT:if (!__CLB4_0_6_bool17) {__CLR4_0_6672672l1l0dwc6.R.inc(8391);__CLB4_0_6_bool17=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8392);match(TokenTypes.DOT_DOT);
                __CLR4_0_6672672l1l0dwc6.R.inc(8393);getXPathHandler().startAllNodeStep(Axis.PARENT);
                __CLR4_0_6672672l1l0dwc6.R.inc(8394);predicates();
                __CLR4_0_6672672l1l0dwc6.R.inc(8395);getXPathHandler().endAllNodeStep();
                __CLR4_0_6672672l1l0dwc6.R.inc(8396);break;
            }
        }
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void predicates() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8397);
        __CLR4_0_6672672l1l0dwc6.R.inc(8398);while (true) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8399);if ((((LA(1) == TokenTypes.LEFT_BRACKET)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8400)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8401)==0&false))) {{
                __CLR4_0_6672672l1l0dwc6.R.inc(8402);predicate();
            } }else {{
                __CLR4_0_6672672l1l0dwc6.R.inc(8403);break;
            }
        }}
    }}finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    void predicate() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8404);
        __CLR4_0_6672672l1l0dwc6.R.inc(8405);getXPathHandler().startPredicate();

        __CLR4_0_6672672l1l0dwc6.R.inc(8406);match(TokenTypes.LEFT_BRACKET);

        __CLR4_0_6672672l1l0dwc6.R.inc(8407);predicateExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8408);match(TokenTypes.RIGHT_BRACKET);

        __CLR4_0_6672672l1l0dwc6.R.inc(8409);getXPathHandler().endPredicate();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void predicateExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8410);
        __CLR4_0_6672672l1l0dwc6.R.inc(8411);expr();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void expr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8412);
        __CLR4_0_6672672l1l0dwc6.R.inc(8413);orExpr();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void orExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8414);
        __CLR4_0_6672672l1l0dwc6.R.inc(8415);getXPathHandler().startOrExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8416);andExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8417);boolean create = false;

        boolean __CLB4_0_6_bool18=false;__CLR4_0_6672672l1l0dwc6.R.inc(8418);switch (LA(1)) {
            case TokenTypes.OR:if (!__CLB4_0_6_bool18) {__CLR4_0_6672672l1l0dwc6.R.inc(8419);__CLB4_0_6_bool18=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8420);create = true;
                __CLR4_0_6672672l1l0dwc6.R.inc(8421);match(TokenTypes.OR);
                __CLR4_0_6672672l1l0dwc6.R.inc(8422);orExpr();
                __CLR4_0_6672672l1l0dwc6.R.inc(8423);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8424);getXPathHandler().endOrExpr(create);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void andExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8425);
        __CLR4_0_6672672l1l0dwc6.R.inc(8426);getXPathHandler().startAndExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8427);equalityExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8428);boolean create = false;

        boolean __CLB4_0_6_bool19=false;__CLR4_0_6672672l1l0dwc6.R.inc(8429);switch (LA(1)) {
            case TokenTypes.AND:if (!__CLB4_0_6_bool19) {__CLR4_0_6672672l1l0dwc6.R.inc(8430);__CLB4_0_6_bool19=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8431);create = true;
                __CLR4_0_6672672l1l0dwc6.R.inc(8432);match(TokenTypes.AND);
                __CLR4_0_6672672l1l0dwc6.R.inc(8433);andExpr();
                __CLR4_0_6672672l1l0dwc6.R.inc(8434);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8435);getXPathHandler().endAndExpr(create);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void equalityExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8436);
        __CLR4_0_6672672l1l0dwc6.R.inc(8437);relationalExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8438);int la = LA(1);
        __CLR4_0_6672672l1l0dwc6.R.inc(8439);while ((((la == TokenTypes.EQUALS || la == TokenTypes.NOT_EQUALS)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8440)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8441)==0&false))) {{
            boolean __CLB4_0_6_bool20=false;__CLR4_0_6672672l1l0dwc6.R.inc(8442);switch (la) {
                case TokenTypes.EQUALS:if (!__CLB4_0_6_bool20) {__CLR4_0_6672672l1l0dwc6.R.inc(8443);__CLB4_0_6_bool20=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8444);match(TokenTypes.EQUALS);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8445);getXPathHandler().startEqualityExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8446);relationalExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8447);getXPathHandler().endEqualityExpr(Operator.EQUALS);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8448);break;
                }
                case TokenTypes.NOT_EQUALS:if (!__CLB4_0_6_bool20) {__CLR4_0_6672672l1l0dwc6.R.inc(8449);__CLB4_0_6_bool20=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8450);match(TokenTypes.NOT_EQUALS);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8451);getXPathHandler().startEqualityExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8452);relationalExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8453);getXPathHandler().endEqualityExpr(Operator.NOT_EQUALS);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8454);break;
                }
            }
            __CLR4_0_6672672l1l0dwc6.R.inc(8455);la = LA(1);
        }
    }}finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void relationalExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8456);

        __CLR4_0_6672672l1l0dwc6.R.inc(8457);additiveExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8458);int la = LA(1);
        // Very important: TokenTypes.LESS_THAN != Operator.LESS_THAN
        //                 TokenTypes.GREATER_THAN != Operator.GREATER_THAN
        //                 TokenTypes.GREATER_THAN_EQUALS != Operator.GREATER_THAN_EQUALS
        //                 TokenTypes.LESS_THAN_EQUALS != Operator.LESS_THAN_EQUALS
        __CLR4_0_6672672l1l0dwc6.R.inc(8459);while ((((la == TokenTypes.LESS_THAN_SIGN
                || la == TokenTypes.GREATER_THAN_SIGN
                || la == TokenTypes.LESS_THAN_OR_EQUALS_SIGN
                || la == TokenTypes.GREATER_THAN_OR_EQUALS_SIGN)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8460)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8461)==0&false))) {{
            boolean __CLB4_0_6_bool21=false;__CLR4_0_6672672l1l0dwc6.R.inc(8462);switch (la) {
                case TokenTypes.LESS_THAN_SIGN:if (!__CLB4_0_6_bool21) {__CLR4_0_6672672l1l0dwc6.R.inc(8463);__CLB4_0_6_bool21=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8464);match(TokenTypes.LESS_THAN_SIGN);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8465);getXPathHandler().startRelationalExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8466);additiveExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8467);getXPathHandler().endRelationalExpr(Operator.LESS_THAN);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8468);break;
                }
                case TokenTypes.GREATER_THAN_SIGN:if (!__CLB4_0_6_bool21) {__CLR4_0_6672672l1l0dwc6.R.inc(8469);__CLB4_0_6_bool21=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8470);match(TokenTypes.GREATER_THAN_SIGN);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8471);getXPathHandler().startRelationalExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8472);additiveExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8473);getXPathHandler().endRelationalExpr(Operator.GREATER_THAN);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8474);break;
                }
                case TokenTypes.GREATER_THAN_OR_EQUALS_SIGN:if (!__CLB4_0_6_bool21) {__CLR4_0_6672672l1l0dwc6.R.inc(8475);__CLB4_0_6_bool21=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8476);match(TokenTypes.GREATER_THAN_OR_EQUALS_SIGN);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8477);getXPathHandler().startRelationalExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8478);additiveExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8479);getXPathHandler().endRelationalExpr(Operator.GREATER_THAN_EQUALS);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8480);break;
                }
                case TokenTypes.LESS_THAN_OR_EQUALS_SIGN:if (!__CLB4_0_6_bool21) {__CLR4_0_6672672l1l0dwc6.R.inc(8481);__CLB4_0_6_bool21=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8482);match(TokenTypes.LESS_THAN_OR_EQUALS_SIGN);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8483);getXPathHandler().startRelationalExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8484);additiveExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8485);getXPathHandler().endRelationalExpr(Operator.LESS_THAN_EQUALS);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8486);break;
                }
            }
            __CLR4_0_6672672l1l0dwc6.R.inc(8487);la = LA(1);
        }
    }}finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}


    private void additiveExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8488);
        __CLR4_0_6672672l1l0dwc6.R.inc(8489);multiplicativeExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8490);int la = LA(1);
        __CLR4_0_6672672l1l0dwc6.R.inc(8491);while ((((la == TokenTypes.PLUS || la == TokenTypes.MINUS)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8492)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8493)==0&false))) {{
            boolean __CLB4_0_6_bool22=false;__CLR4_0_6672672l1l0dwc6.R.inc(8494);switch (la) {
                case TokenTypes.PLUS:if (!__CLB4_0_6_bool22) {__CLR4_0_6672672l1l0dwc6.R.inc(8495);__CLB4_0_6_bool22=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8496);match(TokenTypes.PLUS);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8497);getXPathHandler().startAdditiveExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8498);multiplicativeExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8499);getXPathHandler().endAdditiveExpr(Operator.ADD);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8500);break;
                }
                case TokenTypes.MINUS:if (!__CLB4_0_6_bool22) {__CLR4_0_6672672l1l0dwc6.R.inc(8501);__CLB4_0_6_bool22=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8502);match(TokenTypes.MINUS);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8503);getXPathHandler().startAdditiveExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8504);multiplicativeExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8505);getXPathHandler().endAdditiveExpr(Operator.SUBTRACT);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8506);break;
                }
            }
            __CLR4_0_6672672l1l0dwc6.R.inc(8507);la = LA(1);
        }
    }}finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void multiplicativeExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8508);
        __CLR4_0_6672672l1l0dwc6.R.inc(8509);unaryExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8510);int la = LA(1);
        __CLR4_0_6672672l1l0dwc6.R.inc(8511);while ((((la == TokenTypes.STAR_OPERATOR || la == TokenTypes.DIV || la == TokenTypes.MOD)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8512)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8513)==0&false))) {{
            boolean __CLB4_0_6_bool23=false;__CLR4_0_6672672l1l0dwc6.R.inc(8514);switch (la) {
                case TokenTypes.STAR:if (!__CLB4_0_6_bool23) {__CLR4_0_6672672l1l0dwc6.R.inc(8515);__CLB4_0_6_bool23=true;}
                case TokenTypes.STAR_OPERATOR:if (!__CLB4_0_6_bool23) {__CLR4_0_6672672l1l0dwc6.R.inc(8516);__CLB4_0_6_bool23=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8517);match(TokenTypes.STAR_OPERATOR);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8518);getXPathHandler().startMultiplicativeExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8519);unaryExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8520);getXPathHandler().endMultiplicativeExpr(Operator.MULTIPLY);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8521);break;
                }
                case TokenTypes.DIV:if (!__CLB4_0_6_bool23) {__CLR4_0_6672672l1l0dwc6.R.inc(8522);__CLB4_0_6_bool23=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8523);match(TokenTypes.DIV);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8524);getXPathHandler().startMultiplicativeExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8525);unaryExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8526);getXPathHandler().endMultiplicativeExpr(Operator.DIV);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8527);break;
                }
                case TokenTypes.MOD:if (!__CLB4_0_6_bool23) {__CLR4_0_6672672l1l0dwc6.R.inc(8528);__CLB4_0_6_bool23=true;} {
                    __CLR4_0_6672672l1l0dwc6.R.inc(8529);match(TokenTypes.MOD);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8530);getXPathHandler().startMultiplicativeExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8531);unaryExpr();
                    __CLR4_0_6672672l1l0dwc6.R.inc(8532);getXPathHandler().endMultiplicativeExpr(Operator.MOD);
                    __CLR4_0_6672672l1l0dwc6.R.inc(8533);break;
                }
            }
            __CLR4_0_6672672l1l0dwc6.R.inc(8534);la = LA(1);
        }

    }}finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void unaryExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8535);
        boolean __CLB4_0_6_bool24=false;__CLR4_0_6672672l1l0dwc6.R.inc(8536);switch (LA(1)) {
            case TokenTypes.MINUS:if (!__CLB4_0_6_bool24) {__CLR4_0_6672672l1l0dwc6.R.inc(8537);__CLB4_0_6_bool24=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8538);getXPathHandler().startUnaryExpr();
                __CLR4_0_6672672l1l0dwc6.R.inc(8539);match(TokenTypes.MINUS);
                __CLR4_0_6672672l1l0dwc6.R.inc(8540);unaryExpr();
                __CLR4_0_6672672l1l0dwc6.R.inc(8541);getXPathHandler().endUnaryExpr(Operator.NEGATIVE);
                __CLR4_0_6672672l1l0dwc6.R.inc(8542);break;
            }
            default:if (!__CLB4_0_6_bool24) {__CLR4_0_6672672l1l0dwc6.R.inc(8543);__CLB4_0_6_bool24=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8544);unionExpr();
                __CLR4_0_6672672l1l0dwc6.R.inc(8545);break;
            }
        }


    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void unionExpr() throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8546);
        __CLR4_0_6672672l1l0dwc6.R.inc(8547);getXPathHandler().startUnionExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8548);pathExpr();

        __CLR4_0_6672672l1l0dwc6.R.inc(8549);boolean create = false;

        boolean __CLB4_0_6_bool25=false;__CLR4_0_6672672l1l0dwc6.R.inc(8550);switch (LA(1)) {
            case TokenTypes.PIPE:if (!__CLB4_0_6_bool25) {__CLR4_0_6672672l1l0dwc6.R.inc(8551);__CLB4_0_6_bool25=true;} {
                __CLR4_0_6672672l1l0dwc6.R.inc(8552);match(TokenTypes.PIPE);
                __CLR4_0_6672672l1l0dwc6.R.inc(8553);create = true;
                __CLR4_0_6672672l1l0dwc6.R.inc(8554);expr();
                __CLR4_0_6672672l1l0dwc6.R.inc(8555);break;
            }
        }

        __CLR4_0_6672672l1l0dwc6.R.inc(8556);getXPathHandler().endUnionExpr(create);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private Token match(int tokenType) throws XPathSyntaxException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8557);
        __CLR4_0_6672672l1l0dwc6.R.inc(8558);LT(1);

        __CLR4_0_6672672l1l0dwc6.R.inc(8559);Token token = (Token) tokens.get(0);

        __CLR4_0_6672672l1l0dwc6.R.inc(8560);if ((((token.getTokenType() == tokenType)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8561)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8562)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8563);tokens.remove(0);
            __CLR4_0_6672672l1l0dwc6.R.inc(8564);return token;
        }


        }__CLR4_0_6672672l1l0dwc6.R.inc(8565);XPathSyntaxException ex = createSyntaxException("Expected: " + TokenTypes.getTokenText(tokenType));
        __CLR4_0_6672672l1l0dwc6.R.inc(8566);throw ex;
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private int LA(int position) {try{__CLR4_0_6672672l1l0dwc6.R.inc(8567);
        __CLR4_0_6672672l1l0dwc6.R.inc(8568);return LT(position).getTokenType();
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}


    // XXX This method's a HotSpot; could we improve it?
    private Token LT(int position) {try{__CLR4_0_6672672l1l0dwc6.R.inc(8569);
        __CLR4_0_6672672l1l0dwc6.R.inc(8570);if ((((tokens.size() <= (position - 1))&&(__CLR4_0_6672672l1l0dwc6.R.iget(8571)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8572)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8573);for (int i = 0; (((i < position)&&(__CLR4_0_6672672l1l0dwc6.R.iget(8574)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8575)==0&false)); ++i) {{
                __CLR4_0_6672672l1l0dwc6.R.inc(8576);tokens.add(lexer.nextToken());
            }
        }}

        }__CLR4_0_6672672l1l0dwc6.R.inc(8577);return (Token) tokens.get(position - 1);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private boolean isNodeTypeName(Token name) {try{__CLR4_0_6672672l1l0dwc6.R.inc(8578);
        __CLR4_0_6672672l1l0dwc6.R.inc(8579);String text = name.getTokenText();

        __CLR4_0_6672672l1l0dwc6.R.inc(8580);if (((("node".equals(text)
                ||
                "comment".equals(text)
                ||
                "text".equals(text)
                ||
                "processing-instruction".equals(text))&&(__CLR4_0_6672672l1l0dwc6.R.iget(8581)!=0|true))||(__CLR4_0_6672672l1l0dwc6.R.iget(8582)==0&false))) {{
            __CLR4_0_6672672l1l0dwc6.R.inc(8583);return true;
        }

        }__CLR4_0_6672672l1l0dwc6.R.inc(8584);return false;
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private XPathSyntaxException createSyntaxException(String message) {try{__CLR4_0_6672672l1l0dwc6.R.inc(8585);
        __CLR4_0_6672672l1l0dwc6.R.inc(8586);String xpath = this.lexer.getXPath();
        __CLR4_0_6672672l1l0dwc6.R.inc(8587);int position = LT(1).getTokenBegin();

        __CLR4_0_6672672l1l0dwc6.R.inc(8588);return new XPathSyntaxException(xpath,
                position,
                message);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}

    private void throwInvalidAxis(String invalidAxis) throws SAXPathException {try{__CLR4_0_6672672l1l0dwc6.R.inc(8589);
        __CLR4_0_6672672l1l0dwc6.R.inc(8590);String xpath = this.lexer.getXPath();
        __CLR4_0_6672672l1l0dwc6.R.inc(8591);int position = LT(1).getTokenBegin();

        __CLR4_0_6672672l1l0dwc6.R.inc(8592);String message = "Expected valid axis name instead of [" + invalidAxis + "]";

        __CLR4_0_6672672l1l0dwc6.R.inc(8593);throw new XPathSyntaxException(xpath,
                position,
                message);
    }finally{__CLR4_0_6672672l1l0dwc6.R.flushNeeded();}}
}
