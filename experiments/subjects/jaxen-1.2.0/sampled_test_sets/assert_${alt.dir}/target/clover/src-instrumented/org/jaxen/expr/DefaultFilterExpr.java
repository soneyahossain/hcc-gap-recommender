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

import java.util.ArrayList;
import java.util.List;

/**
 * @deprecated this class will become non-public in the future;
 * use the interface instead
 */
public class DefaultFilterExpr extends DefaultExpr implements FilterExpr, Predicated {public static class __CLR4_0_61bm1bml1l0dvgk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,1776,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    private static final long serialVersionUID = -549640659288005735L;
    private Expr expr;
    private PredicateSet predicates;

    public DefaultFilterExpr(PredicateSet predicateSet) {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1714);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1715);this.predicates = predicateSet;
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public DefaultFilterExpr(Expr expr, PredicateSet predicateSet) {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1716);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1717);this.expr = expr;
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1718);this.predicates = predicateSet;
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public void addPredicate(Predicate predicate) {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1719);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1720);this.predicates.addPredicate(predicate);
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public List getPredicates() {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1721);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1722);return this.predicates.getPredicates();
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public PredicateSet getPredicateSet() {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1723);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1724);return this.predicates;
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public Expr getExpr() {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1725);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1726);return this.expr;
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1727);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1728);return "[(DefaultFilterExpr): expr: " + expr + " predicates: " + predicates + " ]";
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public String getText() {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1729);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1730);String text = "";
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1731);if ((((this.expr != null)&&(__CLR4_0_61bm1bml1l0dvgk.R.iget(1732)!=0|true))||(__CLR4_0_61bm1bml1l0dvgk.R.iget(1733)==0&false))) {{
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1734);text = this.expr.getText();
        }
        }__CLR4_0_61bm1bml1l0dvgk.R.inc(1735);text += predicates.getText();
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1736);return text;
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public Expr simplify() {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1737);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1738);this.predicates.simplify();

        __CLR4_0_61bm1bml1l0dvgk.R.inc(1739);if ((((this.expr != null)&&(__CLR4_0_61bm1bml1l0dvgk.R.iget(1740)!=0|true))||(__CLR4_0_61bm1bml1l0dvgk.R.iget(1741)==0&false))) {{
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1742);this.expr = this.expr.simplify();
        }

        }__CLR4_0_61bm1bml1l0dvgk.R.inc(1743);if ((((this.predicates.getPredicates().size() == 0)&&(__CLR4_0_61bm1bml1l0dvgk.R.iget(1744)!=0|true))||(__CLR4_0_61bm1bml1l0dvgk.R.iget(1745)==0&false))) {{
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1746);return getExpr();
        }

        }__CLR4_0_61bm1bml1l0dvgk.R.inc(1747);return this;
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    /**
     * Returns true if the current filter matches at least one of the context nodes
     */
    public boolean asBoolean(Context context) throws JaxenException {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1748);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1749);Object results = null;
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1750);if ((((expr != null)&&(__CLR4_0_61bm1bml1l0dvgk.R.iget(1751)!=0|true))||(__CLR4_0_61bm1bml1l0dvgk.R.iget(1752)==0&false))) {{
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1753);results = expr.evaluate(context);
        } }else {{
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1754);List nodeSet = context.getNodeSet();
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1755);ArrayList list = new ArrayList(nodeSet.size());
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1756);list.addAll(nodeSet);
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1757);results = list;
        }

        }__CLR4_0_61bm1bml1l0dvgk.R.inc(1758);if ((((results instanceof Boolean)&&(__CLR4_0_61bm1bml1l0dvgk.R.iget(1759)!=0|true))||(__CLR4_0_61bm1bml1l0dvgk.R.iget(1760)==0&false))) {{
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1761);Boolean b = (Boolean) results;
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1762);return b.booleanValue();
        }
        }__CLR4_0_61bm1bml1l0dvgk.R.inc(1763);if ((((results instanceof List)&&(__CLR4_0_61bm1bml1l0dvgk.R.iget(1764)!=0|true))||(__CLR4_0_61bm1bml1l0dvgk.R.iget(1765)==0&false))) {{
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1766);return getPredicateSet().evaluateAsBoolean(
                    (List) results, context.getContextSupport()
            );
        }

        }__CLR4_0_61bm1bml1l0dvgk.R.inc(1767);return false;
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

    public Object evaluate(Context context) throws JaxenException {try{__CLR4_0_61bm1bml1l0dvgk.R.inc(1768);
        __CLR4_0_61bm1bml1l0dvgk.R.inc(1769);Object results = getExpr().evaluate(context);

        __CLR4_0_61bm1bml1l0dvgk.R.inc(1770);if ((((results instanceof List)&&(__CLR4_0_61bm1bml1l0dvgk.R.iget(1771)!=0|true))||(__CLR4_0_61bm1bml1l0dvgk.R.iget(1772)==0&false))) {{
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1773);List newresults = getPredicateSet().evaluatePredicates((List) results,
                    context.getContextSupport());
            __CLR4_0_61bm1bml1l0dvgk.R.inc(1774);results = newresults;
        }

        }__CLR4_0_61bm1bml1l0dvgk.R.inc(1775);return results;
    }finally{__CLR4_0_61bm1bml1l0dvgk.R.flushNeeded();}}

}
