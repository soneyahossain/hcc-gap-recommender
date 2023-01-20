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

import java.util.*;

abstract class DefaultLocationPath extends DefaultExpr implements LocationPath {public static class __CLR4_0_61gf1gfl1l0dvi6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,1952,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private List steps;

    /**
     * Create a new empty location path.
     */
    DefaultLocationPath() {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1887);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1888);this.steps = new LinkedList();
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

    public void addStep(Step step) {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1889);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1890);getSteps().add(step);
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

    public List getSteps() {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1891);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1892);return this.steps;
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

    public Expr simplify() {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1893);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1894);Iterator stepIter = getSteps().iterator();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1895);Step eachStep = null;
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1896);while ((((stepIter.hasNext())&&(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1897)!=0|true))||(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1898)==0&false))) {{
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1899);eachStep = (Step) stepIter.next();
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1900);eachStep.simplify();
        }
        }__CLR4_0_61gf1gfl1l0dvi6.R.inc(1901);return this;
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

    public String getText() {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1902);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1903);StringBuffer buf = new StringBuffer();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1904);Iterator stepIter = getSteps().iterator();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1905);while ((((stepIter.hasNext())&&(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1906)!=0|true))||(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1907)==0&false))) {{
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1908);buf.append(((Step) stepIter.next()).getText());
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1909);if ((((stepIter.hasNext())&&(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1910)!=0|true))||(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1911)==0&false))) {{
                __CLR4_0_61gf1gfl1l0dvi6.R.inc(1912);buf.append("/");
            }
        }}
        }__CLR4_0_61gf1gfl1l0dvi6.R.inc(1913);return buf.toString();
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1914);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1915);StringBuffer buf = new StringBuffer();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1916);Iterator stepIter = getSteps().iterator();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1917);while ((((stepIter.hasNext())&&(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1918)!=0|true))||(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1919)==0&false))) {{
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1920);buf.append(stepIter.next().toString());
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1921);if ((((stepIter.hasNext())&&(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1922)!=0|true))||(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1923)==0&false))) {{
                __CLR4_0_61gf1gfl1l0dvi6.R.inc(1924);buf.append("/");
            }
        }}
        }__CLR4_0_61gf1gfl1l0dvi6.R.inc(1925);return buf.toString();
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

    public boolean isAbsolute() {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1926);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1927);return false;
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

    public Object evaluate(Context context) throws JaxenException {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1928);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1929);List nodeSet = context.getNodeSet();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1930);List contextNodeSet = new ArrayList(nodeSet);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1931);ContextSupport support = context.getContextSupport();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1932);Context stepContext = new Context(support);
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1933);Iterator stepIter = getSteps().iterator();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1934);while ((((stepIter.hasNext())&&(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1935)!=0|true))||(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1936)==0&false))) {{
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1937);Step eachStep = (Step) stepIter.next();
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1938);stepContext.setNodeSet(contextNodeSet);
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1939);contextNodeSet = eachStep.evaluate(stepContext);
            // now we need to reverse the list if this is a reverse axis
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1940);if ((((isReverseAxis(eachStep))&&(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1941)!=0|true))||(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1942)==0&false))) {{
                __CLR4_0_61gf1gfl1l0dvi6.R.inc(1943);Collections.reverse(contextNodeSet);
            }
        }}

        }__CLR4_0_61gf1gfl1l0dvi6.R.inc(1944);if ((((getSteps().size() > 1 || nodeSet.size() > 1)&&(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1945)!=0|true))||(__CLR4_0_61gf1gfl1l0dvi6.R.iget(1946)==0&false))) {{
            __CLR4_0_61gf1gfl1l0dvi6.R.inc(1947);Collections.sort(contextNodeSet, new NodeComparator(support.getNavigator()));
        }

        }__CLR4_0_61gf1gfl1l0dvi6.R.inc(1948);return contextNodeSet;
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

    private boolean isReverseAxis(Step step) {try{__CLR4_0_61gf1gfl1l0dvi6.R.inc(1949);

        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1950);int axis = step.getAxis();
        __CLR4_0_61gf1gfl1l0dvi6.R.inc(1951);return axis == org.jaxen.saxpath.Axis.PRECEDING
                || axis == org.jaxen.saxpath.Axis.PRECEDING_SIBLING
                || axis == org.jaxen.saxpath.Axis.ANCESTOR
                || axis == org.jaxen.saxpath.Axis.ANCESTOR_OR_SELF;
    }finally{__CLR4_0_61gf1gfl1l0dvi6.R.flushNeeded();}}

}

