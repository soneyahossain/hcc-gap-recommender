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
import org.jaxen.Navigator;

/**
 * <p><code>NamespaceTest</code> tests for a given namespace URI.</p>
 *
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @version $Revision$
 * @deprecated will be removed in Jaxen 2.0
 */
public class NamespaceTest extends NodeTest {static class __CLR4_0_63mm3mml1l0dw32{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4740,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The prefix to match against
     */
    private String prefix;

    /**
     * The type of node to match - either attribute or element
     */
    private short nodeType;

    public NamespaceTest(String prefix, short nodeType) {try{__CLR4_0_63mm3mml1l0dw32.R.inc(4702);
        __CLR4_0_63mm3mml1l0dw32.R.inc(4703);if ((((prefix == null)&&(__CLR4_0_63mm3mml1l0dw32.R.iget(4704)!=0|true))||(__CLR4_0_63mm3mml1l0dw32.R.iget(4705)==0&false))) {{
            __CLR4_0_63mm3mml1l0dw32.R.inc(4706);prefix = "";
        }
        }__CLR4_0_63mm3mml1l0dw32.R.inc(4707);this.prefix = prefix;
        __CLR4_0_63mm3mml1l0dw32.R.inc(4708);this.nodeType = nodeType;
    }finally{__CLR4_0_63mm3mml1l0dw32.R.flushNeeded();}}

    /**
     * @return true if the pattern matches the given node
     */
    public boolean matches(Object node, Context context) {try{__CLR4_0_63mm3mml1l0dw32.R.inc(4709);
        __CLR4_0_63mm3mml1l0dw32.R.inc(4710);Navigator navigator = context.getNavigator();
        __CLR4_0_63mm3mml1l0dw32.R.inc(4711);String uri = getURI(node, context);

        __CLR4_0_63mm3mml1l0dw32.R.inc(4712);if ((((nodeType == Pattern.ELEMENT_NODE)&&(__CLR4_0_63mm3mml1l0dw32.R.iget(4713)!=0|true))||(__CLR4_0_63mm3mml1l0dw32.R.iget(4714)==0&false))) {{
            __CLR4_0_63mm3mml1l0dw32.R.inc(4715);return navigator.isElement(node)
                    && uri.equals(navigator.getElementNamespaceUri(node));
        } }else {__CLR4_0_63mm3mml1l0dw32.R.inc(4716);if ((((nodeType == Pattern.ATTRIBUTE_NODE)&&(__CLR4_0_63mm3mml1l0dw32.R.iget(4717)!=0|true))||(__CLR4_0_63mm3mml1l0dw32.R.iget(4718)==0&false))) {{
            __CLR4_0_63mm3mml1l0dw32.R.inc(4719);return navigator.isAttribute(node)
                    && uri.equals(navigator.getAttributeNamespaceUri(node));
        }
        }}__CLR4_0_63mm3mml1l0dw32.R.inc(4720);return false;
    }finally{__CLR4_0_63mm3mml1l0dw32.R.flushNeeded();}}

    public double getPriority() {try{__CLR4_0_63mm3mml1l0dw32.R.inc(4721);
        __CLR4_0_63mm3mml1l0dw32.R.inc(4722);return -0.25;
    }finally{__CLR4_0_63mm3mml1l0dw32.R.flushNeeded();}}


    public short getMatchType() {try{__CLR4_0_63mm3mml1l0dw32.R.inc(4723);
        __CLR4_0_63mm3mml1l0dw32.R.inc(4724);return nodeType;
    }finally{__CLR4_0_63mm3mml1l0dw32.R.flushNeeded();}}

    public String getText() {try{__CLR4_0_63mm3mml1l0dw32.R.inc(4725);
        __CLR4_0_63mm3mml1l0dw32.R.inc(4726);return prefix + ":";
    }finally{__CLR4_0_63mm3mml1l0dw32.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_63mm3mml1l0dw32.R.inc(4727);
        __CLR4_0_63mm3mml1l0dw32.R.inc(4728);return super.toString() + "[ prefix: " + prefix + " type: " + nodeType + " ]";
    }finally{__CLR4_0_63mm3mml1l0dw32.R.flushNeeded();}}

    /**
     * Returns the URI of the current prefix or "" if no URI can be found
     */
    protected String getURI(Object node, Context context) {try{__CLR4_0_63mm3mml1l0dw32.R.inc(4729);
        __CLR4_0_63mm3mml1l0dw32.R.inc(4730);String uri = context.getNavigator().translateNamespacePrefixToUri(prefix, node);
        __CLR4_0_63mm3mml1l0dw32.R.inc(4731);if ((((uri == null)&&(__CLR4_0_63mm3mml1l0dw32.R.iget(4732)!=0|true))||(__CLR4_0_63mm3mml1l0dw32.R.iget(4733)==0&false))) {{
            __CLR4_0_63mm3mml1l0dw32.R.inc(4734);uri = context.getContextSupport().translateNamespacePrefixToUri(prefix);
        }
        }__CLR4_0_63mm3mml1l0dw32.R.inc(4735);if ((((uri == null)&&(__CLR4_0_63mm3mml1l0dw32.R.iget(4736)!=0|true))||(__CLR4_0_63mm3mml1l0dw32.R.iget(4737)==0&false))) {{
            __CLR4_0_63mm3mml1l0dw32.R.inc(4738);uri = "";
        }
        }__CLR4_0_63mm3mml1l0dw32.R.inc(4739);return uri;
    }finally{__CLR4_0_63mm3mml1l0dw32.R.flushNeeded();}}
}
