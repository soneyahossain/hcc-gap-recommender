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


package org.jaxen.saxpath;

import org.jaxen.JaxenRuntimeException;


/**
 * Internal SAXPath class that contains constants representing
 * XPath operators to avoid a lot of string comparisons.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Axis {public static class __CLR4_0_63xw3xwl1l0dw55{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,5192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Marker for an invalid axis
     */
    public final static int INVALID_AXIS = 0;

    // XXX Ultimately these should use the type-safe enum pattern instead
    /**
     * The <code>child</code> axis
     */
    public final static int CHILD = 1;
    /**
     * The <code>descendant</code> axis
     */
    public final static int DESCENDANT = 2;
    /**
     * The <code>parent</code> axis
     */
    public final static int PARENT = 3;
    /**
     * The <code>ancestor</code> axis
     */
    public final static int ANCESTOR = 4;
    /**
     * The <code>following-sibling</code> axis
     */
    public final static int FOLLOWING_SIBLING = 5;
    /**
     * The <code>preceding-sibling</code> axis
     */
    public final static int PRECEDING_SIBLING = 6;
    /**
     * The <code>following</code> axis
     */
    public final static int FOLLOWING = 7;
    /**
     * The <code>preceding</code> axis
     */
    public final static int PRECEDING = 8;
    /**
     * The <code>attribute</code> axis
     */
    public final static int ATTRIBUTE = 9;
    /**
     * The <code>namespace</code> axis
     */
    public final static int NAMESPACE = 10;
    /**
     * The <code>self</code> axis
     */
    public final static int SELF = 11;
    /**
     * The <code>descendant-or-self</code> axis
     */
    public final static int DESCENDANT_OR_SELF = 12;
    /**
     * The <code>ancestor-or-self</code> axis
     */
    public final static int ANCESTOR_OR_SELF = 13;

    private Axis() {try{__CLR4_0_63xw3xwl1l0dw55.R.inc(5108);
    }finally{__CLR4_0_63xw3xwl1l0dw55.R.flushNeeded();}}

    /**
     * <p>
     * Returns the name of the axis.
     * </p>
     *
     * @param axisNum the axis code
     * @return the name of the axis such as might be used in an XPath expression
     * @throws JaxenRuntimeException if the number does not represent one of the 13
     *                               XPath axes
     */
    public static String lookup(int axisNum) {try{__CLR4_0_63xw3xwl1l0dw55.R.inc(5109);
        boolean __CLB4_0_6_bool0=false;__CLR4_0_63xw3xwl1l0dw55.R.inc(5110);switch (axisNum) {
            case CHILD:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5111);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5112);return "child";

            case DESCENDANT:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5113);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5114);return "descendant";

            case PARENT:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5115);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5116);return "parent";

            case ANCESTOR:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5117);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5118);return "ancestor";

            case FOLLOWING_SIBLING:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5119);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5120);return "following-sibling";

            case PRECEDING_SIBLING:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5121);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5122);return "preceding-sibling";

            case FOLLOWING:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5123);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5124);return "following";

            case PRECEDING:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5125);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5126);return "preceding";

            case ATTRIBUTE:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5127);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5128);return "attribute";

            case NAMESPACE:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5129);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5130);return "namespace";

            case SELF:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5131);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5132);return "self";

            case DESCENDANT_OR_SELF:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5133);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5134);return "descendant-or-self";

            case ANCESTOR_OR_SELF:if (!__CLB4_0_6_bool0) {__CLR4_0_63xw3xwl1l0dw55.R.inc(5135);__CLB4_0_6_bool0=true;}
                __CLR4_0_63xw3xwl1l0dw55.R.inc(5136);return "ancestor-or-self";
        }

        __CLR4_0_63xw3xwl1l0dw55.R.inc(5137);throw new JaxenRuntimeException("Illegal Axis Number");
    }finally{__CLR4_0_63xw3xwl1l0dw55.R.flushNeeded();}}

    /**
     * <p>
     * Returns the code for an axis given its name.
     * </p>
     *
     * @param axisName the name of the axis: child, parent, descendant, descendant-or-self, etc.
     * @return the axis code
     */
    public static int lookup(String axisName) {try{__CLR4_0_63xw3xwl1l0dw55.R.inc(5138);

        // XXX All these equals calls are a small HotSpot;
        // Need to replace this with a static HashMap
        __CLR4_0_63xw3xwl1l0dw55.R.inc(5139);if (((("child".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5140)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5141)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5142);return CHILD;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5143);if (((("descendant".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5144)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5145)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5146);return DESCENDANT;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5147);if (((("parent".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5148)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5149)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5150);return PARENT;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5151);if (((("ancestor".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5152)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5153)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5154);return ANCESTOR;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5155);if (((("following-sibling".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5156)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5157)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5158);return FOLLOWING_SIBLING;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5159);if (((("preceding-sibling".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5160)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5161)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5162);return PRECEDING_SIBLING;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5163);if (((("following".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5164)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5165)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5166);return FOLLOWING;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5167);if (((("preceding".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5168)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5169)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5170);return PRECEDING;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5171);if (((("attribute".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5172)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5173)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5174);return ATTRIBUTE;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5175);if (((("namespace".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5176)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5177)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5178);return NAMESPACE;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5179);if (((("self".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5180)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5181)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5182);return SELF;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5183);if (((("descendant-or-self".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5184)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5185)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5186);return DESCENDANT_OR_SELF;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5187);if (((("ancestor-or-self".equals(axisName))&&(__CLR4_0_63xw3xwl1l0dw55.R.iget(5188)!=0|true))||(__CLR4_0_63xw3xwl1l0dw55.R.iget(5189)==0&false))) {{
            __CLR4_0_63xw3xwl1l0dw55.R.inc(5190);return ANCESTOR_OR_SELF;
        }

        }__CLR4_0_63xw3xwl1l0dw55.R.inc(5191);return INVALID_AXIS;
    }finally{__CLR4_0_63xw3xwl1l0dw55.R.flushNeeded();}}
}
