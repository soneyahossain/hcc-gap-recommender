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
 * $Id$
 */


package org.jaxen.expr;

import org.jaxen.Context;
import org.jaxen.ContextSupport;
import org.jaxen.JaxenException;
import org.jaxen.function.BooleanFunction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * Represents the collection of predicates that follow the node-test in a
 * location path.
 * </p>
 *
 * <p>
 * There is no rule that the same predicate may not
 * appear twice in an XPath expression, nor does this class enforce any such rule.
 * This is implemented more as a list than a set. However, adding the swme predicate
 * twice should have no effect on the final result other than slowing it down.
 * </p>
 */
public class PredicateSet implements Serializable {public static class __CLR4_0_626a26al1l0dvp8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,2928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -7166491740228977853L;

    private List predicates;

    /**
     * Create a new empty predicate set.
     */
    public PredicateSet() {try{__CLR4_0_626a26al1l0dvp8.R.inc(2818);
        __CLR4_0_626a26al1l0dvp8.R.inc(2819);this.predicates = Collections.EMPTY_LIST;
    }finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}

    /**
     * Add a predicate to the set.
     *
     * @param predicate the predicate to be inserted
     */
    public void addPredicate(Predicate predicate) {try{__CLR4_0_626a26al1l0dvp8.R.inc(2820);
        __CLR4_0_626a26al1l0dvp8.R.inc(2821);if ((((this.predicates == Collections.EMPTY_LIST)&&(__CLR4_0_626a26al1l0dvp8.R.iget(2822)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2823)==0&false))) {{
            __CLR4_0_626a26al1l0dvp8.R.inc(2824);this.predicates = new ArrayList();
        }

        }__CLR4_0_626a26al1l0dvp8.R.inc(2825);this.predicates.add(predicate);
    }finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}

    /**
     * Returns the list containing the predicates.
     * This list is live, not a copy.
     *
     * @return a live list of predicates
     */
    public List getPredicates() {try{__CLR4_0_626a26al1l0dvp8.R.inc(2826);
        __CLR4_0_626a26al1l0dvp8.R.inc(2827);return this.predicates;
    }finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}

    /**
     * Simplify each of the predicates in the list.
     */
    public void simplify() {try{__CLR4_0_626a26al1l0dvp8.R.inc(2828);
        __CLR4_0_626a26al1l0dvp8.R.inc(2829);Iterator predIter = this.predicates.iterator();
        __CLR4_0_626a26al1l0dvp8.R.inc(2830);Predicate eachPred = null;

        __CLR4_0_626a26al1l0dvp8.R.inc(2831);while ((((predIter.hasNext())&&(__CLR4_0_626a26al1l0dvp8.R.iget(2832)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2833)==0&false))) {{
            __CLR4_0_626a26al1l0dvp8.R.inc(2834);eachPred = (Predicate) predIter.next();
            __CLR4_0_626a26al1l0dvp8.R.inc(2835);eachPred.simplify();
        }
    }}finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}

    /**
     * Returns the XPath string containing each of the predicates.
     *
     * @return the XPath string containing each of the predicates
     */
    public String getText() {try{__CLR4_0_626a26al1l0dvp8.R.inc(2836);
        __CLR4_0_626a26al1l0dvp8.R.inc(2837);StringBuffer buf = new StringBuffer();

        __CLR4_0_626a26al1l0dvp8.R.inc(2838);Iterator predIter = this.predicates.iterator();
        __CLR4_0_626a26al1l0dvp8.R.inc(2839);Predicate eachPred = null;

        __CLR4_0_626a26al1l0dvp8.R.inc(2840);while ((((predIter.hasNext())&&(__CLR4_0_626a26al1l0dvp8.R.iget(2841)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2842)==0&false))) {{
            __CLR4_0_626a26al1l0dvp8.R.inc(2843);eachPred = (Predicate) predIter.next();
            __CLR4_0_626a26al1l0dvp8.R.inc(2844);buf.append(eachPred.getText());
        }

        }__CLR4_0_626a26al1l0dvp8.R.inc(2845);return buf.toString();
    }finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}

    /**
     * <p>Returns true if any of the supplied nodes satisfy
     * all the predicates in the set. Returns false if none of the supplied
     * nodes matches all the predicates in the set. Returns false if the
     * node-set is empty.</p>
     *
     * @param contextNodeSet the nodes to test against these predicates
     * @param support        ????
     * @return true if any node in the contextNodeSet matches all the predicates
     * @throws JaxenException
     */
    protected boolean evaluateAsBoolean(List contextNodeSet,
                                        ContextSupport support) throws JaxenException {try{__CLR4_0_626a26al1l0dvp8.R.inc(2846);
        __CLR4_0_626a26al1l0dvp8.R.inc(2847);return anyMatchingNode(contextNodeSet, support);
    }finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}

