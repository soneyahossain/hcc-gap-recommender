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


package org.jaxen;

import java.io.Serializable;
import java.util.List;

import org.jaxen.expr.Expr;
import org.jaxen.expr.XPathExpr;
import org.jaxen.function.BooleanFunction;
import org.jaxen.function.NumberFunction;
import org.jaxen.function.StringFunction;
import org.jaxen.saxpath.SAXPathException;
import org.jaxen.saxpath.XPathReader;
import org.jaxen.saxpath.helpers.XPathReaderFactory;
import org.jaxen.util.SingletonList;

/** Base functionality for all concrete, implementation-specific XPaths.
 *
 *  <p>
 *  This class provides generic functionality for further-defined
 *  implementation-specific XPaths.
 *  </p>
 *
 *  <p>
 *  If you want to adapt the Jaxen engine to traverse your own
 *  object model, then this is a good base class to derive from.
 *  Typically you only really need to provide your own 
 *  {@link org.jaxen.Navigator} implementation.
 *  </p>
 *
 *  @see org.jaxen.dom4j.Dom4jXPath XPath for dom4j
 *  @see org.jaxen.jdom.JDOMXPath   XPath for JDOM
 *  @see org.jaxen.dom.DOMXPath     XPath for W3C DOM
 *
 *  @author <a href="mailto:bob@werken.com">bob mcwhirter</a>
 *  @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 */
public class BaseXPath implements XPath, Serializable
{public static class __CLR4_0_600l1l0duyf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,119,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -1993731281300293168L;

    /** Original expression text. */
    private final String exprText;

    /** the parsed form of the XPath expression */
    private final XPathExpr xpath;
    
    /** the support information and function, namespace and variable contexts */
    private ContextSupport support;

    /** the implementation-specific Navigator for retrieving XML nodes **/
    private Navigator navigator;
    
    /** Construct given an XPath expression string. 
     *
     *  @param xpathExpr the XPath expression
     *
     *  @throws JaxenException if there is a syntax error while
     *          parsing the expression
     */
    protected BaseXPath(String xpathExpr) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(0);
        __CLR4_0_600l1l0duyf.R.inc(1);try
        {
            __CLR4_0_600l1l0duyf.R.inc(2);XPathReader reader = XPathReaderFactory.createReader();
            __CLR4_0_600l1l0duyf.R.inc(3);JaxenHandler handler = new JaxenHandler();
            __CLR4_0_600l1l0duyf.R.inc(4);reader.setXPathHandler( handler );
            __CLR4_0_600l1l0duyf.R.inc(5);reader.parse( xpathExpr );
            __CLR4_0_600l1l0duyf.R.inc(6);this.xpath = handler.getXPathExpr();
        }
        catch (org.jaxen.saxpath.XPathSyntaxException e)
        {
            __CLR4_0_600l1l0duyf.R.inc(7);throw new org.jaxen.XPathSyntaxException( e );
        }
        catch (SAXPathException e)
        {
            __CLR4_0_600l1l0duyf.R.inc(8);throw new JaxenException( e );
        }

