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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

/**
 * <p>
 * <b>4.2</b>
 * <code><i>string</i> translate(<i>string</i>,<i>string</i>,<i>string</i>)</code>
 * </p>
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath#function-translate">
 * <p>
 * The <b><a href="https://www.w3.org/TR/xpath#function-translate">translate</a></b> function
 * returns the first argument string with occurrences of characters in
 * the second argument string replaced by the character at the
 * corresponding position in the third argument string. For example,
 * <code>translate("bar","abc","ABC")</code> returns the string
 * <code>BAr</code>. If there is a character in the second argument
 * string with no character at a corresponding position in the third
 * argument string (because the second argument string is longer than
 * the third argument string), then occurrences of that character in the
 * first argument string are removed. For example,
 * <code>translate("--aaa--","abc-","ABC")</code> returns
 * <code>"AAA"</code>. If a character occurs more than once in the
 * second argument string, then the first occurrence determines the
 * replacement character. If the third argument string is longer than
 * the second argument string, then excess characters are ignored.
 * </p>
 * 
 * <blockquote> <b>NOTE: </b>The <b>translate</b> function is not a
 * sufficient solution for case conversion in all languages. A future
 * version of XPath may provide additional functions for case
 * conversion.</blockquote>
 * 
 * </blockquote>
 * 
 * @author Jan Dvorak ( jan.dvorak @ mathan.cz )
 * 
 * @see <a href="https://www.w3.org/TR/xpath#function-translate"
 *      target="_top">Section 4.2 of the XPath Specification</a>
 */
public class TranslateFunction implements Function
{public static class __CLR4_0_62w12w1l1l0dvyc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3823,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

     /* The translation is done thru a HashMap. Performance tip (for anyone
      * who needs to improve the performance of this particular function):
      * Cache the HashMaps, once they are constructed. */
    
