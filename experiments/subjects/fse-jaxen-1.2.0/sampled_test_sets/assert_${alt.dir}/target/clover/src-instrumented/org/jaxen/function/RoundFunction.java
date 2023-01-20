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


package org.jaxen.function;

import java.util.List;

import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

/**
 * <p><b>4.4</b> <code><i>number</i> round(<i>number</i>)</code> </p>
 * 
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath">
 * The <b>round</b> function returns the number that is closest to the argument and that is an integer. 
 * If there are two such numbers, then the one that is closest to positive infinity is returned. 
 * If the argument is NaN, then NaN is returned. If the argument is positive infinity, then positive infinity is returned. 
 * If the argument is negative infinity, then negative infinity is returned. 
 * If the argument is positive zero, then positive zero is returned. 
 * If the argument is negative zero, then negative zero is returned. 
 * If the argument is less than zero, but greater than or equal to -0.5, then negative zero is returned.
 * </blockquote>
 * 
 * @author bob mcwhirter (bob @ werken.com)
 * 
 * @see <a href="https://www.w3.org/TR/xpath#function-round" target="_top">Section 4.4 of the XPath Specification</a>
 */
public class RoundFunction implements Function
{public static class __CLR4_0_62nu2nul1l0dvw3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3465,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
 
    /**
     * Create a new <code>RoundFunction</code> object.
     */
    public RoundFunction() {try{__CLR4_0_62nu2nul1l0dvw3.R.inc(3450);}finally{__CLR4_0_62nu2nul1l0dvw3.R.flushNeeded();}}
    
    
    /** Returns the nearest integer to the number.
     *
     * @param context the context at the point in the
     *         expression when the function is called
     * @param args a list with exactly one item which will be converted to a 
     *     <code>Double</code> as if by the XPath <code>number()</code> function
     * 
     * @return a <code>Double</code> containing the integer nearest to
     *     <code>args.get(0)</code>
     * 
     * @throws FunctionCallException if <code>args</code> has more or less than one item
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62nu2nul1l0dvw3.R.inc(3451);
        __CLR4_0_62nu2nul1l0dvw3.R.inc(3452);if ((((args.size() == 1)&&(__CLR4_0_62nu2nul1l0dvw3.R.iget(3453)!=0|true))||(__CLR4_0_62nu2nul1l0dvw3.R.iget(3454)==0&false)))
        {{
            __CLR4_0_62nu2nul1l0dvw3.R.inc(3455);return evaluate( args.get(0),
                             context.getNavigator() );
        }

        }__CLR4_0_62nu2nul1l0dvw3.R.inc(3456);throw new FunctionCallException( "round() requires one argument." );
    }finally{__CLR4_0_62nu2nul1l0dvw3.R.flushNeeded();}}

    /** 
     * Returns the integer nearest to the argument.
     * If necessary, the argument is first converted to a <code>Double</code>
     * as if by the XPath <code>number()</code> function.
     * 
     * @param obj the object to be rounded
     * @param nav ignored
     * 
     * @return the integer nearest to <code>obj</code>
     */
    public static Double evaluate(Object obj,
                                  Navigator nav)
    {try{__CLR4_0_62nu2nul1l0dvw3.R.inc(3457);
        __CLR4_0_62nu2nul1l0dvw3.R.inc(3458);Double d  = NumberFunction.evaluate( obj,
                                            nav );

        __CLR4_0_62nu2nul1l0dvw3.R.inc(3459);if ((((d.isNaN() || d.isInfinite())&&(__CLR4_0_62nu2nul1l0dvw3.R.iget(3460)!=0|true))||(__CLR4_0_62nu2nul1l0dvw3.R.iget(3461)==0&false)))
        {{
            __CLR4_0_62nu2nul1l0dvw3.R.inc(3462);return d;
        }

        }__CLR4_0_62nu2nul1l0dvw3.R.inc(3463);double value = d.doubleValue();
        __CLR4_0_62nu2nul1l0dvw3.R.inc(3464);return new Double( Math.round( value ) );
    }finally{__CLR4_0_62nu2nul1l0dvw3.R.flushNeeded();}}
}
