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

import org.jaxen.JaxenException;
import org.jaxen.JaxenHandler;
import org.jaxen.expr.Expr;
import org.jaxen.expr.FilterExpr;
import org.jaxen.saxpath.Axis;

import java.util.LinkedList;

/**
 * SAXPath <code>XPathHandler</code> implementation capable
 * of building Jaxen expression trees which can walk various
 * different object models.
 *
 * @author bob mcwhirter (bob@werken.com)
 * @deprecated will be removed in Jaxen 2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class PatternHandler extends JaxenHandler {public static class __CLR4_0_63p03p0l1l0dw3z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4900,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Pattern pattern;

    public PatternHandler() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4788);
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    /**
     * Retrieve the simplified Jaxen Pattern expression tree.
     *
     * <p>
     * This method is only valid once <code>XPathReader.parse(...)</code>
     * successfully returned.
     * </p>
     *
     * @return The Pattern expression tree.
     */
    public Pattern getPattern() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4789);
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4790);return getPattern(true);
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    /**
     * Retrieve the Jaxen Pattern expression tree, optionally
     * simplified.
     *
     * <p>
     * This method is only valid once <code>XPathReader.parse(...)</code>
     * successfully returned.
     * </p>
     *
     * @param shouldSimplify ????
     * @return The Pattern expression tree.
     */
    public Pattern getPattern(boolean shouldSimplify) {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4791);
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4792);if ((((shouldSimplify && !this.simplified)&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4793)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4794)==0&false))) {{
            //System.err.println("simplifying....");
            __CLR4_0_63p03p0l1l0dw3z.R.inc(4795);this.pattern.simplify();
            __CLR4_0_63p03p0l1l0dw3z.R.inc(4796);this.simplified = true;
        }

        }__CLR4_0_63p03p0l1l0dw3z.R.inc(4797);return this.pattern;
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}


    public void endXPath() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4798);
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4799);this.pattern = (Pattern) pop();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4800);System.out.println("stack is: " + stack);

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4801);popFrame();
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void endPathExpr() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4802);
        //System.err.println("endPathExpr()");

        // PathExpr ::=   LocationPath
        //              | FilterExpr
        //              | FilterExpr / RelativeLocationPath
        //              | FilterExpr // RelativeLocationPath
        //
        // If the current stack-frame has two items, it's a
        // FilterExpr and a LocationPath (of some flavor).
        //
        // If the current stack-frame has one item, it's simply
        // a FilterExpr, and more than like boils down to a
        // primary expr of some flavor.  But that's for another
        // method...

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4803);LinkedList frame = popFrame();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4804);System.out.println("endPathExpr(): " + frame);

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4805);push(frame.removeFirst());
/*        
        LocationPathPattern locationPath = new LocationPathPattern();
        push( locationPath );
        while (! frame.isEmpty() )
        {
            Object filter = frame.removeLast();
            if ( filter instanceof NodeTest ) 
            {
                locationPath.setNodeTest( (NodeTest) filter );
            }
            else if ( filter instanceof FilterExpr )
            {
                locationPath.addFilter( (FilterExpr) filter );
            }
            else if ( filter instanceof LocationPathPattern ) 
            {
                LocationPathPattern parent = (LocationPathPattern) filter;
                locationPath.setParentPattern( parent );
                locationPath = parent;
            }
            else if ( filter != null ) 
            {
                throw new JaxenException( "Unknown filter: " + filter );
            }
        }
*/
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void startAbsoluteLocationPath() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4806);
        //System.err.println("startAbsoluteLocationPath()");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4807);pushFrame();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4808);push(createAbsoluteLocationPath());
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void endAbsoluteLocationPath() throws JaxenException {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4809);
        //System.err.println("endAbsoluteLocationPath()");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4810);endLocationPath();
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void startRelativeLocationPath() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4811);
        //System.err.println("startRelativeLocationPath()");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4812);pushFrame();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4813);push(createRelativeLocationPath());
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void endRelativeLocationPath() throws JaxenException {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4814);
        //System.err.println("endRelativeLocationPath()");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4815);endLocationPath();
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    protected void endLocationPath() throws JaxenException {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4816);
        // start at the back, its the main pattern then add everything else as 
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4817);LinkedList list = popFrame();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4818);System.out.println("endLocationPath: " + list);

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4819);LocationPathPattern locationPath = (LocationPathPattern) list.removeFirst();
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4820);push(locationPath);
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4821);boolean doneNodeTest = false;
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4822);while ((((!list.isEmpty())&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4823)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4824)==0&false))) {{
            __CLR4_0_63p03p0l1l0dw3z.R.inc(4825);Object filter = list.removeFirst();
            __CLR4_0_63p03p0l1l0dw3z.R.inc(4826);if ((((filter instanceof NodeTest)&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4827)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4828)==0&false))) {{
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4829);if ((((doneNodeTest)&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4830)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4831)==0&false))) {{
                    __CLR4_0_63p03p0l1l0dw3z.R.inc(4832);LocationPathPattern parent = new LocationPathPattern((NodeTest) filter);
                    __CLR4_0_63p03p0l1l0dw3z.R.inc(4833);locationPath.setParentPattern(parent);
                    __CLR4_0_63p03p0l1l0dw3z.R.inc(4834);locationPath = parent;
                    __CLR4_0_63p03p0l1l0dw3z.R.inc(4835);doneNodeTest = false;
                } }else {{
                    __CLR4_0_63p03p0l1l0dw3z.R.inc(4836);locationPath.setNodeTest((NodeTest) filter);
                }
            }} }else {__CLR4_0_63p03p0l1l0dw3z.R.inc(4837);if ((((filter instanceof FilterExpr)&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4838)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4839)==0&false))) {{
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4840);locationPath.addFilter((FilterExpr) filter);
            } }else {__CLR4_0_63p03p0l1l0dw3z.R.inc(4841);if ((((filter instanceof LocationPathPattern)&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4842)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4843)==0&false))) {{
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4844);LocationPathPattern parent = (LocationPathPattern) filter;
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4845);locationPath.setParentPattern(parent);
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4846);locationPath = parent;
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4847);doneNodeTest = false;
            }
        }}}}
    }}finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}


    public void startNameStep(int axis,
                              String prefix,
                              String localName) {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4848);
        //System.err.println("startNameStep(" + axis + ", " + prefix + ", " + localName + ")");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4849);pushFrame();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4850);short nodeType = Pattern.ELEMENT_NODE;
        boolean __CLB4_0_6_bool0=false;__CLR4_0_63p03p0l1l0dw3z.R.inc(4851);switch (axis) {
            case Axis.ATTRIBUTE:if (!__CLB4_0_6_bool0) {__CLR4_0_63p03p0l1l0dw3z.R.inc(4852);__CLB4_0_6_bool0=true;}
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4853);nodeType = Pattern.ATTRIBUTE_NODE;
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4854);break;
            case Axis.NAMESPACE:if (!__CLB4_0_6_bool0) {__CLR4_0_63p03p0l1l0dw3z.R.inc(4855);__CLB4_0_6_bool0=true;}
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4856);nodeType = Pattern.NAMESPACE_NODE;
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4857);break;
        }

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4858);if ((((prefix != null && prefix.length() > 0 && !prefix.equals("*"))&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4859)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4860)==0&false))) {{
            __CLR4_0_63p03p0l1l0dw3z.R.inc(4861);push(new NamespaceTest(prefix, nodeType));
        }
        }__CLR4_0_63p03p0l1l0dw3z.R.inc(4862);if ((((localName != null && localName.length() > 0 && !localName.equals("*"))&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4863)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4864)==0&false))) {{
            __CLR4_0_63p03p0l1l0dw3z.R.inc(4865);push(new NameTest(localName, nodeType));
        }
    }}finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void startTextNodeStep(int axis) {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4866);
        //System.err.println("startTextNodeStep()");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4867);pushFrame();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4868);push(new NodeTypeTest(Pattern.TEXT_NODE));
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void startCommentNodeStep(int axis) {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4869);
        //System.err.println("startCommentNodeStep()");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4870);pushFrame();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4871);push(new NodeTypeTest(Pattern.COMMENT_NODE));
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void startAllNodeStep(int axis) {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4872);
        //System.err.println("startAllNodeStep()");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4873);pushFrame();

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4874);push(AnyNodeTest.getInstance());
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void startProcessingInstructionNodeStep(int axis,
                                                   String name) {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4875);
        //System.err.println("startProcessingInstructionStep()");
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4876);pushFrame();

        // XXXX: should we throw an exception if name is present?            
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4877);push(new NodeTypeTest(Pattern.PROCESSING_INSTRUCTION_NODE));
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    protected void endStep() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4878);
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4879);LinkedList list = popFrame();
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4880);if ((((!list.isEmpty())&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4881)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4882)==0&false))) {{
            __CLR4_0_63p03p0l1l0dw3z.R.inc(4883);push(list.removeFirst());

            __CLR4_0_63p03p0l1l0dw3z.R.inc(4884);if ((((!list.isEmpty())&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4885)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4886)==0&false))) {{
                __CLR4_0_63p03p0l1l0dw3z.R.inc(4887);System.out.println("List should now be empty!" + list);
            }
        }}
    }}finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}


    public void startUnionExpr() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4888);
        //System.err.println("startUnionExpr()");
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    public void endUnionExpr(boolean create) throws JaxenException {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4889);
        //System.err.println("endUnionExpr()");

        __CLR4_0_63p03p0l1l0dw3z.R.inc(4890);if ((((create)&&(__CLR4_0_63p03p0l1l0dw3z.R.iget(4891)!=0|true))||(__CLR4_0_63p03p0l1l0dw3z.R.iget(4892)==0&false))) {{
            //System.err.println("makeUnionExpr");

            __CLR4_0_63p03p0l1l0dw3z.R.inc(4893);Expr rhs = (Expr) pop();
            __CLR4_0_63p03p0l1l0dw3z.R.inc(4894);Expr lhs = (Expr) pop();

            __CLR4_0_63p03p0l1l0dw3z.R.inc(4895);push(getXPathFactory().createUnionExpr(lhs,
                    rhs));
        }
    }}finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    protected Pattern createAbsoluteLocationPath() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4896);
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4897);return new LocationPathPattern(NodeTypeTest.DOCUMENT_TEST);
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

    protected Pattern createRelativeLocationPath() {try{__CLR4_0_63p03p0l1l0dw3z.R.inc(4898);
        __CLR4_0_63p03p0l1l0dw3z.R.inc(4899);return new LocationPathPattern();
    }finally{__CLR4_0_63p03p0l1l0dw3z.R.flushNeeded();}}

}