    /**
     * Create a new <code>TranslateFunction</code> object.
     */
    public TranslateFunction() {try{__CLR4_0_62w12w1l1l0dvyc.R.inc(3745);}finally{__CLR4_0_62w12w1l1l0dvyc.R.flushNeeded();}}
    
    
    /** Returns a copy of the first argument in which
     * characters found in the second argument are replaced by
     * corresponding characters from the third argument.
     *
     * @param context the context at the point in the
     *         expression when the function is called
     * @param args a list that contains exactly three items
     * 
     * @return a <code>String</code> built from <code>args.get(0)</code> 
     *     in which occurrences of characters in <code>args.get(1)</code> 
     *     are replaced by the corresponding characters in <code>args.get(2)</code> 
     * 
     * @throws FunctionCallException if <code>args</code> does not have exactly three items
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62w12w1l1l0dvyc.R.inc(3746);
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3747);if ((((args.size() == 3)&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3748)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3749)==0&false))) {{
            __CLR4_0_62w12w1l1l0dvyc.R.inc(3750);return evaluate( args.get(0),
                             args.get(1),
                             args.get(2),
                             context.getNavigator() );
        }

        }__CLR4_0_62w12w1l1l0dvyc.R.inc(3751);throw new FunctionCallException( "translate() requires three arguments." );
    }finally{__CLR4_0_62w12w1l1l0dvyc.R.flushNeeded();}}

    /** 
     * Returns a copy of <code>strArg</code> in which
     * characters found in <code>fromArg</code> are replaced by
     * corresponding characters from <code>toArg</code>.
     * If necessary each argument is first converted to it string-value
     * as if by the XPath <code>string()</code> function.
     * 
     * @param strArg the base string
     * @param fromArg the characters to be replaced
     * @param toArg the characters they will be replaced by
     * @param nav the <code>Navigator</code> used to calculate the string-values of the arguments.
     * 
     * @return a copy of <code>strArg</code> in which
     *  characters found in <code>fromArg</code> are replaced by
     *  corresponding characters from <code>toArg</code>
     *  
     * @throws FunctionCallException if one of the arguments is a malformed Unicode string;
     *     that is, if surrogate characters don't line up properly
     * 
     */
    public static String evaluate(Object strArg,
                                  Object fromArg,
                                  Object toArg,
                                  Navigator nav) throws FunctionCallException
    {try{__CLR4_0_62w12w1l1l0dvyc.R.inc(3752);
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3753);String inStr = StringFunction.evaluate( strArg, nav );
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3754);String fromStr = StringFunction.evaluate( fromArg, nav );
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3755);String toStr = StringFunction.evaluate( toArg, nav );
    
        // Initialize the mapping in a HashMap
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3756);Map characterMap = new HashMap();
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3757);String[] fromCharacters = toUnicodeCharacters(fromStr);
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3758);String[] toCharacters = toUnicodeCharacters(toStr);
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3759);int fromLen = fromCharacters.length;
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3760);int toLen = toCharacters.length;
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3761);for ( int i = 0; (((i < fromLen)&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3762)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3763)==0&false)); i++ ) {{
            __CLR4_0_62w12w1l1l0dvyc.R.inc(3764);String cFrom = fromCharacters[i];
            __CLR4_0_62w12w1l1l0dvyc.R.inc(3765);if ( (((characterMap.containsKey( cFrom ) )&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3766)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3767)==0&false))) {{
                // We've seen the character before, ignore
                __CLR4_0_62w12w1l1l0dvyc.R.inc(3768);continue;
            }
            
            }__CLR4_0_62w12w1l1l0dvyc.R.inc(3769);if ( (((i < toLen )&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3770)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3771)==0&false))) {{
                // Will change
                __CLR4_0_62w12w1l1l0dvyc.R.inc(3772);characterMap.put( cFrom, toCharacters[i] );
            } 
            }else {{
                // Will delete
                __CLR4_0_62w12w1l1l0dvyc.R.inc(3773);characterMap.put( cFrom, null );
            }
        }}

        // Process the input string thru the map
        }__CLR4_0_62w12w1l1l0dvyc.R.inc(3774);StringBuffer outStr = new StringBuffer( inStr.length() );
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3775);String[] inCharacters = toUnicodeCharacters(inStr);
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3776);int inLen = inCharacters.length;
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3777);for ( int i = 0; (((i < inLen)&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3778)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3779)==0&false)); i++ ) {{
            __CLR4_0_62w12w1l1l0dvyc.R.inc(3780);String cIn = inCharacters[i];
            __CLR4_0_62w12w1l1l0dvyc.R.inc(3781);if ( (((characterMap.containsKey( cIn ) )&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3782)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3783)==0&false))) {{
                __CLR4_0_62w12w1l1l0dvyc.R.inc(3784);String cTo = (String) characterMap.get( cIn );
                __CLR4_0_62w12w1l1l0dvyc.R.inc(3785);if ( (((cTo != null )&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3786)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3787)==0&false))) {{
                    __CLR4_0_62w12w1l1l0dvyc.R.inc(3788);outStr.append( cTo );
                }
            }} 
            }else {{
                __CLR4_0_62w12w1l1l0dvyc.R.inc(3789);outStr.append( cIn );
            }
        }}
    
        }__CLR4_0_62w12w1l1l0dvyc.R.inc(3790);return outStr.toString();
    }finally{__CLR4_0_62w12w1l1l0dvyc.R.flushNeeded();}}

    private static String[] toUnicodeCharacters(String s) throws FunctionCallException {try{__CLR4_0_62w12w1l1l0dvyc.R.inc(3791);

        __CLR4_0_62w12w1l1l0dvyc.R.inc(3792);String[] result = new String[s.length()];
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3793);int stringLength = 0;
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3794);for (int i = 0; (((i < s.length())&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3795)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3796)==0&false)); i++) {{
            __CLR4_0_62w12w1l1l0dvyc.R.inc(3797);char c1 = s.charAt(i);
            __CLR4_0_62w12w1l1l0dvyc.R.inc(3798);if ((((isHighSurrogate(c1))&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3799)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3800)==0&false))) {{
                __CLR4_0_62w12w1l1l0dvyc.R.inc(3801);try {
                    __CLR4_0_62w12w1l1l0dvyc.R.inc(3802);char c2 = s.charAt(i+1);
                    __CLR4_0_62w12w1l1l0dvyc.R.inc(3803);if ((((isLowSurrogate(c2))&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3804)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3805)==0&false))) {{
                        __CLR4_0_62w12w1l1l0dvyc.R.inc(3806);result[stringLength] = (c1 + "" + c2).intern();
                        __CLR4_0_62w12w1l1l0dvyc.R.inc(3807);i++;
                    }
                    }else {{
                        __CLR4_0_62w12w1l1l0dvyc.R.inc(3808);throw new FunctionCallException("Mismatched surrogate pair in translate function");
                    }
                }}
                catch (StringIndexOutOfBoundsException ex) {
                    __CLR4_0_62w12w1l1l0dvyc.R.inc(3809);throw new FunctionCallException("High surrogate without low surrogate at end of string passed to translate function");
                }
            }
            }else {{
                __CLR4_0_62w12w1l1l0dvyc.R.inc(3810);result[stringLength]=String.valueOf(c1).intern();
            }
            }__CLR4_0_62w12w1l1l0dvyc.R.inc(3811);stringLength++;
        }
        
        }__CLR4_0_62w12w1l1l0dvyc.R.inc(3812);if ((((stringLength == result.length)&&(__CLR4_0_62w12w1l1l0dvyc.R.iget(3813)!=0|true))||(__CLR4_0_62w12w1l1l0dvyc.R.iget(3814)==0&false))) {__CLR4_0_62w12w1l1l0dvyc.R.inc(3815);return result;
        
        // trim array
        }__CLR4_0_62w12w1l1l0dvyc.R.inc(3816);String[] trimmed = new String[stringLength];
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3817);System.arraycopy(result, 0, trimmed, 0, stringLength);
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3818);return trimmed;
        
    }finally{__CLR4_0_62w12w1l1l0dvyc.R.flushNeeded();}}

    private static boolean isHighSurrogate(char c) {try{__CLR4_0_62w12w1l1l0dvyc.R.inc(3819);
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3820);return c >= 0xD800 && c <= 0xDBFF;
    }finally{__CLR4_0_62w12w1l1l0dvyc.R.flushNeeded();}}
     
    private static boolean isLowSurrogate(char c) {try{__CLR4_0_62w12w1l1l0dvyc.R.inc(3821);
        __CLR4_0_62w12w1l1l0dvyc.R.inc(3822);return c >= 0xDC00 && c <= 0xDFFF;
    }finally{__CLR4_0_62w12w1l1l0dvyc.R.flushNeeded();}}
     
}