/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ *//*
 * $Header$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Copyright 2000-2004 bob mcwhirter & James Strachan.
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
import org.jaxen.Function;
import org.jaxen.JaxenException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @deprecated this class will become non-public in the future;
 * use the interface instead
 */
public class DefaultFunctionCallExpr extends DefaultExpr implements FunctionCallExpr {public static class __CLR4_0_61dc1dcl1l0dvgz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,1849,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    private static final long serialVersionUID = -4747789292572193708L;
    private String prefix;
    private String functionName;
    private List parameters;

    public DefaultFunctionCallExpr(String prefix, String functionName) {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1776);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1777);this.prefix = prefix;
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1778);this.functionName = functionName;
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1779);this.parameters = new ArrayList();
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}

    public void addParameter(Expr parameter) {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1780);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1781);this.parameters.add(parameter);
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}


    public List getParameters() {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1782);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1783);return this.parameters;
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}

    public String getPrefix() {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1784);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1785);return this.prefix;
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}

    public String getFunctionName() {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1786);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1787);return this.functionName;
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}


    public String getText() {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1788);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1789);StringBuffer buf = new StringBuffer();
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1790);String prefix = getPrefix();

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1791);if ((((prefix != null &&
                prefix.length() > 0)&&(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1792)!=0|true))||(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1793)==0&false))) {{
            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1794);buf.append(prefix);
            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1795);buf.append(":");
        }

        }__CLR4_0_61dc1dcl1l0dvgz.R.inc(1796);buf.append(getFunctionName());
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1797);buf.append("(");

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1798);Iterator paramIter = getParameters().iterator();

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1799);while ((((paramIter.hasNext())&&(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1800)!=0|true))||(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1801)==0&false))) {{
            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1802);Expr eachParam = (Expr) paramIter.next();

            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1803);buf.append(eachParam.getText());

            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1804);if ((((paramIter.hasNext())&&(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1805)!=0|true))||(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1806)==0&false))) {{
                __CLR4_0_61dc1dcl1l0dvgz.R.inc(1807);buf.append(", ");
            }
        }}

        }__CLR4_0_61dc1dcl1l0dvgz.R.inc(1808);buf.append(")");

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1809);return buf.toString();
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}

    public Expr simplify() {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1810);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1811);List paramExprs = getParameters();
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1812);int paramSize = paramExprs.size();

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1813);List newParams = new ArrayList(paramSize);

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1814);for (int i = 0; (((i < paramSize)&&(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1815)!=0|true))||(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1816)==0&false)); ++i) {{
            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1817);Expr eachParam = (Expr) paramExprs.get(i);

            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1818);newParams.add(eachParam.simplify());
        }

        }__CLR4_0_61dc1dcl1l0dvgz.R.inc(1819);this.parameters = newParams;

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1820);return this;
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}


    public String toString() {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1821);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1822);String prefix = getPrefix();

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1823);if ((((prefix == null)&&(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1824)!=0|true))||(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1825)==0&false))) {{
            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1826);return "[(DefaultFunctionCallExpr): " + getFunctionName() + "(" + getParameters() + ") ]";
        }

        }__CLR4_0_61dc1dcl1l0dvgz.R.inc(1827);return "[(DefaultFunctionCallExpr): " + getPrefix() + ":" + getFunctionName() + "(" + getParameters() + ") ]";
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}

    public Object evaluate(Context context) throws JaxenException {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1828);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1829);String prefix = getPrefix();
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1830);String namespaceURI = null;
        // default namespace is not used within XPath expressions
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1831);if ((((prefix != null && !"".equals(prefix))&&(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1832)!=0|true))||(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1833)==0&false))) {{
            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1834);namespaceURI = context.translateNamespacePrefixToUri(prefix);
        }

        }__CLR4_0_61dc1dcl1l0dvgz.R.inc(1835);Function func = context.getFunction(namespaceURI,
                prefix,
                getFunctionName());
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1836);List paramValues = evaluateParams(context);

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1837);return func.call(context, paramValues);
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}

    public List evaluateParams(Context context) throws JaxenException {try{__CLR4_0_61dc1dcl1l0dvgz.R.inc(1838);
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1839);List paramExprs = getParameters();
        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1840);int paramSize = paramExprs.size();

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1841);List paramValues = new ArrayList(paramSize);

        __CLR4_0_61dc1dcl1l0dvgz.R.inc(1842);for (int i = 0; (((i < paramSize)&&(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1843)!=0|true))||(__CLR4_0_61dc1dcl1l0dvgz.R.iget(1844)==0&false)); ++i) {{
            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1845);Expr eachParam = (Expr) paramExprs.get(i);

            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1846);Object eachValue = eachParam.evaluate(context);

            __CLR4_0_61dc1dcl1l0dvgz.R.inc(1847);paramValues.add(eachValue);
        }
        }__CLR4_0_61dc1dcl1l0dvgz.R.inc(1848);return paramValues;
    }finally{__CLR4_0_61dc1dcl1l0dvgz.R.flushNeeded();}}

}

