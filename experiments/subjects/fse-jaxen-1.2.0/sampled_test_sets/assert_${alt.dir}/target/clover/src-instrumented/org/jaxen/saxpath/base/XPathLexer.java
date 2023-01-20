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

@java.lang.SuppressWarnings({"fallthrough"}) class XPathLexer {public static class __CLR4_0_65vp5vpl1l0dwb1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,8030,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String xpath;
    private int currentPosition;
    private int endPosition;
    private boolean expectOperator = false;

    XPathLexer(String xpath) {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7621);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7622);setXPath(xpath);
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    String getXPath() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7623);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7624);return this.xpath;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private void setXPath(String xpath) {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7625);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7626);this.xpath = xpath;
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7627);this.currentPosition = 0;
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7628);this.endPosition = xpath.length();
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    Token nextToken() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7629);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7630);Token token = null;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7631);do {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7632);token = null;

            boolean __CLB4_0_6_bool0=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(7633);switch (LA(1)) {
                case '$':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7634);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7635);token = dollar();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7636);break;
                }

                case '"':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7637);__CLB4_0_6_bool0=true;}
                case '\'':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7638);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7639);token = literal();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7640);break;
                }

                case '/':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7641);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7642);token = slashes();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7643);break;
                }

                case ',':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7644);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7645);token = comma();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7646);break;
                }

                case '(':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7647);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7648);token = leftParen();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7649);break;
                }

                case ')':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7650);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7651);token = rightParen();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7652);break;
                }

                case '[':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7653);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7654);token = leftBracket();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7655);break;
                }

                case ']':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7656);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7657);token = rightBracket();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7658);break;
                }

                case '+':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7659);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7660);token = plus();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7661);break;
                }

                case '-':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7662);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7663);token = minus();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7664);break;
                }

                case '<':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7665);__CLB4_0_6_bool0=true;}
                case '>':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7666);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7667);token = relationalOperator();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7668);break;
                }

                case '=':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7669);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7670);token = equals();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7671);break;
                }

                case '!':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7672);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7673);if ((((LA(2) == '=')&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7674)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7675)==0&false))) {{
                        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7676);token = notEquals();
                    }
                    }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7677);break;
                }

                case '|':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7678);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7679);token = pipe();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7680);break;
                }

                case '@':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7681);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7682);token = at();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7683);break;
                }

                case ':':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7684);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7685);if ((((LA(2) == ':')&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7686)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7687)==0&false))) {{
                        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7688);token = doubleColon();
                    } }else {{
                        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7689);token = colon();
                    }
                    }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7690);break;
                }

                case '*':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7691);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7692);token = star();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7693);break;
                }

                case '.':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7694);__CLB4_0_6_bool0=true;} {
                    boolean __CLB4_0_6_bool1=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(7695);switch (LA(2)) {
                        case '0':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7696);__CLB4_0_6_bool1=true;}
                        case '1':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7697);__CLB4_0_6_bool1=true;}
                        case '2':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7698);__CLB4_0_6_bool1=true;}
                        case '3':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7699);__CLB4_0_6_bool1=true;}
                        case '4':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7700);__CLB4_0_6_bool1=true;}
                        case '5':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7701);__CLB4_0_6_bool1=true;}
                        case '6':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7702);__CLB4_0_6_bool1=true;}
                        case '7':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7703);__CLB4_0_6_bool1=true;}
                        case '8':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7704);__CLB4_0_6_bool1=true;}
                        case '9':if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7705);__CLB4_0_6_bool1=true;} {
                            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7706);token = number();
                            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7707);break;
                        }
                        default:if (!__CLB4_0_6_bool1) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7708);__CLB4_0_6_bool1=true;} {
                            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7709);token = dots();
                            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7710);break;
                        }
                    }
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7711);break;
                }

                case '0':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7712);__CLB4_0_6_bool0=true;}
                case '1':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7713);__CLB4_0_6_bool0=true;}
                case '2':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7714);__CLB4_0_6_bool0=true;}
                case '3':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7715);__CLB4_0_6_bool0=true;}
                case '4':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7716);__CLB4_0_6_bool0=true;}
                case '5':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7717);__CLB4_0_6_bool0=true;}
                case '6':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7718);__CLB4_0_6_bool0=true;}
                case '7':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7719);__CLB4_0_6_bool0=true;}
                case '8':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7720);__CLB4_0_6_bool0=true;}
                case '9':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7721);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7722);token = number();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7723);break;
                }

                case ' ':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7724);__CLB4_0_6_bool0=true;}
                case '\t':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7725);__CLB4_0_6_bool0=true;}
                case '\n':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7726);__CLB4_0_6_bool0=true;}
                case '\r':if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7727);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7728);token = whitespace();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7729);break;
                }

                default:if (!__CLB4_0_6_bool0) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7730);__CLB4_0_6_bool0=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7731);if ((((Verifier.isXMLNCNameStartCharacter(LA(1)))&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7732)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7733)==0&false))) {{
                        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7734);token = identifierOrOperatorName();
                    }
                }}
            }

            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7735);if ((((token == null)&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7736)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7737)==0&false))) {{
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7738);if ((((!hasMoreChars())&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7739)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7740)==0&false))) {{
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7741);token = new Token(TokenTypes.EOF,
                            getXPath(),
                            this.currentPosition,
                            this.endPosition);
                } }else {{
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7742);token = new Token(TokenTypes.ERROR,
                            getXPath(),
                            this.currentPosition,
                            this.endPosition);
                }
            }}

        }}
        }while ((((token.getTokenType() == TokenTypes.SKIP)&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7743)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7744)==0&false)));

        // For some reason, section 3.7, Lexical structure,
        // doesn't seem to feel like it needs to mention the
        // SLASH, DOUBLE_SLASH, and COLON tokens for the test
        // if an NCName is an operator or not.
        //
        // According to section 3.7, "/foo" should be considered
        // as a SLASH following by an OperatorName being 'foo'.
        // Which is just simply, clearly, wrong, in my mind.
        //
        //     -bob

        boolean __CLB4_0_6_bool2=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(7745);switch (token.getTokenType()) {
            case TokenTypes.AT:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7746);__CLB4_0_6_bool2=true;}
            case TokenTypes.DOUBLE_COLON:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7747);__CLB4_0_6_bool2=true;}
            case TokenTypes.LEFT_PAREN:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7748);__CLB4_0_6_bool2=true;}
            case TokenTypes.LEFT_BRACKET:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7749);__CLB4_0_6_bool2=true;}
            case TokenTypes.AND:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7750);__CLB4_0_6_bool2=true;}
            case TokenTypes.OR:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7751);__CLB4_0_6_bool2=true;}
            case TokenTypes.MOD:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7752);__CLB4_0_6_bool2=true;}
            case TokenTypes.DIV:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7753);__CLB4_0_6_bool2=true;}
            case TokenTypes.COLON:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7754);__CLB4_0_6_bool2=true;}
            case TokenTypes.SLASH:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7755);__CLB4_0_6_bool2=true;}
            case TokenTypes.DOUBLE_SLASH:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7756);__CLB4_0_6_bool2=true;}
            case TokenTypes.PIPE:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7757);__CLB4_0_6_bool2=true;}
            case TokenTypes.DOLLAR:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7758);__CLB4_0_6_bool2=true;}
            case TokenTypes.PLUS:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7759);__CLB4_0_6_bool2=true;}
            case TokenTypes.MINUS:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7760);__CLB4_0_6_bool2=true;}
            case TokenTypes.STAR_OPERATOR:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7761);__CLB4_0_6_bool2=true;}
            case TokenTypes.COMMA:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7762);__CLB4_0_6_bool2=true;}
            case TokenTypes.LESS_THAN_SIGN:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7763);__CLB4_0_6_bool2=true;}
            case TokenTypes.GREATER_THAN_SIGN:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7764);__CLB4_0_6_bool2=true;}
            case TokenTypes.LESS_THAN_OR_EQUALS_SIGN:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7765);__CLB4_0_6_bool2=true;}
            case TokenTypes.GREATER_THAN_OR_EQUALS_SIGN:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7766);__CLB4_0_6_bool2=true;}
            case TokenTypes.EQUALS:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7767);__CLB4_0_6_bool2=true;}
            case TokenTypes.NOT_EQUALS:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7768);__CLB4_0_6_bool2=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7769);expectOperator = false;
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7770);break;
            }
            default:if (!__CLB4_0_6_bool2) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7771);__CLB4_0_6_bool2=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7772);expectOperator = true;
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7773);break;
            }
        }

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7774);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token identifierOrOperatorName() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7775);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7776);Token token = null;
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7777);if ((((expectOperator)&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7778)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7779)==0&false))) {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7780);token = operatorName();
        } }else {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7781);token = identifier();
        }
        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7782);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token identifier() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7783);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7784);Token token = null;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7785);int start = this.currentPosition;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7786);while ((((hasMoreChars())&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7787)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7788)==0&false))) {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7789);if ((((Verifier.isXMLNCNameCharacter(LA(1)))&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7790)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7791)==0&false))) {{
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7792);consume();
            } }else {{
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7793);break;
            }
        }}

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7794);token = new Token(TokenTypes.IDENTIFIER,
                getXPath(),
                start,
                this.currentPosition);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7795);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token operatorName() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7796);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7797);Token token = null;

        boolean __CLB4_0_6_bool3=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(7798);switch (LA(1)) {
            case 'a':if (!__CLB4_0_6_bool3) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7799);__CLB4_0_6_bool3=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7800);token = and();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7801);break;
            }

            case 'o':if (!__CLB4_0_6_bool3) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7802);__CLB4_0_6_bool3=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7803);token = or();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7804);break;
            }

            case 'm':if (!__CLB4_0_6_bool3) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7805);__CLB4_0_6_bool3=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7806);token = mod();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7807);break;
            }

            case 'd':if (!__CLB4_0_6_bool3) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7808);__CLB4_0_6_bool3=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7809);token = div();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7810);break;
            }
        }

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7811);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token mod() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7812);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7813);Token token = null;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7814);if (((((LA(1) == 'm')
                &&
                (LA(2) == 'o')
                &&
                (LA(3) == 'd')
        )&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7815)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7816)==0&false))) {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7817);token = new Token(TokenTypes.MOD,
                    getXPath(),
                    this.currentPosition,
                    this.currentPosition + 3);

            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7818);consume();
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7819);consume();
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7820);consume();
        }

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7821);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token div() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7822);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7823);Token token = null;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7824);if (((((LA(1) == 'd')
                &&
                (LA(2) == 'i')
                &&
                (LA(3) == 'v')
        )&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7825)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7826)==0&false))) {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7827);token = new Token(TokenTypes.DIV,
                    getXPath(),
                    this.currentPosition,
                    this.currentPosition + 3);

            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7828);consume();
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7829);consume();
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7830);consume();
        }

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7831);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token and() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7832);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7833);Token token = null;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7834);if (((((LA(1) == 'a')
                &&
                (LA(2) == 'n')
                &&
                (LA(3) == 'd')
        )&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7835)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7836)==0&false))) {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7837);token = new Token(TokenTypes.AND,
                    getXPath(),
                    this.currentPosition,
                    this.currentPosition + 3);

            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7838);consume();
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7839);consume();
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7840);consume();
        }

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7841);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token or() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7842);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7843);Token token = null;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7844);if (((((LA(1) == 'o')
                &&
                (LA(2) == 'r')
        )&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7845)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7846)==0&false))) {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7847);token = new Token(TokenTypes.OR,
                    getXPath(),
                    this.currentPosition,
                    this.currentPosition + 2);

            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7848);consume();
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7849);consume();
        }

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7850);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token number() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7851);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7852);int start = this.currentPosition;
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7853);boolean periodAllowed = true;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7854);loop:
        while (true) {{
            boolean __CLB4_0_6_bool4=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(7855);switch (LA(1)) {
                case '.':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7856);__CLB4_0_6_bool4=true;}
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7857);if ((((periodAllowed)&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7858)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7859)==0&false))) {{
                        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7860);periodAllowed = false;
                        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7861);consume();
                    } }else {{
                        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7862);break loop;
                    }
                    }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7863);break;
                case '0':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7864);__CLB4_0_6_bool4=true;}
                case '1':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7865);__CLB4_0_6_bool4=true;}
                case '2':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7866);__CLB4_0_6_bool4=true;}
                case '3':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7867);__CLB4_0_6_bool4=true;}
                case '4':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7868);__CLB4_0_6_bool4=true;}
                case '5':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7869);__CLB4_0_6_bool4=true;}
                case '6':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7870);__CLB4_0_6_bool4=true;}
                case '7':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7871);__CLB4_0_6_bool4=true;}
                case '8':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7872);__CLB4_0_6_bool4=true;}
                case '9':if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7873);__CLB4_0_6_bool4=true;}
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7874);consume();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7875);break;
                default:if (!__CLB4_0_6_bool4) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7876);__CLB4_0_6_bool4=true;}
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7877);break loop;
            }
        }

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7878);return new Token(TokenTypes.DOUBLE,
                getXPath(),
                start,
                this.currentPosition);
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token whitespace() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7879);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7880);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7881);loop:
        while ((((hasMoreChars())&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7882)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7883)==0&false))) {{
            boolean __CLB4_0_6_bool5=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(7884);switch (LA(1)) {
                case ' ':if (!__CLB4_0_6_bool5) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7885);__CLB4_0_6_bool5=true;}
                case '\t':if (!__CLB4_0_6_bool5) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7886);__CLB4_0_6_bool5=true;}
                case '\n':if (!__CLB4_0_6_bool5) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7887);__CLB4_0_6_bool5=true;}
                case '\r':if (!__CLB4_0_6_bool5) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7888);__CLB4_0_6_bool5=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7889);consume();
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7890);break;
                }

                default:if (!__CLB4_0_6_bool5) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7891);__CLB4_0_6_bool5=true;} {
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7892);break loop;
                }
            }
        }

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7893);return new Token(TokenTypes.SKIP,
                getXPath(),
                0,
                0);
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token comma() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7894);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7895);Token token = new Token(TokenTypes.COMMA,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7896);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7897);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token equals() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7898);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7899);Token token = new Token(TokenTypes.EQUALS,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7900);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7901);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token minus() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7902);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7903);Token token = new Token(TokenTypes.MINUS,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7904);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7905);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token plus() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7906);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7907);Token token = new Token(TokenTypes.PLUS,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7908);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7909);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token dollar() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7910);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7911);Token token = new Token(TokenTypes.DOLLAR,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7912);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7913);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token pipe() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7914);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7915);Token token = new Token(TokenTypes.PIPE,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7916);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7917);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token at() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7918);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7919);Token token = new Token(TokenTypes.AT,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7920);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7921);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token colon() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7922);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7923);Token token = new Token(TokenTypes.COLON,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7924);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7925);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token doubleColon() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7926);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7927);Token token = new Token(TokenTypes.DOUBLE_COLON,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 2);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7928);consume();
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7929);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7930);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token notEquals() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7931);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7932);Token token = new Token(TokenTypes.NOT_EQUALS,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 2);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7933);consume();
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7934);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7935);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token relationalOperator() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7936);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7937);Token token = null;

        boolean __CLB4_0_6_bool6=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(7938);switch (LA(1)) {
            case '<':if (!__CLB4_0_6_bool6) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7939);__CLB4_0_6_bool6=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7940);if ((((LA(2) == '=')&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7941)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7942)==0&false))) {{
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7943);token = new Token(TokenTypes.LESS_THAN_OR_EQUALS_SIGN,
                            getXPath(),
                            this.currentPosition,
                            this.currentPosition + 2);
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7944);consume();
                } }else {{
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7945);token = new Token(TokenTypes.LESS_THAN_SIGN,
                            getXPath(),
                            this.currentPosition,
                            this.currentPosition + 1);
                }

                }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7946);consume();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7947);break;
            }
            case '>':if (!__CLB4_0_6_bool6) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7948);__CLB4_0_6_bool6=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7949);if ((((LA(2) == '=')&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7950)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7951)==0&false))) {{
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7952);token = new Token(TokenTypes.GREATER_THAN_OR_EQUALS_SIGN,
                            getXPath(),
                            this.currentPosition,
                            this.currentPosition + 2);
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7953);consume();
                } }else {{
                    __CLR4_0_65vp5vpl1l0dwb1.R.inc(7954);token = new Token(TokenTypes.GREATER_THAN_SIGN,
                            getXPath(),
                            this.currentPosition,
                            this.currentPosition + 1);
                }

                }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7955);consume();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7956);break;
            }
        }

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7957);return token;

    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    // ????
    private Token star() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7958);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7959);int tokenType = (((expectOperator )&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7960)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7961)==0&false))? TokenTypes.STAR_OPERATOR : TokenTypes.STAR;
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7962);Token token = new Token(tokenType,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7963);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7964);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token literal() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7965);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7966);Token token = null;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7967);char match = LA(1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7968);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7969);int start = this.currentPosition;

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7970);while (((((token == null)
                &&
                hasMoreChars())&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7971)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7972)==0&false))) {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(7973);if ((((LA(1) == match)&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7974)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(7975)==0&false))) {{
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7976);token = new Token(TokenTypes.LITERAL,
                        getXPath(),
                        start,
                        this.currentPosition);
            }
            }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7977);consume();
        }

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(7978);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token dots() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7979);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7980);Token token = null;

        boolean __CLB4_0_6_bool7=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(7981);switch (LA(2)) {
            case '.':if (!__CLB4_0_6_bool7) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7982);__CLB4_0_6_bool7=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7983);token = new Token(TokenTypes.DOT_DOT,
                        getXPath(),
                        this.currentPosition,
                        this.currentPosition + 2);
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7984);consume();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7985);consume();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7986);break;
            }
            default:if (!__CLB4_0_6_bool7) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(7987);__CLB4_0_6_bool7=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7988);token = new Token(TokenTypes.DOT,
                        getXPath(),
                        this.currentPosition,
                        this.currentPosition + 1);
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7989);consume();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(7990);break;
            }
        }

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7991);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token leftBracket() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7992);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7993);Token token = new Token(TokenTypes.LEFT_BRACKET,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7994);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7995);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token rightBracket() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(7996);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7997);Token token = new Token(TokenTypes.RIGHT_BRACKET,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7998);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(7999);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token leftParen() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(8000);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8001);Token token = new Token(TokenTypes.LEFT_PAREN,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8002);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8003);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token rightParen() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(8004);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8005);Token token = new Token(TokenTypes.RIGHT_PAREN,
                getXPath(),
                this.currentPosition,
                this.currentPosition + 1);

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8006);consume();

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8007);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private Token slashes() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(8008);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8009);Token token = null;

        boolean __CLB4_0_6_bool8=false;__CLR4_0_65vp5vpl1l0dwb1.R.inc(8010);switch (LA(2)) {
            case '/':if (!__CLB4_0_6_bool8) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(8011);__CLB4_0_6_bool8=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(8012);token = new Token(TokenTypes.DOUBLE_SLASH,
                        getXPath(),
                        this.currentPosition,
                        this.currentPosition + 2);
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(8013);consume();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(8014);consume();
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(8015);break;
            }
            default:if (!__CLB4_0_6_bool8) {__CLR4_0_65vp5vpl1l0dwb1.R.inc(8016);__CLB4_0_6_bool8=true;} {
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(8017);token = new Token(TokenTypes.SLASH,
                        getXPath(),
                        this.currentPosition,
                        this.currentPosition + 1);
                __CLR4_0_65vp5vpl1l0dwb1.R.inc(8018);consume();
            }
        }

        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8019);return token;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private char LA(int i) {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(8020);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8021);if ((((currentPosition + (i - 1) >= this.endPosition)&&(__CLR4_0_65vp5vpl1l0dwb1.R.iget(8022)!=0|true))||(__CLR4_0_65vp5vpl1l0dwb1.R.iget(8023)==0&false))) {{
            __CLR4_0_65vp5vpl1l0dwb1.R.inc(8024);return (char) -1;
        }

        }__CLR4_0_65vp5vpl1l0dwb1.R.inc(8025);return getXPath().charAt(this.currentPosition + (i - 1));
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private void consume() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(8026);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8027);++this.currentPosition;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

    private boolean hasMoreChars() {try{__CLR4_0_65vp5vpl1l0dwb1.R.inc(8028);
        __CLR4_0_65vp5vpl1l0dwb1.R.inc(8029);return this.currentPosition < this.endPosition;
    }finally{__CLR4_0_65vp5vpl1l0dwb1.R.flushNeeded();}}

}
