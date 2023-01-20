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
 * <b>4.2</b> <code><i>string</i> normalize-space(<i>string</i>)</code>
 * </p>
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath#function-normalize-space"> 
 * The <b>normalize-space</b> function
 * returns the argument string with whitespace normalized by stripping
 * leading and trailing whitespace and replacing sequences of whitespace
 * characters by a single space. Whitespace characters are the same as
 * those allowed by the <a href="https://www.w3.org/TR/REC-xml#NT-S" target="_top">S</a>
 * production in XML. If the argument is omitted, it defaults to the
 * context node converted to a string, in other words the <a
 * href="https://www.w3.org/TR/xpath#dt-string-value"  
 * target="_top">string-value</a> of the context node.
 * </blockquote>
 * 
 * @author James Strachan (james@metastuff.com)
 * @see <a href="https://www.w3.org/TR/xpath#function-normalize-space"
 *      target="_top">Section 4.2 of the XPath Specification</a>
 */
public class NormalizeSpaceFunction implements Function
{public static class __CLR4_0_62kz2kzl1l0dvva{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    /**
     * Create a new <code>NormalizeSpaceFunction</code> object.
     */
    public NormalizeSpaceFunction() {try{__CLR4_0_62kz2kzl1l0dvva.R.inc(3347);}finally{__CLR4_0_62kz2kzl1l0dvva.R.flushNeeded();}}
    
    /** 
     * Returns the string-value of the first item in <code>args</code>
     * after removing all leading and trailing white space, and 
     * replacing each other sequence of whitespace by a single space.
     * Whitespace consists of the characters space (0x32), carriage return (0x0D),
     * linefeed (0x0A), and tab (0x09).
     *
     * @param context the context at the point in the
     *         expression when the function is called
     * @param args a list that contains exactly one item
     * 
     * @return a normalized <code>String</code>
     * 
     * @throws FunctionCallException if <code>args</code> does not have length one
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62kz2kzl1l0dvva.R.inc(3348);
        
        __CLR4_0_62kz2kzl1l0dvva.R.inc(3349);if ((((args.size() == 0)&&(__CLR4_0_62kz2kzl1l0dvva.R.iget(3350)!=0|true))||(__CLR4_0_62kz2kzl1l0dvva.R.iget(3351)==0&false))) {{
            __CLR4_0_62kz2kzl1l0dvva.R.inc(3352);return evaluate( context.getNodeSet(),
                             context.getNavigator() );
        }
        }else {__CLR4_0_62kz2kzl1l0dvva.R.inc(3353);if ((((args.size() == 1)&&(__CLR4_0_62kz2kzl1l0dvva.R.iget(3354)!=0|true))||(__CLR4_0_62kz2kzl1l0dvva.R.iget(3355)==0&false)))
        {{
            __CLR4_0_62kz2kzl1l0dvva.R.inc(3356);return evaluate( args.get(0),
                             context.getNavigator() );
        }
    
        }}__CLR4_0_62kz2kzl1l0dvva.R.inc(3357);throw new FunctionCallException( "normalize-space() cannot have more than one argument" );
    }finally{__CLR4_0_62kz2kzl1l0dvva.R.flushNeeded();}}

    /** 
     * Returns the string-value of <code>strArg</code> after removing
     * all leading and trailing white space, and 
     * replacing each other sequence of whitespace by a single space.
     * Whitespace consists of the characters space (0x32), carriage return (0x0D),
     * linefeed (0x0A), and tab (0x09).
     *
     * @param strArg the object whose string-value is normalized
     * @param nav the context at the point in the
     *         expression when the function is called
     * 
     * @return the normalized string-value
     */
    public static String evaluate(Object strArg,
                                  Navigator nav) 
    {try{__CLR4_0_62kz2kzl1l0dvva.R.inc(3358);
        __CLR4_0_62kz2kzl1l0dvva.R.inc(3359);String str = StringFunction.evaluate( strArg,
                                              nav );

        __CLR4_0_62kz2kzl1l0dvva.R.inc(3360);char[] buffer = str.toCharArray();
        __CLR4_0_62kz2kzl1l0dvva.R.inc(3361);int write = 0;
        __CLR4_0_62kz2kzl1l0dvva.R.inc(3362);int lastWrite = 0;
        __CLR4_0_62kz2kzl1l0dvva.R.inc(3363);boolean wroteOne = false;
        __CLR4_0_62kz2kzl1l0dvva.R.inc(3364);int read = 0;
        __CLR4_0_62kz2kzl1l0dvva.R.inc(3365);while ((((read < buffer.length)&&(__CLR4_0_62kz2kzl1l0dvva.R.iget(3366)!=0|true))||(__CLR4_0_62kz2kzl1l0dvva.R.iget(3367)==0&false)))
        {{
            __CLR4_0_62kz2kzl1l0dvva.R.inc(3368);if ((((isXMLSpace(buffer[read]))&&(__CLR4_0_62kz2kzl1l0dvva.R.iget(3369)!=0|true))||(__CLR4_0_62kz2kzl1l0dvva.R.iget(3370)==0&false)))
            {{
                __CLR4_0_62kz2kzl1l0dvva.R.inc(3371);if ((((wroteOne)&&(__CLR4_0_62kz2kzl1l0dvva.R.iget(3372)!=0|true))||(__CLR4_0_62kz2kzl1l0dvva.R.iget(3373)==0&false)))
                {{
                    __CLR4_0_62kz2kzl1l0dvva.R.inc(3374);buffer[write++] = ' ';
                }
                }__CLR4_0_62kz2kzl1l0dvva.R.inc(3375);do
                {{
                    __CLR4_0_62kz2kzl1l0dvva.R.inc(3376);read++;
                }
                }while((((read < buffer.length && isXMLSpace(buffer[read]))&&(__CLR4_0_62kz2kzl1l0dvva.R.iget(3377)!=0|true))||(__CLR4_0_62kz2kzl1l0dvva.R.iget(3378)==0&false)));
            }
            }else
            {{
                __CLR4_0_62kz2kzl1l0dvva.R.inc(3379);buffer[write++] = buffer[read++];
                __CLR4_0_62kz2kzl1l0dvva.R.inc(3380);wroteOne = true;
                __CLR4_0_62kz2kzl1l0dvva.R.inc(3381);lastWrite = write;
            }
        }}

        }__CLR4_0_62kz2kzl1l0dvva.R.inc(3382);return new String(buffer, 0, lastWrite);
    }finally{__CLR4_0_62kz2kzl1l0dvva.R.flushNeeded();}}
    
    
    private static boolean isXMLSpace(char c) {try{__CLR4_0_62kz2kzl1l0dvva.R.inc(3383);
        __CLR4_0_62kz2kzl1l0dvva.R.inc(3384);return c == ' ' || c == '\n' || c == '\r' || c == '\t';
    }finally{__CLR4_0_62kz2kzl1l0dvva.R.flushNeeded();}}
    
}
