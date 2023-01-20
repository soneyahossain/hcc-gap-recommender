/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ *//*
 * $Header$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Copyright 2005 Elliotte Rusty Harold.
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

import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;

import java.util.Comparator;
import java.util.Iterator;


class NodeComparator implements Comparator {public static class __CLR4_0_623e23el1l0dvol{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,2818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Navigator navigator;


    NodeComparator(Navigator navigator) {try{__CLR4_0_623e23el1l0dvol.R.inc(2714);
        __CLR4_0_623e23el1l0dvol.R.inc(2715);this.navigator = navigator;
    }finally{__CLR4_0_623e23el1l0dvol.R.flushNeeded();}}

    public int compare(Object o1, Object o2) {try{__CLR4_0_623e23el1l0dvol.R.inc(2716);

        __CLR4_0_623e23el1l0dvol.R.inc(2717);if ((((o1 == o2)&&(__CLR4_0_623e23el1l0dvol.R.iget(2718)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2719)==0&false))) {__CLR4_0_623e23el1l0dvol.R.inc(2720);return 0;

        // treat all objects as equal
        }__CLR4_0_623e23el1l0dvol.R.inc(2721);if ((((navigator == null)&&(__CLR4_0_623e23el1l0dvol.R.iget(2722)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2723)==0&false))) {__CLR4_0_623e23el1l0dvol.R.inc(2724);return 0;

        }__CLR4_0_623e23el1l0dvol.R.inc(2725);if ((((isNonChild(o1) && isNonChild(o2))&&(__CLR4_0_623e23el1l0dvol.R.iget(2726)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2727)==0&false))) {{

            __CLR4_0_623e23el1l0dvol.R.inc(2728);try {
                __CLR4_0_623e23el1l0dvol.R.inc(2729);Object p1 = navigator.getParentNode(o1);
                __CLR4_0_623e23el1l0dvol.R.inc(2730);Object p2 = navigator.getParentNode(o2);

                __CLR4_0_623e23el1l0dvol.R.inc(2731);if ((((p1 == p2)&&(__CLR4_0_623e23el1l0dvol.R.iget(2732)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2733)==0&false))) {{
                    __CLR4_0_623e23el1l0dvol.R.inc(2734);if ((((navigator.isNamespace(o1) && navigator.isAttribute(o2))&&(__CLR4_0_623e23el1l0dvol.R.iget(2735)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2736)==0&false))) {{
                        __CLR4_0_623e23el1l0dvol.R.inc(2737);return -1;
                    } }else {__CLR4_0_623e23el1l0dvol.R.inc(2738);if ((((navigator.isNamespace(o2) && navigator.isAttribute(o1))&&(__CLR4_0_623e23el1l0dvol.R.iget(2739)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2740)==0&false))) {{
                        __CLR4_0_623e23el1l0dvol.R.inc(2741);return 1;
                    } }else {__CLR4_0_623e23el1l0dvol.R.inc(2742);if ((((navigator.isNamespace(o1))&&(__CLR4_0_623e23el1l0dvol.R.iget(2743)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2744)==0&false))) {{
                        __CLR4_0_623e23el1l0dvol.R.inc(2745);String prefix1 = navigator.getNamespacePrefix(o1);
                        __CLR4_0_623e23el1l0dvol.R.inc(2746);String prefix2 = navigator.getNamespacePrefix(o2);
                        __CLR4_0_623e23el1l0dvol.R.inc(2747);return prefix1.compareTo(prefix2);
                    } }else {__CLR4_0_623e23el1l0dvol.R.inc(2748);if ((((navigator.isAttribute(o1))&&(__CLR4_0_623e23el1l0dvol.R.iget(2749)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2750)==0&false))) {{
                        __CLR4_0_623e23el1l0dvol.R.inc(2751);String name1 = navigator.getAttributeQName(o1);
                        __CLR4_0_623e23el1l0dvol.R.inc(2752);String name2 = navigator.getAttributeQName(o2);
                        __CLR4_0_623e23el1l0dvol.R.inc(2753);return name1.compareTo(name2);
                    }
                }}}}}

                }__CLR4_0_623e23el1l0dvol.R.inc(2754);return compare(p1, p2);
            } catch (UnsupportedAxisException ex) {
                __CLR4_0_623e23el1l0dvol.R.inc(2755);return 0;
            }

        }

        }__CLR4_0_623e23el1l0dvol.R.inc(2756);try {
            __CLR4_0_623e23el1l0dvol.R.inc(2757);int depth1 = getDepth(o1);
            __CLR4_0_623e23el1l0dvol.R.inc(2758);int depth2 = getDepth(o2);

            __CLR4_0_623e23el1l0dvol.R.inc(2759);Object a1 = o1;
            __CLR4_0_623e23el1l0dvol.R.inc(2760);Object a2 = o2;

            __CLR4_0_623e23el1l0dvol.R.inc(2761);while ((((depth1 > depth2)&&(__CLR4_0_623e23el1l0dvol.R.iget(2762)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2763)==0&false))) {{
                __CLR4_0_623e23el1l0dvol.R.inc(2764);a1 = navigator.getParentNode(a1);
                __CLR4_0_623e23el1l0dvol.R.inc(2765);depth1--;
            }
            }__CLR4_0_623e23el1l0dvol.R.inc(2766);if ((((a1 == o2)&&(__CLR4_0_623e23el1l0dvol.R.iget(2767)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2768)==0&false))) {__CLR4_0_623e23el1l0dvol.R.inc(2769);return 1;

            }__CLR4_0_623e23el1l0dvol.R.inc(2770);while ((((depth2 > depth1)&&(__CLR4_0_623e23el1l0dvol.R.iget(2771)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2772)==0&false))) {{
                __CLR4_0_623e23el1l0dvol.R.inc(2773);a2 = navigator.getParentNode(a2);
                __CLR4_0_623e23el1l0dvol.R.inc(2774);depth2--;
            }
            }__CLR4_0_623e23el1l0dvol.R.inc(2775);if ((((a2 == o1)&&(__CLR4_0_623e23el1l0dvol.R.iget(2776)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2777)==0&false))) {__CLR4_0_623e23el1l0dvol.R.inc(2778);return -1;

            // a1 and a2 are now at same depth; and are not the same
            }__CLR4_0_623e23el1l0dvol.R.inc(2779);while (true) {{
                __CLR4_0_623e23el1l0dvol.R.inc(2780);Object p1 = navigator.getParentNode(a1);
                __CLR4_0_623e23el1l0dvol.R.inc(2781);Object p2 = navigator.getParentNode(a2);
                __CLR4_0_623e23el1l0dvol.R.inc(2782);if ((((p1 == p2)&&(__CLR4_0_623e23el1l0dvol.R.iget(2783)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2784)==0&false))) {{
                    __CLR4_0_623e23el1l0dvol.R.inc(2785);return compareSiblings(a1, a2);
                }
                }__CLR4_0_623e23el1l0dvol.R.inc(2786);a1 = p1;
                __CLR4_0_623e23el1l0dvol.R.inc(2787);a2 = p2;
            }

        }} catch (UnsupportedAxisException ex) {
            __CLR4_0_623e23el1l0dvol.R.inc(2788);return 0; // ???? should I throw an exception instead?
        }
    }finally{__CLR4_0_623e23el1l0dvol.R.flushNeeded();}}


