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
package org.jaxen.expr;

import org.jaxen.Context;
import org.jaxen.ContextSupport;
import org.jaxen.JaxenException;
import org.jaxen.UnsupportedAxisException;
import org.jaxen.expr.iter.IterableAxis;
import org.jaxen.saxpath.Axis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @deprecated this class will become non-public in the future;
 * use the interface instead
 */
public abstract class DefaultStep implements Step {public static class __CLR4_0_61vd1vdl1l0dvly{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,2475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private IterableAxis axis;
    private PredicateSet predicates;

    public DefaultStep(IterableAxis axis, PredicateSet predicates) {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2425);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2426);this.axis = axis;
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2427);this.predicates = predicates;
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public void addPredicate(Predicate predicate) {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2428);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2429);this.predicates.addPredicate(predicate);
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public List getPredicates() {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2430);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2431);return this.predicates.getPredicates();
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public PredicateSet getPredicateSet() {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2432);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2433);return this.predicates;
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public int getAxis() {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2434);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2435);return this.axis.value();
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public IterableAxis getIterableAxis() {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2436);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2437);return this.axis;
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public String getAxisName() {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2438);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2439);return Axis.lookup(getAxis());
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public String getText() {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2440);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2441);return this.predicates.getText();
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2442);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2443);return getIterableAxis() + " " + super.toString();
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public void simplify() {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2444);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2445);this.predicates.simplify();
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public Iterator axisIterator(Object contextNode, ContextSupport support)
            throws UnsupportedAxisException {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2446);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2447);return getIterableAxis().iterator(contextNode, support);
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

    public List evaluate(final Context context) throws JaxenException {try{__CLR4_0_61vd1vdl1l0dvly.R.inc(2448);
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2449);final List contextNodeSet = context.getNodeSet();
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2450);final IdentitySet unique = new IdentitySet();
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2451);final int contextSize = contextNodeSet.size();

        // ???? try linked lists instead?
        // ???? initial size for these?
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2452);final ArrayList interimSet = new ArrayList();
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2453);final ArrayList newNodeSet = new ArrayList();
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2454);final ContextSupport support = context.getContextSupport();

        // ???? use iterator instead
        __CLR4_0_61vd1vdl1l0dvly.R.inc(2455);for (int i = 0; (((i < contextSize)&&(__CLR4_0_61vd1vdl1l0dvly.R.iget(2456)!=0|true))||(__CLR4_0_61vd1vdl1l0dvly.R.iget(2457)==0&false)); ++i) {{
            __CLR4_0_61vd1vdl1l0dvly.R.inc(2458);Object eachContextNode = contextNodeSet.get(i);


            /* See jaxen-106. Might be able to optimize this by doing
             * specific matching for individual axes. For instance on namespace axis
             * we should only get namespace nodes and on attribute axes we only get
             * attribute nodes. Self and parent axes have single members.
             * Children, descendant, ancestor, and sibling axes never
             * see any attributes or namespaces
             */
            __CLR4_0_61vd1vdl1l0dvly.R.inc(2459);Iterator axisNodeIter = axis.iterator(eachContextNode, support);
            __CLR4_0_61vd1vdl1l0dvly.R.inc(2460);while ((((axisNodeIter.hasNext())&&(__CLR4_0_61vd1vdl1l0dvly.R.iget(2461)!=0|true))||(__CLR4_0_61vd1vdl1l0dvly.R.iget(2462)==0&false))) {{
                __CLR4_0_61vd1vdl1l0dvly.R.inc(2463);Object eachAxisNode = axisNodeIter.next();
                __CLR4_0_61vd1vdl1l0dvly.R.inc(2464);if ((((!unique.contains(eachAxisNode))&&(__CLR4_0_61vd1vdl1l0dvly.R.iget(2465)!=0|true))||(__CLR4_0_61vd1vdl1l0dvly.R.iget(2466)==0&false))) {{
                    __CLR4_0_61vd1vdl1l0dvly.R.inc(2467);if ((((matches(eachAxisNode, support))&&(__CLR4_0_61vd1vdl1l0dvly.R.iget(2468)!=0|true))||(__CLR4_0_61vd1vdl1l0dvly.R.iget(2469)==0&false))) {{
                        __CLR4_0_61vd1vdl1l0dvly.R.inc(2470);unique.add(eachAxisNode);
                        __CLR4_0_61vd1vdl1l0dvly.R.inc(2471);interimSet.add(eachAxisNode);
                    }
                }}
            }}
            }__CLR4_0_61vd1vdl1l0dvly.R.inc(2472);newNodeSet.addAll(getPredicateSet().evaluatePredicates(
                    interimSet, support));
            __CLR4_0_61vd1vdl1l0dvly.R.inc(2473);interimSet.clear();
        }
        }__CLR4_0_61vd1vdl1l0dvly.R.inc(2474);return newNodeSet;
    }finally{__CLR4_0_61vd1vdl1l0dvly.R.flushNeeded();}}

}
