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
 */
package org.jaxen.function;

import java.util.List;

import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;
/**
 * <p>
 * <b>4.2</b>
 * <code><i>string</i> substring(<i>string</i>,<i>number</i>,<i>number?</i>)</code>
 * </p>
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath"> 
 * <p>The <b>substring</b> function returns the
 * substring of the first argument starting at the position specified in
 * the second argument with length specified in the third argument. For
 * example,
 * 
 * <code>substring("12345",2,3)</code> returns <code>"234"</code>.
 * If the third argument is not specified, it returns the substring
 * starting at the position specified in the second argument and
 * continuing to the end of the string. For example,
 * <code>substring("12345",2)</code> returns <code>"2345"</code>.
 * </p>
 * 
 * <p>
 * More precisely, each character in the string (see <a
 * href="https://www.w3.org/TR/xpath#strings">[<b>3.6 Strings</b>]</a>) is considered to have a
 * numeric position: the position of the first character is 1, the
 * position of the second character is 2 and so on.
 * </p>
 * 
 * <blockquote> <b>NOTE: </b>This differs from Java and ECMAScript, in
 * which the <code>String.substring</code> method treats the position
 * of the first character as 0.</blockquote>
 * 
 * <p>
 * The returned substring contains those characters for which the
 * position of the character is greater than or equal to the rounded
 * value of the second argument and, if the third argument is specified,
 * less than the sum of the rounded value of the second argument and the
 * rounded value of the third argument; the comparisons and addition
 * used for the above follow the standard IEEE 754 rules; rounding is
 * done as if by a call to the <b><a href="#function-round">round</a></b>
 * function. The following examples illustrate various unusual cases:
 * </p>
 * 
 * <ul>
 * 
 * <li>
 * <p>
 * <code>substring("12345", 1.5, 2.6)</code> returns
 * <code>"234"</code>
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * <code>substring("12345", 0, 3)</code> returns <code>"12"</code>
 * 
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * <code>substring("12345", 0 div 0, 3)</code> returns <code>""</code>
 * </p>
 * </li>
 * 
 * <li>
 * <p>.
 * <code>substring("12345", 1, 0 div 0)</code> returns
 * 
 * <code>""</code>
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * <code>substring("12345", -42, 1 div 0)</code> returns
 * <code>"12345"</code>
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * <code>substring("12345", -1 div 0, 1 div 0)</code> returns
 * <code>""</code> </blockquote>
 * 
 * @author bob mcwhirter (bob @ werken.com)
 * 
 * @see <a href="https://www.w3.org/TR/xpath#function-substring"
 *      target="_top">Section 4.2 of the XPath Specification</a>
 */
