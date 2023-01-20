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

import org.jaxen.JaxenException;
import org.jaxen.expr.iter.*;
import org.jaxen.saxpath.Axis;
import org.jaxen.saxpath.Operator;

/**
 * The concrete implementation of the XPathFactory anstract factory.
 *
 * @see XPathFactory
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DefaultXPathFactory implements XPathFactory {public static class __CLR4_0_61zt1ztl1l0dvnf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,2699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public XPathExpr createXPath(Expr rootExpr) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2585);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2586);return new DefaultXPathExpr(rootExpr);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public PathExpr createPathExpr(FilterExpr filterExpr,
                                   LocationPath locationPath) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2587);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2588);return new DefaultPathExpr(filterExpr,
                locationPath);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public LocationPath createRelativeLocationPath() throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2589);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2590);return new DefaultRelativeLocationPath();
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public LocationPath createAbsoluteLocationPath() throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2591);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2592);return new DefaultAbsoluteLocationPath();
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public BinaryExpr createOrExpr(Expr lhs,
                                   Expr rhs) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2593);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2594);return new DefaultOrExpr(lhs,
                rhs);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public BinaryExpr createAndExpr(Expr lhs,
                                    Expr rhs) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2595);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2596);return new DefaultAndExpr(lhs,
                rhs);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public BinaryExpr createEqualityExpr(Expr lhs,
                                         Expr rhs,
                                         int equalityOperator) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2597);
        boolean __CLB4_0_6_bool0=false;__CLR4_0_61zt1ztl1l0dvnf.R.inc(2598);switch (equalityOperator) {
            case Operator.EQUALS:if (!__CLB4_0_6_bool0) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2599);__CLB4_0_6_bool0=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2600);return new DefaultEqualsExpr(lhs,
                        rhs);
            }
            case Operator.NOT_EQUALS:if (!__CLB4_0_6_bool0) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2601);__CLB4_0_6_bool0=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2602);return new DefaultNotEqualsExpr(lhs,
                        rhs);
            }
        }
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2603);throw new JaxenException("Unhandled operator in createEqualityExpr(): " + equalityOperator);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public BinaryExpr createRelationalExpr(Expr lhs,
                                           Expr rhs,
                                           int relationalOperator) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2604);
        boolean __CLB4_0_6_bool1=false;__CLR4_0_61zt1ztl1l0dvnf.R.inc(2605);switch (relationalOperator) {
            case Operator.LESS_THAN:if (!__CLB4_0_6_bool1) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2606);__CLB4_0_6_bool1=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2607);return new DefaultLessThanExpr(lhs,
                        rhs);
            }
            case Operator.GREATER_THAN:if (!__CLB4_0_6_bool1) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2608);__CLB4_0_6_bool1=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2609);return new DefaultGreaterThanExpr(lhs,
                        rhs);
            }
            case Operator.LESS_THAN_EQUALS:if (!__CLB4_0_6_bool1) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2610);__CLB4_0_6_bool1=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2611);return new DefaultLessThanEqualExpr(lhs,
                        rhs);
            }
            case Operator.GREATER_THAN_EQUALS:if (!__CLB4_0_6_bool1) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2612);__CLB4_0_6_bool1=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2613);return new DefaultGreaterThanEqualExpr(lhs,
                        rhs);
            }
        }
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2614);throw new JaxenException("Unhandled operator in createRelationalExpr(): " + relationalOperator);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public BinaryExpr createAdditiveExpr(Expr lhs,
                                         Expr rhs,
                                         int additiveOperator) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2615);
        boolean __CLB4_0_6_bool2=false;__CLR4_0_61zt1ztl1l0dvnf.R.inc(2616);switch (additiveOperator) {
            case Operator.ADD:if (!__CLB4_0_6_bool2) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2617);__CLB4_0_6_bool2=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2618);return new DefaultPlusExpr(lhs,
                        rhs);
            }
            case Operator.SUBTRACT:if (!__CLB4_0_6_bool2) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2619);__CLB4_0_6_bool2=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2620);return new DefaultMinusExpr(lhs,
                        rhs);
            }
        }
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2621);throw new JaxenException("Unhandled operator in createAdditiveExpr(): " + additiveOperator);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public BinaryExpr createMultiplicativeExpr(Expr lhs,
                                               Expr rhs,
                                               int multiplicativeOperator) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2622);
        boolean __CLB4_0_6_bool3=false;__CLR4_0_61zt1ztl1l0dvnf.R.inc(2623);switch (multiplicativeOperator) {
            case Operator.MULTIPLY:if (!__CLB4_0_6_bool3) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2624);__CLB4_0_6_bool3=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2625);return new DefaultMultiplyExpr(lhs,
                        rhs);
            }
            case Operator.DIV:if (!__CLB4_0_6_bool3) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2626);__CLB4_0_6_bool3=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2627);return new DefaultDivExpr(lhs,
                        rhs);
            }
            case Operator.MOD:if (!__CLB4_0_6_bool3) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2628);__CLB4_0_6_bool3=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2629);return new DefaultModExpr(lhs,
                        rhs);
            }
        }
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2630);throw new JaxenException("Unhandled operator in createMultiplicativeExpr(): " + multiplicativeOperator);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public Expr createUnaryExpr(Expr expr,
                                int unaryOperator) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2631);
        boolean __CLB4_0_6_bool4=false;__CLR4_0_61zt1ztl1l0dvnf.R.inc(2632);switch (unaryOperator) {
            case Operator.NEGATIVE:if (!__CLB4_0_6_bool4) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2633);__CLB4_0_6_bool4=true;} {
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2634);return new DefaultUnaryExpr(expr);
            }
        }
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2635);return expr;
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public UnionExpr createUnionExpr(Expr lhs,
                                     Expr rhs) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2636);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2637);return new DefaultUnionExpr(lhs,
                rhs);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public FilterExpr createFilterExpr(Expr expr) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2638);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2639);return new DefaultFilterExpr(expr, createPredicateSet());
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public FunctionCallExpr createFunctionCallExpr(String prefix,
                                                   String functionName) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2640);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2641);return new DefaultFunctionCallExpr(prefix,
                functionName);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public NumberExpr createNumberExpr(int number) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2642);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2643);return new DefaultNumberExpr(new Double(number));
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public NumberExpr createNumberExpr(double number) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2644);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2645);return new DefaultNumberExpr(new Double(number));
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public LiteralExpr createLiteralExpr(String literal) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2646);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2647);return new DefaultLiteralExpr(literal);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public VariableReferenceExpr createVariableReferenceExpr(String prefix,
                                                             String variable) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2648);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2649);return new DefaultVariableReferenceExpr(prefix,
                variable);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public Step createNameStep(int axis,
                               String prefix,
                               String localName) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2650);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2651);IterableAxis iter = getIterableAxis(axis);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2652);return new DefaultNameStep(iter,
                prefix,
                localName,
                createPredicateSet());
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public Step createTextNodeStep(int axis) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2653);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2654);IterableAxis iter = getIterableAxis(axis);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2655);return new DefaultTextNodeStep(iter, createPredicateSet());
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public Step createCommentNodeStep(int axis) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2656);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2657);IterableAxis iter = getIterableAxis(axis);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2658);return new DefaultCommentNodeStep(iter, createPredicateSet());
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public Step createAllNodeStep(int axis) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2659);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2660);IterableAxis iter = getIterableAxis(axis);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2661);return new DefaultAllNodeStep(iter, createPredicateSet());
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public Step createProcessingInstructionNodeStep(int axis,
                                                    String piName) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2662);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2663);IterableAxis iter = getIterableAxis(axis);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2664);return new DefaultProcessingInstructionNodeStep(iter,
                piName,
                createPredicateSet());
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public Predicate createPredicate(Expr predicateExpr) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2665);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2666);return new DefaultPredicate(predicateExpr);
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    protected IterableAxis getIterableAxis(int axis) throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2667);

        boolean __CLB4_0_6_bool5=false;__CLR4_0_61zt1ztl1l0dvnf.R.inc(2668);switch (axis) {
            case Axis.CHILD:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2669);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2670);return new IterableChildAxis(axis);
            case Axis.DESCENDANT:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2671);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2672);return new IterableDescendantAxis(axis);
            case Axis.PARENT:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2673);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2674);return new IterableParentAxis(axis);
            case Axis.FOLLOWING_SIBLING:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2675);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2676);return new IterableFollowingSiblingAxis(axis);
            case Axis.PRECEDING_SIBLING:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2677);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2678);return new IterablePrecedingSiblingAxis(axis);
            case Axis.FOLLOWING:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2679);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2680);return new IterableFollowingAxis(axis);
            case Axis.PRECEDING:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2681);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2682);return new IterablePrecedingAxis(axis);
            case Axis.ATTRIBUTE:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2683);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2684);return new IterableAttributeAxis(axis);
            case Axis.NAMESPACE:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2685);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2686);return new IterableNamespaceAxis(axis);
            case Axis.SELF:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2687);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2688);return new IterableSelfAxis(axis);
            case Axis.DESCENDANT_OR_SELF:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2689);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2690);return new IterableDescendantOrSelfAxis(axis);
            case Axis.ANCESTOR_OR_SELF:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2691);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2692);return new IterableAncestorOrSelfAxis(axis);
            case Axis.ANCESTOR:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2693);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2694);return new IterableAncestorAxis(axis);
            default:if (!__CLB4_0_6_bool5) {__CLR4_0_61zt1ztl1l0dvnf.R.inc(2695);__CLB4_0_6_bool5=true;}
                __CLR4_0_61zt1ztl1l0dvnf.R.inc(2696);throw new JaxenException("Unrecognized axis code: " + axis);
        }

    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

    public PredicateSet createPredicateSet() throws JaxenException {try{__CLR4_0_61zt1ztl1l0dvnf.R.inc(2697);
        __CLR4_0_61zt1ztl1l0dvnf.R.inc(2698);return new PredicateSet();
    }finally{__CLR4_0_61zt1ztl1l0dvnf.R.flushNeeded();}}

}
