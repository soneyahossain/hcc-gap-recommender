/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package org.jaxen;

/*
 $Id$

 Copyright 2003 The Werken Company. All Rights Reserved.
 
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are
met:

  * Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.

  * Neither the name of the Jaxen Project nor the names of its
    contributors may be used to endorse or promote products derived 
    from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Wrapper around implementation-specific objects used
 *  as the context of an expression evaluation.
 *
 *  <p>
 *  <strong>NOTE:</strong> This class is not typically used directly,
 *  but is exposed for writers of implementation-specific
 *  XPath packages.
 *  </p>
 *
 *  <p>
 *  The <code>Context</code> bundles utilities together
 *  for evaluation of the expression.  It wraps the provided
 *  objects for ease-of-passage through the expression 
 *  <acronym title="Abstract Syntax Tree">AST</acronym>.
 *  </p>
 *
 *  @see ContextSupport
 *  @see BaseXPath
 *  @see org.jaxen.dom4j.Dom4jXPath XPath for dom4j
 *  @see org.jaxen.jdom.JDOMXPath  XPath for JDOM
 *  @see org.jaxen.dom.DOMXPath   XPath for W3C DOM
 *
 *  @author <a href="mailto:bob@werken.com">bob mcwhirter</a>
 */
public class Context implements Serializable {public static class __CLR4_0_63b3bl1l0dv0g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * 
     */
    private static final long serialVersionUID = 2315979994685591055L;

    // ----------------------------------------------------------------------
    //     Instance members
    // ----------------------------------------------------------------------

    /** Context-support */
    private ContextSupport contextSupport;

    /** Context node-set */
    private List nodeSet;

    /** Current context size */
    private int size;

    /** Current context position */
    private int position;

    // ----------------------------------------------------------------------
    //     Constructors
    // ----------------------------------------------------------------------

