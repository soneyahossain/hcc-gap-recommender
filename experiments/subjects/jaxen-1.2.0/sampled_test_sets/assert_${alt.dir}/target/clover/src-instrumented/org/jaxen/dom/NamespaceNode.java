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

////////////////////////////////////////////////////////////////////
// Inner class for a Namespace node.
////////////////////////////////////////////////////////////////////

package org.jaxen.dom;

import org.jaxen.pattern.Pattern;
import org.w3c.dom.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;


/**
 * Extension DOM2/DOM3 node type for a namespace node.
 *
 * <p>This class implements the DOM2 and DOM3 {@link Node} interface
 * to allow namespace nodes to be included in the result
 * set of an XPath selectNodes operation, even though DOM does
 * not model namespaces in scope as separate nodes.</p>
 *
 * <p>
 * While all of the DOM2 methods are implemented with reasonable
 * defaults, there will be some unexpected surprises, so users are
 * advised to test for NamespaceNodes and filter them out from the
 * result sets as early as possible.
 * </p>
 *
 * <ol>
 *
 * <li>The {@link #getNodeType} method returns {@link #NAMESPACE_NODE},
 * which is not one of the usual DOM2 node types.  Generic code may
 * fall unexpectedly out of switch statements, for example.</li>
 *
 * <li>The {@link #getOwnerDocument} method returns the owner document
 * of the parent node, but that owner document will know nothing about
 * the namespace node.</li>
 *
 * <li>The {@link #isSupported} method always returns false.</li>
 *
 * <li> The DOM3 methods sometimes throw UnsupportedOperationException.
 *      They're here only to allow this class to be compiled with Java 1.5.
 *       Do not call or rely on them.</li>
 * </ol>
 *
 * <p>All attempts to modify a <code>NamespaceNode</code> will fail with a {@link
 * DOMException} ({@link
 * DOMException#NO_MODIFICATION_ALLOWED_ERR}).</p>
 *
 * @author David Megginson
 * @author Elliotte Rusty Harold
 * @see DocumentNavigator
 */
public class NamespaceNode implements Node {public static class __CLR4_0_6u3u3l1l0dvc4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,1279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant: this is a NamespaceNode.
     *
     * @see #getNodeType
     */
    public final static short NAMESPACE_NODE = Pattern.NAMESPACE_NODE;

    // FIXME "Note: Numeric codes up to 200 are reserved to W3C for possible future use."
    // We should be using higher codes. Here we're using 13, the same as DOM 3's type for XPathNamespace.
    // However, that's only a note not a recommendation.
    private Node parent;
    private String name;


    ////////////////////////////////////////////////////////////////////
    // Implementation of org.w3c.dom.Node.
    ////////////////////////////////////////////////////////////////////
    private String value;
    // XXX userdata needs testing
    private HashMap userData = new HashMap();