        __CLR4_0_600l1l0duyf.R.inc(9);this.exprText = xpathExpr;
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Construct given an XPath expression string.
     *
     *  @param xpathExpr the XPath expression
     *
     *  @param navigator the XML navigator to use
     *
     *  @throws JaxenException if there is a syntax error while
     *          parsing the expression
     */
    public BaseXPath(String xpathExpr, Navigator navigator) throws JaxenException
    {
        this( xpathExpr );__CLR4_0_600l1l0duyf.R.inc(11);try{__CLR4_0_600l1l0duyf.R.inc(10);
        __CLR4_0_600l1l0duyf.R.inc(12);this.navigator = navigator;
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Evaluate this XPath against a given context.
     *  The context of evaluation may be any object type
     *  the navigator recognizes as a node.
     *  The return value is either a <code>String</code>,
     *  <code>Double</code>, <code>Boolean</code>, or <code>List</code>
     *  of nodes.
     *
     *  <p>
     *  When using this method, one must be careful to
     *  test the class of the returned object.  If the returned 
     *  object is a list, then the items in this 
     *  list will be the actual <code>Document</code>,
     *  <code>Element</code>, <code>Attribute</code>, etc. objects
     *  as defined by the concrete XML object-model implementation,
     *  directly from the context document.  This method <strong>does
     *  not return <em>copies</em> of anything</strong>, but merely 
     *  returns references to objects within the source document.
     *  </p>
     *  
     * @param context the node, node-set or Context object for evaluation. 
     *      This value can be null.
     *
     * @return the result of evaluating the XPath expression
     *          against the supplied context
     * @throws JaxenException if an XPath error occurs during expression evaluation
     * @throws ClassCastException if the context is not a node
     */
    public Object evaluate(Object context) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(13);
        __CLR4_0_600l1l0duyf.R.inc(14);List answer = selectNodes(context);

        __CLR4_0_600l1l0duyf.R.inc(15);if ( (((answer != null
             &&
             answer.size() == 1 )&&(__CLR4_0_600l1l0duyf.R.iget(16)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(17)==0&false)))
        {{
            __CLR4_0_600l1l0duyf.R.inc(18);Object first = answer.get(0);

            __CLR4_0_600l1l0duyf.R.inc(19);if ( (((first instanceof String
                 ||
                 first instanceof Number
                 ||
                 first instanceof Boolean )&&(__CLR4_0_600l1l0duyf.R.iget(20)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(21)==0&false))) 
            {{
                __CLR4_0_600l1l0duyf.R.inc(22);return first;
            }
        }}
        }__CLR4_0_600l1l0duyf.R.inc(23);return answer;
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
    /** 
     *  List all the nodes selected by this XPath
     *  expression. If multiple nodes match, multiple nodes
     *  are returned. Nodes are returned
     *  in document-order, as defined by the XPath
     *  specification. If the expression selects a non-node-set
     *  (i.e. a number, boolean, or string) then a List
     *  containing just that one object is returned.
     *
     * @param node the node, node-set or Context object for evaluation. 
     *     This value can be null.
     *
     * @return the node-set of all items selected by this XPath expression
     * @throws JaxenException if an XPath error occurs during expression evaluation
     *
     * @see #selectNodesForContext
     */
    public List selectNodes(Object node) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(24);
        __CLR4_0_600l1l0duyf.R.inc(25);Context context = getContext( node );
        __CLR4_0_600l1l0duyf.R.inc(26);return selectNodesForContext( context );
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** 
     * Return the first node selected by this XPath
     * expression. If multiple nodes match, only one node is
     * returned. The selected node will be the first
     * selected node in document-order, as defined by the XPath
     * specification.
     *
     * @param node the node, node-set or Context object for evaluation. 
     *     This value can be null.
     *
     * @return the node-set of all items selected
     *          by this XPath expression
     * @throws JaxenException if an XPath error occurs during expression evaluation
     *
     * @see #selectNodes
     */
    public Object selectSingleNode(Object node) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(27);
        __CLR4_0_600l1l0duyf.R.inc(28);List results = selectNodes( node );

        __CLR4_0_600l1l0duyf.R.inc(29);if ( (((results.isEmpty() )&&(__CLR4_0_600l1l0duyf.R.iget(30)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(31)==0&false)))
        {{
            __CLR4_0_600l1l0duyf.R.inc(32);return null;
        }

        }__CLR4_0_600l1l0duyf.R.inc(33);return results.get( 0 );
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /**
     * Returns the XPath string-value of the argument node.
     * 
     * @param node the node whose value to take
     * @return the XPath string value of this node
     * @throws JaxenException if an XPath error occurs during expression evaluation
     * @deprecated replaced by {@link #stringValueOf}
     */
    public String valueOf(Object node) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(34);
        __CLR4_0_600l1l0duyf.R.inc(35);return stringValueOf( node );
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Retrieves the string-value of the result of
     *  evaluating this XPath expression when evaluated 
     *  against the specified context.
     *
     *  <p>
     *  The string-value of the expression is determined per
     *  the <code>string(..)</code> core function defined
     *  in the XPath specification.  This means that an expression
     *  that selects zero nodes will return the empty string,
     *  while an expression that selects one-or-more nodes will
     *  return the string-value of the first node.
     *  </p>
     *
     * @param node the node, node-set or Context object for evaluation. This value can be null.
     *
     * @return the string-value of the result of evaluating this expression with the specified context node
     * @throws JaxenException if an XPath error occurs during expression evaluation
     */
    public String stringValueOf(Object node) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(36);
        __CLR4_0_600l1l0duyf.R.inc(37);Context context = getContext( node );
        
        __CLR4_0_600l1l0duyf.R.inc(38);Object result = selectSingleNodeForContext( context );

        __CLR4_0_600l1l0duyf.R.inc(39);if ( (((result == null )&&(__CLR4_0_600l1l0duyf.R.iget(40)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(41)==0&false)))
        {{
            __CLR4_0_600l1l0duyf.R.inc(42);return "";
        }

        }__CLR4_0_600l1l0duyf.R.inc(43);return StringFunction.evaluate( result,
                                        context.getNavigator() );
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Retrieve a boolean-value interpretation of this XPath
     *  expression when evaluated against a given context.
     *
     *  <p>
     *  The boolean-value of the expression is determined per
     *  the <code>boolean(..)</code> function defined
     *  in the XPath specification.  This means that an expression
     *  that selects zero nodes will return <code>false</code>,
     *  while an expression that selects one or more nodes will
     *  return <code>true</code>.
     *  </p>
     *
     * @param node the node, node-set or Context object for evaluation. This value can be null.
     *
     * @return the boolean-value of the result of evaluating this expression with the specified context node
     * @throws JaxenException if an XPath error occurs during expression evaluation
     */
    public boolean booleanValueOf(Object node) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(44);
        __CLR4_0_600l1l0duyf.R.inc(45);Context context = getContext( node );
        __CLR4_0_600l1l0duyf.R.inc(46);List result = selectNodesForContext( context );
        __CLR4_0_600l1l0duyf.R.inc(47);if ( (((result == null )&&(__CLR4_0_600l1l0duyf.R.iget(48)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(49)==0&false))) {__CLR4_0_600l1l0duyf.R.inc(50);return false;
        }__CLR4_0_600l1l0duyf.R.inc(51);return BooleanFunction.evaluate( result, context.getNavigator() ).booleanValue();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Retrieve a number-value interpretation of this XPath
     *  expression when evaluated against a given context.
     *
     *  <p>
     *  The number-value of the expression is determined per
     *  the <code>number(..)</code> core function as defined
     *  in the XPath specification. This means that if this
     *  expression selects multiple nodes, the number-value
     *  of the first node is returned.
     *  </p>
     *
     * @param node the node, node-set or Context object for evaluation. This value can be null.
     *
     * @return a <code>Double</code> indicating the numeric value of
     *      evaluating this expression against the specified context
     * @throws JaxenException if an XPath error occurs during expression evaluation
     */
    public Number numberValueOf(Object node) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(52);
        __CLR4_0_600l1l0duyf.R.inc(53);Context context = getContext( node );
        __CLR4_0_600l1l0duyf.R.inc(54);Object result = selectSingleNodeForContext( context );
        __CLR4_0_600l1l0duyf.R.inc(55);return NumberFunction.evaluate( result,
                                        context.getNavigator() );
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    // Helpers

    /** Add a namespace prefix-to-URI mapping for this XPath
     *  expression.
     *
     *  <p>
     *  Namespace prefix-to-URI mappings in an XPath are independent
     *  of those used within any document.  Only the mapping explicitly
     *  added to this XPath will be available for resolving the
     *  XPath expression.
     *  </p>
     *
     *  <p>
     *  This is a convenience method for adding mappings to the
     *  default {@link NamespaceContext} in place for this XPath.
     *  If you have installed a custom <code>NamespaceContext</code>
     *  that is not a <code>SimpleNamespaceContext</code>,
     *  then this method will throw a <code>JaxenException</code>.
     *  </p>
     *
     *  @param prefix the namespace prefix
     *  @param uri the namespace URI
     *
     *  @throws JaxenException if the <code>NamespaceContext</code>
     *          used by this XPath is not a <code>SimpleNamespaceContext</code>
     */
    public void addNamespace(String prefix,
                             String uri) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(56);
        __CLR4_0_600l1l0duyf.R.inc(57);NamespaceContext nsContext = getNamespaceContext();
        __CLR4_0_600l1l0duyf.R.inc(58);if ( (((nsContext instanceof SimpleNamespaceContext )&&(__CLR4_0_600l1l0duyf.R.iget(59)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(60)==0&false)))
        {{
            __CLR4_0_600l1l0duyf.R.inc(61);((SimpleNamespaceContext)nsContext).addNamespace( prefix,
                                                              uri );
            __CLR4_0_600l1l0duyf.R.inc(62);return;
        }

        }__CLR4_0_600l1l0duyf.R.inc(63);throw new JaxenException("Operation not permitted while using a non-simple namespace context.");
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}


    // ------------------------------------------------------------
    // ------------------------------------------------------------
    //     Properties
    // ------------------------------------------------------------
    // ------------------------------------------------------------

    
    /** Set a <code>NamespaceContext</code> for use with this
     *  XPath expression.
     *
     *  <p>
     *  A <code>NamespaceContext</code> is responsible for translating
     *  namespace prefixes within the expression into namespace URIs.
     *  </p>
     *
     *  @param namespaceContext the <code>NamespaceContext</code> to
     *         install for this expression
     *
     *  @see NamespaceContext
     *  @see NamespaceContext#translateNamespacePrefixToUri
     */
    public void setNamespaceContext(NamespaceContext namespaceContext)
    {try{__CLR4_0_600l1l0duyf.R.inc(64);
        __CLR4_0_600l1l0duyf.R.inc(65);getContextSupport().setNamespaceContext(namespaceContext);
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Set a <code>FunctionContext</code> for use with this XPath
     *  expression.
     *
     *  <p>
     *  A <code>FunctionContext</code> is responsible for resolving
     *  all function calls used within the expression.
     *  </p>
     *
     *  @param functionContext the <code>FunctionContext</code> to
     *         install for this expression
     *
     *  @see FunctionContext
     *  @see FunctionContext#getFunction
     */
    public void setFunctionContext(FunctionContext functionContext)
    {try{__CLR4_0_600l1l0duyf.R.inc(66);
        __CLR4_0_600l1l0duyf.R.inc(67);getContextSupport().setFunctionContext(functionContext);
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Set a <code>VariableContext</code> for use with this XPath
     *  expression.
     *
     *  <p>
     *  A <code>VariableContext</code> is responsible for resolving
     *  all variables referenced within the expression.
     *  </p>
     *
     *  @param variableContext The <code>VariableContext</code> to
     *         install for this expression
     *
     *  @see VariableContext
     *  @see VariableContext#getVariableValue
     */
    public void setVariableContext(VariableContext variableContext)
    {try{__CLR4_0_600l1l0duyf.R.inc(68);
        __CLR4_0_600l1l0duyf.R.inc(69);getContextSupport().setVariableContext(variableContext);
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Retrieve the <code>NamespaceContext</code> used by this XPath
     *  expression.
     *
     *  <p>
     *  A <code>NamespaceContext</code> is responsible for mapping
     *  prefixes used within the expression to namespace URIs.
     *  </p>
     *
     *  <p>
     *  If this XPath expression has not previously had a <code>NamespaceContext</code>
     *  installed, a new default <code>NamespaceContext</code> will be created,
     *  installed and returned.
     *  </p>
     *
     *  @return the <code>NamespaceContext</code> used by this expression
     *
     *  @see NamespaceContext
     */
    public NamespaceContext getNamespaceContext()
    {try{__CLR4_0_600l1l0duyf.R.inc(70);
        __CLR4_0_600l1l0duyf.R.inc(71);return getContextSupport().getNamespaceContext();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Retrieve the <code>FunctionContext</code> used by this XPath
     *  expression.
     *
     *  <p>
     *  A <code>FunctionContext</code> is responsible for resolving
     *  all function calls used within the expression.
     *  </p>
     *
     *  <p>
     *  If this XPath expression has not previously had a <code>FunctionContext</code>
     *  installed, a new default <code>FunctionContext</code> will be created,
     *  installed and returned.
     *  </p>
     *
     *  @return the <code>FunctionContext</code> used by this expression
     *
     *  @see FunctionContext
     */
    public FunctionContext getFunctionContext()
    {try{__CLR4_0_600l1l0duyf.R.inc(72);
        __CLR4_0_600l1l0duyf.R.inc(73);return getContextSupport().getFunctionContext();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Retrieve the <code>VariableContext</code> used by this XPath
     *  expression.
     *
     *  <p>
     *  A <code>VariableContext</code> is responsible for resolving
     *  all variables referenced within the expression.
     *  </p>
     *
     *  <p>
     *  If this XPath expression has not previously had a <code>VariableContext</code>
     *  installed, a new default <code>VariableContext</code> will be created,
     *  installed and returned.
     *  </p>
     *  
     *  @return the <code>VariableContext</code> used by this expression
     *
     *  @see VariableContext
     */
    public VariableContext getVariableContext()
    {try{__CLR4_0_600l1l0duyf.R.inc(74);
        __CLR4_0_600l1l0duyf.R.inc(75);return getContextSupport().getVariableContext();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
    
    /** Retrieve the root expression of the internal
     *  compiled form of this XPath expression.
     *
     *  <p>
     *  Internally, Jaxen maintains a form of Abstract Syntax
     *  Tree (AST) to represent the structure of the XPath expression.
     *  This is normally not required during normal consumer-grade
     *  usage of Jaxen.  This method is provided for hard-core users
     *  who wish to manipulate or inspect a tree-based version of
     *  the expression.
     *  </p>
     *
     *  @return the root of the AST of this expression
     */
    public Expr getRootExpr() 
    {try{__CLR4_0_600l1l0duyf.R.inc(76);
        __CLR4_0_600l1l0duyf.R.inc(77);return xpath.getRootExpr();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
    /** Return the original expression text.
     *
     *  @return the normalized XPath expression string
     */
    public String toString()
    {try{__CLR4_0_600l1l0duyf.R.inc(78);
        __CLR4_0_600l1l0duyf.R.inc(79);return this.exprText;
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Returns a string representation of the parse tree.
     *
     *  @return a string representation of the parse tree.
     */
    public String debug()
    {try{__CLR4_0_600l1l0duyf.R.inc(80);
        __CLR4_0_600l1l0duyf.R.inc(81);return this.xpath.toString();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
    // ------------------------------------------------------------
    // ------------------------------------------------------------
    //     Implementation methods
    // ------------------------------------------------------------
    // ------------------------------------------------------------

    
    /** Create a {@link Context} wrapper for the provided
     *  implementation-specific object.
     *
     *  @param node the implementation-specific object 
     *         to be used as the context
     *
     *  @return a <code>Context</code> wrapper around the object
     */
    protected Context getContext(Object node)
    {try{__CLR4_0_600l1l0duyf.R.inc(82);
        __CLR4_0_600l1l0duyf.R.inc(83);if ( (((node instanceof Context )&&(__CLR4_0_600l1l0duyf.R.iget(84)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(85)==0&false)))
        {{
            __CLR4_0_600l1l0duyf.R.inc(86);return (Context) node;
        }

        }__CLR4_0_600l1l0duyf.R.inc(87);Context fullContext = new Context( getContextSupport() );

        __CLR4_0_600l1l0duyf.R.inc(88);if ( (((node instanceof List )&&(__CLR4_0_600l1l0duyf.R.iget(89)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(90)==0&false)))
        {{
            __CLR4_0_600l1l0duyf.R.inc(91);fullContext.setNodeSet( (List) node );
        }
        }else
        {{
            __CLR4_0_600l1l0duyf.R.inc(92);List list = new SingletonList(node);
            __CLR4_0_600l1l0duyf.R.inc(93);fullContext.setNodeSet( list );
        }

        }__CLR4_0_600l1l0duyf.R.inc(94);return fullContext;
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Retrieve the {@link ContextSupport} aggregation of
     *  <code>NamespaceContext</code>, <code>FunctionContext</code>,
     *  <code>VariableContext</code>, and {@link Navigator}.
     *
     *  @return aggregate <code>ContextSupport</code> for this
     *          XPath expression
     */
    protected ContextSupport getContextSupport()
    {try{__CLR4_0_600l1l0duyf.R.inc(95);
        __CLR4_0_600l1l0duyf.R.inc(96);if ( (((support == null )&&(__CLR4_0_600l1l0duyf.R.iget(97)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(98)==0&false)))
        {{
            __CLR4_0_600l1l0duyf.R.inc(99);support = new ContextSupport( 
                createNamespaceContext(),
                createFunctionContext(),
                createVariableContext(),
                getNavigator() 
            );
        }

        }__CLR4_0_600l1l0duyf.R.inc(100);return support;
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}

    /** Retrieve the XML object-model-specific {@link Navigator} 
     *  for us in evaluating this XPath expression.
     *
     *  @return the implementation-specific <code>Navigator</code>
     */
    public Navigator getNavigator()
    {try{__CLR4_0_600l1l0duyf.R.inc(101);
        __CLR4_0_600l1l0duyf.R.inc(102);return navigator;
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
    

    // ------------------------------------------------------------
    // ------------------------------------------------------------
    //     Factory methods for default contexts
    // ------------------------------------------------------------
    // ------------------------------------------------------------

    /** Create a default <code>FunctionContext</code>.
     *
     *  @return a default <code>FunctionContext</code>
     */
    protected FunctionContext createFunctionContext()
    {try{__CLR4_0_600l1l0duyf.R.inc(103);
        __CLR4_0_600l1l0duyf.R.inc(104);return XPathFunctionContext.getInstance();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
    /** Create a default <code>NamespaceContext</code>.
     *
     *  @return a default <code>NamespaceContext</code> instance
     */
    protected NamespaceContext createNamespaceContext()
    {try{__CLR4_0_600l1l0duyf.R.inc(105);
        __CLR4_0_600l1l0duyf.R.inc(106);return new SimpleNamespaceContext();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
    /** Create a default <code>VariableContext</code>.
     *
     *  @return a default <code>VariableContext</code> instance
     */
    protected VariableContext createVariableContext()
    {try{__CLR4_0_600l1l0duyf.R.inc(107);
        __CLR4_0_600l1l0duyf.R.inc(108);return new SimpleVariableContext();
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
    /** Select all nodes that match this XPath
     *  expression on the given Context object. 
     *  If multiple nodes match, multiple nodes
     *  will be returned in document-order, as defined by the XPath
     *  specification. If the expression selects a non-node-set
     *  (i.e. a number, boolean, or string) then a List
     *  containing just that one object is returned.
     *
     * @param context the Context which gets evaluated
     *
     * @return the node-set of all items selected
     *          by this XPath expression
     * @throws JaxenException if an XPath error occurs during expression evaluation
     *
     */
    protected List selectNodesForContext(Context context) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(109);
        __CLR4_0_600l1l0duyf.R.inc(110);List list = this.xpath.asList( context );
        __CLR4_0_600l1l0duyf.R.inc(111);return list;
        
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
 

    /** Return only the first node that is selected by this XPath
     *  expression.  If multiple nodes match, only one node will be
     *  returned. The selected node will be the first
     *  selected node in document-order, as defined by the XPath
     *  specification. If the XPath expression selects a double,
     *  String, or boolean, then that object is returned.
     *
     * @param context the Context against which this expression is evaluated
     *
     * @return the first node in document order of all nodes selected
     *          by this XPath expression
     * @throws JaxenException if an XPath error occurs during expression evaluation
     *
     * @see #selectNodesForContext
     */
    protected Object selectSingleNodeForContext(Context context) throws JaxenException
    {try{__CLR4_0_600l1l0duyf.R.inc(112);
        __CLR4_0_600l1l0duyf.R.inc(113);List results = selectNodesForContext(context);

        __CLR4_0_600l1l0duyf.R.inc(114);if ( (((results.isEmpty() )&&(__CLR4_0_600l1l0duyf.R.iget(115)!=0|true))||(__CLR4_0_600l1l0duyf.R.iget(116)==0&false)))
        {{
            __CLR4_0_600l1l0duyf.R.inc(117);return null;
        }

        }__CLR4_0_600l1l0duyf.R.inc(118);return results.get( 0 );
    }finally{__CLR4_0_600l1l0duyf.R.flushNeeded();}}
    
}
