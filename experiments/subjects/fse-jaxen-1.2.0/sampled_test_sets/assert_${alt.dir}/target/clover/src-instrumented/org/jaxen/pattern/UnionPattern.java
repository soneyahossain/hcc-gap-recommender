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
 * <p><code>UnionPattern</code> represents a union pattern.</p>
 *
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @version $Revision$
 * @deprecated will be removed in Jaxen 2.0
 */
public class UnionPattern extends Pattern {public static class __CLR4_0_63wn3wnl1l0dw4u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,5108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Pattern lhs;
    private Pattern rhs;
    private short nodeType = ANY_NODE;
    private String matchesNodeName = null;


    public UnionPattern() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5063);
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}

    public UnionPattern(Pattern lhs, Pattern rhs) {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5064);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5065);this.lhs = lhs;
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5066);this.rhs = rhs;
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5067);init();
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}


    public Pattern getLHS() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5068);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5069);return lhs;
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}

    public void setLHS(Pattern lhs) {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5070);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5071);this.lhs = lhs;
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5072);init();
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}

    public Pattern getRHS() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5073);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5074);return rhs;
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}

    public void setRHS(Pattern rhs) {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5075);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5076);this.rhs = rhs;
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5077);init();
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}


    // Pattern interface
    //-------------------------------------------------------------------------    

    /**
     * @return true if the pattern matches the given node
     */
    public boolean matches(Object node, Context context) throws JaxenException {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5078);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5079);return lhs.matches(node, context) || rhs.matches(node, context);
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}

    public Pattern[] getUnionPatterns() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5080);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5081);return new Pattern[]{lhs, rhs};
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}


    public short getMatchType() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5082);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5083);return nodeType;
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}


    public String getMatchesNodeName() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5084);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5085);return matchesNodeName;
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}


    public Pattern simplify() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5086);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5087);this.lhs = lhs.simplify();
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5088);this.rhs = rhs.simplify();
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5089);init();
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5090);return this;
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}

    public String getText() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5091);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5092);return lhs.getText() + " | " + rhs.getText();
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5093);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5094);return super.toString() + "[ lhs: " + lhs + " rhs: " + rhs + " ]";
    }finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}

    // Implementation methods
    //-------------------------------------------------------------------------    
    private void init() {try{__CLR4_0_63wn3wnl1l0dw4u.R.inc(5095);
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5096);short type1 = lhs.getMatchType();
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5097);short type2 = rhs.getMatchType();
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5098);this.nodeType = ((((type1 == type2) )&&(__CLR4_0_63wn3wnl1l0dw4u.R.iget(5099)!=0|true))||(__CLR4_0_63wn3wnl1l0dw4u.R.iget(5100)==0&false))? type1 : ANY_NODE;

        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5101);String name1 = lhs.getMatchesNodeName();
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5102);String name2 = rhs.getMatchesNodeName();

        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5103);this.matchesNodeName = null;
        __CLR4_0_63wn3wnl1l0dw4u.R.inc(5104);if ((((name1 != null && name2 != null && name1.equals(name2))&&(__CLR4_0_63wn3wnl1l0dw4u.R.iget(5105)!=0|true))||(__CLR4_0_63wn3wnl1l0dw4u.R.iget(5106)==0&false))) {{
            __CLR4_0_63wn3wnl1l0dw4u.R.inc(5107);this.matchesNodeName = name1;
        }
    }}finally{__CLR4_0_63wn3wnl1l0dw4u.R.flushNeeded();}}
}
