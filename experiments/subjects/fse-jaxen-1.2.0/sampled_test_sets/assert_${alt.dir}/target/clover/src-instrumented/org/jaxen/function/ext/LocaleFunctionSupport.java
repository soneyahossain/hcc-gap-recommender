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

package org.jaxen.function.ext;

import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import org.jaxen.Function;
import org.jaxen.Navigator;
import org.jaxen.function.StringFunction;

/**
 * <p>An abstract base class for Locale-specific extension 
 * functions. This class provides convenience methods that
 * can be inherited, specifically to find a Locale from
 * an XPath function argument value.
 * </p>
 *
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 */
public abstract class LocaleFunctionSupport implements Function
{public static class __CLR4_0_62zj2zjl1l0dvz1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3927,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** 
     * Attempts to convert the given function argument value 
     * into a Locale either via casting, extracting it from a List
     * or looking up the named Locale using reflection.
     *
     * @param value is either a Locale, a List containing a Locale
     *      or a String containing the name of a Locale
     *      as defined by the Locale static members.
     *
     * @return the Locale for the value or null if one could 
     *      not be deduced
     */
    protected Locale getLocale(Object value, Navigator navigator) 
    {try{__CLR4_0_62zj2zjl1l0dvz1.R.inc(3871);
        __CLR4_0_62zj2zjl1l0dvz1.R.inc(3872);if ((((value instanceof Locale)&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3873)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3874)==0&false)))
        {{
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3875);return (Locale) value;
        }
        }else {__CLR4_0_62zj2zjl1l0dvz1.R.inc(3876);if((((value instanceof List)&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3877)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3878)==0&false)))
        {{
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3879);List list = (List) value;
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3880);if ( (((! list.isEmpty() )&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3881)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3882)==0&false))) 
            {{
                __CLR4_0_62zj2zjl1l0dvz1.R.inc(3883);return getLocale( list.get(0), navigator );
            }
        }}
        }else {{
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3884);String text = StringFunction.evaluate( value, navigator );
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3885);if ((((text != null && text.length() > 0)&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3886)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3887)==0&false))) 
            {{
                __CLR4_0_62zj2zjl1l0dvz1.R.inc(3888);return findLocale( text );
            }
        }}
        }}__CLR4_0_62zj2zjl1l0dvz1.R.inc(3889);return null;
    }finally{__CLR4_0_62zj2zjl1l0dvz1.R.flushNeeded();}}
    
    /** 
     * Tries to find a Locale instance by name using 
     * <a href="http://www.ietf.org/rfc/rfc3066.txt" target="_top">RFC 3066</a>
     * language tags such as 'en', 'en-US', 'en-US-Brooklyn'.
     *
     * @param localeText the RFC 3066 language tag
     * @return the locale for the given text or null if one could not
     *      be found 
     */
    protected Locale findLocale(String localeText) {try{__CLR4_0_62zj2zjl1l0dvz1.R.inc(3890);
        __CLR4_0_62zj2zjl1l0dvz1.R.inc(3891);StringTokenizer tokens = new StringTokenizer( localeText, "-" );
        __CLR4_0_62zj2zjl1l0dvz1.R.inc(3892);if ((((tokens.hasMoreTokens())&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3893)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3894)==0&false)))
        {{
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3895);String language = tokens.nextToken();
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3896);if ((((! tokens.hasMoreTokens())&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3897)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3898)==0&false)))
            {{                
                __CLR4_0_62zj2zjl1l0dvz1.R.inc(3899);return findLocaleForLanguage(language);
            }
            }else 
            {{
                __CLR4_0_62zj2zjl1l0dvz1.R.inc(3900);String country = tokens.nextToken();
                __CLR4_0_62zj2zjl1l0dvz1.R.inc(3901);if ((((! tokens.hasMoreTokens())&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3902)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3903)==0&false)))
                {{
                    __CLR4_0_62zj2zjl1l0dvz1.R.inc(3904);return new Locale(language, country);
                }
                }else 
                {{
                    __CLR4_0_62zj2zjl1l0dvz1.R.inc(3905);String variant = tokens.nextToken();
                    __CLR4_0_62zj2zjl1l0dvz1.R.inc(3906);return new Locale(language, country, variant);
                }
            }}
        }}
        }__CLR4_0_62zj2zjl1l0dvz1.R.inc(3907);return null;
    }finally{__CLR4_0_62zj2zjl1l0dvz1.R.flushNeeded();}}
    
    /** 
     * Finds the locale with the given language name with no country
     * or variant, such as Locale.ENGLISH or Locale.FRENCH
     *
     * @param language the language code to look for
     * @return the locale for the given language or null if one could not
     *      be found 
     */
    protected Locale findLocaleForLanguage(String language) {try{__CLR4_0_62zj2zjl1l0dvz1.R.inc(3908);
        __CLR4_0_62zj2zjl1l0dvz1.R.inc(3909);Locale[] locales = Locale.getAvailableLocales();
        __CLR4_0_62zj2zjl1l0dvz1.R.inc(3910);for ( int i = 0, size = locales.length; (((i < size)&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3911)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3912)==0&false)); i++ ) 
        {{
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3913);Locale locale = locales[i];
            __CLR4_0_62zj2zjl1l0dvz1.R.inc(3914);if ( (((language.equals( locale.getLanguage() ) )&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3915)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3916)==0&false))) 
            {{
                __CLR4_0_62zj2zjl1l0dvz1.R.inc(3917);String country = locale.getCountry();
                __CLR4_0_62zj2zjl1l0dvz1.R.inc(3918);if ( (((country == null || country.length() == 0 )&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3919)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3920)==0&false))) 
                {{
                    __CLR4_0_62zj2zjl1l0dvz1.R.inc(3921);String variant = locale.getVariant();
                    __CLR4_0_62zj2zjl1l0dvz1.R.inc(3922);if ( (((variant == null || variant.length() == 0 )&&(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3923)!=0|true))||(__CLR4_0_62zj2zjl1l0dvz1.R.iget(3924)==0&false))) 
                    {{
                        __CLR4_0_62zj2zjl1l0dvz1.R.inc(3925);return locale;
                    }
                }}
            }}
        }}    
        }__CLR4_0_62zj2zjl1l0dvz1.R.inc(3926);return null;
    }finally{__CLR4_0_62zj2zjl1l0dvz1.R.flushNeeded();}}
}
