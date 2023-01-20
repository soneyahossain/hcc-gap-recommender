/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package org.jaxen.dom;

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
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Interface for navigating around the W3C DOM Level 2 object model.
 *
 * <p>
 * This class is not intended for direct usage, but is
 * used by the Jaxen engine during evaluation.
 * </p>
 *
 * <p>This class implements the {@link org.jaxen.DefaultNavigator} interface
 * for the Jaxen XPath library.  This adapter allows the Jaxen
 * library to be used to execute XPath queries against any object tree
 * that implements the DOM level 2 interfaces.</p>
 *
 * <p>Note: DOM level 2 does not include a node representing an XPath
 * namespace node.  This navigator will return namespace nodes
 * as instances of the custom {@link NamespaceNode} class, and
 * users will have to check result sets to locate and isolate
 * these.</p>
 *
 * @author David Megginson
 * @author James Strachan
 * @see XPath
 * @see NamespaceNode
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DocumentNavigator extends DefaultNavigator {public static class __CLR4_0_6jijil1l0dvai{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,1083,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    ////////////////////////////////////////////////////////////////////
    // Constants.
    ////////////////////////////////////////////////////////////////////

    /**
     *
     */
    private static final long serialVersionUID = 8460943068889528115L;

    private final static DocumentNavigator SINGLETON = new DocumentNavigator();


    ////////////////////////////////////////////////////////////////////
    // Constructor.
    ////////////////////////////////////////////////////////////////////


    /**
     * Default constructor.
     */
    public DocumentNavigator() {try{__CLR4_0_6jijil1l0dvai.R.inc(702);
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get a constant DocumentNavigator for efficiency.
     *
     * @return a constant instance of a DocumentNavigator.
     */
    public static Navigator getInstance() {try{__CLR4_0_6jijil1l0dvai.R.inc(703);
        __CLR4_0_6jijil1l0dvai.R.inc(704);return SINGLETON;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    ////////////////////////////////////////////////////////////////////
    // Implementation of org.jaxen.DefaultNavigator.
    ////////////////////////////////////////////////////////////////////


    /**
     * Get an iterator over all of this node's children.
     *
     * @param contextNode the context node for the child axis.
     * @return a possibly-empty iterator (not null)
     */
    public Iterator getChildAxisIterator(Object contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(705);
        __CLR4_0_6jijil1l0dvai.R.inc(706);Node node = (Node) contextNode;

        __CLR4_0_6jijil1l0dvai.R.inc(707);if ((((node.getNodeType() == Node.ELEMENT_NODE || node.getNodeType() == Node.DOCUMENT_NODE)&&(__CLR4_0_6jijil1l0dvai.R.iget(708)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(709)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(710);return new NodeIterator((Node) contextNode) {
                protected Node getFirstNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(711);
                    __CLR4_0_6jijil1l0dvai.R.inc(712);return node.getFirstChild();
                }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

                protected Node getNextNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(713);
                    __CLR4_0_6jijil1l0dvai.R.inc(714);return node.getNextSibling();
                }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}
            };
        }

        }__CLR4_0_6jijil1l0dvai.R.inc(715);return JaxenConstants.EMPTY_ITERATOR;

    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get a (single-member) iterator over this node's parent.
     *
     * @param contextNode the context node for the parent axis
     * @return a possibly-empty iterator (not null)
     */
    public Iterator getParentAxisIterator(Object contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(716);
        __CLR4_0_6jijil1l0dvai.R.inc(717);Node node = (Node) contextNode;

        __CLR4_0_6jijil1l0dvai.R.inc(718);if ((((node.getNodeType() == Node.ATTRIBUTE_NODE)&&(__CLR4_0_6jijil1l0dvai.R.iget(719)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(720)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(721);return new NodeIterator(node) {
                protected Node getFirstNode(Node n) {try{__CLR4_0_6jijil1l0dvai.R.inc(722);
                    // We can assume castability here because we've already
                    // tested the node type.
                    __CLR4_0_6jijil1l0dvai.R.inc(723);return ((Attr) n).getOwnerElement();
                }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

                protected Node getNextNode(Node n) {try{__CLR4_0_6jijil1l0dvai.R.inc(724);
                    __CLR4_0_6jijil1l0dvai.R.inc(725);return null;
                }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}
            };
        } }else {{
            __CLR4_0_6jijil1l0dvai.R.inc(726);return new NodeIterator(node) {
                protected Node getFirstNode(Node n) {try{__CLR4_0_6jijil1l0dvai.R.inc(727);
                    __CLR4_0_6jijil1l0dvai.R.inc(728);return n.getParentNode();
                }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

                protected Node getNextNode(Node n) {try{__CLR4_0_6jijil1l0dvai.R.inc(729);
                    __CLR4_0_6jijil1l0dvai.R.inc(730);return null;
                }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}
            };
        }
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Return the XPath parent of the supplied DOM node.
     * XPath has slightly different definition of parent than DOM does.
     * In particular, the parent of an attribute is not null.
     *
     * @param child the child node
     * @return the parent of the specified node; or null if
     * the node does not have a parent
     */
    public Object getParentNode(Object child) {try{__CLR4_0_6jijil1l0dvai.R.inc(731);
        __CLR4_0_6jijil1l0dvai.R.inc(732);Node node = (Node) child;
        __CLR4_0_6jijil1l0dvai.R.inc(733);if ((((node.getNodeType() == Node.ATTRIBUTE_NODE)&&(__CLR4_0_6jijil1l0dvai.R.iget(734)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(735)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(736);return ((Attr) node).getOwnerElement();
        }
        }__CLR4_0_6jijil1l0dvai.R.inc(737);return node.getParentNode();
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get an iterator over all following siblings.
     *
     * @param contextNode the context node for the sibling iterator
     * @return a possibly-empty iterator (not null)
     */
    public Iterator getFollowingSiblingAxisIterator(Object contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(738);
        __CLR4_0_6jijil1l0dvai.R.inc(739);return new NodeIterator((Node) contextNode) {
            protected Node getFirstNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(740);
                __CLR4_0_6jijil1l0dvai.R.inc(741);return getNextNode(node);
            }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

            protected Node getNextNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(742);
                __CLR4_0_6jijil1l0dvai.R.inc(743);return node.getNextSibling();
            }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}
        };
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get an iterator over all preceding siblings.
     *
     * @param contextNode the context node for the preceding sibling axis
     * @return a possibly-empty iterator (not null)
     */
    public Iterator getPrecedingSiblingAxisIterator(Object contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(744);
        __CLR4_0_6jijil1l0dvai.R.inc(745);return new NodeIterator((Node) contextNode) {
            protected Node getFirstNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(746);
                __CLR4_0_6jijil1l0dvai.R.inc(747);return getNextNode(node);
            }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

            protected Node getNextNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(748);
                __CLR4_0_6jijil1l0dvai.R.inc(749);return node.getPreviousSibling();
            }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}
        };
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get an iterator over all following nodes, depth-first.
     *
     * @param contextNode the context node for the following axis
     * @return a possibly-empty iterator (not null)
     */
    public Iterator getFollowingAxisIterator(Object contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(750);
        __CLR4_0_6jijil1l0dvai.R.inc(751);return new NodeIterator((Node) contextNode) {
            protected Node getFirstNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(752);
                __CLR4_0_6jijil1l0dvai.R.inc(753);if ((((node == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(754)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(755)==0&false))) {{
                    __CLR4_0_6jijil1l0dvai.R.inc(756);return null;
                } }else {{
                    __CLR4_0_6jijil1l0dvai.R.inc(757);Node sibling = node.getNextSibling();
                    __CLR4_0_6jijil1l0dvai.R.inc(758);if ((((sibling == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(759)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(760)==0&false))) {{
                        __CLR4_0_6jijil1l0dvai.R.inc(761);return getFirstNode(node.getParentNode());
                    } }else {{
                        __CLR4_0_6jijil1l0dvai.R.inc(762);return sibling;
                    }
                }}
            }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

            protected Node getNextNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(763);
                __CLR4_0_6jijil1l0dvai.R.inc(764);if ((((node == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(765)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(766)==0&false))) {{
                    __CLR4_0_6jijil1l0dvai.R.inc(767);return null;
                } }else {{
                    __CLR4_0_6jijil1l0dvai.R.inc(768);Node n = node.getFirstChild();
                    __CLR4_0_6jijil1l0dvai.R.inc(769);if ((((n == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(770)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(771)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(772);n = node.getNextSibling();
                    }__CLR4_0_6jijil1l0dvai.R.inc(773);if ((((n == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(774)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(775)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(776);return getFirstNode(node.getParentNode());
                    }else {__CLR4_0_6jijil1l0dvai.R.inc(777);return n;
                }}
            }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}
        };
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get an iterator over all attributes.
     *
     * @param contextNode the context node for the attribute axis
     * @return a possibly-empty iterator (not null)
     */
    public Iterator getAttributeAxisIterator(Object contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(778);
        __CLR4_0_6jijil1l0dvai.R.inc(779);if ((((isElement(contextNode))&&(__CLR4_0_6jijil1l0dvai.R.iget(780)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(781)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(782);return new AttributeIterator((Node) contextNode);
        } }else {{
            __CLR4_0_6jijil1l0dvai.R.inc(783);return JaxenConstants.EMPTY_ITERATOR;
        }
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get an iterator over all declared namespaces.
     *
     * <p>Note: this iterator is not live: it takes a snapshot
     * and that snapshot remains static during the life of
     * the iterator (i.e. it won't reflect subsequent changes
     * to the DOM).</p>
     *
     * <p>
     * In the event that the DOM is inconsistent; for instance a
     * <code>pre:foo</code> element is declared by DOM to be in the
     * http://www.a.com/ namespace but also has an
     * <code>xmlns:pre="http://www.b.com"</code> attribute; then only
     * one of the namespaces will be counted. This will be the intrinsic
     * namespace of the <code>Element</code> or <code>Attr</code> object
     * rather than the one provide by the contradictory namespace
     * declaration attribute. In the event of a contradiction between two
     * attributes on the same element--e.g. <code>pre:foo</code> in the
     * http://www.a.com/ namespace and <code>pre:bar</code> in the
     * http://www.b.com/ namespace--it is undefined which namespace
     * will be returned.
     * </p>
     *
     * @param contextNode the context node for the namespace axis
     * @return a possibly-empty iterator (not null)
     */
    public Iterator getNamespaceAxisIterator(Object contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(784);
        // Only elements have namespace nodes
        __CLR4_0_6jijil1l0dvai.R.inc(785);if ((((isElement(contextNode))&&(__CLR4_0_6jijil1l0dvai.R.iget(786)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(787)==0&false))) {{

            __CLR4_0_6jijil1l0dvai.R.inc(788);HashMap nsMap = new HashMap();

            // Starting at the current node, walk
            // up to the root, noting the namespace
            // declarations in scope.
            __CLR4_0_6jijil1l0dvai.R.inc(789);for (Node n = (Node) contextNode;
                 (((n != null)&&(__CLR4_0_6jijil1l0dvai.R.iget(790)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(791)==0&false));
                 n = n.getParentNode()) {{

                // 1. Look for the namespace of the element itself
                __CLR4_0_6jijil1l0dvai.R.inc(792);String myNamespace = n.getNamespaceURI();
                __CLR4_0_6jijil1l0dvai.R.inc(793);if ((((myNamespace != null && !"".equals(myNamespace))&&(__CLR4_0_6jijil1l0dvai.R.iget(794)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(795)==0&false))) {{
                    __CLR4_0_6jijil1l0dvai.R.inc(796);String myPrefix = n.getPrefix();
                    __CLR4_0_6jijil1l0dvai.R.inc(797);if ((((!nsMap.containsKey(myPrefix))&&(__CLR4_0_6jijil1l0dvai.R.iget(798)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(799)==0&false))) {{
                        __CLR4_0_6jijil1l0dvai.R.inc(800);NamespaceNode ns = new NamespaceNode((Node) contextNode, myPrefix, myNamespace);
                        __CLR4_0_6jijil1l0dvai.R.inc(801);nsMap.put(myPrefix, ns);
                    }
                }}

                }__CLR4_0_6jijil1l0dvai.R.inc(802);if ((((n.hasAttributes())&&(__CLR4_0_6jijil1l0dvai.R.iget(803)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(804)==0&false))) {{
                    __CLR4_0_6jijil1l0dvai.R.inc(805);NamedNodeMap atts = n.getAttributes();
                    __CLR4_0_6jijil1l0dvai.R.inc(806);int length = atts.getLength();
                    // 2. Look for namespaces of attributes
                    __CLR4_0_6jijil1l0dvai.R.inc(807);for (int i = 0; (((i < length)&&(__CLR4_0_6jijil1l0dvai.R.iget(808)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(809)==0&false)); i++) {{
                        __CLR4_0_6jijil1l0dvai.R.inc(810);Attr att = (Attr) atts.item(i);
                        // Work around Crimson bug by testing URI rather than name
                        __CLR4_0_6jijil1l0dvai.R.inc(811);String attributeNamespace = att.getNamespaceURI();
                        __CLR4_0_6jijil1l0dvai.R.inc(812);if (((("http://www.w3.org/2000/xmlns/".equals(attributeNamespace))&&(__CLR4_0_6jijil1l0dvai.R.iget(813)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(814)==0&false))) {{
                        } }else {__CLR4_0_6jijil1l0dvai.R.inc(815);if ((((attributeNamespace != null)&&(__CLR4_0_6jijil1l0dvai.R.iget(816)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(817)==0&false))) {{
                            __CLR4_0_6jijil1l0dvai.R.inc(818);String prefix = att.getPrefix();
                            __CLR4_0_6jijil1l0dvai.R.inc(819);NamespaceNode ns =
                                    new NamespaceNode((Node) contextNode, prefix, attributeNamespace);
                            // Add only if there's not a closer declaration in force.
                            __CLR4_0_6jijil1l0dvai.R.inc(820);if ((((!nsMap.containsKey(prefix))&&(__CLR4_0_6jijil1l0dvai.R.iget(821)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(822)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(823);nsMap.put(prefix, ns);

                        }}
                    }}}

                    // 3. Look for namespace declaration attributes
                    }__CLR4_0_6jijil1l0dvai.R.inc(824);for (int i = 0; (((i < length)&&(__CLR4_0_6jijil1l0dvai.R.iget(825)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(826)==0&false)); i++) {{
                        __CLR4_0_6jijil1l0dvai.R.inc(827);Attr att = (Attr) atts.item(i);
                        // work around crimson bug by testing URI rather than name
                        __CLR4_0_6jijil1l0dvai.R.inc(828);String attributeNamespace = att.getNamespaceURI();
                        __CLR4_0_6jijil1l0dvai.R.inc(829);if (((("http://www.w3.org/2000/xmlns/".equals(attributeNamespace))&&(__CLR4_0_6jijil1l0dvai.R.iget(830)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(831)==0&false))) {{
                            __CLR4_0_6jijil1l0dvai.R.inc(832);NamespaceNode ns =
                                    new NamespaceNode((Node) contextNode, att);
                            // Add only if there's not a closer declaration in force.
                            __CLR4_0_6jijil1l0dvai.R.inc(833);String name = ns.getNodeName();
                            __CLR4_0_6jijil1l0dvai.R.inc(834);if ((((!nsMap.containsKey(name))&&(__CLR4_0_6jijil1l0dvai.R.iget(835)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(836)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(837);nsMap.put(name, ns);
                        }}
                    }}

                }}

            }}
            // Section 5.4 of the XPath rec requires
            // this to be present.
            }__CLR4_0_6jijil1l0dvai.R.inc(838);nsMap.put("xml",
                    new
                            NamespaceNode((Node) contextNode,
                            "xml",
                            "http://www.w3.org/XML/1998/namespace"));

            // An empty default namespace cancels
            // any previous default.
            __CLR4_0_6jijil1l0dvai.R.inc(839);NamespaceNode defaultNS = (NamespaceNode) nsMap.get("");
            __CLR4_0_6jijil1l0dvai.R.inc(840);if ((((defaultNS != null && defaultNS.getNodeValue().length() == 0)&&(__CLR4_0_6jijil1l0dvai.R.iget(841)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(842)==0&false))) {{
                __CLR4_0_6jijil1l0dvai.R.inc(843);nsMap.remove("");
            }
            }__CLR4_0_6jijil1l0dvai.R.inc(844);return nsMap.values().iterator();
        } }else {{
            __CLR4_0_6jijil1l0dvai.R.inc(845);return JaxenConstants.EMPTY_ITERATOR;
        }
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    /**
     * Returns a parsed form of the given XPath string, which will be suitable
     * for queries on DOM documents.
     *
     * @param xpath the XPath expression
     * @return a parsed form of the given XPath string
     * @throws org.jaxen.saxpath.SAXPathException if the string is syntactically incorrect
     */
    public XPath parseXPath(String xpath) throws org.jaxen.saxpath.SAXPathException {try{__CLR4_0_6jijil1l0dvai.R.inc(846);
        __CLR4_0_6jijil1l0dvai.R.inc(847);return new DOMXPath(xpath);
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    /**
     * Get the top-level document node.
     *
     * @param contextNode any node in the document
     * @return the root node
     */
    public Object getDocumentNode(Object contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(848);
        __CLR4_0_6jijil1l0dvai.R.inc(849);if ((((isDocument(contextNode))&&(__CLR4_0_6jijil1l0dvai.R.iget(850)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(851)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(852);return contextNode;
        }else {__CLR4_0_6jijil1l0dvai.R.inc(853);return ((Node) contextNode).getOwnerDocument();
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    // Why are there separate methods for getElementNamespaceURI and 
    // getAttributeNamespaceURI when they do exactly the same thing?
    // This should be combined in a future version.

    /**
     * Get the namespace URI of an element.
     *
     * @param element the target node
     * @return a string (possibly empty) if the node is an element,
     * and null otherwise
     */
    public String getElementNamespaceUri(Object element) {try{__CLR4_0_6jijil1l0dvai.R.inc(854);
        __CLR4_0_6jijil1l0dvai.R.inc(855);try {
            __CLR4_0_6jijil1l0dvai.R.inc(856);Node node = (Node) element;
            __CLR4_0_6jijil1l0dvai.R.inc(857);if ((((node.getNodeType() == Node.ELEMENT_NODE)&&(__CLR4_0_6jijil1l0dvai.R.iget(858)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(859)==0&false))) {{
                __CLR4_0_6jijil1l0dvai.R.inc(860);return node.getNamespaceURI();
            }
        }} catch (ClassCastException ex) {
        }
        __CLR4_0_6jijil1l0dvai.R.inc(861);return null;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the local name of an element.
     *
     * @param element the target node
     * @return a string representing the unqualified local name
     * if the node is an element, or null otherwise
     */
    public String getElementName(Object element) {try{__CLR4_0_6jijil1l0dvai.R.inc(862);
        __CLR4_0_6jijil1l0dvai.R.inc(863);if ((((isElement(element))&&(__CLR4_0_6jijil1l0dvai.R.iget(864)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(865)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(866);String name = ((Node) element).getLocalName();
            __CLR4_0_6jijil1l0dvai.R.inc(867);if ((((name == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(868)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(869)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(870);name = ((Node) element).getNodeName();
            }__CLR4_0_6jijil1l0dvai.R.inc(871);return name;
        }
        }__CLR4_0_6jijil1l0dvai.R.inc(872);return null;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the qualified name of an element.
     *
     * @param element the target node
     * @return a string representing the qualified (i.e. possibly
     * prefixed) name if the argument is an element, or null otherwise
     */
    public String getElementQName(Object element) {try{__CLR4_0_6jijil1l0dvai.R.inc(873);
        __CLR4_0_6jijil1l0dvai.R.inc(874);try {
            __CLR4_0_6jijil1l0dvai.R.inc(875);Node node = (Node) element;
            __CLR4_0_6jijil1l0dvai.R.inc(876);if ((((node.getNodeType() == Node.ELEMENT_NODE)&&(__CLR4_0_6jijil1l0dvai.R.iget(877)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(878)==0&false))) {{
                __CLR4_0_6jijil1l0dvai.R.inc(879);return node.getNodeName();
            }
        }} catch (ClassCastException ex) {
        }
        __CLR4_0_6jijil1l0dvai.R.inc(880);return null;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the namespace URI of an attribute.
     *
     * @param attribute the target node
     * @return the namespace name of the specified node
     */
    public String getAttributeNamespaceUri(Object attribute) {try{__CLR4_0_6jijil1l0dvai.R.inc(881);
        __CLR4_0_6jijil1l0dvai.R.inc(882);try {
            __CLR4_0_6jijil1l0dvai.R.inc(883);Node node = (Node) attribute;
            __CLR4_0_6jijil1l0dvai.R.inc(884);if ((((node.getNodeType() == Node.ATTRIBUTE_NODE)&&(__CLR4_0_6jijil1l0dvai.R.iget(885)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(886)==0&false))) {{
                __CLR4_0_6jijil1l0dvai.R.inc(887);return node.getNamespaceURI();
            }
        }} catch (ClassCastException ex) {
        }
        __CLR4_0_6jijil1l0dvai.R.inc(888);return null;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the local name of an attribute.
     *
     * @param attribute the target node
     * @return a string representing the unqualified local name
     * if the node is an attribute, or null otherwise
     */
    public String getAttributeName(Object attribute) {try{__CLR4_0_6jijil1l0dvai.R.inc(889);
        __CLR4_0_6jijil1l0dvai.R.inc(890);if ((((isAttribute(attribute))&&(__CLR4_0_6jijil1l0dvai.R.iget(891)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(892)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(893);String name = ((Node) attribute).getLocalName();
            __CLR4_0_6jijil1l0dvai.R.inc(894);if ((((name == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(895)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(896)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(897);name = ((Node) attribute).getNodeName();
            }__CLR4_0_6jijil1l0dvai.R.inc(898);return name;
        }
        }__CLR4_0_6jijil1l0dvai.R.inc(899);return null;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the qualified name of an attribute.
     *
     * @param attribute the target node
     * @return a string representing the qualified (i.e. possibly
     * prefixed) name if the argument is an attribute, or null otherwise
     */
    public String getAttributeQName(Object attribute) {try{__CLR4_0_6jijil1l0dvai.R.inc(900);
        __CLR4_0_6jijil1l0dvai.R.inc(901);try {
            __CLR4_0_6jijil1l0dvai.R.inc(902);Node node = (Node) attribute;
            __CLR4_0_6jijil1l0dvai.R.inc(903);if ((((node.getNodeType() == Node.ATTRIBUTE_NODE)&&(__CLR4_0_6jijil1l0dvai.R.iget(904)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(905)==0&false))) {{
                __CLR4_0_6jijil1l0dvai.R.inc(906);return node.getNodeName();
            }
        }} catch (ClassCastException ex) {
        }
        __CLR4_0_6jijil1l0dvai.R.inc(907);return null;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Test if a node is a top-level document.
     *
     * @param object the target node
     * @return true if the node is the document root, false otherwise
     */
    public boolean isDocument(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(908);
        __CLR4_0_6jijil1l0dvai.R.inc(909);return (object instanceof Node) &&
                (((Node) object).getNodeType() == Node.DOCUMENT_NODE);
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Test if a node is a namespace.
     *
     * @param object the target node
     * @return true if the node is a namespace, false otherwise
     */
    public boolean isNamespace(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(910);
        __CLR4_0_6jijil1l0dvai.R.inc(911);return (object instanceof NamespaceNode);
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Test if a node is an element.
     *
     * @param object the target node
     * @return true if the node is an element, false otherwise
     */
    public boolean isElement(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(912);
        __CLR4_0_6jijil1l0dvai.R.inc(913);return (object instanceof Node) &&
                (((Node) object).getNodeType() == Node.ELEMENT_NODE);
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Test if a node is an attribute. <code>xmlns</code> and
     * <code>xmlns:pre</code> attributes do not count as attributes
     * for the purposes of XPath.
     *
     * @param object the target node
     * @return true if the node is an attribute, false otherwise
     */
    public boolean isAttribute(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(914);
        __CLR4_0_6jijil1l0dvai.R.inc(915);return (object instanceof Node) &&
                (((Node) object).getNodeType() == Node.ATTRIBUTE_NODE)
                && !"http://www.w3.org/2000/xmlns/".equals(((Node) object).getNamespaceURI());
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Test if a node is a comment.
     *
     * @param object the target node
     * @return true if the node is a comment, false otherwise
     */
    public boolean isComment(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(916);
        __CLR4_0_6jijil1l0dvai.R.inc(917);return (object instanceof Node) &&
                (((Node) object).getNodeType() == Node.COMMENT_NODE);
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Test if a node is plain text.
     *
     * @param object the target node
     * @return true if the node is a text node, false otherwise
     */
    public boolean isText(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(918);
        __CLR4_0_6jijil1l0dvai.R.inc(919);if ((((object instanceof Node)&&(__CLR4_0_6jijil1l0dvai.R.iget(920)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(921)==0&false))) {{
            boolean __CLB4_0_6_bool0=false;__CLR4_0_6jijil1l0dvai.R.inc(922);switch (((Node) object).getNodeType()) {
                case Node.TEXT_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_6jijil1l0dvai.R.inc(923);__CLB4_0_6_bool0=true;}
                case Node.CDATA_SECTION_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_6jijil1l0dvai.R.inc(924);__CLB4_0_6_bool0=true;}
                    __CLR4_0_6jijil1l0dvai.R.inc(925);return true;
                default:if (!__CLB4_0_6_bool0) {__CLR4_0_6jijil1l0dvai.R.inc(926);__CLB4_0_6_bool0=true;}
                    __CLR4_0_6jijil1l0dvai.R.inc(927);return false;
            }
        } }else {{
            __CLR4_0_6jijil1l0dvai.R.inc(928);return false;
        }
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Test if a node is a processing instruction.
     *
     * @param object the target node
     * @return true if the node is a processing instruction, false otherwise
     */
    public boolean isProcessingInstruction(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(929);
        __CLR4_0_6jijil1l0dvai.R.inc(930);return (object instanceof Node) &&
                (((Node) object).getNodeType() == Node.PROCESSING_INSTRUCTION_NODE);
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the string value of an element node.
     *
     * @param object the target node
     * @return the text inside the node and its descendants if the node
     * is an element, null otherwise
     */
    public String getElementStringValue(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(931);
        __CLR4_0_6jijil1l0dvai.R.inc(932);if ((((isElement(object))&&(__CLR4_0_6jijil1l0dvai.R.iget(933)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(934)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(935);return getStringValue((Node) object, new StringBuffer()).toString();
        } }else {{
            __CLR4_0_6jijil1l0dvai.R.inc(936);return null;
        }
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Construct a node's string value recursively.
     *
     * @param node   the current node
     * @param buffer the buffer for building the text
     * @return the buffer passed as a parameter (for convenience)
     */
    private StringBuffer getStringValue(Node node, StringBuffer buffer) {try{__CLR4_0_6jijil1l0dvai.R.inc(937);
        __CLR4_0_6jijil1l0dvai.R.inc(938);if ((((isText(node))&&(__CLR4_0_6jijil1l0dvai.R.iget(939)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(940)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(941);buffer.append(node.getNodeValue());
        } }else {{
            __CLR4_0_6jijil1l0dvai.R.inc(942);NodeList children = node.getChildNodes();
            __CLR4_0_6jijil1l0dvai.R.inc(943);int length = children.getLength();
            __CLR4_0_6jijil1l0dvai.R.inc(944);for (int i = 0; (((i < length)&&(__CLR4_0_6jijil1l0dvai.R.iget(945)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(946)==0&false)); i++) {{
                __CLR4_0_6jijil1l0dvai.R.inc(947);getStringValue(children.item(i), buffer);
            }
        }}
        }__CLR4_0_6jijil1l0dvai.R.inc(948);return buffer;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the string value of an attribute node.
     *
     * @param object the target node
     * @return the text of the attribute value if the node is an
     * attribute, null otherwise
     */
    public String getAttributeStringValue(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(949);
        __CLR4_0_6jijil1l0dvai.R.inc(950);if ((((isAttribute(object))&&(__CLR4_0_6jijil1l0dvai.R.iget(951)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(952)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(953);return ((Node) object).getNodeValue();
        }else {__CLR4_0_6jijil1l0dvai.R.inc(954);return null;
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the string value of text.
     *
     * @param object the target node
     * @return the string of text if the node is text, null otherwise
     */
    public String getTextStringValue(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(955);
        __CLR4_0_6jijil1l0dvai.R.inc(956);if ((((isText(object))&&(__CLR4_0_6jijil1l0dvai.R.iget(957)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(958)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(959);return ((Node) object).getNodeValue();
        }else {__CLR4_0_6jijil1l0dvai.R.inc(960);return null;
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the string value of a comment node.
     *
     * @param object the target node
     * @return the text of the comment if the node is a comment, null otherwise
     */
    public String getCommentStringValue(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(961);
        __CLR4_0_6jijil1l0dvai.R.inc(962);if ((((isComment(object))&&(__CLR4_0_6jijil1l0dvai.R.iget(963)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(964)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(965);return ((Node) object).getNodeValue();
        }else {__CLR4_0_6jijil1l0dvai.R.inc(966);return null;
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    /**
     * Get the string value of a namespace node.
     *
     * @param object the target node
     * @return the namespace URI as a (possibly empty) string if the
     * node is a namespace node, null otherwise
     */
    public String getNamespaceStringValue(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(967);
        __CLR4_0_6jijil1l0dvai.R.inc(968);if ((((isNamespace(object))&&(__CLR4_0_6jijil1l0dvai.R.iget(969)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(970)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(971);return ((NamespaceNode) object).getNodeValue();
        }else {__CLR4_0_6jijil1l0dvai.R.inc(972);return null;
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    /**
     * Get the prefix value of a namespace node.
     *
     * @param object the target node
     * @return the namespace prefix a (possibly empty) string if the
     * node is a namespace node, null otherwise
     */
    public String getNamespacePrefix(Object object) {try{__CLR4_0_6jijil1l0dvai.R.inc(973);
        __CLR4_0_6jijil1l0dvai.R.inc(974);if ((((isNamespace(object))&&(__CLR4_0_6jijil1l0dvai.R.iget(975)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(976)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(977);return ((NamespaceNode) object).getLocalName();
        }else {__CLR4_0_6jijil1l0dvai.R.inc(978);return null;
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    /**
     * Translate a namespace prefix to a URI.
     *
     * @param prefix  the namespace prefix
     * @param element the namespace context
     * @return the namespace URI bound to the prefix in the scope of <code>element</code>;
     * null if the prefix is not bound
     */
    public String translateNamespacePrefixToUri(String prefix, Object element) {try{__CLR4_0_6jijil1l0dvai.R.inc(979);
        __CLR4_0_6jijil1l0dvai.R.inc(980);Iterator it = getNamespaceAxisIterator(element);
        __CLR4_0_6jijil1l0dvai.R.inc(981);while ((((it.hasNext())&&(__CLR4_0_6jijil1l0dvai.R.iget(982)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(983)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(984);NamespaceNode ns = (NamespaceNode) it.next();
            __CLR4_0_6jijil1l0dvai.R.inc(985);if ((((prefix.equals(ns.getNodeName()))&&(__CLR4_0_6jijil1l0dvai.R.iget(986)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(987)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(988);return ns.getNodeValue();
        }}
        }__CLR4_0_6jijil1l0dvai.R.inc(989);return null;
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    /**
     * Use JAXP to load a namespace aware document from a given URI.
     *
     * @param uri the URI of the document to load
     * @return the new W3C DOM Level 2 Document instance
     * @throws FunctionCallException containing a nested exception
     *                               if a problem occurs trying to parse the given document
     * @todo Possibly we could make the factory a thread local.
     */
    public Object getDocument(String uri) throws FunctionCallException {try{__CLR4_0_6jijil1l0dvai.R.inc(990);
        __CLR4_0_6jijil1l0dvai.R.inc(991);try {
            // We really do need to construct a new factory here each time.
            // DocumentBuilderFactory is not guaranteed to be thread safe? 
            __CLR4_0_6jijil1l0dvai.R.inc(992);DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            __CLR4_0_6jijil1l0dvai.R.inc(993);factory.setNamespaceAware(true);
            __CLR4_0_6jijil1l0dvai.R.inc(994);DocumentBuilder builder = factory.newDocumentBuilder();
            __CLR4_0_6jijil1l0dvai.R.inc(995);return builder.parse(uri);
        } catch (ParserConfigurationException e) {
            __CLR4_0_6jijil1l0dvai.R.inc(996);throw new FunctionCallException("JAXP setup error in document() function: " + e.getMessage(), e);
        } catch (SAXException e) {
            __CLR4_0_6jijil1l0dvai.R.inc(997);throw new FunctionCallException("XML error in document() function: " + e.getMessage(), e);
        } catch (IOException e) {
            __CLR4_0_6jijil1l0dvai.R.inc(998);throw new FunctionCallException("I/O error in document() function: " + e.getMessage(), e);
        }

    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    /**
     * Get the target of a processing instruction node.
     *
     * @param obj the processing instruction
     * @return the target of the processing instruction
     * @throws ClassCastException if obj is not a processing instruction
     */
    public String getProcessingInstructionTarget(Object obj) {try{__CLR4_0_6jijil1l0dvai.R.inc(999);
        __CLR4_0_6jijil1l0dvai.R.inc(1000);if ((((isProcessingInstruction(obj))&&(__CLR4_0_6jijil1l0dvai.R.iget(1001)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1002)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(1003);ProcessingInstruction pi = (ProcessingInstruction) obj;
            __CLR4_0_6jijil1l0dvai.R.inc(1004);return pi.getTarget();
        }
        }__CLR4_0_6jijil1l0dvai.R.inc(1005);throw new ClassCastException(obj + " is not a processing instruction");
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    /**
     * Get the data of a processing instruction node.
     *
     * @param obj the processing instruction
     * @return the target of the processing instruction
     * @throws ClassCastException if obj is not a processing instruction
     */
    public String getProcessingInstructionData(Object obj) {try{__CLR4_0_6jijil1l0dvai.R.inc(1006);
        __CLR4_0_6jijil1l0dvai.R.inc(1007);if ((((isProcessingInstruction(obj))&&(__CLR4_0_6jijil1l0dvai.R.iget(1008)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1009)==0&false))) {{
            __CLR4_0_6jijil1l0dvai.R.inc(1010);ProcessingInstruction pi = (ProcessingInstruction) obj;
            __CLR4_0_6jijil1l0dvai.R.inc(1011);return pi.getData();
        }
        }__CLR4_0_6jijil1l0dvai.R.inc(1012);throw new ClassCastException(obj + " is not a processing instruction");
    }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    ////////////////////////////////////////////////////////////////////
    // Inner class: iterate over DOM nodes.
    ////////////////////////////////////////////////////////////////////


    // FIXME: needs to recurse into
    // DocumentFragment and EntityReference
    // to use their children.

    /**
     * Returns the element whose ID is given by elementId.
     * If no such element exists, returns null.
     * Attributes with the name "ID" are not of type ID unless so defined.
     * Attribute types are only known if when the parser understands DTD's or
     * schemas that declare attributes of type ID. When JAXP is used, you
     * must call <code>setValidating(true)</code> on the
     * DocumentBuilderFactory.
     *
     * @param object    a node from the document in which to look for the id
     * @param elementId id to look for
     * @return element whose ID is given by elementId, or null if no such
     * element exists in the document or if the implementation
     * does not know about attribute types
     * @throws ClassCastException if object is not an <code>org.w3c.dom.Node</code> object
     * @see javax.xml.parsers.DocumentBuilderFactory
     */
    public Object getElementById(Object object, String elementId) {try{__CLR4_0_6jijil1l0dvai.R.inc(1013);
        __CLR4_0_6jijil1l0dvai.R.inc(1014);Document doc = (Document) getDocumentNode(object);
        __CLR4_0_6jijil1l0dvai.R.inc(1015);if ((((doc != null)&&(__CLR4_0_6jijil1l0dvai.R.iget(1016)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1017)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(1018);return doc.getElementById(elementId);
        }else {__CLR4_0_6jijil1l0dvai.R.inc(1019);return null;
    }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}


    ////////////////////////////////////////////////////////////////////
    // Inner class: iterate over a DOM named node map.
    ////////////////////////////////////////////////////////////////////

    /**
     * An iterator over an attribute list.
     */
    private static class AttributeIterator implements Iterator {

        private NamedNodeMap map;
        private int pos;
        private int lastAttribute = -1;

        /**
         * Constructor.
         *
         * @param parent the parent DOM element for the attributes.
         */
        AttributeIterator(Node parent) {try{__CLR4_0_6jijil1l0dvai.R.inc(1020);
            __CLR4_0_6jijil1l0dvai.R.inc(1021);this.map = parent.getAttributes();
            __CLR4_0_6jijil1l0dvai.R.inc(1022);this.pos = 0;
            __CLR4_0_6jijil1l0dvai.R.inc(1023);for (int i = this.map.getLength() - 1; (((i >= 0)&&(__CLR4_0_6jijil1l0dvai.R.iget(1024)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1025)==0&false)); i--) {{
                __CLR4_0_6jijil1l0dvai.R.inc(1026);Node node = map.item(i);
                __CLR4_0_6jijil1l0dvai.R.inc(1027);if ((((!"http://www.w3.org/2000/xmlns/".equals(node.getNamespaceURI()))&&(__CLR4_0_6jijil1l0dvai.R.iget(1028)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1029)==0&false))) {{
                    __CLR4_0_6jijil1l0dvai.R.inc(1030);this.lastAttribute = i;
                    __CLR4_0_6jijil1l0dvai.R.inc(1031);break;
                }
            }}
        }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

        public boolean hasNext() {try{__CLR4_0_6jijil1l0dvai.R.inc(1032);
            __CLR4_0_6jijil1l0dvai.R.inc(1033);return pos <= lastAttribute;
        }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

        public Object next() {try{__CLR4_0_6jijil1l0dvai.R.inc(1034);
            __CLR4_0_6jijil1l0dvai.R.inc(1035);Node attr = map.item(pos++);
            __CLR4_0_6jijil1l0dvai.R.inc(1036);if ((((attr == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(1037)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1038)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(1039);throw new NoSuchElementException();
            }else {__CLR4_0_6jijil1l0dvai.R.inc(1040);if (((("http://www.w3.org/2000/xmlns/".equals(attr.getNamespaceURI()))&&(__CLR4_0_6jijil1l0dvai.R.iget(1041)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1042)==0&false))) {{
                // XPath doesn't consider namespace declarations to be attributes
                // so skip it and go to the next one
                __CLR4_0_6jijil1l0dvai.R.inc(1043);return next();
            } }else {__CLR4_0_6jijil1l0dvai.R.inc(1044);return attr;
        }}}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

        public void remove() {try{__CLR4_0_6jijil1l0dvai.R.inc(1045);
            __CLR4_0_6jijil1l0dvai.R.inc(1046);throw new UnsupportedOperationException();
        }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

    }

    /**
     * A generic iterator over DOM nodes.
     *
     * <p>Concrete subclasses must implement the {@link #getFirstNode}
     * and {@link #getNextNode} methods for a specific iteration
     * strategy.</p>
     */
    abstract class NodeIterator
            implements Iterator {


        private Node node;

        /**
         * Constructor.
         *
         * @param contextNode the starting node
         */
        public NodeIterator(Node contextNode) {try{__CLR4_0_6jijil1l0dvai.R.inc(1047);
            __CLR4_0_6jijil1l0dvai.R.inc(1048);node = getFirstNode(contextNode);
            __CLR4_0_6jijil1l0dvai.R.inc(1049);while ((((!isXPathNode(node))&&(__CLR4_0_6jijil1l0dvai.R.iget(1050)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1051)==0&false))) {{
                __CLR4_0_6jijil1l0dvai.R.inc(1052);node = getNextNode(node);
            }
        }}finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

        public boolean hasNext() {try{__CLR4_0_6jijil1l0dvai.R.inc(1053);
            __CLR4_0_6jijil1l0dvai.R.inc(1054);return (node != null);
        }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

        public Object next() {try{__CLR4_0_6jijil1l0dvai.R.inc(1055);
            __CLR4_0_6jijil1l0dvai.R.inc(1056);if ((((node == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(1057)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1058)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(1059);throw new NoSuchElementException();
            }__CLR4_0_6jijil1l0dvai.R.inc(1060);Node ret = node;
            __CLR4_0_6jijil1l0dvai.R.inc(1061);node = getNextNode(node);
            __CLR4_0_6jijil1l0dvai.R.inc(1062);while ((((!isXPathNode(node))&&(__CLR4_0_6jijil1l0dvai.R.iget(1063)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1064)==0&false))) {{
                __CLR4_0_6jijil1l0dvai.R.inc(1065);node = getNextNode(node);
            }
            }__CLR4_0_6jijil1l0dvai.R.inc(1066);return ret;
        }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

        public void remove() {try{__CLR4_0_6jijil1l0dvai.R.inc(1067);
            __CLR4_0_6jijil1l0dvai.R.inc(1068);throw new UnsupportedOperationException();
        }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}

        /**
         * Get the first node for iteration.
         *
         * <p>This method must derive an initial node for iteration
         * from a context node.</p>
         *
         * @param contextNode the starting node
         * @return the first node in the iteration
         * @see #getNextNode
         */
        protected abstract Node getFirstNode(Node contextNode);

        /**
         * Get the next node for iteration.
         *
         * <p>This method must locate a following node from the
         * current context node.</p>
         *
         * @param contextNode the current node in the iteration
         * @return the following node in the iteration, or null
         * if there is none
         * @see #getFirstNode
         */
        protected abstract Node getNextNode(Node contextNode);

        /**
         * Test whether a DOM node is usable by XPath.
         *
         * @param node the DOM node to test
         * @return true if the node is usable, false if it should be skipped
         */
        private boolean isXPathNode(Node node) {try{__CLR4_0_6jijil1l0dvai.R.inc(1069);
            // null is usable, because it means end
            __CLR4_0_6jijil1l0dvai.R.inc(1070);if ((((node == null)&&(__CLR4_0_6jijil1l0dvai.R.iget(1071)!=0|true))||(__CLR4_0_6jijil1l0dvai.R.iget(1072)==0&false))) {__CLR4_0_6jijil1l0dvai.R.inc(1073);return true;

            }boolean __CLB4_0_6_bool1=false;__CLR4_0_6jijil1l0dvai.R.inc(1074);switch (node.getNodeType()) {
                case Node.DOCUMENT_FRAGMENT_NODE:if (!__CLB4_0_6_bool1) {__CLR4_0_6jijil1l0dvai.R.inc(1075);__CLB4_0_6_bool1=true;}
                case Node.DOCUMENT_TYPE_NODE:if (!__CLB4_0_6_bool1) {__CLR4_0_6jijil1l0dvai.R.inc(1076);__CLB4_0_6_bool1=true;}
                case Node.ENTITY_NODE:if (!__CLB4_0_6_bool1) {__CLR4_0_6jijil1l0dvai.R.inc(1077);__CLB4_0_6_bool1=true;}
                case Node.ENTITY_REFERENCE_NODE:if (!__CLB4_0_6_bool1) {__CLR4_0_6jijil1l0dvai.R.inc(1078);__CLB4_0_6_bool1=true;}
                case Node.NOTATION_NODE:if (!__CLB4_0_6_bool1) {__CLR4_0_6jijil1l0dvai.R.inc(1079);__CLB4_0_6_bool1=true;}
                    __CLR4_0_6jijil1l0dvai.R.inc(1080);return false;
                default:if (!__CLB4_0_6_bool1) {__CLR4_0_6jijil1l0dvai.R.inc(1081);__CLB4_0_6_bool1=true;}
                    __CLR4_0_6jijil1l0dvai.R.inc(1082);return true;
            }
        }finally{__CLR4_0_6jijil1l0dvai.R.flushNeeded();}}
    }

}

// end of DocumentNavigator.java
