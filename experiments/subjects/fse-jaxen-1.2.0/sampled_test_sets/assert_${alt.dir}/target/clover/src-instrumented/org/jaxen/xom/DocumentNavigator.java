/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ *//*
 * $Header$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Copyright 2000-2003 bob mcwhirter & James Strachan.
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


package org.jaxen.xom;


import nu.xom.*;
import org.jaxen.*;
import org.jaxen.saxpath.SAXPathException;
import org.jaxen.util.SingleObjectIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Interface for navigating around the XOM object model.
 *
 * <p>
 * This class is not intended for direct usage, but is
 * used by the Jaxen engine during evaluation.
 * </p>
 *
 * @see XPath
 */
public class DocumentNavigator extends org.jaxen.DefaultNavigator {public static class __CLR4_0_66xp6xpl1l0dwfb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,9209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    private static final long serialVersionUID = 3159311338575942877L;

    public boolean isAttribute(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(8989);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(8990);return o instanceof Attribute;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public boolean isComment(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(8991);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(8992);return o instanceof Comment;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public boolean isDocument(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(8993);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(8994);return o instanceof Document;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public boolean isElement(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(8995);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(8996);return o instanceof Element;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public boolean isNamespace(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(8997);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(8998);return o instanceof XPathNamespace;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public boolean isProcessingInstruction(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(8999);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9000);return o instanceof ProcessingInstruction;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public boolean isText(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9001);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9002);return o instanceof Text;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public String getAttributeName(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9003);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9004);return ((((isAttribute(o) )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9005)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9006)==0&false))? ((Attribute) o).getLocalName() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getAttributeNamespaceUri(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9007);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9008);return ((((isAttribute(o) )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9009)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9010)==0&false))? ((Attribute) o).getNamespaceURI() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getAttributeQName(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9011);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9012);return ((((isAttribute(o) )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9013)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9014)==0&false))? ((Attribute) o).getQualifiedName() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getAttributeStringValue(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9015);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9016);return ((((isAttribute(o) )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9017)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9018)==0&false))? ((Attribute) o).getValue() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public String getCommentStringValue(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9019);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9020);return ((((isComment(o) )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9021)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9022)==0&false))? ((Comment) o).getValue() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getElementName(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9023);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9024);return ((((isElement(o) )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9025)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9026)==0&false))? ((Element) o).getLocalName() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getElementNamespaceUri(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9027);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9028);return ((((isElement(o) )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9029)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9030)==0&false))? ((Element) o).getNamespaceURI() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getElementQName(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9031);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9032);return ((((isElement(o) )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9033)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9034)==0&false))? ((Element) o).getQualifiedName() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getElementStringValue(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9035);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9036);return ((((o instanceof Node )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9037)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9038)==0&false))? ((Node) o).getValue() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public String getNamespacePrefix(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9039);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9040);if ((((isElement(o))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9041)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9042)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9043);return ((Element) o).getNamespacePrefix();
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9044);if ((((isAttribute(o))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9045)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9046)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9047);return ((Attribute) o).getNamespacePrefix();
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9048);if ((((o instanceof XPathNamespace)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9049)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9050)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9051);return ((XPathNamespace) o).getNamespacePrefix();
        }
        }}}__CLR4_0_66xp6xpl1l0dwfb.R.inc(9052);return null;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getNamespaceStringValue(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9053);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9054);if ((((isElement(o))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9055)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9056)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9057);return ((Element) o).getNamespaceURI();
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9058);if ((((isAttribute(o))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9059)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9060)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9061);return ((Attribute) o).getNamespaceURI();
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9062);if ((((o instanceof XPathNamespace)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9063)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9064)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9065);return ((XPathNamespace) o).getNamespaceURI();
        }
        }}}__CLR4_0_66xp6xpl1l0dwfb.R.inc(9066);return null;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public String getTextStringValue(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9067);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9068);return ((((o instanceof Text )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9069)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9070)==0&false))? ((Text) o).getValue() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public Object getDocument(String s) throws FunctionCallException {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9071);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9072);try {
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9073);return new Builder(new NodeFactory()).build(s);
        } catch (Exception pe) {
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9074);throw new FunctionCallException(pe);
        }
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public Object getDocumentNode(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9075);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9076);ParentNode parent = null;
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9077);if ((((o instanceof ParentNode)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9078)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9079)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9080);parent = (ParentNode) o;
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9081);if ((((o instanceof Node)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9082)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9083)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9084);parent = ((Node) o).getParent();
        }
        }}__CLR4_0_66xp6xpl1l0dwfb.R.inc(9085);return parent.getDocument();
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public Iterator getAttributeAxisIterator(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9086);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9087);if ((((isElement(o))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9088)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9089)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9090);return new IndexIterator(o, 0, ((Element) o).getAttributeCount()) {
                public Object get(Object o, int i) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9091);
                    __CLR4_0_66xp6xpl1l0dwfb.R.inc(9092);return ((Element) o).getAttribute(i);
                }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}
            };
        }
        }__CLR4_0_66xp6xpl1l0dwfb.R.inc(9093);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public Iterator getChildAxisIterator(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9094);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9095);if ((((isElement(o) || (o instanceof Document))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9096)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9097)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9098);return new IndexIterator(o, 0, ((ParentNode) o).getChildCount()) {
                public Object get(Object o, int i) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9099);
                    __CLR4_0_66xp6xpl1l0dwfb.R.inc(9100);return ((ParentNode) o).getChild(i);
                }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}
            };
        }
        }__CLR4_0_66xp6xpl1l0dwfb.R.inc(9101);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public Iterator getParentAxisIterator(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9102);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9103);Object parent = null;
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9104);if ((((o instanceof Node)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9105)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9106)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9107);parent = ((Node) o).getParent();
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9108);if ((((isNamespace(o))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9109)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9110)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9111);parent = ((XPathNamespace) o).getElement();
        }
        }}__CLR4_0_66xp6xpl1l0dwfb.R.inc(9112);return ((((parent != null )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9113)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9114)==0&false))? new SingleObjectIterator(parent) : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public Object getParentNode(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9115);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9116);return ((((o instanceof Node )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9117)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9118)==0&false))? ((Node) o).getParent() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public Iterator getPrecedingAxisIterator(Object o) throws UnsupportedAxisException {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9119);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9120);return super.getPrecedingAxisIterator(o);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public Iterator getPrecedingSiblingAxisIterator(Object o) throws UnsupportedAxisException {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9121);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9122);return super.getPrecedingSiblingAxisIterator(o);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String getProcessingInstructionData(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9123);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9124);return ((((o instanceof ProcessingInstruction )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9125)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9126)==0&false))? ((ProcessingInstruction) o).getValue() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public String getProcessingInstructionTarget(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9127);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9128);return ((((o instanceof ProcessingInstruction )&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9129)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9130)==0&false))? ((ProcessingInstruction) o).getTarget() : null);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    public String translateNamespacePrefixToUri(String s, Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9131);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9132);Element element = null;
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9133);if ((((o instanceof Element)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9134)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9135)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9136);element = (Element) o;
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9137);if ((((o instanceof ParentNode)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9138)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9139)==0&false))) {{
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9140);if ((((o instanceof Node)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9141)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9142)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9143);element = (Element) ((Node) o).getParent();
        } }else {__CLR4_0_66xp6xpl1l0dwfb.R.inc(9144);if ((((o instanceof XPathNamespace)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9145)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9146)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9147);element = ((XPathNamespace) o).getElement();
        }
        }}}}__CLR4_0_66xp6xpl1l0dwfb.R.inc(9148);if ((((element != null)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9149)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9150)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9151);return element.getNamespaceURI(s);
        }
        }__CLR4_0_66xp6xpl1l0dwfb.R.inc(9152);return null;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public XPath parseXPath(String s) throws SAXPathException {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9153);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9154);return new BaseXPath(s, this);
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    private boolean addNamespaceForElement(Element elt, String uri, String prefix, Map map) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9155);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9156);if ((((uri != null && uri.length() > 0 && (!map.containsKey(prefix)))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9157)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9158)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9159);map.put(prefix, new XPathNamespace(elt, uri, prefix));
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9160);return true;
        }
        }__CLR4_0_66xp6xpl1l0dwfb.R.inc(9161);return false;
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    public Iterator getNamespaceAxisIterator(Object o) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9162);
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9163);if ((((!isElement(o))&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9164)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9165)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9166);return JaxenConstants.EMPTY_ITERATOR;
        }
        }__CLR4_0_66xp6xpl1l0dwfb.R.inc(9167);Map nsMap = new HashMap();
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9168);Element elt = (Element) o;
        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9169);ParentNode parent = elt;

        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9170);while ((((parent instanceof Element)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9171)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9172)==0&false))) {{
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9173);elt = (Element) parent;
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9174);String uri = elt.getNamespaceURI();
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9175);String prefix = elt.getNamespacePrefix();
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9176);addNamespaceForElement(elt, uri, prefix, nsMap);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9177);int count = elt.getNamespaceDeclarationCount();
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9178);for (int i = 0; (((i < count)&&(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9179)!=0|true))||(__CLR4_0_66xp6xpl1l0dwfb.R.iget(9180)==0&false)); i++) {{
                __CLR4_0_66xp6xpl1l0dwfb.R.inc(9181);prefix = elt.getNamespacePrefix(i);
                __CLR4_0_66xp6xpl1l0dwfb.R.inc(9182);uri = elt.getNamespaceURI(prefix);
                __CLR4_0_66xp6xpl1l0dwfb.R.inc(9183);addNamespaceForElement(elt, uri, prefix, nsMap);
            }
            }__CLR4_0_66xp6xpl1l0dwfb.R.inc(9184);parent = elt.getParent();
        }
        }__CLR4_0_66xp6xpl1l0dwfb.R.inc(9185);addNamespaceForElement(elt, "http://www.w3.org/XML/1998/namespace", "xml", nsMap);

        __CLR4_0_66xp6xpl1l0dwfb.R.inc(9186);return nsMap.values().iterator();
    }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

    //

    private abstract static class IndexIterator implements Iterator {
        private Object o = null;
        private int pos = 0, end = -1;

        public IndexIterator(Object o, int pos, int end) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9187);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9188);this.o = o;
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9189);this.pos = pos;
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9190);this.end = end;
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

        public boolean hasNext() {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9191);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9192);return pos < end;
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

        public abstract Object get(Object o, int i);

        public Object next() {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9193);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9194);return get(o, pos++);
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

        public void remove() {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9195);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9196);throw new UnsupportedOperationException();
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}
    }

    /**
     * Wrapper for XOM namespace nodes to give them a parent,
     * as required by the XPath data model.
     *
     * @author Erwin Bolwidt
     */
    private static class XPathNamespace {
        private Element element;

        private String uri, prefix;

        public XPathNamespace(Element elt, String uri, String prefix) {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9197);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9198);element = elt;
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9199);this.uri = uri;
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9200);this.prefix = prefix;
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

        /**
         * Returns the XOM element from which this namespace node has been
         * retrieved. The result may be null when the namespace node has not yet
         * been assigned to an element.
         */
        public Element getElement() {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9201);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9202);return element;
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

        public String getNamespaceURI() {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9203);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9204);return uri;
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

        public String getNamespacePrefix() {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9205);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9206);return prefix;
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}

        public String toString() {try{__CLR4_0_66xp6xpl1l0dwfb.R.inc(9207);
            __CLR4_0_66xp6xpl1l0dwfb.R.inc(9208);return ("[xmlns:" + prefix + "=\"" +
                    uri + "\", element=" +
                    element.getLocalName() + "]");
        }finally{__CLR4_0_66xp6xpl1l0dwfb.R.flushNeeded();}}
    }
}
