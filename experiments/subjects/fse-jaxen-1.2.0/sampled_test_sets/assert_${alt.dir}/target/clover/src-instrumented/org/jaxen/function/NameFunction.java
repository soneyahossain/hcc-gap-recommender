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
 * <p><b>4.1</b> <code><i>string</i> name(<i>node-set?</i>)</code> </p>
 *  
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath">
 * The <b>name</b> function returns a string containing a QName representing 
 * the expanded-name of the node in the argument node-set that is first in document order. 
 * The QName must represent the expanded-name with respect to the namespace declarations 
 * in effect on the node whose expanded-name is being represented. Typically, this will 
 * be the QName that occurred in the XML source....If 
 * the argument node-set is empty or the first node has 
 * no expanded-name, an empty string is returned. 
 * If the argument it omitted, it defaults to a node-set with the context node as its only member.
 * </blockquote>
 * 
 * @author bob mcwhirter (bob @ werken.com)
 * 
 * @see <a href="https://www.w3.org/TR/xpath#function-name" target="_top">Section 4.1 of the XPath Specification</a>
 */
public class NameFunction implements Function
{public static class __CLR4_0_62i22i2l1l0dvur{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3292,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    
    /**
     * Create a new <code>NameFunction</code> object.
     */
    public NameFunction() {try{__CLR4_0_62i22i2l1l0dvur.R.inc(3242);}finally{__CLR4_0_62i22i2l1l0dvur.R.flushNeeded();}}
    
    /**
     * Returns the name of the specified node or the name of the context node if 
     * no arguments are provided.
     * 
     * @param context the context at the point in the
     *         expression where the function is called
     * @param args a <code>List</code> containing zero or one items
     * 
     * @return a <code>String</code> containing the name
     * 
     * @throws FunctionCallException if <code>args</code> has more than one item
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62i22i2l1l0dvur.R.inc(3243);
        __CLR4_0_62i22i2l1l0dvur.R.inc(3244);if ( (((args.size() == 0 )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3245)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3246)==0&false)))
        {{
            __CLR4_0_62i22i2l1l0dvur.R.inc(3247);return evaluate( context.getNodeSet(),
                             context.getNavigator() );
        }

        }__CLR4_0_62i22i2l1l0dvur.R.inc(3248);if ( (((args.size() == 1 )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3249)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3250)==0&false)))
        {{
            __CLR4_0_62i22i2l1l0dvur.R.inc(3251);return evaluate( args,
                             context.getNavigator() );
        }

        }__CLR4_0_62i22i2l1l0dvur.R.inc(3252);throw new FunctionCallException( "name() requires zero or one argument." );
    }finally{__CLR4_0_62i22i2l1l0dvur.R.flushNeeded();}}

    /**
     * Returns the name of <code>list.get(0)</code>
     * 
     * @param list a list of nodes
     * @param nav the <code>Navigator</code> used to retrieve the name
     * 
     * @return the name of <code>list.get(0)</code>
     * 
     * @throws FunctionCallException if <code>list.get(0)</code> is not a node
     */
    public static String evaluate(List list,
                                  Navigator nav) throws FunctionCallException
    {try{__CLR4_0_62i22i2l1l0dvur.R.inc(3253);
        __CLR4_0_62i22i2l1l0dvur.R.inc(3254);if ( (((! list.isEmpty() )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3255)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3256)==0&false)))
        {{            
            __CLR4_0_62i22i2l1l0dvur.R.inc(3257);Object first = list.get(0);

            __CLR4_0_62i22i2l1l0dvur.R.inc(3258);if ((((first instanceof List)&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3259)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3260)==0&false)))
            {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3261);return evaluate( (List) first,
                                 nav );
            }
            }else {__CLR4_0_62i22i2l1l0dvur.R.inc(3262);if ( (((nav.isElement( first ) )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3263)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3264)==0&false)))
            {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3265);return nav.getElementQName( first );
            }
            }else {__CLR4_0_62i22i2l1l0dvur.R.inc(3266);if ( (((nav.isAttribute( first ) )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3267)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3268)==0&false)))
            {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3269);return nav.getAttributeQName( first );
            }
            }else {__CLR4_0_62i22i2l1l0dvur.R.inc(3270);if ( (((nav.isProcessingInstruction( first ) )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3271)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3272)==0&false)))
            {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3273);return nav.getProcessingInstructionTarget( first );
            }
            }else {__CLR4_0_62i22i2l1l0dvur.R.inc(3274);if ( (((nav.isNamespace( first ) )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3275)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3276)==0&false)))
            {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3277);return nav.getNamespacePrefix( first );
            }
            }else {__CLR4_0_62i22i2l1l0dvur.R.inc(3278);if ( (((nav.isDocument( first ) )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3279)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3280)==0&false)))
            {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3281);return "";
            }
            }else {__CLR4_0_62i22i2l1l0dvur.R.inc(3282);if ( (((nav.isComment( first ) )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3283)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3284)==0&false)))
            {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3285);return "";
            }
            }else {__CLR4_0_62i22i2l1l0dvur.R.inc(3286);if ( (((nav.isText( first ) )&&(__CLR4_0_62i22i2l1l0dvur.R.iget(3287)!=0|true))||(__CLR4_0_62i22i2l1l0dvur.R.iget(3288)==0&false)))
            {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3289);return "";
            }
            }else {{
                __CLR4_0_62i22i2l1l0dvur.R.inc(3290);throw new FunctionCallException("The argument to the name function must be a node-set");   
            }
        }}}}}}}}}

        }__CLR4_0_62i22i2l1l0dvur.R.inc(3291);return "";

    }finally{__CLR4_0_62i22i2l1l0dvur.R.flushNeeded();}}
    
}