public class SubstringFunction implements Function
{public static class __CLR4_0_62t62t6l1l0dvxr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3725,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Create a new <code>SubstringFunction</code> object.
     */
    public SubstringFunction() {try{__CLR4_0_62t62t6l1l0dvxr.R.inc(3642);}finally{__CLR4_0_62t62t6l1l0dvxr.R.flushNeeded();}}

    
    /** Returns a substring of an XPath string-value by character index.
     *
     * @param context the context at the point in the
     *         expression when the function is called
     * @param args a list that contains two or three items
     * 
     * @return a <code>String</code> containing the specifed character subsequence of 
     *     the original string or the string-value of the context node
     * 
     * @throws FunctionCallException if <code>args</code> has more than three
     *     or less than two items
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62t62t6l1l0dvxr.R.inc(3643);
        __CLR4_0_62t62t6l1l0dvxr.R.inc(3644);final int argc = args.size();
        __CLR4_0_62t62t6l1l0dvxr.R.inc(3645);if ((((argc < 2 || argc > 3)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3646)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3647)==0&false))){{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3648);throw new FunctionCallException( "substring() requires two or three arguments." );
        }

        }__CLR4_0_62t62t6l1l0dvxr.R.inc(3649);final Navigator nav = context.getNavigator();

        __CLR4_0_62t62t6l1l0dvxr.R.inc(3650);final String str = StringFunction.evaluate(args.get(0), nav );
        // The spec doesn't really address this case
        __CLR4_0_62t62t6l1l0dvxr.R.inc(3651);if ((((str == null)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3652)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3653)==0&false))) {{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3654);return "";
        }

        }__CLR4_0_62t62t6l1l0dvxr.R.inc(3655);final int stringLength = (StringLengthFunction.evaluate(args.get(0), nav )).intValue();

        __CLR4_0_62t62t6l1l0dvxr.R.inc(3656);if ((((stringLength == 0)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3657)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3658)==0&false))) {{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3659);return "";
        }

        }__CLR4_0_62t62t6l1l0dvxr.R.inc(3660);Double d1 = NumberFunction.evaluate(args.get(1), nav);

        __CLR4_0_62t62t6l1l0dvxr.R.inc(3661);if ((((d1.isNaN())&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3662)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3663)==0&false))){{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3664);return "";
        }
        // Round the value and subtract 1 as Java strings are zero based
        }__CLR4_0_62t62t6l1l0dvxr.R.inc(3665);int start = RoundFunction.evaluate(d1, nav).intValue() - 1;

        __CLR4_0_62t62t6l1l0dvxr.R.inc(3666);int substringLength = stringLength;
        __CLR4_0_62t62t6l1l0dvxr.R.inc(3667);if ((((argc == 3)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3668)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3669)==0&false))){{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3670);Double d2 = NumberFunction.evaluate(args.get(2), nav);

            __CLR4_0_62t62t6l1l0dvxr.R.inc(3671);if ((((!d2.isNaN())&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3672)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3673)==0&false))){{
                __CLR4_0_62t62t6l1l0dvxr.R.inc(3674);substringLength = RoundFunction.evaluate(d2, nav ).intValue();
            }
            }else {{
                __CLR4_0_62t62t6l1l0dvxr.R.inc(3675);substringLength = 0;
            }
        }}
        
        }__CLR4_0_62t62t6l1l0dvxr.R.inc(3676);if ((((substringLength < 0)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3677)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3678)==0&false))) {__CLR4_0_62t62t6l1l0dvxr.R.inc(3679);return "";

        }__CLR4_0_62t62t6l1l0dvxr.R.inc(3680);int end = start + substringLength;
        __CLR4_0_62t62t6l1l0dvxr.R.inc(3681);if ((((argc == 2)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3682)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3683)==0&false))) {__CLR4_0_62t62t6l1l0dvxr.R.inc(3684);end = stringLength;
            
        // negative start is treated as 0
        }__CLR4_0_62t62t6l1l0dvxr.R.inc(3685);if ( (((start < 0)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3686)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3687)==0&false))){{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3688);start = 0;
        }
        }else {__CLR4_0_62t62t6l1l0dvxr.R.inc(3689);if ((((start > stringLength)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3690)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3691)==0&false))){{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3692);return "";
        }

        }}__CLR4_0_62t62t6l1l0dvxr.R.inc(3693);if ((((end > stringLength)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3694)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3695)==0&false))){{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3696);end = stringLength;
        }
        }else {__CLR4_0_62t62t6l1l0dvxr.R.inc(3697);if ((((end < start)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3698)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3699)==0&false))) {__CLR4_0_62t62t6l1l0dvxr.R.inc(3700);return "";
        
        }}__CLR4_0_62t62t6l1l0dvxr.R.inc(3701);if ((((stringLength == str.length())&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3702)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3703)==0&false))) {{
            // easy case; no surrogate pairs
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3704);return str.substring(start, end);
        }
        }else {{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3705);return unicodeSubstring(str, start, end);
        }
        
    }}finally{__CLR4_0_62t62t6l1l0dvxr.R.flushNeeded();}}

    private static String unicodeSubstring(String s, int start, int end) {try{__CLR4_0_62t62t6l1l0dvxr.R.inc(3706);

        __CLR4_0_62t62t6l1l0dvxr.R.inc(3707);StringBuffer result = new StringBuffer(s.length());
        __CLR4_0_62t62t6l1l0dvxr.R.inc(3708);for (int jChar = 0, uChar=0; (((uChar < end)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3709)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3710)==0&false)); jChar++, uChar++) {{
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3711);char c = s.charAt(jChar);
            __CLR4_0_62t62t6l1l0dvxr.R.inc(3712);if ((((uChar >= start)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3713)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3714)==0&false))) {__CLR4_0_62t62t6l1l0dvxr.R.inc(3715);result.append(c);
            }__CLR4_0_62t62t6l1l0dvxr.R.inc(3716);if ((((c >= 0xD800)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3717)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3718)==0&false))) {{ // get the low surrogate
                // ???? we could check here that this is indeed a low surroagte
                // we could also catch StringIndexOutOfBoundsException
                __CLR4_0_62t62t6l1l0dvxr.R.inc(3719);jChar++;
                __CLR4_0_62t62t6l1l0dvxr.R.inc(3720);if ((((uChar >= start)&&(__CLR4_0_62t62t6l1l0dvxr.R.iget(3721)!=0|true))||(__CLR4_0_62t62t6l1l0dvxr.R.iget(3722)==0&false))) {__CLR4_0_62t62t6l1l0dvxr.R.inc(3723);result.append(s.charAt(jChar));
            }}
        }}
        }__CLR4_0_62t62t6l1l0dvxr.R.inc(3724);return result.toString();
    }finally{__CLR4_0_62t62t6l1l0dvxr.R.flushNeeded();}}
}
