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

package org.jaxen.pattern;

import org.jaxen.Context;

/**
 * <p><code>NodeTypeTest</code> matches if the node is of a certain type
 * such as element, attribute, comment, text, processing instruction and so forth.</p>
 *
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @version $Revision$
 * @deprecated will be removed in Jaxen 2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class NodeTypeTest extends NodeTest {static class __CLR4_0_63nz3nzl1l0dw3f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final NodeTypeTest DOCUMENT_TEST
            = new NodeTypeTest(DOCUMENT_NODE);

    public static final NodeTypeTest ELEMENT_TEST
            = new NodeTypeTest(ELEMENT_NODE);

    public static final NodeTypeTest ATTRIBUTE_TEST
            = new NodeTypeTest(ATTRIBUTE_NODE);

    public static final NodeTypeTest COMMENT_TEST
            = new NodeTypeTest(COMMENT_NODE);

    public static final NodeTypeTest TEXT_TEST
            = new NodeTypeTest(TEXT_NODE);

    public static final NodeTypeTest PROCESSING_INSTRUCTION_TEST
            = new NodeTypeTest(PROCESSING_INSTRUCTION_NODE);

    public static final NodeTypeTest NAMESPACE_TEST
            = new NodeTypeTest(NAMESPACE_NODE);


    private short nodeType;

    public NodeTypeTest(short nodeType) {try{__CLR4_0_63nz3nzl1l0dw3f.R.inc(4751);
        __CLR4_0_63nz3nzl1l0dw3f.R.inc(4752);this.nodeType = nodeType;
    }finally{__CLR4_0_63nz3nzl1l0dw3f.R.flushNeeded();}}

    /**
     * @return true if the pattern matches the given node
     */
    public boolean matches(Object node, Context context) {try{__CLR4_0_63nz3nzl1l0dw3f.R.inc(4753);
        __CLR4_0_63nz3nzl1l0dw3f.R.inc(4754);return nodeType == context.getNavigator().getNodeType(node);
    }finally{__CLR4_0_63nz3nzl1l0dw3f.R.flushNeeded();}}

    public double getPriority() {try{__CLR4_0_63nz3nzl1l0dw3f.R.inc(4755);
        __CLR4_0_63nz3nzl1l0dw3f.R.inc(4756);return -0.5;
    }finally{__CLR4_0_63nz3nzl1l0dw3f.R.flushNeeded();}}


    public short getMatchType() {try{__CLR4_0_63nz3nzl1l0dw3f.R.inc(4757);
        __CLR4_0_63nz3nzl1l0dw3f.R.inc(4758);return nodeType;
    }finally{__CLR4_0_63nz3nzl1l0dw3f.R.flushNeeded();}}

    public String getText() {try{__CLR4_0_63nz3nzl1l0dw3f.R.inc(4759);
        boolean __CLB4_0_6_bool0=false;__CLR4_0_63nz3nzl1l0dw3f.R.inc(4760);switch (nodeType) {
            case ELEMENT_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_63nz3nzl1l0dw3f.R.inc(4761);__CLB4_0_6_bool0=true;}
                __CLR4_0_63nz3nzl1l0dw3f.R.inc(4762);return "child()";
            case ATTRIBUTE_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_63nz3nzl1l0dw3f.R.inc(4763);__CLB4_0_6_bool0=true;}
                __CLR4_0_63nz3nzl1l0dw3f.R.inc(4764);return "@*";
            case NAMESPACE_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_63nz3nzl1l0dw3f.R.inc(4765);__CLB4_0_6_bool0=true;}
                __CLR4_0_63nz3nzl1l0dw3f.R.inc(4766);return "namespace()";
            case DOCUMENT_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_63nz3nzl1l0dw3f.R.inc(4767);__CLB4_0_6_bool0=true;}
                __CLR4_0_63nz3nzl1l0dw3f.R.inc(4768);return "/";
            case COMMENT_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_63nz3nzl1l0dw3f.R.inc(4769);__CLB4_0_6_bool0=true;}
                __CLR4_0_63nz3nzl1l0dw3f.R.inc(4770);return "comment()";
            case TEXT_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_63nz3nzl1l0dw3f.R.inc(4771);__CLB4_0_6_bool0=true;}
                __CLR4_0_63nz3nzl1l0dw3f.R.inc(4772);return "text()";
            case PROCESSING_INSTRUCTION_NODE:if (!__CLB4_0_6_bool0) {__CLR4_0_63nz3nzl1l0dw3f.R.inc(4773);__CLB4_0_6_bool0=true;}
                __CLR4_0_63nz3nzl1l0dw3f.R.inc(4774);return "processing-instruction()";
        }
        __CLR4_0_63nz3nzl1l0dw3f.R.inc(4775);return "";
    }finally{__CLR4_0_63nz3nzl1l0dw3f.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_63nz3nzl1l0dw3f.R.inc(4776);
        __CLR4_0_63nz3nzl1l0dw3f.R.inc(4777);return super.toString() + "[ type: " + nodeType + " ]";
    }finally{__CLR4_0_63nz3nzl1l0dw3f.R.flushNeeded();}}
}