    /**
     * Create a new NamespaceNode.
     *
     * @param parent the DOM node to which the namespace is attached
     * @param name   the namespace prefix
     * @param value  the namespace URI
     */
    public NamespaceNode(Node parent, String name, String value) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1083);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1084);this.parent = parent;
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1085);this.name = (((name == null )&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1086)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1087)==0&false))? "" : name;
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1088);this.value = value;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Constructor.
     *
     * @param parent    the DOM node to which the namespace is attached
     * @param attribute the DOM attribute object containing the
     *                  namespace declaration
     */
    NamespaceNode(Node parent, Node attribute) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1089);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1090);String attributeName = attribute.getNodeName();

        __CLR4_0_6u3u3l1l0dvc4.R.inc(1091);if ((((attributeName.equals("xmlns"))&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1092)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1093)==0&false))) {{
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1094);this.name = "";
        } }else {__CLR4_0_6u3u3l1l0dvc4.R.inc(1095);if ((((attributeName.startsWith("xmlns:"))&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1096)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1097)==0&false))) {{
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1098);this.name = attributeName.substring(6); // the part after "xmlns:"
        } }else {{ // workaround for Crimson bug; Crimson incorrectly reports the prefix as the node name
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1099);this.name = attributeName;
        }
        }}__CLR4_0_6u3u3l1l0dvc4.R.inc(1100);this.parent = parent;
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1101);this.value = attribute.getNodeValue();
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the namespace prefix.
     *
     * @return the namespace prefix, or "" for the default namespace
     */
    public String getNodeName() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1102);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1103);return name;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the namespace URI.
     *
     * @return the namespace URI
     */
    public String getNodeValue() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1104);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1105);return value;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Change the namespace URI (always fails).
     *
     * @param value the new URI
     * @throws DOMException always
     */
    public void setNodeValue(String value) throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1106);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1107);disallowModification();
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the node type.
     *
     * @return always {@link #NAMESPACE_NODE}.
     */
    public short getNodeType() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1108);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1109);return NAMESPACE_NODE;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the parent node.
     *
     * <p>This method returns the element that was queried for Namespaces
     * in effect, <em>not</em> necessarily the actual element containing
     * the Namespace declaration.</p>
     *
     * @return the parent node (not null)
     */
    public Node getParentNode() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1110);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1111);return parent;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the list of child nodes.
     *
     * @return an empty node list
     */
    public NodeList getChildNodes() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1112);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1113);return new EmptyNodeList();
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the first child node.
     *
     * @return null
     */
    public Node getFirstChild() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1114);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1115);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the last child node.
     *
     * @return null
     */
    public Node getLastChild() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1116);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1117);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the previous sibling node.
     *
     * @return null
     */
    public Node getPreviousSibling() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1118);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1119);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the next sibling node.
     *
     * @return null
     */
    public Node getNextSibling() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1120);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1121);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the attribute nodes.
     *
     * @return null
     */
    public NamedNodeMap getAttributes() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1122);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1123);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the owner document.
     *
     * @return the owner document <em>of the parent node</em>
     */
    public Document getOwnerDocument() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1124);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1125);if ((((parent == null)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1126)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1127)==0&false))) {__CLR4_0_6u3u3l1l0dvc4.R.inc(1128);return null;
        }__CLR4_0_6u3u3l1l0dvc4.R.inc(1129);return parent.getOwnerDocument();
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Insert a new child node (always fails).
     *
     * @param newChild the node to add
     * @param refChild ignored
     * @return never
     * @throws DOMException always
     * @see Node#insertBefore
     */
    public Node insertBefore(Node newChild, Node refChild)
            throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1130);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1131);disallowModification();
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1132);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Replace a child node (always fails).
     *
     * @param newChild the node to add
     * @param oldChild the child node to replace
     * @return never
     * @throws DOMException always
     * @see Node#replaceChild
     */
    public Node replaceChild(Node newChild, Node oldChild) throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1133);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1134);disallowModification();
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1135);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Remove a child node (always fails).
     *
     * @param oldChild the child node to remove
     * @return never
     * @throws DOMException always
     * @see Node#removeChild
     */
    public Node removeChild(Node oldChild) throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1136);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1137);disallowModification();
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1138);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Append a new child node (always fails).
     *
     * @param newChild the node to add
     * @return never
     * @throws DOMException always
     * @see Node#appendChild
     */
    public Node appendChild(Node newChild) throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1139);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1140);disallowModification();
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1141);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Test for child nodes.
     *
     * @return false
     */
    public boolean hasChildNodes() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1142);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1143);return false;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Create a copy of this node.
     *
     * @param deep make a deep copy (no effect, since namespace nodes
     *             don't have children).
     * @return a new copy of this namespace node
     */
    public Node cloneNode(boolean deep) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1144);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1145);return new NamespaceNode(parent, name, value);
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Normalize the text descendants of this node.
     *
     * <p>This method has no effect, since namespace nodes have no
     * descendants.</p>
     */
    public void normalize() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1146);
        // no op
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Test if a DOM2 feature is supported. (None are.)
     *
     * @param feature the feature name
     * @param version the feature version
     * @return false
     */
    public boolean isSupported(String feature, String version) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1147);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1148);return false;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the namespace URI of this node.
     *
     * <p>Namespace declarations are not themselves
     * Namespace-qualified.</p>
     *
     * @return null
     */
    public String getNamespaceURI() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1149);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1150);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the namespace prefix of this node.
     *
     * <p>Namespace declarations are not themselves
     * namespace-qualified.</p>
     *
     * @return null
     * @see #getLocalName
     */
    public String getPrefix() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1151);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1152);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    ////////////////////////////////////////////////////////////////////
    // Override default methods from java.lang.Object.
    ////////////////////////////////////////////////////////////////////

    /**
     * Change the namespace prefix of this node (always fails).
     *
     * @param prefix the new prefix
     * @throws DOMException always thrown
     */
    public void setPrefix(String prefix)
            throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1153);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1154);disallowModification();
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Get the XPath name of the namespace node;; i.e. the
     * namespace prefix.
     *
     * @return the namespace prefix
     */
    public String getLocalName() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1155);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1156);return name;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Test if this node has attributes.
     *
     * @return false
     */
    public boolean hasAttributes() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1157);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1158);return false;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Throw a NO_MODIFICATION_ALLOWED_ERR DOMException.
     *
     * @throws DOMException always thrown
     */
    private void disallowModification() throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1159);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1160);throw new DOMException(DOMException.NO_MODIFICATION_ALLOWED_ERR,
                "Namespace node may not be modified");
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    ////////////////////////////////////////////////////////////////////
    // Internal state.
    ////////////////////////////////////////////////////////////////////

    /**
     * Generate a hash code for a namespace node.
     *
     * @return a hash code for this node
     */
    public int hashCode() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1161);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1162);return hashCode(parent) + hashCode(name) + hashCode(value);
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Test for equivalence with another object.
     *
     * <p>Two Namespace nodes are considered equivalent if their parents,
     * names, and values are equal.</p>
     *
     * @param o the object to test for equality
     * @return true if the object is equivalent to this node, false
     * otherwise
     */
    public boolean equals(Object o) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1163);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1164);if ((((o == this)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1165)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1166)==0&false))) {__CLR4_0_6u3u3l1l0dvc4.R.inc(1167);return true;
        }else {__CLR4_0_6u3u3l1l0dvc4.R.inc(1168);if ((((o == null)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1169)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1170)==0&false))) {__CLR4_0_6u3u3l1l0dvc4.R.inc(1171);return false;
        }else {__CLR4_0_6u3u3l1l0dvc4.R.inc(1172);if ((((o instanceof NamespaceNode)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1173)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1174)==0&false))) {{
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1175);NamespaceNode ns = (NamespaceNode) o;
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1176);return (equals(parent, ns.getParentNode()) &&
                    equals(name, ns.getNodeName()) &&
                    equals(value, ns.getNodeValue()));
        } }else {{
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1177);return false;
        }
    }}}}finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Helper method for generating a hash code.
     *
     * @param o the object for generating a hash code (possibly null)
     * @return the object's hash code, or 0 if the object is null
     * @see java.lang.Object#hashCode
     */
    private int hashCode(Object o) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1178);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1179);return ((((o == null )&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1180)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1181)==0&false))? 0 : o.hashCode());
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    ////////////////////////////////////////////////////////////////////
    // Inner class: empty node list.
    ////////////////////////////////////////////////////////////////////

    /**
     * Helper method for comparing two objects.
     *
     * @param a the first object to compare (possibly null)
     * @param b the second object to compare (possibly null)
     * @return true if the objects are equivalent or are both null
     * @see java.lang.Object#equals
     */
    private boolean equals(Object a, Object b) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1182);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1183);return ((a == null && b == null) ||
                (a != null && a.equals(b)));
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    ////////////////////////////////////////////////////////////////////
    // DOM Level 3 methods
    ////////////////////////////////////////////////////////////////////

    /**
     * Return the base URI of the document containing this node.
     * This only works in DOM 3.
     *
     * @return null
     */
    public String getBaseURI() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1184);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1185);Class clazz = Node.class;
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1186);try {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1187);Class[] args = new Class[0];
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1188);Method getBaseURI = clazz.getMethod("getBaseURI", args);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1189);String base = (String) getBaseURI.invoke(this.getParentNode(), args);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1190);return base;
        } catch (Exception ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1191);return null;
        }
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Compare relative position of this node to another nbode. (Always fails).
     * This method is included solely for compatibility with the superclass.
     *
     * @param other the node to compare to
     * @return never
     * @throws DOMException NOT_SUPPORTED_ERR
     */
    public short compareDocumentPosition(Node other) throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1192);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1193);DOMException ex = new DOMException(
                DOMException.NOT_SUPPORTED_ERR,
                "DOM level 3 interfaces are not fully implemented in Jaxen's NamespaceNode class"
        );
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1194);throw ex;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Return the namespace URI.
     *
     * @return the namespace URI
     * @see #getNodeValue
     */
    public String getTextContent() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1195);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1196);return value;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Change the value of this node (always fails).
     * This method is included solely for compatibility with the superclass.
     *
     * @param textContent the new content
     * @throws DOMException always
     */
    public void setTextContent(String textContent) throws DOMException {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1197);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1198);disallowModification();
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Returns true if and only if this object represents the same XPath namespace node
     * as the argument; that is, they have the same parent, the same prefix, and the
     * same URI.
     *
     * @param other the node to compare to
     * @return true if this object represents the same XPath namespace node
     * as other; false otherwise
     */
    public boolean isSameNode(Node other) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1199);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1200);boolean a = this.isEqualNode(other);
        // a bit flaky (should really be 
        // this.getParentNode().isEqual(other.getParentNode())
        // but we want this to compile in Java 1.4 without problems
        // Note that this will mess up code coverage since you can't cover both
        // branches in the same VM
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1201);boolean b;
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1202);Node thisParent = this.getParentNode();
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1203);Node thatParent = other.getParentNode();
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1204);try {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1205);Class clazz = Node.class;
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1206);Class[] args = {clazz};
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1207);Method isEqual = clazz.getMethod("isEqual", args);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1208);Object[] args2 = new Object[1];
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1209);args2[0] = thatParent;
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1210);Boolean result = (Boolean) isEqual.invoke(thisParent, args2);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1211);b = result.booleanValue();
        } catch (NoSuchMethodException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1212);b = thisParent.equals(thatParent);
        } catch (InvocationTargetException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1213);b = thisParent.equals(thatParent);
        } catch (IllegalAccessException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1214);b = thisParent.equals(thatParent);
        }

        __CLR4_0_6u3u3l1l0dvc4.R.inc(1215);return a && b;

    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Return the prefix bound to this namespace URI within the scope
     * of this node.
     *
     * @param namespaceURI the URI to find a prefix binding for
     * @return a prefix matching this namespace URI
     * @throws UnsupportedOperationException in DOM 2
     */
    public String lookupPrefix(String namespaceURI) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1216);
        // This could be fully implemented even in Java 1.4. See
        // http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/namespaces-algorithms.html#lookupNamespaceURIAlgo
        // It hardly seems worth the effort though.

        __CLR4_0_6u3u3l1l0dvc4.R.inc(1217);try {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1218);Class clazz = Node.class;
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1219);Class[] argTypes = {String.class};
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1220);Method lookupPrefix = clazz.getMethod("lookupPrefix", argTypes);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1221);String[] args = {namespaceURI};
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1222);String result = (String) lookupPrefix.invoke(parent, args);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1223);return result;
        } catch (NoSuchMethodException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1224);throw new UnsupportedOperationException("Cannot lookup prefixes in DOM 2");
        } catch (InvocationTargetException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1225);throw new UnsupportedOperationException("Cannot lookup prefixes in DOM 2");
        } catch (IllegalAccessException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1226);throw new UnsupportedOperationException("Cannot lookup prefixes in DOM 2");
        }

    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Return true if the specified URI is the default namespace in
     * scope (always fails). This method is included solely for
     * compatibility with the superclass.
     *
     * @param namespaceURI the URI to check
     * @return never
     * @throws UnsupportedOperationException always
     */
    public boolean isDefaultNamespace(String namespaceURI) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1227);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1228);return namespaceURI.equals(this.lookupNamespaceURI(null));
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Return the namespace URI mapped to the specified
     * prefix within the scope of this namespace node.
     *
     * @param prefix the prefix to search for
     * @return the namespace URI mapped to this prefix
     * @throws UnsupportedOperationException in DOM 2
     */
    public String lookupNamespaceURI(String prefix) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1229);
        // This could be fully implemented even in Java 1.4. See
        // http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/namespaces-algorithms.html#lookupNamespaceURIAlgo
        // It hardly seems worth the effort though.

        __CLR4_0_6u3u3l1l0dvc4.R.inc(1230);try {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1231);Class clazz = Node.class;
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1232);Class[] argTypes = {String.class};
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1233);Method lookupNamespaceURI = clazz.getMethod("lookupNamespaceURI", argTypes);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1234);String[] args = {prefix};
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1235);String result = (String) lookupNamespaceURI.invoke(parent, args);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1236);return result;
        } catch (NoSuchMethodException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1237);throw new UnsupportedOperationException("Cannot lookup namespace URIs in DOM 2");
        } catch (InvocationTargetException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1238);throw new UnsupportedOperationException("Cannot lookup namespace URIs in DOM 2");
        } catch (IllegalAccessException ex) {
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1239);throw new UnsupportedOperationException("Cannot lookup namespace URIs in DOM 2");
        }
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Returns true if this object binds the same prefix to the same URI.
     * That is, this object has the same prefix and URI as the argument.
     *
     * @param arg the node to compare to
     * @return true if this object has the same prefix and URI as the argument; false otherwise
     */
    public boolean isEqualNode(Node arg) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1240);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1241);if ((((arg.getNodeType() == this.getNodeType())&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1242)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1243)==0&false))) {{
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1244);NamespaceNode other = (NamespaceNode) arg;
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1245);if ((((other.name == null && this.name != null)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1246)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1247)==0&false))) {__CLR4_0_6u3u3l1l0dvc4.R.inc(1248);return false;
            }else {__CLR4_0_6u3u3l1l0dvc4.R.inc(1249);if ((((other.name != null && this.name == null)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1250)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1251)==0&false))) {__CLR4_0_6u3u3l1l0dvc4.R.inc(1252);return false;
            }else {__CLR4_0_6u3u3l1l0dvc4.R.inc(1253);if ((((other.value == null && this.value != null)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1254)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1255)==0&false))) {__CLR4_0_6u3u3l1l0dvc4.R.inc(1256);return false;
            }else {__CLR4_0_6u3u3l1l0dvc4.R.inc(1257);if ((((other.value != null && this.value == null)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1258)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1259)==0&false))) {__CLR4_0_6u3u3l1l0dvc4.R.inc(1260);return false;
            }else {__CLR4_0_6u3u3l1l0dvc4.R.inc(1261);if ((((other.name == null && this.name == null)&&(__CLR4_0_6u3u3l1l0dvc4.R.iget(1262)!=0|true))||(__CLR4_0_6u3u3l1l0dvc4.R.iget(1263)==0&false))) {{
                __CLR4_0_6u3u3l1l0dvc4.R.inc(1264);return other.value.equals(this.value);
            }

            }}}}}__CLR4_0_6u3u3l1l0dvc4.R.inc(1265);return other.name.equals(this.name) && other.value.equals(this.value);
        }
        }__CLR4_0_6u3u3l1l0dvc4.R.inc(1266);return false;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


    /**
     * Returns the value of the requested feature. Always returns null.
     *
     * @return null
     */
    public Object getFeature(String feature, String version) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1267);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1268);return null;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Associates an object with a key.
     *
     * @param key     the key by which the data will be retrieved
     * @param data    the object to store with the key
     * @param handler ignored since namespace nodes cannot be imported, cloned, or renamed
     * @return the value previously associated with this key; or null
     * if there isn't any such previous value
     */
    public Object setUserData(String key, Object data, UserDataHandler handler) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1269);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1270);Object oldValue = getUserData(key);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1271);userData.put(key, data);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1272);return oldValue;
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * Returns the user data associated with the given key.
     *
     * @param key the lookup key
     * @return the object associated with the key; or null if no such object is available
     */
    public Object getUserData(String key) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1273);
        __CLR4_0_6u3u3l1l0dvc4.R.inc(1274);return userData.get(key);
    }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    /**
     * A node list with no members.
     *
     * <p>This class is necessary for the {@link Node#getChildNodes}
     * method, which must return an empty node list rather than
     * null when there are no children.</p>
     */
    private static class EmptyNodeList implements NodeList {

        /**
         * @see NodeList#getLength
         */
        public int getLength() {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1275);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1276);return 0;
        }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}


        /**
         * @see NodeList#item
         */
        public Node item(int index) {try{__CLR4_0_6u3u3l1l0dvc4.R.inc(1277);
            __CLR4_0_6u3u3l1l0dvc4.R.inc(1278);return null;
        }finally{__CLR4_0_6u3u3l1l0dvc4.R.flushNeeded();}}

    }

}

// end of NamespaceNode.java