    private boolean anyMatchingNode(List contextNodeSet, ContextSupport support)
            throws JaxenException {try{__CLR4_0_626a26al1l0dvp8.R.inc(2848);
        // Easy way out (necessary)
        __CLR4_0_626a26al1l0dvp8.R.inc(2849);if ((((predicates.size() == 0)&&(__CLR4_0_626a26al1l0dvp8.R.iget(2850)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2851)==0&false))) {{
            __CLR4_0_626a26al1l0dvp8.R.inc(2852);return false;
        }
        }__CLR4_0_626a26al1l0dvp8.R.inc(2853);Iterator predIter = predicates.iterator();

        // initial list to filter
        __CLR4_0_626a26al1l0dvp8.R.inc(2854);List nodes2Filter = contextNodeSet;
        // apply all predicates
        __CLR4_0_626a26al1l0dvp8.R.inc(2855);while ((((predIter.hasNext())&&(__CLR4_0_626a26al1l0dvp8.R.iget(2856)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2857)==0&false))) {{
            __CLR4_0_626a26al1l0dvp8.R.inc(2858);final int nodes2FilterSize = nodes2Filter.size();
            // Set up a dummy context with a list to hold each node
            __CLR4_0_626a26al1l0dvp8.R.inc(2859);Context predContext = new Context(support);
            __CLR4_0_626a26al1l0dvp8.R.inc(2860);List tempList = new ArrayList(1);
            __CLR4_0_626a26al1l0dvp8.R.inc(2861);predContext.setNodeSet(tempList);
            // loop through the current nodes to filter and add to the
            // filtered nodes list if the predicate succeeds
            __CLR4_0_626a26al1l0dvp8.R.inc(2862);for (int i = 0; (((i < nodes2FilterSize)&&(__CLR4_0_626a26al1l0dvp8.R.iget(2863)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2864)==0&false)); ++i) {{
                __CLR4_0_626a26al1l0dvp8.R.inc(2865);Object contextNode = nodes2Filter.get(i);
                __CLR4_0_626a26al1l0dvp8.R.inc(2866);tempList.clear();
                __CLR4_0_626a26al1l0dvp8.R.inc(2867);tempList.add(contextNode);
                __CLR4_0_626a26al1l0dvp8.R.inc(2868);predContext.setNodeSet(tempList);
                // ????
                __CLR4_0_626a26al1l0dvp8.R.inc(2869);predContext.setPosition(i + 1);
                __CLR4_0_626a26al1l0dvp8.R.inc(2870);predContext.setSize(nodes2FilterSize);
                __CLR4_0_626a26al1l0dvp8.R.inc(2871);Object predResult = ((Predicate) predIter.next()).evaluate(predContext);
                __CLR4_0_626a26al1l0dvp8.R.inc(2872);if ((((predResult instanceof Number)&&(__CLR4_0_626a26al1l0dvp8.R.iget(2873)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2874)==0&false))) {{
                    // Here we assume nodes are in forward or reverse order
                    // as appropriate for axis
                    __CLR4_0_626a26al1l0dvp8.R.inc(2875);int proximity = ((Number) predResult).intValue();
                    __CLR4_0_626a26al1l0dvp8.R.inc(2876);if ((((proximity == (i + 1))&&(__CLR4_0_626a26al1l0dvp8.R.iget(2877)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2878)==0&false))) {{
                        __CLR4_0_626a26al1l0dvp8.R.inc(2879);return true;
                    }
                }} }else {{
                    __CLR4_0_626a26al1l0dvp8.R.inc(2880);Boolean includes =
                            BooleanFunction.evaluate(predResult,
                                    predContext.getNavigator());
                    __CLR4_0_626a26al1l0dvp8.R.inc(2881);if ((((includes.booleanValue())&&(__CLR4_0_626a26al1l0dvp8.R.iget(2882)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2883)==0&false))) {{
                        __CLR4_0_626a26al1l0dvp8.R.inc(2884);return true;
                    }
                }}
            }}
        }}

        }__CLR4_0_626a26al1l0dvp8.R.inc(2885);return false;
    }finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}


