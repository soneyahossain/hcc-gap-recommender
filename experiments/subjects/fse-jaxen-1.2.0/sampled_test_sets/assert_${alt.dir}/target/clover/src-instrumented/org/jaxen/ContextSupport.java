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

/** Supporting context information for resolving
 *  namespace prefixes, functions, and variables.
 * 
 *  <p>
 *  <strong>NOTE:</strong> This class is not typically used directly,
 *  but is exposed for writers of implementation-specific
 *  XPath packages.
 *  </p>
 *
 *  @see org.jaxen.dom4j.Dom4jXPath XPath for dom4j
 *  @see org.jaxen.jdom.JDOMXPath   XPath for JDOM
 *  @see org.jaxen.dom.DOMXPath     XPath for W3C DOM
 *
 *  @author <a href="mailto:bob@eng.werken.com">bob mcwhirter</a>
 *
 *  @version $Id$
 */
public class ContextSupport implements Serializable {public static class __CLR4_0_64k4kl1l0dv16{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * 
     */
    private static final long serialVersionUID = 4494082174713652559L;

    /** Function context. */
    private transient FunctionContext functionContext;
    
    /** Namespace context. */
    private NamespaceContext namespaceContext;

    /** Variable context. */
    private VariableContext variableContext;
    
    /** Model navigator. */
    private Navigator navigator;

    // ----------------------------------------------------------------------
    //     Constructors
    // ----------------------------------------------------------------------
    
    /** Construct an empty <code>ContextSupport</code>.
     */
    public ContextSupport()
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(164);
        // intentionally left blank
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    /** Create a new ContextSupport object.
     *
     *  @param namespaceContext the NamespaceContext
     *  @param functionContext the FunctionContext
     *  @param variableContext the VariableContext
     *  @param navigator the model navigator
     */
    public ContextSupport(NamespaceContext namespaceContext,
                          FunctionContext functionContext,
                          VariableContext variableContext,
                          Navigator navigator)
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(165);
        __CLR4_0_64k4kl1l0dv16.R.inc(166);setNamespaceContext( namespaceContext );
        __CLR4_0_64k4kl1l0dv16.R.inc(167);setFunctionContext( functionContext );
        __CLR4_0_64k4kl1l0dv16.R.inc(168);setVariableContext( variableContext );

        __CLR4_0_64k4kl1l0dv16.R.inc(169);this.navigator = navigator;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    // ----------------------------------------------------------------------
    //     Instance methods
    // ----------------------------------------------------------------------

    /** Set the <code>NamespaceContext</code>.
     *
     *  @param namespaceContext the namespace context
     */
    public void setNamespaceContext(NamespaceContext namespaceContext)
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(170);
        __CLR4_0_64k4kl1l0dv16.R.inc(171);this.namespaceContext = namespaceContext;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    /** Retrieve the <code>NamespaceContext</code>.
     *
     *  @return the namespace context
     */
    public NamespaceContext getNamespaceContext()
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(172);
        __CLR4_0_64k4kl1l0dv16.R.inc(173);return this.namespaceContext;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    /** Set the <code>FunctionContext</code>.
     *
     *  @param functionContext the function context
     */
    public void setFunctionContext(FunctionContext functionContext)
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(174);
        __CLR4_0_64k4kl1l0dv16.R.inc(175);this.functionContext  = functionContext;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    /** Retrieve the <code>FunctionContext</code>.
     *
     *  @return the function context
     */
    public FunctionContext getFunctionContext()
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(176);
        __CLR4_0_64k4kl1l0dv16.R.inc(177);return this.functionContext;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    /** Set the <code>VariableContext</code>.
     *
     *  @param variableContext the variable context
     */
    public void setVariableContext(VariableContext variableContext)
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(178);
        __CLR4_0_64k4kl1l0dv16.R.inc(179);this.variableContext  = variableContext;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    /** Retrieve the <code>VariableContext</code>.
     *
     *  @return the variable context
     */
    public VariableContext getVariableContext()
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(180);
        __CLR4_0_64k4kl1l0dv16.R.inc(181);return this.variableContext;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    /** Retrieve the <code>Navigator</code>.
     *
     *  @return the navigator
     */
    public Navigator getNavigator()
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(182);
        __CLR4_0_64k4kl1l0dv16.R.inc(183);return this.navigator;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    /** Translate a namespace prefix to its URI.
     *
     *  @param prefix The prefix
     *
     *  @return the namespace URI mapped to the prefix
     */
    public String translateNamespacePrefixToUri(String prefix)
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(184);
        
        __CLR4_0_64k4kl1l0dv16.R.inc(185);if (((("xml".equals(prefix))&&(__CLR4_0_64k4kl1l0dv16.R.iget(186)!=0|true))||(__CLR4_0_64k4kl1l0dv16.R.iget(187)==0&false))) {{
            __CLR4_0_64k4kl1l0dv16.R.inc(188);return "http://www.w3.org/XML/1998/namespace";
        }
        }__CLR4_0_64k4kl1l0dv16.R.inc(189);NamespaceContext context = getNamespaceContext();

        __CLR4_0_64k4kl1l0dv16.R.inc(190);if ( (((context != null )&&(__CLR4_0_64k4kl1l0dv16.R.iget(191)!=0|true))||(__CLR4_0_64k4kl1l0dv16.R.iget(192)==0&false)))
        {{
            __CLR4_0_64k4kl1l0dv16.R.inc(193);return context.translateNamespacePrefixToUri( prefix );
        }

        }__CLR4_0_64k4kl1l0dv16.R.inc(194);return null;
    }finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

    /** Retrieve a variable value.
     *
     *  @param namespaceURI the function namespace URI
     *  @param prefix the function prefix
     *  @param localName the function name
     *
     *  @return the variable value.
     *
     *  @throws UnresolvableException if unable to locate a bound variable.
     */
    public Object getVariableValue( String namespaceURI,
                                    String prefix,
                                    String localName )
        throws UnresolvableException
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(195);
        __CLR4_0_64k4kl1l0dv16.R.inc(196);VariableContext context = getVariableContext();

        __CLR4_0_64k4kl1l0dv16.R.inc(197);if ( (((context != null )&&(__CLR4_0_64k4kl1l0dv16.R.iget(198)!=0|true))||(__CLR4_0_64k4kl1l0dv16.R.iget(199)==0&false)))
        {{
            __CLR4_0_64k4kl1l0dv16.R.inc(200);return context.getVariableValue( namespaceURI, prefix, localName );
        }
        }else
        {{
            __CLR4_0_64k4kl1l0dv16.R.inc(201);throw new UnresolvableException( "No variable context installed" );
        }
    }}finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}

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
    public Function getFunction( String namespaceURI,
                                 String prefix,
                                 String localName )
        throws UnresolvableException
    {try{__CLR4_0_64k4kl1l0dv16.R.inc(202);
        __CLR4_0_64k4kl1l0dv16.R.inc(203);FunctionContext context = getFunctionContext();

        __CLR4_0_64k4kl1l0dv16.R.inc(204);if ( (((context != null )&&(__CLR4_0_64k4kl1l0dv16.R.iget(205)!=0|true))||(__CLR4_0_64k4kl1l0dv16.R.iget(206)==0&false)))
        {{
            __CLR4_0_64k4kl1l0dv16.R.inc(207);return context.getFunction( namespaceURI, prefix, localName );
        }
        }else
        {{
            __CLR4_0_64k4kl1l0dv16.R.inc(208);throw new UnresolvableException( "No function context installed" );
        }
    }}finally{__CLR4_0_64k4kl1l0dv16.R.flushNeeded();}}
    
}
