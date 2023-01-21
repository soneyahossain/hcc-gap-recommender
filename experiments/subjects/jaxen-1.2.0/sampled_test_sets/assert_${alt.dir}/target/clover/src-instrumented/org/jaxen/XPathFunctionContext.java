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

import org.jaxen.function.BooleanFunction;
import org.jaxen.function.CeilingFunction;
import org.jaxen.function.ConcatFunction;
import org.jaxen.function.ContainsFunction;
import org.jaxen.function.CountFunction;
import org.jaxen.function.FalseFunction;
import org.jaxen.function.FloorFunction;
import org.jaxen.function.IdFunction;
import org.jaxen.function.LangFunction;
import org.jaxen.function.LastFunction;
import org.jaxen.function.LocalNameFunction;
import org.jaxen.function.NameFunction;
import org.jaxen.function.NamespaceUriFunction;
import org.jaxen.function.NormalizeSpaceFunction;
import org.jaxen.function.NotFunction;
import org.jaxen.function.NumberFunction;
import org.jaxen.function.PositionFunction;
import org.jaxen.function.RoundFunction;
import org.jaxen.function.StartsWithFunction;
import org.jaxen.function.StringFunction;
import org.jaxen.function.StringLengthFunction;
import org.jaxen.function.SubstringAfterFunction;
import org.jaxen.function.SubstringBeforeFunction;
import org.jaxen.function.SubstringFunction;
import org.jaxen.function.SumFunction;
import org.jaxen.function.TranslateFunction;
import org.jaxen.function.TrueFunction;
import org.jaxen.function.ext.EndsWithFunction;
import org.jaxen.function.ext.EvaluateFunction;
import org.jaxen.function.ext.LowerFunction;
import org.jaxen.function.ext.UpperFunction;
import org.jaxen.function.xslt.DocumentFunction;

/** A <code>FunctionContext</code> implementing the core XPath
 *  function library, plus Jaxen extensions.
 *
 *  <p>
 *  The core XPath function library is provided through this
 *  implementation of <code>FunctionContext</code>.  Additionally,
 *  extension functions have been provided, as enumerated below.
 *  </p>
 *
 *  <p>
 *  This class is re-entrant and thread-safe.  If using the
 *  default instance, it is inadvisable to call 
 *  {@link #registerFunction(String, String, Function)}
 *  as that will extend the global function context, affecting other
 *  users. 
 *  </p>
 *
 *  <p>
 *  Extension functions:
 *  </p>
 *
 *  <ul>
 *     <li>evaluate(..)</li>
 *     <li>upper-case(..)</li>
 *     <li>lower-case(..)</li>
 *     <li>ends-with(..)</li>
 *  </ul>
 *
 *  @see FunctionContext
 *  @see org.jaxen.function
 *  @see org.jaxen.function.xslt
 *  @see org.jaxen.function.ext
 *
 *  @author <a href="mailto:bob@werken.com">bob mcwhirter</a>
 */
