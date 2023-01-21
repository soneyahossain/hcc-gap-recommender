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
 * <p><b>4.2</b> <code><i>string</i> substring-after(<i>string</i>,<i>string</i>)</code></p> 
 * 
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath">
 * The <b>substring-after</b> function returns the substring of the first argument string 
 * that follows the first occurrence of the second argument string in the first 
 * argument string, or the empty string if the first argument string does not contain the second argument string. 
 * For example, substring-after("1999/04/01","/") returns 04/01, 
 * and substring-after("1999/04/01","19") returns 99/04/01.
 * </blockquote>
 * 
 * @author bob mcwhirter (bob @ werken.com)
 * @see <a href="https://www.w3.org/TR/xpath#function-substring-after" target="_top">Section 4.2 of the XPath Specification</a>
 */
public class SubstringAfterFunction implements Function
{public static class __CLR4_0_62sa2sal1l0dvx7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3626,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Create a new <code>SubstringAfterFunction</code> object.
     */
    public SubstringAfterFunction() {try{__CLR4_0_62sa2sal1l0dvx7.R.inc(3610);}finally{__CLR4_0_62sa2sal1l0dvx7.R.flushNeeded();}}


    /** 
     * Returns the part of the string-value of the first item in <code>args</code>
     * that follows the string-value of the second item in <code>args</code>;
     * or the empty string if the second string is not a substring of the first string.
     *
     * @param context the context at the point in the
     *         expression when the function is called
     * @param args a list that contains two items
     * 
     * @return a <code>String</code> containing that 
     *     part of the string-value of the first item in <code>args</code>
     *     that comes before the string-value of the second item in <code>args</code>
     * 
     * @throws FunctionCallException if <code>args</code> does not have length two
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62sa2sal1l0dvx7.R.inc(3611);
        __CLR4_0_62sa2sal1l0dvx7.R.inc(3612);if ((((args.size() == 2)&&(__CLR4_0_62sa2sal1l0dvx7.R.iget(3613)!=0|true))||(__CLR4_0_62sa2sal1l0dvx7.R.iget(3614)==0&false)))
        {{
            __CLR4_0_62sa2sal1l0dvx7.R.inc(3615);return evaluate( args.get(0),
                             args.get(1),
                             context.getNavigator() );
        }

        }__CLR4_0_62sa2sal1l0dvx7.R.inc(3616);throw new FunctionCallException( "substring-after() requires two arguments." );
    }finally{__CLR4_0_62sa2sal1l0dvx7.R.flushNeeded();}}


    /** 
     * Returns the part of <code>strArg</code> that follows the first occurence 
     * of <code>matchArg</code>; or the empty string if the 
     * <code>strArg</code> does not contain <code>matchArg</code>
     * 
     * @param strArg the string from which the substring is extracted
     * @param matchArg the string that marks the boundary of the substring
     * @param nav the <code>Navigator</code> used to calculate the string-values of
     *     the first two arguments
     * 
     * @return a <code>String</code> containing
     *     the part of <code>strArg</code> that precedes the first occurence 
     *     of <code>matchArg</code>
     * 
     */
    public static String evaluate(Object strArg,
                                  Object matchArg,
                                  Navigator nav)
    {try{__CLR4_0_62sa2sal1l0dvx7.R.inc(3617);
        __CLR4_0_62sa2sal1l0dvx7.R.inc(3618);String str   = StringFunction.evaluate( strArg,
                                                nav );

        __CLR4_0_62sa2sal1l0dvx7.R.inc(3619);String match = StringFunction.evaluate( matchArg,
                                                nav );
    
        __CLR4_0_62sa2sal1l0dvx7.R.inc(3620);int loc = str.indexOf(match);

        __CLR4_0_62sa2sal1l0dvx7.R.inc(3621);if ( (((loc < 0 )&&(__CLR4_0_62sa2sal1l0dvx7.R.iget(3622)!=0|true))||(__CLR4_0_62sa2sal1l0dvx7.R.iget(3623)==0&false)))
        {{
            __CLR4_0_62sa2sal1l0dvx7.R.inc(3624);return "";
        }

        }__CLR4_0_62sa2sal1l0dvx7.R.inc(3625);return str.substring(loc+match.length());
    }finally{__CLR4_0_62sa2sal1l0dvx7.R.flushNeeded();}}
}
