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
 * <b>4.1</b>
 * <code><i>string</i> namespace-uri(<i>node-set?</i>)</code>
 * </p>
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath">
 * <p>
 * The <b>namespace-uri</b>
 * function returns the namespace URI of the <a
 * href="https://www.w3.org/TR/xpath#dt-expanded-name" target="_top">expanded-name</a> of the node in the
 * argument node-set that is first in <a
 * href="https://www.w3.org/TR/xpath#dt-document-order" target="_top">document order</a>. If the argument
 * node-set is empty, the first node has no <a
 * href="https://www.w3.org/TR/xpath#dt-expanded-name" target="_top">expanded-name</a>, or the namespace URI of
 * the <a href="https://www.w3.org/TR/xpath#dt-expanded-name" target="_top">expanded-name</a> is null, an empty
 * string is returned. If the argument is omitted, it defaults to a
 * node-set with the context node as its only member.
 * </p>
 * 
 * <blockquote> <b>NOTE: </b>The string returned by the <b>namespace-uri</b> function will
 * be empty except for element nodes and attribute nodes.</blockquote>
 * 
 * </blockquote>
 * 
 * @author bob mcwhirter (bob @ werken.com)
 * @see <a href="https://www.w3.org/TR/xpath#function-namespace-uri"
 *      target="_top">Section 4.1 of the XPath Specification</a>
 */
public class NamespaceUriFunction implements Function
{public static class __CLR4_0_62jg2jgl1l0dvv1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Create a new <code>NamespaceUriFunction</code> object.
     */
    public NamespaceUriFunction() {try{__CLR4_0_62jg2jgl1l0dvv1.R.inc(3292);}finally{__CLR4_0_62jg2jgl1l0dvv1.R.flushNeeded();}}

    /**
     * Returns the namespace URI of the specified node or the namespace URI of the context node if 
     * no arguments are provided.
     * 
     * @param context the context at the point in the
     *         expression where the function is called
     * @param args a <code>List</code> containing zero or one items
     * 
     * @return a <code>String</code> containing the namespace URI
     * 
     * @throws FunctionCallException if <code>args</code> has more than one item
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62jg2jgl1l0dvv1.R.inc(3293);
        __CLR4_0_62jg2jgl1l0dvv1.R.inc(3294);if ((((args.size() == 0)&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3295)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3296)==0&false)))
        {{
            __CLR4_0_62jg2jgl1l0dvv1.R.inc(3297);return evaluate( context.getNodeSet(),
                             context.getNavigator() );
        }

        }__CLR4_0_62jg2jgl1l0dvv1.R.inc(3298);if ( (((args.size() == 1 )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3299)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3300)==0&false)))
        {{
            __CLR4_0_62jg2jgl1l0dvv1.R.inc(3301);return evaluate( args,
                             context.getNavigator() );
        }

        }__CLR4_0_62jg2jgl1l0dvv1.R.inc(3302);throw new FunctionCallException( "namespace-uri() requires zero or one argument." );
    }finally{__CLR4_0_62jg2jgl1l0dvv1.R.flushNeeded();}}

    /**
     * Returns the namespace URI of <code>list.get(0)</code>
     * 
     * @param list a list of nodes
     * @param nav the <code>Navigator</code> used to retrieve the namespace
     * 
     * @return the namespace URI of <code>list.get(0)</code>
     * 
     * @throws FunctionCallException if <code>list.get(0)</code> is not a node
     */
    public static String evaluate(List list,
                                  Navigator nav) throws FunctionCallException
    {try{__CLR4_0_62jg2jgl1l0dvv1.R.inc(3303);
        __CLR4_0_62jg2jgl1l0dvv1.R.inc(3304);if ( (((! list.isEmpty() )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3305)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3306)==0&false)))
        {{
            __CLR4_0_62jg2jgl1l0dvv1.R.inc(3307);Object first = list.get(0);

            __CLR4_0_62jg2jgl1l0dvv1.R.inc(3308);if ( (((first instanceof List )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3309)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3310)==0&false)))
            {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3311);return evaluate( (List) first,
                                 nav );
            }
            }else {__CLR4_0_62jg2jgl1l0dvv1.R.inc(3312);if ( (((nav.isElement( first ) )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3313)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3314)==0&false)))
            {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3315);return nav.getElementNamespaceUri( first );
            }
            }else {__CLR4_0_62jg2jgl1l0dvv1.R.inc(3316);if ( (((nav.isAttribute( first ) )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3317)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3318)==0&false)))
            {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3319);String uri = nav.getAttributeNamespaceUri( first );
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3320);if ((((uri == null)&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3321)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3322)==0&false))) {__CLR4_0_62jg2jgl1l0dvv1.R.inc(3323);return "";
                }__CLR4_0_62jg2jgl1l0dvv1.R.inc(3324);return uri;
            }
            }else {__CLR4_0_62jg2jgl1l0dvv1.R.inc(3325);if ( (((nav.isProcessingInstruction( first ) )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3326)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3327)==0&false)))
            {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3328);return "";
            }
            }else {__CLR4_0_62jg2jgl1l0dvv1.R.inc(3329);if ( (((nav.isNamespace( first ) )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3330)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3331)==0&false)))
            {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3332);return "";
            }
            }else {__CLR4_0_62jg2jgl1l0dvv1.R.inc(3333);if ( (((nav.isDocument( first ) )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3334)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3335)==0&false)))
            {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3336);return "";
            }
            }else {__CLR4_0_62jg2jgl1l0dvv1.R.inc(3337);if ( (((nav.isComment( first ) )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3338)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3339)==0&false)))
            {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3340);return "";
            }
            }else {__CLR4_0_62jg2jgl1l0dvv1.R.inc(3341);if ( (((nav.isText( first ) )&&(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3342)!=0|true))||(__CLR4_0_62jg2jgl1l0dvv1.R.iget(3343)==0&false)))
            {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3344);return "";
            }
            }else {{
                __CLR4_0_62jg2jgl1l0dvv1.R.inc(3345);throw new FunctionCallException(
                  "The argument to the namespace-uri function must be a node-set");   
            }

        }}}}}}}}}

        }__CLR4_0_62jg2jgl1l0dvv1.R.inc(3346);return "";

    }finally{__CLR4_0_62jg2jgl1l0dvv1.R.flushNeeded();}}
}

