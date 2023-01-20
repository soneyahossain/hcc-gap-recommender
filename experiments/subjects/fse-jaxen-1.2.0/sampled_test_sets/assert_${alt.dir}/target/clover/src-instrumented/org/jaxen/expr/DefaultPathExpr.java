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
import org.jaxen.JaxenException;


class DefaultPathExpr extends DefaultExpr implements PathExpr {public static class __CLR4_0_61qi1qil1l0dvkn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,2316,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -6593934674727004281L;
    private Expr filterExpr;
    private LocationPath locationPath;

    DefaultPathExpr(Expr filterExpr,
                    LocationPath locationPath) {try{__CLR4_0_61qi1qil1l0dvkn.R.inc(2250);
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2251);this.filterExpr = filterExpr;
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2252);this.locationPath = locationPath;
    }finally{__CLR4_0_61qi1qil1l0dvkn.R.flushNeeded();}}

    public Expr getFilterExpr() {try{__CLR4_0_61qi1qil1l0dvkn.R.inc(2253);
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2254);return this.filterExpr;
    }finally{__CLR4_0_61qi1qil1l0dvkn.R.flushNeeded();}}


    public void setFilterExpr(Expr filterExpr) {try{__CLR4_0_61qi1qil1l0dvkn.R.inc(2255);
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2256);this.filterExpr = filterExpr;
    }finally{__CLR4_0_61qi1qil1l0dvkn.R.flushNeeded();}}


    public LocationPath getLocationPath() {try{__CLR4_0_61qi1qil1l0dvkn.R.inc(2257);
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2258);return this.locationPath;
    }finally{__CLR4_0_61qi1qil1l0dvkn.R.flushNeeded();}}


    public String toString() {try{__CLR4_0_61qi1qil1l0dvkn.R.inc(2259);
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2260);if ((((getLocationPath() != null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2261)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2262)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2263);return "[(DefaultPathExpr): " + getFilterExpr() + ", " + getLocationPath() + "]";
        }

        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2264);return "[(DefaultPathExpr): " + getFilterExpr() + "]";
    }finally{__CLR4_0_61qi1qil1l0dvkn.R.flushNeeded();}}


    public String getText() {try{__CLR4_0_61qi1qil1l0dvkn.R.inc(2265);
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2266);StringBuffer buf = new StringBuffer();

        __CLR4_0_61qi1qil1l0dvkn.R.inc(2267);if ((((getFilterExpr() != null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2268)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2269)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2270);buf.append(getFilterExpr().getText());
        }

        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2271);if ((((getLocationPath() != null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2272)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2273)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2274);if ((((!getLocationPath().getSteps().isEmpty())&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2275)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2276)==0&false))) {__CLR4_0_61qi1qil1l0dvkn.R.inc(2277);buf.append("/");
            }__CLR4_0_61qi1qil1l0dvkn.R.inc(2278);buf.append(getLocationPath().getText());
        }

        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2279);return buf.toString();
    }finally{__CLR4_0_61qi1qil1l0dvkn.R.flushNeeded();}}


    public Expr simplify() {try{__CLR4_0_61qi1qil1l0dvkn.R.inc(2280);
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2281);if ((((getFilterExpr() != null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2282)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2283)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2284);setFilterExpr(getFilterExpr().simplify());
        }

        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2285);if ((((getLocationPath() != null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2286)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2287)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2288);getLocationPath().simplify();
        }

        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2289);if ((((getFilterExpr() == null && getLocationPath() == null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2290)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2291)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2292);return null;
        }


        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2293);if ((((getLocationPath() == null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2294)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2295)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2296);return getFilterExpr();
        }

        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2297);if ((((getFilterExpr() == null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2298)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2299)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2300);return getLocationPath();
        }

        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2301);return this;
    }finally{__CLR4_0_61qi1qil1l0dvkn.R.flushNeeded();}}

    public Object evaluate(Context context) throws JaxenException {try{__CLR4_0_61qi1qil1l0dvkn.R.inc(2302);
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2303);Object results = null;
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2304);Context pathContext = null;
        __CLR4_0_61qi1qil1l0dvkn.R.inc(2305);if ((((getFilterExpr() != null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2306)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2307)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2308);results = getFilterExpr().evaluate(context);
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2309);pathContext = new Context(context.getContextSupport());
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2310);pathContext.setNodeSet(convertToList(results));
        }
        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2311);if ((((getLocationPath() != null)&&(__CLR4_0_61qi1qil1l0dvkn.R.iget(2312)!=0|true))||(__CLR4_0_61qi1qil1l0dvkn.R.iget(2313)==0&false))) {{
            __CLR4_0_61qi1qil1l0dvkn.R.inc(2314);return getLocationPath().evaluate(pathContext);
        }
        }__CLR4_0_61qi1qil1l0dvkn.R.inc(2315);return results;
    }finally{__CLR4_0_61qi1qil1l0dvkn.R.flushNeeded();}}

}