public class XPathFunctionContext extends SimpleFunctionContext
{public static class __CLR4_0_6hehel1l0dv86{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,672,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static XPathFunctionContext instance = new XPathFunctionContext();

    /** Retrieve the default function context
     *
     *  @return the default function context
     */
    public static FunctionContext getInstance()
    {try{__CLR4_0_6hehel1l0dv86.R.inc(626);
        __CLR4_0_6hehel1l0dv86.R.inc(627);return instance;
    }finally{__CLR4_0_6hehel1l0dv86.R.flushNeeded();}}

    /** Create a new XPath function context.
     *  All core XPath and Jaxen extension functions are registered.
     */
    public XPathFunctionContext()
    {
        this(true);__CLR4_0_6hehel1l0dv86.R.inc(629);try{__CLR4_0_6hehel1l0dv86.R.inc(628);
    }finally{__CLR4_0_6hehel1l0dv86.R.flushNeeded();}}

    /** Create a new XPath function context.
     *  All core XPath functions are registered.
     *  
     * @param includeExtensionFunctions if true extension functions are included;
     *     if false, they aren't
     */
    public XPathFunctionContext(boolean includeExtensionFunctions)
    {try{__CLR4_0_6hehel1l0dv86.R.inc(630);
        __CLR4_0_6hehel1l0dv86.R.inc(631);registerXPathFunctions();
        __CLR4_0_6hehel1l0dv86.R.inc(632);if ((((includeExtensionFunctions)&&(__CLR4_0_6hehel1l0dv86.R.iget(633)!=0|true))||(__CLR4_0_6hehel1l0dv86.R.iget(634)==0&false))) {{
            __CLR4_0_6hehel1l0dv86.R.inc(635);registerXSLTFunctions();
            __CLR4_0_6hehel1l0dv86.R.inc(636);registerExtensionFunctions();
        }
    }}finally{__CLR4_0_6hehel1l0dv86.R.flushNeeded();}}

    private void registerXPathFunctions() {try{__CLR4_0_6hehel1l0dv86.R.inc(637);

        __CLR4_0_6hehel1l0dv86.R.inc(638);registerFunction( null,  // namespace URI
                          "boolean",
                          new BooleanFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(639);registerFunction( null,  // namespace URI
                          "ceiling",
                          new CeilingFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(640);registerFunction( null,  // namespace URI
                          "concat",
                          new ConcatFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(641);registerFunction( null,  // namespace URI
                          "contains",
                          new ContainsFunction() );
        
        __CLR4_0_6hehel1l0dv86.R.inc(642);registerFunction( null,  // namespace URI
                          "count",
                          new CountFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(643);registerFunction( null,  // namespace URI
                          "false",
                          new FalseFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(644);registerFunction( null,  // namespace URI
                          "floor",
                          new FloorFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(645);registerFunction( null,  // namespace URI
                          "id",
                          new IdFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(646);registerFunction( null,  // namespace URI
                          "lang",
                          new LangFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(647);registerFunction( null,  // namespace URI
                          "last",
                          new LastFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(648);registerFunction( null,  // namespace URI
                          "local-name",
                          new LocalNameFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(649);registerFunction( null,  // namespace URI
                          "name",
                          new NameFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(650);registerFunction( null,  // namespace URI
                          "namespace-uri",
                          new NamespaceUriFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(651);registerFunction( null,  // namespace URI
                          "normalize-space",
                          new NormalizeSpaceFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(652);registerFunction( null,  // namespace URI
                          "not",
                          new NotFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(653);registerFunction( null,  // namespace URI
                          "number",
                          new NumberFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(654);registerFunction( null,  // namespace URI
                          "position",
                          new PositionFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(655);registerFunction( null,  // namespace URI
                          "round",
                          new RoundFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(656);registerFunction( null,  // namespace URI
                          "starts-with",
                          new StartsWithFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(657);registerFunction( null,  // namespace URI
                          "string",
                          new StringFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(658);registerFunction( null,  // namespace URI
                          "string-length",
                          new StringLengthFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(659);registerFunction( null,  // namespace URI
                          "substring-after",
                          new SubstringAfterFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(660);registerFunction( null,  // namespace URI
                          "substring-before",
                          new SubstringBeforeFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(661);registerFunction( null,  // namespace URI
                          "substring",
                          new SubstringFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(662);registerFunction( null,  // namespace URI
                          "sum",
                          new SumFunction() );

        __CLR4_0_6hehel1l0dv86.R.inc(663);registerFunction( null,  // namespace URI
                          "true",
                          new TrueFunction() );
        
        __CLR4_0_6hehel1l0dv86.R.inc(664);registerFunction( null,  // namespace URI
                          "translate",
                          new TranslateFunction() );
    }finally{__CLR4_0_6hehel1l0dv86.R.flushNeeded();}}

    private void registerXSLTFunctions() {try{__CLR4_0_6hehel1l0dv86.R.inc(665);

        // extension functions defined in XSLT
        __CLR4_0_6hehel1l0dv86.R.inc(666);registerFunction( null,  // namespace URI
                          "document",
                          new DocumentFunction() );
    }finally{__CLR4_0_6hehel1l0dv86.R.flushNeeded();}}

    private void registerExtensionFunctions() {try{__CLR4_0_6hehel1l0dv86.R.inc(667);
        // extension functions should go into a namespace, but which one?
        // for now, keep them in default namespace to not break any code

        __CLR4_0_6hehel1l0dv86.R.inc(668);registerFunction( null,  // namespace URI
                          "evaluate",
                          new EvaluateFunction() );
        
        __CLR4_0_6hehel1l0dv86.R.inc(669);registerFunction( null,  // namespace URI
                          "lower-case",
                          new LowerFunction() );
        
        __CLR4_0_6hehel1l0dv86.R.inc(670);registerFunction( null,  // namespace URI
                          "upper-case",
                          new UpperFunction() );
        
        __CLR4_0_6hehel1l0dv86.R.inc(671);registerFunction( null,  // namespace URI
                          "ends-with",
                          new EndsWithFunction() );
    }finally{__CLR4_0_6hehel1l0dv86.R.flushNeeded();}}

    
}
