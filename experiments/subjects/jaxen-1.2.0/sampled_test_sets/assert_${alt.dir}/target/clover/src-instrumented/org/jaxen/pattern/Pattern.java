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
import org.jaxen.JaxenException;

/**
 * <p><code>Pattern</code> defines the behaviour for pattern in
 * the XSLT processing model.</p>
 *
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @version $Revision$
 * @deprecated will be removed in Jaxen 2.0
 */
public abstract class Pattern {public static class __CLR4_0_63oq3oql1l0dw3n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4788,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // These node numbers are compatible with both DOM and dom4j's node types
    /**
     * Matches Element nodes
     */
    public static final short ELEMENT_NODE = 1;
    /**
     * Matches attribute nodes
     */
    public static final short ATTRIBUTE_NODE = 2;
    /**
     * Matches text nodes
     */
    public static final short TEXT_NODE = 3;
    /**
     * Matches CDATA section nodes
     */
    public static final short CDATA_SECTION_NODE = 4;
    /**
     * Matches entity reference nodes
     */
    public static final short ENTITY_REFERENCE_NODE = 5;
    /** Matches entity nodes */
    //public static final short ENTITY_NODE = 6;
    /**
     * Matches ProcessingInstruction
     */
    public static final short PROCESSING_INSTRUCTION_NODE = 7;
    /**
     * Matches comment nodes
     */
    public static final short COMMENT_NODE = 8;
    /**
     * Matches document nodes
     */
    public static final short DOCUMENT_NODE = 9;
    /**
     * Matches DocumentType nodes
     */
    public static final short DOCUMENT_TYPE_NODE = 10;
    //public static final short DOCUMENT_FRAGMENT_NODE = 11;
    //public static final short NOTATION_NODE = 12;

    /**
     * Matches a Namespace Node
     */
    // This has the same value as the DOM Level 3 XPathNamespace type
    public static final short NAMESPACE_NODE = 13;

    /**
     * Does not match any valid node
     */
    public static final short UNKNOWN_NODE = 14;

    /**
     * The maximum number of node types for sizing purposes
     */
    public static final short MAX_NODE_TYPE = 14;

    /**
     * Matches any node
     */
    public static final short ANY_NODE = 0;

    /**
     * Matches no nodes
     */
    public static final short NO_NODE = 14;


    /**
     * @param node    ????
     * @param context ????
     * @return true if the pattern matches the given node
     * @throws JaxenException if ????
     */
    public abstract boolean matches(Object node, Context context) throws JaxenException;

    /**
     * Returns the default resolution policy of the pattern according to the
     * <a href="https://www.w3.org/TR/xslt#conflict">
     * XSLT conflict resolution rules</a>.
     *
     * @return 0.5; the default priority defined in XSLT
     * @see <a href="https://www.w3.org/TR/xslt#conflict" target="_top">Section 5.5 of the XSLT specification</a>
     */
    public double getPriority() {try{__CLR4_0_63oq3oql1l0dw3n.R.inc(4778);
        __CLR4_0_63oq3oql1l0dw3n.R.inc(4779);return 0.5;
    }finally{__CLR4_0_63oq3oql1l0dw3n.R.flushNeeded();}}

    /**
     * If this pattern is a union pattern then this
     * method should return an array of patterns which
     * describe the union pattern, which should contain more than one pattern.
     * Otherwise this method should return null.
     *
     * @return an array of the patterns which make up this union pattern
     * or null if this pattern is not a union pattern
     */
    public Pattern[] getUnionPatterns() {try{__CLR4_0_63oq3oql1l0dw3n.R.inc(4780);
        __CLR4_0_63oq3oql1l0dw3n.R.inc(4781);return null;
    }finally{__CLR4_0_63oq3oql1l0dw3n.R.flushNeeded();}}


    /**
     * Returns the type of node the pattern matches.
     *
     * @return <code>ANY_NODE</code> unless overridden
     */
    public short getMatchType() {try{__CLR4_0_63oq3oql1l0dw3n.R.inc(4782);
        __CLR4_0_63oq3oql1l0dw3n.R.inc(4783);return ANY_NODE;
    }finally{__CLR4_0_63oq3oql1l0dw3n.R.flushNeeded();}}


    /**
     * For patterns which only match an ATTRIBUTE_NODE or an
     * ELEMENT_NODE then this pattern may return the name of the
     * element or attribute it matches. This allows a more efficient
     * rule matching algorithm to be performed, rather than a brute
     * force approach of evaluating every pattern for a given Node.
     *
     * @return the name of the element or attribute this pattern matches
     * or null if this pattern matches any or more than one name
     */
    public String getMatchesNodeName() {try{__CLR4_0_63oq3oql1l0dw3n.R.inc(4784);
        __CLR4_0_63oq3oql1l0dw3n.R.inc(4785);return null;
    }finally{__CLR4_0_63oq3oql1l0dw3n.R.flushNeeded();}}


    public Pattern simplify() {try{__CLR4_0_63oq3oql1l0dw3n.R.inc(4786);
        __CLR4_0_63oq3oql1l0dw3n.R.inc(4787);return this;
    }finally{__CLR4_0_63oq3oql1l0dw3n.R.flushNeeded();}}

    /**
     * Returns a textual representation of this pattern
     *
     * @return the usual string form of this XSLT pattern
     */
    public abstract String getText();

}
