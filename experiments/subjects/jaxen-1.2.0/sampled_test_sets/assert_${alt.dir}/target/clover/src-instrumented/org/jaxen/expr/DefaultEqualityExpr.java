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
import org.jaxen.JaxenException;
import org.jaxen.Navigator;
import org.jaxen.function.BooleanFunction;
import org.jaxen.function.NumberFunction;
import org.jaxen.function.StringFunction;

import java.util.Iterator;
import java.util.List;

abstract class DefaultEqualityExpr extends DefaultTruthExpr implements EqualityExpr {public static class __CLR4_0_618t18tl1l0dvfs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,1682,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    DefaultEqualityExpr(Expr lhs, Expr rhs) {
        super(lhs, rhs);__CLR4_0_618t18tl1l0dvfs.R.inc(1614);try{__CLR4_0_618t18tl1l0dvfs.R.inc(1613);
    }finally{__CLR4_0_618t18tl1l0dvfs.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_618t18tl1l0dvfs.R.inc(1615);
        __CLR4_0_618t18tl1l0dvfs.R.inc(1616);return "[(DefaultEqualityExpr): " + getLHS() + ", " + getRHS() + "]";
    }finally{__CLR4_0_618t18tl1l0dvfs.R.flushNeeded();}}

    public Object evaluate(Context context) throws JaxenException {try{__CLR4_0_618t18tl1l0dvfs.R.inc(1617);
        __CLR4_0_618t18tl1l0dvfs.R.inc(1618);Object lhsValue = getLHS().evaluate(context);
        __CLR4_0_618t18tl1l0dvfs.R.inc(1619);Object rhsValue = getRHS().evaluate(context);

        __CLR4_0_618t18tl1l0dvfs.R.inc(1620);if ((((lhsValue == null || rhsValue == null)&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1621)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1622)==0&false))) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1623);return Boolean.FALSE;
        }

        }__CLR4_0_618t18tl1l0dvfs.R.inc(1624);Navigator nav = context.getNavigator();

        __CLR4_0_618t18tl1l0dvfs.R.inc(1625);if ((((bothAreSets(lhsValue, rhsValue))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1626)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1627)==0&false))) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1628);return evaluateSetSet((List) lhsValue, (List) rhsValue, nav);
        } }else {__CLR4_0_618t18tl1l0dvfs.R.inc(1629);if ((((isSet(lhsValue) && isBoolean(rhsValue))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1630)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1631)==0&false))) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1632);Boolean lhsBoolean = (((((List) lhsValue).isEmpty() )&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1633)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1634)==0&false))? Boolean.FALSE : Boolean.TRUE;
            __CLR4_0_618t18tl1l0dvfs.R.inc(1635);Boolean rhsBoolean = (Boolean) rhsValue;
            __CLR4_0_618t18tl1l0dvfs.R.inc(1636);return Boolean.valueOf(evaluateObjectObject(lhsBoolean, rhsBoolean, nav));
        } }else {__CLR4_0_618t18tl1l0dvfs.R.inc(1637);if ((((isBoolean(lhsValue) && isSet(rhsValue))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1638)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1639)==0&false))) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1640);Boolean lhsBoolean = (Boolean) lhsValue;
            __CLR4_0_618t18tl1l0dvfs.R.inc(1641);Boolean rhsBoolean = (((((List) rhsValue).isEmpty() )&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1642)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1643)==0&false))? Boolean.FALSE : Boolean.TRUE;
            __CLR4_0_618t18tl1l0dvfs.R.inc(1644);return Boolean.valueOf(evaluateObjectObject(lhsBoolean, rhsBoolean, nav));
        } }else {__CLR4_0_618t18tl1l0dvfs.R.inc(1645);if ((((eitherIsSet(lhsValue, rhsValue))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1646)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1647)==0&false))) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1648);if ((((isSet(lhsValue))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1649)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1650)==0&false))) {{
                __CLR4_0_618t18tl1l0dvfs.R.inc(1651);return evaluateSetSet((List) lhsValue, convertToList(rhsValue), nav);
            } }else {{
                __CLR4_0_618t18tl1l0dvfs.R.inc(1652);return evaluateSetSet(convertToList(lhsValue), (List) rhsValue, nav);
            }
        }} }else {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1653);return Boolean.valueOf(evaluateObjectObject(lhsValue, rhsValue, nav));
        }
    }}}}}finally{__CLR4_0_618t18tl1l0dvfs.R.flushNeeded();}}

    private Boolean evaluateSetSet(List lhsSet, List rhsSet, Navigator nav) {try{__CLR4_0_618t18tl1l0dvfs.R.inc(1654);
        /* If both objects to be compared are node-sets, then the comparison will be
         * true if and only if there is a node in the first node-set and a node in
         * the second node-set such that the result of performing the comparison on
         * the string-values of the two nodes is true */
        __CLR4_0_618t18tl1l0dvfs.R.inc(1655);if ((((setIsEmpty(lhsSet) || setIsEmpty(rhsSet))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1656)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1657)==0&false))) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1658);return Boolean.FALSE;
        }

        }__CLR4_0_618t18tl1l0dvfs.R.inc(1659);for (Iterator lhsIterator = lhsSet.iterator(); (((lhsIterator.hasNext())&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1660)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1661)==0&false)); ) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1662);Object lhs = lhsIterator.next();

            __CLR4_0_618t18tl1l0dvfs.R.inc(1663);for (Iterator rhsIterator = rhsSet.iterator(); (((rhsIterator.hasNext())&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1664)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1665)==0&false)); ) {{
                __CLR4_0_618t18tl1l0dvfs.R.inc(1666);Object rhs = rhsIterator.next();

                __CLR4_0_618t18tl1l0dvfs.R.inc(1667);if ((((evaluateObjectObject(lhs, rhs, nav))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1668)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1669)==0&false))) {{
                    __CLR4_0_618t18tl1l0dvfs.R.inc(1670);return Boolean.TRUE;
                }
            }}
        }}

        }__CLR4_0_618t18tl1l0dvfs.R.inc(1671);return Boolean.FALSE;
    }finally{__CLR4_0_618t18tl1l0dvfs.R.flushNeeded();}}

    private boolean evaluateObjectObject(Object lhs, Object rhs, Navigator nav) {try{__CLR4_0_618t18tl1l0dvfs.R.inc(1672);
        __CLR4_0_618t18tl1l0dvfs.R.inc(1673);if ((((eitherIsBoolean(lhs, rhs))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1674)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1675)==0&false))) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1676);return evaluateObjectObject(BooleanFunction.evaluate(lhs, nav),
                    BooleanFunction.evaluate(rhs, nav));
        } }else {__CLR4_0_618t18tl1l0dvfs.R.inc(1677);if ((((eitherIsNumber(lhs, rhs))&&(__CLR4_0_618t18tl1l0dvfs.R.iget(1678)!=0|true))||(__CLR4_0_618t18tl1l0dvfs.R.iget(1679)==0&false))) {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1680);return evaluateObjectObject(NumberFunction.evaluate(lhs,
                    nav),
                    NumberFunction.evaluate(rhs,
                            nav));
        } }else {{
            __CLR4_0_618t18tl1l0dvfs.R.inc(1681);return evaluateObjectObject(StringFunction.evaluate(lhs,
                    nav),
                    StringFunction.evaluate(rhs,
                            nav));
        }
    }}}finally{__CLR4_0_618t18tl1l0dvfs.R.flushNeeded();}}

    protected abstract boolean evaluateObjectObject(Object lhs, Object rhs);
}
