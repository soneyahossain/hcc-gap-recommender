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
 * <p>
 * <b>4.3</b> <code><i>boolean</i> boolean(<i>object</i>)</code>
 * </p>
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath#section-Boolean-Functions">
 * <p>
 * The <b><a href="https://www.w3.org/TR/xpath#function-boolean" target="_top">boolean</a></b>
 * function converts its argument to a boolean as follows:
 * </p>
 * 
 * <ul>
 * 
 * <li>
 * <p>
 * a number is true if and only if it is neither positive or negative
 * zero nor NaN
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * a node-set is true if and only if it is non-empty
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * a string is true if and only if its length is non-zero
 * </p>
 * </li>
 * 
 * <li>
 * 
 * <p>
 * an object of a type other than the four basic types is converted to a
 * boolean in a way that is dependent on that type
 * </p></li></ul>
 * </blockquote>
 * 
 * @author bob mcwhirter (bob @ werken.com)
 * @see <a href="https://www.w3.org/TR/xpath#function-boolean">Section 4.3 of the XPath Specification</a>
 */
public class BooleanFunction implements Function
{public static class __CLR4_0_62ba2bal1l0dvse{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3037,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    /**
     * Create a new <code>BooleanFunction</code> object.
     */
    public BooleanFunction() {try{__CLR4_0_62ba2bal1l0dvse.R.inc(2998);}finally{__CLR4_0_62ba2bal1l0dvse.R.flushNeeded();}}
    
    /** Convert the argument to a <code>Boolean</code>
     *
     * @param context the context at the point in the
     *         expression when the function is called
     * @param args a list with exactly one item which will be converted to a 
     *     <code>Boolean</code>
     * 
     * @return the result of evaluating the function; 
     *     <code>Boolean.TRUE</code> or <code>Boolean.FALSE</code>
     * 
     * @throws FunctionCallException if <code>args</code> has more or less than one item
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62ba2bal1l0dvse.R.inc(2999);
        __CLR4_0_62ba2bal1l0dvse.R.inc(3000);if ( (((args.size() == 1 )&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3001)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3002)==0&false)))
        {{
            __CLR4_0_62ba2bal1l0dvse.R.inc(3003);return evaluate( args.get(0), context.getNavigator() );
        }

        }__CLR4_0_62ba2bal1l0dvse.R.inc(3004);throw new FunctionCallException("boolean() requires one argument");
    }finally{__CLR4_0_62ba2bal1l0dvse.R.flushNeeded();}}

    /** 
     * <p>Convert the argument <code>obj</code> to a <code>Boolean</code> 
     * according to the following rules:</p>
     *
     * <ul>
     * <li>Lists are false if they're empty; true if they're not.</li>
     * <li>Booleans are false if they're false; true if they're true.</li>
     * <li>Strings are false if they're empty; true if they're not.</li>
     * <li>Numbers are false if they're 0 or NaN; true if they're not.</li>
     * <li>All other objects are true.</li>
     * </ul>
     * 
     * @param obj the object to convert to a boolean
     * @param nav ignored
     * 
     * @return <code>Boolean.TRUE</code> or <code>Boolean.FALSE</code>
     */
    public static Boolean evaluate(Object obj, Navigator nav)
    {try{__CLR4_0_62ba2bal1l0dvse.R.inc(3005);
        __CLR4_0_62ba2bal1l0dvse.R.inc(3006);if ( (((obj instanceof List )&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3007)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3008)==0&false)))
        {{
            __CLR4_0_62ba2bal1l0dvse.R.inc(3009);List list = (List) obj;
            
            // if it's an empty list, then we have a null node-set -> false            
            __CLR4_0_62ba2bal1l0dvse.R.inc(3010);if ((((list.size() == 0)&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3011)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3012)==0&false)))
            {{
                __CLR4_0_62ba2bal1l0dvse.R.inc(3013);return Boolean.FALSE;
            }
     
            // otherwise, unwrap the list and check the primitive
            }__CLR4_0_62ba2bal1l0dvse.R.inc(3014);obj = list.get(0);
        }
        
        // now check for primitive types
        // otherwise a non-empty node-set is true

        // if it's a Boolean, let it decide
        }__CLR4_0_62ba2bal1l0dvse.R.inc(3015);if ( (((obj instanceof Boolean )&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3016)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3017)==0&false)))
        {{
            __CLR4_0_62ba2bal1l0dvse.R.inc(3018);return (Boolean) obj;
        }
        // if it's a Number, != 0 -> true
        }else {__CLR4_0_62ba2bal1l0dvse.R.inc(3019);if ( (((obj instanceof Number )&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3020)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3021)==0&false)))
        {{
            __CLR4_0_62ba2bal1l0dvse.R.inc(3022);double d = ((Number) obj).doubleValue();
            __CLR4_0_62ba2bal1l0dvse.R.inc(3023);if ( (((d == 0 || Double.isNaN(d) )&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3024)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3025)==0&false)))
            {{
                __CLR4_0_62ba2bal1l0dvse.R.inc(3026);return Boolean.FALSE;
            }
            }__CLR4_0_62ba2bal1l0dvse.R.inc(3027);return Boolean.TRUE;
        }
        // if it's a String, "" -> false
        }else {__CLR4_0_62ba2bal1l0dvse.R.inc(3028);if ( (((obj instanceof String )&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3029)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3030)==0&false)))
        {{
            __CLR4_0_62ba2bal1l0dvse.R.inc(3031);return ( (((((String)obj).length() > 0
                     )&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3032)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3033)==0&false))? Boolean.TRUE
                     : Boolean.FALSE );
        }
        }else 
        {{
            // assume it's a node so that this node-set is non-empty 
            // and so it's true
            __CLR4_0_62ba2bal1l0dvse.R.inc(3034);return (((( obj != null ) )&&(__CLR4_0_62ba2bal1l0dvse.R.iget(3035)!=0|true))||(__CLR4_0_62ba2bal1l0dvse.R.iget(3036)==0&false))? Boolean.TRUE : Boolean.FALSE;
        }

    }}}}finally{__CLR4_0_62ba2bal1l0dvse.R.flushNeeded();}}
}