    /**
     * <p>Returns all of the supplied nodes that satisfy
     * all the predicates in the set. </p>
     *
     * @param contextNodeSet the nodes to test against these predicates
     * @param support        ????
     * @return all the nodes that match each of the predicates
     * @throws JaxenException
     */
    protected List evaluatePredicates(List contextNodeSet, ContextSupport support)
            throws JaxenException {try{__CLR4_0_626a26al1l0dvp8.R.inc(2886);
        // Easy way out (necessary)
        __CLR4_0_626a26al1l0dvp8.R.inc(2887);if ((((predicates.size() == 0)&&(__CLR4_0_626a26al1l0dvp8.R.iget(2888)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2889)==0&false))) {{
            __CLR4_0_626a26al1l0dvp8.R.inc(2890);return contextNodeSet;
        }
        }__CLR4_0_626a26al1l0dvp8.R.inc(2891);Iterator predIter = predicates.iterator();

        // initial list to filter
        __CLR4_0_626a26al1l0dvp8.R.inc(2892);List nodes2Filter = contextNodeSet;
        // apply all predicates
        __CLR4_0_626a26al1l0dvp8.R.inc(2893);while ((((predIter.hasNext())&&(__CLR4_0_626a26al1l0dvp8.R.iget(2894)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2895)==0&false))) {{
            __CLR4_0_626a26al1l0dvp8.R.inc(2896);nodes2Filter =
                    applyPredicate((Predicate) predIter.next(), nodes2Filter, support);
        }

        }__CLR4_0_626a26al1l0dvp8.R.inc(2897);return nodes2Filter;
    }finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}

    public List applyPredicate(Predicate predicate, List nodes2Filter, ContextSupport support)
            throws JaxenException {try{__CLR4_0_626a26al1l0dvp8.R.inc(2898);
        __CLR4_0_626a26al1l0dvp8.R.inc(2899);final int nodes2FilterSize = nodes2Filter.size();
        __CLR4_0_626a26al1l0dvp8.R.inc(2900);List filteredNodes = new ArrayList(nodes2FilterSize);
        // Set up a dummy context with a list to hold each node
        __CLR4_0_626a26al1l0dvp8.R.inc(2901);Context predContext = new Context(support);
        __CLR4_0_626a26al1l0dvp8.R.inc(2902);List tempList = new ArrayList(1);
        __CLR4_0_626a26al1l0dvp8.R.inc(2903);predContext.setNodeSet(tempList);
        // loop through the current nodes to filter and add to the
        // filtered nodes list if the predicate succeeds
        __CLR4_0_626a26al1l0dvp8.R.inc(2904);for (int i = 0; (((i < nodes2FilterSize)&&(__CLR4_0_626a26al1l0dvp8.R.iget(2905)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2906)==0&false)); ++i) {{
            __CLR4_0_626a26al1l0dvp8.R.inc(2907);Object contextNode = nodes2Filter.get(i);
            __CLR4_0_626a26al1l0dvp8.R.inc(2908);tempList.clear();
            __CLR4_0_626a26al1l0dvp8.R.inc(2909);tempList.add(contextNode);
            __CLR4_0_626a26al1l0dvp8.R.inc(2910);predContext.setNodeSet(tempList);
            // ????
            __CLR4_0_626a26al1l0dvp8.R.inc(2911);predContext.setPosition(i + 1);
            __CLR4_0_626a26al1l0dvp8.R.inc(2912);predContext.setSize(nodes2FilterSize);
            __CLR4_0_626a26al1l0dvp8.R.inc(2913);Object predResult = predicate.evaluate(predContext);
            __CLR4_0_626a26al1l0dvp8.R.inc(2914);if ((((predResult instanceof Number)&&(__CLR4_0_626a26al1l0dvp8.R.iget(2915)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2916)==0&false))) {{
                // Here we assume nodes are in forward or reverse order
                // as appropriate for axis
                __CLR4_0_626a26al1l0dvp8.R.inc(2917);int proximity = ((Number) predResult).intValue();
                __CLR4_0_626a26al1l0dvp8.R.inc(2918);if ((((proximity == (i + 1))&&(__CLR4_0_626a26al1l0dvp8.R.iget(2919)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2920)==0&false))) {{
                    __CLR4_0_626a26al1l0dvp8.R.inc(2921);filteredNodes.add(contextNode);
                }
            }} }else {{
                __CLR4_0_626a26al1l0dvp8.R.inc(2922);Boolean includes =
                        BooleanFunction.evaluate(predResult,
                                predContext.getNavigator());
                __CLR4_0_626a26al1l0dvp8.R.inc(2923);if ((((includes.booleanValue())&&(__CLR4_0_626a26al1l0dvp8.R.iget(2924)!=0|true))||(__CLR4_0_626a26al1l0dvp8.R.iget(2925)==0&false))) {{
                    __CLR4_0_626a26al1l0dvp8.R.inc(2926);filteredNodes.add(contextNode);
                }
            }}
        }}
        }__CLR4_0_626a26al1l0dvp8.R.inc(2927);return filteredNodes;
    }finally{__CLR4_0_626a26al1l0dvp8.R.flushNeeded();}}

}
