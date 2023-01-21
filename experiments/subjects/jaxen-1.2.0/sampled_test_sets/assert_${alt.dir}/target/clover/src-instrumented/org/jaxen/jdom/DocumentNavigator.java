/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package org.jaxen.jdom;

/*
 * $Header$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Copyright 2000-2005 bob mcwhirter & James Strachan.
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

import org.jaxen.*;
import org.jaxen.saxpath.SAXPathException;
import org.jaxen.util.SingleObjectIterator;
import org.jdom.*;
import org.jdom.input.SAXBuilder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Interface for navigating around the JDOM object model.
 *
 * <p>
 * This class is not intended for direct usage, but is
 * used by the Jaxen engine during evaluation.
 * </p>
 *
 * @author <a href="mailto:bob@werken.com">bob mcwhirter</a>
 * @author Stephen Colebourne
 * @see XPath
 */
public class DocumentNavigator extends DefaultNavigator implements NamedAccessNavigator {public static class __CLR4_0_637o37ol1l0dw1i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4481,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    private static final long serialVersionUID = -1636727587303584165L;

    public static Navigator getInstance() {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4164);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4165);return Singleton.instance;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public boolean isElement(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4166);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4167);return obj instanceof Element;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public boolean isComment(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4168);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4169);return obj instanceof Comment;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public boolean isText(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4170);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4171);return (obj instanceof Text
                ||
                obj instanceof CDATA);
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public boolean isAttribute(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4172);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4173);return obj instanceof Attribute;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public boolean isProcessingInstruction(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4174);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4175);return obj instanceof ProcessingInstruction;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public boolean isDocument(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4176);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4177);return obj instanceof Document;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public boolean isNamespace(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4178);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4179);return obj instanceof Namespace || obj instanceof XPathNamespace;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getElementName(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4180);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4181);Element elem = (Element) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4182);return elem.getName();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getElementNamespaceUri(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4183);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4184);Element elem = (Element) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4185);String uri = elem.getNamespaceURI();
        __CLR4_0_637o37ol1l0dw1i.R.inc(4186);if ((((uri != null && uri.length() == 0)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4187)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4188)==0&false)))
            {__CLR4_0_637o37ol1l0dw1i.R.inc(4189);return null;
        }else
            {__CLR4_0_637o37ol1l0dw1i.R.inc(4190);return uri;
    }}finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getAttributeName(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4191);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4192);Attribute attr = (Attribute) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4193);return attr.getName();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getAttributeNamespaceUri(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4194);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4195);Attribute attr = (Attribute) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4196);String uri = attr.getNamespaceURI();
        __CLR4_0_637o37ol1l0dw1i.R.inc(4197);if ((((uri != null && uri.length() == 0)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4198)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4199)==0&false)))
            {__CLR4_0_637o37ol1l0dw1i.R.inc(4200);return null;
        }else
            {__CLR4_0_637o37ol1l0dw1i.R.inc(4201);return uri;
    }}finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public Iterator getChildAxisIterator(Object contextNode) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4202);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4203);if ((((contextNode instanceof Element)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4204)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4205)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4206);return ((Element) contextNode).getContent().iterator();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4207);if ((((contextNode instanceof Document)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4208)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4209)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4210);return ((Document) contextNode).getContent().iterator();
        }

        }}__CLR4_0_637o37ol1l0dw1i.R.inc(4211);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    /**
     * Retrieves an <code>Iterator</code> over the child elements that
     * match the supplied local name and namespace URI.
     *
     * @param contextNode     the origin context node
     * @param localName       the local name of the children to return, always present
     * @param namespacePrefix ignored; prefixes are not used when matching in XPath
     * @param namespaceURI    the URI of the namespace of the children to return
     * @return an Iterator     that traverses the named children, or null if none
     */
    public Iterator getChildAxisIterator(
            Object contextNode, String localName, String namespacePrefix, String namespaceURI) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4212);

        __CLR4_0_637o37ol1l0dw1i.R.inc(4213);if ((((contextNode instanceof Element)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4214)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4215)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4216);Element node = (Element) contextNode;
            __CLR4_0_637o37ol1l0dw1i.R.inc(4217);if ((((namespaceURI == null)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4218)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4219)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4220);return node.getChildren(localName).iterator();
            }
            }__CLR4_0_637o37ol1l0dw1i.R.inc(4221);return node.getChildren(localName, Namespace.getNamespace(namespacePrefix, namespaceURI)).iterator();
        }
        }__CLR4_0_637o37ol1l0dw1i.R.inc(4222);if ((((contextNode instanceof Document)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4223)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4224)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4225);Document node = (Document) contextNode;

            __CLR4_0_637o37ol1l0dw1i.R.inc(4226);Element el = node.getRootElement();
            __CLR4_0_637o37ol1l0dw1i.R.inc(4227);if ((((el.getName().equals(localName) == false)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4228)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4229)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4230);return JaxenConstants.EMPTY_ITERATOR;
            }
            }__CLR4_0_637o37ol1l0dw1i.R.inc(4231);if ((((namespaceURI != null)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4232)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4233)==0&false))) {{
                // JDOM's equals method does not consider the prefix when comparing namespace objects
                __CLR4_0_637o37ol1l0dw1i.R.inc(4234);if ((((!Namespace.getNamespace(namespacePrefix, namespaceURI).equals(el.getNamespace()))&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4235)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4236)==0&false))) {{
                    __CLR4_0_637o37ol1l0dw1i.R.inc(4237);return JaxenConstants.EMPTY_ITERATOR;
                }
            }} }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4238);if ((((el.getNamespace() != Namespace.NO_NAMESPACE)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4239)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4240)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4241);return JaxenConstants.EMPTY_ITERATOR;
            }

            }}__CLR4_0_637o37ol1l0dw1i.R.inc(4242);return new SingleObjectIterator(el);
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4243);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public Iterator getNamespaceAxisIterator(Object contextNode) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4244);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4245);if ((((!(contextNode instanceof Element))&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4246)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4247)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4248);return JaxenConstants.EMPTY_ITERATOR;
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4249);Element elem = (Element) contextNode;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4250);Map nsMap = new HashMap();

        __CLR4_0_637o37ol1l0dw1i.R.inc(4251);Element current = elem;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4252);while ((((current != null)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4253)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4254)==0&false))) {{

            __CLR4_0_637o37ol1l0dw1i.R.inc(4255);Namespace ns = current.getNamespace();

            __CLR4_0_637o37ol1l0dw1i.R.inc(4256);if ((((ns != Namespace.NO_NAMESPACE)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4257)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4258)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4259);if ((((!nsMap.containsKey(ns.getPrefix()))&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4260)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4261)==0&false)))
                    {__CLR4_0_637o37ol1l0dw1i.R.inc(4262);nsMap.put(ns.getPrefix(), new XPathNamespace(elem, ns));
            }}

            }__CLR4_0_637o37ol1l0dw1i.R.inc(4263);Iterator additional = current.getAdditionalNamespaces().iterator();

            __CLR4_0_637o37ol1l0dw1i.R.inc(4264);while ((((additional.hasNext())&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4265)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4266)==0&false))) {{

                __CLR4_0_637o37ol1l0dw1i.R.inc(4267);ns = (Namespace) additional.next();
                __CLR4_0_637o37ol1l0dw1i.R.inc(4268);if ((((!nsMap.containsKey(ns.getPrefix()))&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4269)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4270)==0&false)))
                    {__CLR4_0_637o37ol1l0dw1i.R.inc(4271);nsMap.put(ns.getPrefix(), new XPathNamespace(elem, ns));
            }}

            }__CLR4_0_637o37ol1l0dw1i.R.inc(4272);Iterator attributes = current.getAttributes().iterator();

            __CLR4_0_637o37ol1l0dw1i.R.inc(4273);while ((((attributes.hasNext())&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4274)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4275)==0&false))) {{

                __CLR4_0_637o37ol1l0dw1i.R.inc(4276);Attribute attribute = (Attribute) attributes.next();

                __CLR4_0_637o37ol1l0dw1i.R.inc(4277);Namespace attrNS = attribute.getNamespace();

                __CLR4_0_637o37ol1l0dw1i.R.inc(4278);if ((((attrNS != Namespace.NO_NAMESPACE)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4279)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4280)==0&false))) {{
                    __CLR4_0_637o37ol1l0dw1i.R.inc(4281);if ((((!nsMap.containsKey(attrNS.getPrefix()))&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4282)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4283)==0&false)))
                        {__CLR4_0_637o37ol1l0dw1i.R.inc(4284);nsMap.put(attrNS.getPrefix(), new XPathNamespace(elem, attrNS));
                }}
            }}

            }__CLR4_0_637o37ol1l0dw1i.R.inc(4285);if ((((current.getParent() instanceof Element)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4286)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4287)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4288);current = (Element) current.getParent();
            } }else {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4289);current = null;
            }
        }}

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4290);nsMap.put("xml", new XPathNamespace(elem, Namespace.XML_NAMESPACE));

        __CLR4_0_637o37ol1l0dw1i.R.inc(4291);return nsMap.values().iterator();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public Iterator getParentAxisIterator(Object contextNode) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4292);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4293);Object parent = null;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4294);if ((((contextNode instanceof Document)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4295)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4296)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4297);return JaxenConstants.EMPTY_ITERATOR;
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4298);if ((((contextNode instanceof Element)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4299)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4300)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4301);parent = ((Element) contextNode).getParent();

            __CLR4_0_637o37ol1l0dw1i.R.inc(4302);if ((((parent == null)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4303)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4304)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4305);if ((((((Element) contextNode).isRootElement())&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4306)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4307)==0&false))) {{
                    __CLR4_0_637o37ol1l0dw1i.R.inc(4308);parent = ((Element) contextNode).getDocument();
                }
            }}
        }} }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4309);if ((((contextNode instanceof Attribute)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4310)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4311)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4312);parent = ((Attribute) contextNode).getParent();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4313);if ((((contextNode instanceof XPathNamespace)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4314)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4315)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4316);parent = ((XPathNamespace) contextNode).getJDOMElement();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4317);if ((((contextNode instanceof ProcessingInstruction)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4318)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4319)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4320);parent = ((ProcessingInstruction) contextNode).getParent();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4321);if ((((contextNode instanceof Comment)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4322)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4323)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4324);parent = ((Comment) contextNode).getParent();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4325);if ((((contextNode instanceof Text)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4326)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4327)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4328);parent = ((Text) contextNode).getParent();
        }

        }}}}}}}__CLR4_0_637o37ol1l0dw1i.R.inc(4329);if ((((parent != null)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4330)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4331)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4332);return new SingleObjectIterator(parent);
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4333);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public Iterator getAttributeAxisIterator(Object contextNode) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4334);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4335);if ((((!(contextNode instanceof Element))&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4336)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4337)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4338);return JaxenConstants.EMPTY_ITERATOR;
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4339);Element elem = (Element) contextNode;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4340);return elem.getAttributes().iterator();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    /**
     * Retrieves an <code>Iterator</code> over the attribute elements that
     * match the supplied name.
     *
     * @param contextNode     the origin context node
     * @param localName       the local name of the attributes to return, always present
     * @param namespacePrefix the prefix of the namespace of the attributes to return
     * @param namespaceURI    the URI of the namespace of the attributes to return
     * @return an Iterator     that traverses the named attributes, not null
     */
    public Iterator getAttributeAxisIterator(
            Object contextNode, String localName, String namespacePrefix, String namespaceURI) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4341);

        __CLR4_0_637o37ol1l0dw1i.R.inc(4342);if ((((contextNode instanceof Element)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4343)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4344)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4345);Element node = (Element) contextNode;
            __CLR4_0_637o37ol1l0dw1i.R.inc(4346);Namespace namespace = ((((namespaceURI == null )&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4347)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4348)==0&false))? Namespace.NO_NAMESPACE :
                    Namespace.getNamespace(namespacePrefix, namespaceURI));
            __CLR4_0_637o37ol1l0dw1i.R.inc(4349);Attribute attr = node.getAttribute(localName, namespace);
            __CLR4_0_637o37ol1l0dw1i.R.inc(4350);if ((((attr != null)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4351)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4352)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4353);return new SingleObjectIterator(attr);
            }
        }}
        }__CLR4_0_637o37ol1l0dw1i.R.inc(4354);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    /**
     * Returns a parsed form of the given XPath string, which will be suitable
     * for queries on JDOM documents.
     */
    public XPath parseXPath(String xpath) throws SAXPathException {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4355);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4356);return new JDOMXPath(xpath);
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public Object getDocumentNode(Object contextNode) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4357);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4358);if ((((contextNode instanceof Document)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4359)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4360)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4361);return contextNode;
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4362);Element elem = (Element) contextNode;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4363);return elem.getDocument();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getElementQName(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4364);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4365);Element elem = (Element) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4366);String prefix = elem.getNamespacePrefix();

        __CLR4_0_637o37ol1l0dw1i.R.inc(4367);if ((((prefix == null || prefix.length() == 0)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4368)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4369)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4370);return elem.getName();
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4371);return prefix + ":" + elem.getName();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getAttributeQName(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4372);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4373);Attribute attr = (Attribute) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4374);String prefix = attr.getNamespacePrefix();

        __CLR4_0_637o37ol1l0dw1i.R.inc(4375);if ((((prefix == null || "".equals(prefix))&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4376)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4377)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4378);return attr.getName();
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4379);return prefix + ":" + attr.getName();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getNamespaceStringValue(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4380);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4381);if ((((obj instanceof Namespace)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4382)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4383)==0&false))) {{

            __CLR4_0_637o37ol1l0dw1i.R.inc(4384);Namespace ns = (Namespace) obj;
            __CLR4_0_637o37ol1l0dw1i.R.inc(4385);return ns.getURI();
        } }else {{

            __CLR4_0_637o37ol1l0dw1i.R.inc(4386);XPathNamespace ns = (XPathNamespace) obj;
            __CLR4_0_637o37ol1l0dw1i.R.inc(4387);return ns.getJDOMNamespace().getURI();
        }

    }}finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getNamespacePrefix(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4388);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4389);if ((((obj instanceof Namespace)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4390)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4391)==0&false))) {{

            __CLR4_0_637o37ol1l0dw1i.R.inc(4392);Namespace ns = (Namespace) obj;
            __CLR4_0_637o37ol1l0dw1i.R.inc(4393);return ns.getPrefix();
        } }else {{

            __CLR4_0_637o37ol1l0dw1i.R.inc(4394);XPathNamespace ns = (XPathNamespace) obj;
            __CLR4_0_637o37ol1l0dw1i.R.inc(4395);return ns.getJDOMNamespace().getPrefix();
        }
    }}finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getTextStringValue(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4396);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4397);if ((((obj instanceof Text)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4398)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4399)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4400);return ((Text) obj).getText();
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4401);if ((((obj instanceof CDATA)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4402)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4403)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4404);return ((CDATA) obj).getText();
        }

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4405);return "";
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getAttributeStringValue(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4406);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4407);Attribute attr = (Attribute) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4408);return attr.getValue();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getElementStringValue(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4409);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4410);Element elem = (Element) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4411);StringBuffer buf = new StringBuffer();

        __CLR4_0_637o37ol1l0dw1i.R.inc(4412);List content = elem.getContent();
        __CLR4_0_637o37ol1l0dw1i.R.inc(4413);Iterator contentIter = content.iterator();
        __CLR4_0_637o37ol1l0dw1i.R.inc(4414);Object each = null;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4415);while ((((contentIter.hasNext())&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4416)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4417)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4418);each = contentIter.next();

            __CLR4_0_637o37ol1l0dw1i.R.inc(4419);if ((((each instanceof Text)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4420)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4421)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4422);buf.append(((Text) each).getText());
            } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4423);if ((((each instanceof CDATA)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4424)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4425)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4426);buf.append(((CDATA) each).getText());
            } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4427);if ((((each instanceof Element)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4428)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4429)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4430);buf.append(getElementStringValue(each));
            }
        }}}}

        }__CLR4_0_637o37ol1l0dw1i.R.inc(4431);return buf.toString();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getProcessingInstructionTarget(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4432);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4433);ProcessingInstruction pi = (ProcessingInstruction) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4434);return pi.getTarget();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getProcessingInstructionData(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4435);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4436);ProcessingInstruction pi = (ProcessingInstruction) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4437);return pi.getData();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String getCommentStringValue(Object obj) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4438);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4439);Comment cmt = (Comment) obj;

        __CLR4_0_637o37ol1l0dw1i.R.inc(4440);return cmt.getText();
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public String translateNamespacePrefixToUri(String prefix, Object context) {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4441);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4442);Element element = null;
        __CLR4_0_637o37ol1l0dw1i.R.inc(4443);if ((((context instanceof Element)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4444)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4445)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4446);element = (Element) context;
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4447);if ((((context instanceof Text)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4448)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4449)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4450);element = (Element) ((Text) context).getParent();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4451);if ((((context instanceof Attribute)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4452)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4453)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4454);element = ((Attribute) context).getParent();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4455);if ((((context instanceof XPathNamespace)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4456)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4457)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4458);element = ((XPathNamespace) context).getJDOMElement();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4459);if ((((context instanceof Comment)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4460)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4461)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4462);element = (Element) ((Comment) context).getParent();
        } }else {__CLR4_0_637o37ol1l0dw1i.R.inc(4463);if ((((context instanceof ProcessingInstruction)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4464)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4465)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4466);element = (Element) ((ProcessingInstruction) context).getParent();
        }

        }}}}}}__CLR4_0_637o37ol1l0dw1i.R.inc(4467);if ((((element != null)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4468)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4469)==0&false))) {{
            __CLR4_0_637o37ol1l0dw1i.R.inc(4470);Namespace namespace = element.getNamespace(prefix);

            __CLR4_0_637o37ol1l0dw1i.R.inc(4471);if ((((namespace != null)&&(__CLR4_0_637o37ol1l0dw1i.R.iget(4472)!=0|true))||(__CLR4_0_637o37ol1l0dw1i.R.iget(4473)==0&false))) {{
                __CLR4_0_637o37ol1l0dw1i.R.inc(4474);return namespace.getURI();
            }
        }}
        }__CLR4_0_637o37ol1l0dw1i.R.inc(4475);return null;
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    public Object getDocument(String url) throws FunctionCallException {try{__CLR4_0_637o37ol1l0dw1i.R.inc(4476);
        __CLR4_0_637o37ol1l0dw1i.R.inc(4477);try {
            __CLR4_0_637o37ol1l0dw1i.R.inc(4478);SAXBuilder builder = new SAXBuilder();

            __CLR4_0_637o37ol1l0dw1i.R.inc(4479);return builder.build(url);
        } catch (Exception e) {
            __CLR4_0_637o37ol1l0dw1i.R.inc(4480);throw new FunctionCallException(e.getMessage());
        }
    }finally{__CLR4_0_637o37ol1l0dw1i.R.flushNeeded();}}

    /**
     * Singleton implementation.
     */
    private static class Singleton {
        /**
         * Singleton instance.
         */
        private static DocumentNavigator instance = new DocumentNavigator();
    }
}
