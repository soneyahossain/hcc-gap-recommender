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

import org.jaxen.ContextSupport;
import org.jaxen.Navigator;
import org.jaxen.expr.iter.IterableAxis;

/**
 * @deprecated this class will become non-public in the future;
 * use the interface instead
 */
public class DefaultProcessingInstructionNodeStep extends DefaultStep
        implements ProcessingInstructionNodeStep {public static class __CLR4_0_61sz1szl1l0dvl9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,2370,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    private static final long serialVersionUID = -4825000697808126927L;
    private String name;

    public DefaultProcessingInstructionNodeStep(IterableAxis axis,
                                                String name,
                                                PredicateSet predicateSet) {
        super(axis, predicateSet);__CLR4_0_61sz1szl1l0dvl9.R.inc(2340);try{__CLR4_0_61sz1szl1l0dvl9.R.inc(2339);

        __CLR4_0_61sz1szl1l0dvl9.R.inc(2341);this.name = name;
    }finally{__CLR4_0_61sz1szl1l0dvl9.R.flushNeeded();}}

    public String getName() {try{__CLR4_0_61sz1szl1l0dvl9.R.inc(2342);
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2343);return this.name;
    }finally{__CLR4_0_61sz1szl1l0dvl9.R.flushNeeded();}}

    public String getText() {try{__CLR4_0_61sz1szl1l0dvl9.R.inc(2344);
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2345);StringBuffer buf = new StringBuffer();
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2346);buf.append(getAxisName());
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2347);buf.append("::processing-instruction(");
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2348);String name = getName();
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2349);if ((((name != null && name.length() != 0)&&(__CLR4_0_61sz1szl1l0dvl9.R.iget(2350)!=0|true))||(__CLR4_0_61sz1szl1l0dvl9.R.iget(2351)==0&false))) {{
            __CLR4_0_61sz1szl1l0dvl9.R.inc(2352);buf.append("'");
            __CLR4_0_61sz1szl1l0dvl9.R.inc(2353);buf.append(name);
            __CLR4_0_61sz1szl1l0dvl9.R.inc(2354);buf.append("'");
        }
        }__CLR4_0_61sz1szl1l0dvl9.R.inc(2355);buf.append(")");
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2356);buf.append(super.getText());
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2357);return buf.toString();
    }finally{__CLR4_0_61sz1szl1l0dvl9.R.flushNeeded();}}

    public boolean matches(Object node,
                           ContextSupport support) {try{__CLR4_0_61sz1szl1l0dvl9.R.inc(2358);

        __CLR4_0_61sz1szl1l0dvl9.R.inc(2359);Navigator nav = support.getNavigator();
        __CLR4_0_61sz1szl1l0dvl9.R.inc(2360);if ((((nav.isProcessingInstruction(node))&&(__CLR4_0_61sz1szl1l0dvl9.R.iget(2361)!=0|true))||(__CLR4_0_61sz1szl1l0dvl9.R.iget(2362)==0&false))) {{
            __CLR4_0_61sz1szl1l0dvl9.R.inc(2363);String name = getName();
            __CLR4_0_61sz1szl1l0dvl9.R.inc(2364);if ((((name == null || name.length() == 0)&&(__CLR4_0_61sz1szl1l0dvl9.R.iget(2365)!=0|true))||(__CLR4_0_61sz1szl1l0dvl9.R.iget(2366)==0&false))) {{
                __CLR4_0_61sz1szl1l0dvl9.R.inc(2367);return true;
            } }else {{
                __CLR4_0_61sz1szl1l0dvl9.R.inc(2368);return name.equals(nav.getProcessingInstructionTarget(node));
            }
        }}

        }__CLR4_0_61sz1szl1l0dvl9.R.inc(2369);return false;

    }finally{__CLR4_0_61sz1szl1l0dvl9.R.flushNeeded();}}

}
