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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;

/**
 * <p><b>4.1</b> <code><i>node-set</i> id(<i>object</i>)</code> </p>
 *  
 * <p>The <b>id</b> function returns a <code>List</code>
 * of all the elements in the context document that have an ID
 * matching one of a specified list of IDs. How an attribute is determined
 * to be of type ID depends on the navigator, but it normally requires that
 * the attribute be declared to have type ID in the DTD. 
 * </p>
 * 
 * <p>
 * There should be no more than one element in any document with a 
 * certain ID. However, if there are multiple such elements--i.e. if 
 * there are duplicate IDs--then this function selects only the first element 
 * in document order with the specified ID. 
 * </p>
 * 
 * @author Erwin Bolwidt (ejb @ klomp.org)
 * @author J\u00e9r\u00f4me N\u00e8gre (jerome.negre @ e-xmlmedia.fr)
 * 
 * @see <a href="https://www.w3.org/TR/xpath#function-id" target="_top">Section 4.1 of the XPath Specification</a>
 */
public class IdFunction implements Function
{public static class __CLR4_0_62eb2ebl1l0dvto{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Create a new <code>IdFunction</code> object.
     */
    public IdFunction() {try{__CLR4_0_62eb2ebl1l0dvto.R.inc(3107);}finally{__CLR4_0_62eb2ebl1l0dvto.R.flushNeeded();}}
    
    /** 
     * Returns a list of the nodes with the specified IDs.
     *
     * @param context the context at the point in the
     *         expression when the function is called
     * @param args a list with exactly one item which is either a string
     *     a node-set
     * 
     * @return a <code>List</code> containing the first node in document 
     *     with each of the specified IDs; or 
     *     an empty list if there are no such nodes
     * 
     * @throws FunctionCallException if <code>args</code> has more or less than one item
     */
    public Object call(Context context, List args) throws FunctionCallException
    {try{__CLR4_0_62eb2ebl1l0dvto.R.inc(3108);
        __CLR4_0_62eb2ebl1l0dvto.R.inc(3109);if ( (((args.size() == 1 )&&(__CLR4_0_62eb2ebl1l0dvto.R.iget(3110)!=0|true))||(__CLR4_0_62eb2ebl1l0dvto.R.iget(3111)==0&false))) {{
            __CLR4_0_62eb2ebl1l0dvto.R.inc(3112);return evaluate( context.getNodeSet(),
                             args.get(0), context.getNavigator() );
        }

        }__CLR4_0_62eb2ebl1l0dvto.R.inc(3113);throw new FunctionCallException( "id() requires one argument" );
    }finally{__CLR4_0_62eb2ebl1l0dvto.R.flushNeeded();}}

    /** 
     * Returns a list of the nodes with the specified IDs.
     * 
     * @param contextNodes the context node-set. The first item in this list
     *     determines the document in which the search is performed.
     * @param arg the ID or IDs to search for
     * @param nav the navigator used to calculate string-values and search
     *     by ID
     * 
     * @return a <code>List</code> containing the first node in document 
     *     with each of the specified IDs; or 
     *     an empty list if there are no such nodes
     * 
     */
    public static List evaluate(List contextNodes, Object arg, Navigator nav)
    {try{__CLR4_0_62eb2ebl1l0dvto.R.inc(3114);
        __CLR4_0_62eb2ebl1l0dvto.R.inc(3115);if ((((contextNodes.size() == 0)&&(__CLR4_0_62eb2ebl1l0dvto.R.iget(3116)!=0|true))||(__CLR4_0_62eb2ebl1l0dvto.R.iget(3117)==0&false))) {__CLR4_0_62eb2ebl1l0dvto.R.inc(3118);return Collections.EMPTY_LIST;
      
        }__CLR4_0_62eb2ebl1l0dvto.R.inc(3119);List nodes = new ArrayList();

        __CLR4_0_62eb2ebl1l0dvto.R.inc(3120);Object contextNode = contextNodes.get(0);

        __CLR4_0_62eb2ebl1l0dvto.R.inc(3121);if ((((arg instanceof List)&&(__CLR4_0_62eb2ebl1l0dvto.R.iget(3122)!=0|true))||(__CLR4_0_62eb2ebl1l0dvto.R.iget(3123)==0&false))) {{
            __CLR4_0_62eb2ebl1l0dvto.R.inc(3124);Iterator iter = ((List)arg).iterator();
            __CLR4_0_62eb2ebl1l0dvto.R.inc(3125);while ((((iter.hasNext())&&(__CLR4_0_62eb2ebl1l0dvto.R.iget(3126)!=0|true))||(__CLR4_0_62eb2ebl1l0dvto.R.iget(3127)==0&false))) {{
                __CLR4_0_62eb2ebl1l0dvto.R.inc(3128);String id = StringFunction.evaluate(iter.next(), nav);
                __CLR4_0_62eb2ebl1l0dvto.R.inc(3129);nodes.addAll( evaluate( contextNodes, id, nav ) );
            }
        }} 
        }else {{
            __CLR4_0_62eb2ebl1l0dvto.R.inc(3130);String ids = StringFunction.evaluate(arg, nav);
            __CLR4_0_62eb2ebl1l0dvto.R.inc(3131);StringTokenizer tok = new StringTokenizer(ids, " \t\n\r");
            __CLR4_0_62eb2ebl1l0dvto.R.inc(3132);while ((((tok.hasMoreTokens())&&(__CLR4_0_62eb2ebl1l0dvto.R.iget(3133)!=0|true))||(__CLR4_0_62eb2ebl1l0dvto.R.iget(3134)==0&false))) {{
                __CLR4_0_62eb2ebl1l0dvto.R.inc(3135);String id = tok.nextToken();
                __CLR4_0_62eb2ebl1l0dvto.R.inc(3136);Object node = nav.getElementById(contextNode, id);
                __CLR4_0_62eb2ebl1l0dvto.R.inc(3137);if ((((node != null)&&(__CLR4_0_62eb2ebl1l0dvto.R.iget(3138)!=0|true))||(__CLR4_0_62eb2ebl1l0dvto.R.iget(3139)==0&false))) {{
                    __CLR4_0_62eb2ebl1l0dvto.R.inc(3140);nodes.add(node);
                }
            }}
        }}
        }__CLR4_0_62eb2ebl1l0dvto.R.inc(3141);return nodes;
    }finally{__CLR4_0_62eb2ebl1l0dvto.R.flushNeeded();}}
    
}