    /** Create a new context.
     *
     *  @param contextSupport the context-support
     */
    public Context(ContextSupport contextSupport)
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(119);
        __CLR4_0_63b3bl1l0dv0g.R.inc(120);this.contextSupport = contextSupport;
        __CLR4_0_63b3bl1l0dv0g.R.inc(121);this.nodeSet        = Collections.EMPTY_LIST;
        __CLR4_0_63b3bl1l0dv0g.R.inc(122);this.size           = 0;
        __CLR4_0_63b3bl1l0dv0g.R.inc(123);this.position       = 0;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}
    
    // ----------------------------------------------------------------------
    //     Instance methods
    // ----------------------------------------------------------------------

    /** 
     * <p>
     * Set the context node-set, and sets the current context size to the size 
     * of this node-set. </p>
     * 
     * <p>The actual list is stored in this object. A copy
     * is not made. This list should not be modified in other code after
     * calling this method.</p>
     *  
     * <p>
     * After invoking this method, the client should immediately call 
     * {@link #setSize(int) setSize} and {@link #setPosition(int) setPosition}.
     *</p>
     *
     *  @param nodeSet the context node-set
     */
    public void setNodeSet(List nodeSet)
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(124);
        __CLR4_0_63b3bl1l0dv0g.R.inc(125);this.nodeSet = nodeSet;
        __CLR4_0_63b3bl1l0dv0g.R.inc(126);this.size    = nodeSet.size();
        __CLR4_0_63b3bl1l0dv0g.R.inc(127);if ((((position >= size)&&(__CLR4_0_63b3bl1l0dv0g.R.iget(128)!=0|true))||(__CLR4_0_63b3bl1l0dv0g.R.iget(129)==0&false))) {__CLR4_0_63b3bl1l0dv0g.R.inc(130);this.position = 0;
    }}finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Retrieve the context node-set.
     *  This is a live list. It is not a copy.
     *  Do not modify it.
     *
     *  @return the context node-set
     */
    public List getNodeSet()
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(131);
        __CLR4_0_63b3bl1l0dv0g.R.inc(132);return this.nodeSet;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Set the <code>ContextSupport</code>.
     *
     *  @param contextSupport the context-support
     */
    public void setContextSupport(ContextSupport contextSupport)
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(133);
        __CLR4_0_63b3bl1l0dv0g.R.inc(134);this.contextSupport = contextSupport;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Retrieve the <code>ContextSupport</code>.
     *
     *  @return the context-support
     */
    public ContextSupport getContextSupport()
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(135);
        __CLR4_0_63b3bl1l0dv0g.R.inc(136);return this.contextSupport;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Retrieve the current <code>Navigator</code>.
     *
     *  @return the navigator
     */
    public Navigator getNavigator()
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(137);
        __CLR4_0_63b3bl1l0dv0g.R.inc(138);return getContextSupport().getNavigator();
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Translate a namespace prefix to its URI.
     *
     *  @param prefix the prefix
     *
     *  @return the namespace URI mapped to the prefix
     */
    public String translateNamespacePrefixToUri(String prefix)
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(139);
        __CLR4_0_63b3bl1l0dv0g.R.inc(140);return getContextSupport().translateNamespacePrefixToUri( prefix );
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Retrieve a variable value.
     *
     *  @param namespaceURI the function namespace URI
     *  @param prefix the function prefix
     *  @param localName the function name
     *
     *  @return the variable value
     *
     *  @throws UnresolvableException if unable to locate a bound variable
     */
    public Object getVariableValue(String namespaceURI,
                                   String prefix,
                                   String localName)
        throws UnresolvableException
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(141);
        __CLR4_0_63b3bl1l0dv0g.R.inc(142);return getContextSupport().getVariableValue( namespaceURI,
                                                     prefix,
                                                     localName );
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Retrieve a <code>Function</code>.
     *
     *  @param namespaceURI the function namespace URI
     *  @param prefix the function prefix
     *  @param localName the function name
     *
     *  @return the function object
     *
     *  @throws UnresolvableException if unable to locate a bound function
     */
    public Function getFunction(String namespaceURI,
                                String prefix,
                                String localName)
        throws UnresolvableException
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(143);
        __CLR4_0_63b3bl1l0dv0g.R.inc(144);return getContextSupport().getFunction( namespaceURI,
                                                prefix,
                                                localName );
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    //     Properties
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    /** Set the current size in the context node-set.
     *
     *  @param size the size
     */
    public void setSize(int size)
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(145);
        __CLR4_0_63b3bl1l0dv0g.R.inc(146);this.size = size;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Retrieve the size of the current context node-set.
     *
     *  @return the size
     */
    public int getSize()
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(147);
        __CLR4_0_63b3bl1l0dv0g.R.inc(148);return this.size;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Set the current position in the context node-set.
     *
     *  @param position the position
     */
    public void setPosition(int position)
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(149);
        __CLR4_0_63b3bl1l0dv0g.R.inc(150);this.position = position;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    /** Retrieve current position in the context node-set.
     *
     *  @return the current position
     */
    public int getPosition()
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(151);
        __CLR4_0_63b3bl1l0dv0g.R.inc(152);return this.position;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    //     Helpers
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    /** Create a type-safe shallow copy.
     *
     *  @return the duplicate
     */
    public Context duplicate()
    {try{__CLR4_0_63b3bl1l0dv0g.R.inc(153);
        __CLR4_0_63b3bl1l0dv0g.R.inc(154);Context dupe = new Context( getContextSupport() );

        __CLR4_0_63b3bl1l0dv0g.R.inc(155);List thisNodeSet = getNodeSet();

        __CLR4_0_63b3bl1l0dv0g.R.inc(156);if ( (((thisNodeSet != null )&&(__CLR4_0_63b3bl1l0dv0g.R.iget(157)!=0|true))||(__CLR4_0_63b3bl1l0dv0g.R.iget(158)==0&false)))
        {{
            __CLR4_0_63b3bl1l0dv0g.R.inc(159);List dupeNodeSet = new ArrayList( thisNodeSet.size() );
            __CLR4_0_63b3bl1l0dv0g.R.inc(160);dupeNodeSet.addAll( thisNodeSet );
            __CLR4_0_63b3bl1l0dv0g.R.inc(161);dupe.setNodeSet( dupeNodeSet );
            __CLR4_0_63b3bl1l0dv0g.R.inc(162);dupe.setPosition(this.position);
        }

        }__CLR4_0_63b3bl1l0dv0g.R.inc(163);return dupe;
    }finally{__CLR4_0_63b3bl1l0dv0g.R.flushNeeded();}}
}
