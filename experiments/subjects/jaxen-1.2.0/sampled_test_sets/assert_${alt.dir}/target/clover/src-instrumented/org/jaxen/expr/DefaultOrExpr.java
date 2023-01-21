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

class DefaultOrExpr extends DefaultLogicalExpr {public static class __CLR4_0_61pz1pzl1l0dvkf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,2250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    private static final long serialVersionUID = 4894552680753026730L;

    DefaultOrExpr(Expr lhs,
                  Expr rhs) {
        super(lhs,
                rhs);__CLR4_0_61pz1pzl1l0dvkf.R.inc(2232);try{__CLR4_0_61pz1pzl1l0dvkf.R.inc(2231);
    }finally{__CLR4_0_61pz1pzl1l0dvkf.R.flushNeeded();}}

    public String getOperator() {try{__CLR4_0_61pz1pzl1l0dvkf.R.inc(2233);
        __CLR4_0_61pz1pzl1l0dvkf.R.inc(2234);return "or";
    }finally{__CLR4_0_61pz1pzl1l0dvkf.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_61pz1pzl1l0dvkf.R.inc(2235);
        __CLR4_0_61pz1pzl1l0dvkf.R.inc(2236);return "[(DefaultOrExpr): " + getLHS() + ", " + getRHS() + "]";
    }finally{__CLR4_0_61pz1pzl1l0dvkf.R.flushNeeded();}}

    public Object evaluate(Context context) throws JaxenException {try{__CLR4_0_61pz1pzl1l0dvkf.R.inc(2237);
        __CLR4_0_61pz1pzl1l0dvkf.R.inc(2238);Navigator nav = context.getNavigator();
        __CLR4_0_61pz1pzl1l0dvkf.R.inc(2239);Boolean lhsValue = BooleanFunction.evaluate(getLHS().evaluate(context), nav);

        __CLR4_0_61pz1pzl1l0dvkf.R.inc(2240);if ((((lhsValue.booleanValue())&&(__CLR4_0_61pz1pzl1l0dvkf.R.iget(2241)!=0|true))||(__CLR4_0_61pz1pzl1l0dvkf.R.iget(2242)==0&false))) {{
            __CLR4_0_61pz1pzl1l0dvkf.R.inc(2243);return Boolean.TRUE;
        }

        // Short circuits are required in XPath. "The right operand is not 
        // evaluated if the left operand evaluates to true."
        }__CLR4_0_61pz1pzl1l0dvkf.R.inc(2244);Boolean rhsValue = BooleanFunction.evaluate(getRHS().evaluate(context), nav);

        __CLR4_0_61pz1pzl1l0dvkf.R.inc(2245);if ((((rhsValue.booleanValue())&&(__CLR4_0_61pz1pzl1l0dvkf.R.iget(2246)!=0|true))||(__CLR4_0_61pz1pzl1l0dvkf.R.iget(2247)==0&false))) {{
            __CLR4_0_61pz1pzl1l0dvkf.R.inc(2248);return Boolean.TRUE;
        }

        }__CLR4_0_61pz1pzl1l0dvkf.R.inc(2249);return Boolean.FALSE;
    }finally{__CLR4_0_61pz1pzl1l0dvkf.R.flushNeeded();}}

}