    private boolean isNonChild(Object o) {try{__CLR4_0_623e23el1l0dvol.R.inc(2789);
        __CLR4_0_623e23el1l0dvol.R.inc(2790);return navigator.isAttribute(o) || navigator.isNamespace(o);
    }finally{__CLR4_0_623e23el1l0dvol.R.flushNeeded();}}

    private int compareSiblings(Object sib1, Object sib2)
            throws UnsupportedAxisException {try{__CLR4_0_623e23el1l0dvol.R.inc(2791);

        // attributes and namespaces sort before child nodes
        __CLR4_0_623e23el1l0dvol.R.inc(2792);if ((((isNonChild(sib1))&&(__CLR4_0_623e23el1l0dvol.R.iget(2793)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2794)==0&false))) {{
            __CLR4_0_623e23el1l0dvol.R.inc(2795);return 1;
        } }else {__CLR4_0_623e23el1l0dvol.R.inc(2796);if ((((isNonChild(sib2))&&(__CLR4_0_623e23el1l0dvol.R.iget(2797)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2798)==0&false))) {{
            __CLR4_0_623e23el1l0dvol.R.inc(2799);return -1;
        }

        }}__CLR4_0_623e23el1l0dvol.R.inc(2800);Iterator following = navigator.getFollowingSiblingAxisIterator(sib1);
        __CLR4_0_623e23el1l0dvol.R.inc(2801);while ((((following.hasNext())&&(__CLR4_0_623e23el1l0dvol.R.iget(2802)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2803)==0&false))) {{
            __CLR4_0_623e23el1l0dvol.R.inc(2804);Object next = following.next();
            __CLR4_0_623e23el1l0dvol.R.inc(2805);if ((((next.equals(sib2))&&(__CLR4_0_623e23el1l0dvol.R.iget(2806)!=0|true))||(__CLR4_0_623e23el1l0dvol.R.iget(2807)==0&false))) {__CLR4_0_623e23el1l0dvol.R.inc(2808);return -1;
        }}
        }__CLR4_0_623e23el1l0dvol.R.inc(2809);return 1;

    }finally{__CLR4_0_623e23el1l0dvol.R.flushNeeded();}}

    private int getDepth(Object o) throws UnsupportedAxisException {try{__CLR4_0_623e23el1l0dvol.R.inc(2810);

        __CLR4_0_623e23el1l0dvol.R.inc(2811);int depth = 0;
        __CLR4_0_623e23el1l0dvol.R.inc(2812);Object parent = o;

        __CLR4_0_623e23el1l0dvol.R.inc(2813);while ((parent = navigator.getParentNode(parent)) != null) {{
            __CLR4_0_623e23el1l0dvol.R.inc(2816);depth++;
        }
        }__CLR4_0_623e23el1l0dvol.R.inc(2817);return depth;

    }finally{__CLR4_0_623e23el1l0dvol.R.flushNeeded();}}

}
