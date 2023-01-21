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
import org.jaxen.expr.*;
import org.jaxen.saxpath.Axis;
import org.jaxen.saxpath.XPathReader;
import org.jaxen.saxpath.helpers.XPathReaderFactory;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * <code>PatternParser</code> is a helper class for parsing
 * XSLT patterns
 *
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @deprecated will be removed in Jaxen 2.0
 */
public class PatternParser {public static class __CLR4_0_63s43s4l1l0dw4h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,5054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final boolean TRACE = false;
    private static final boolean USE_HANDLER = false;

    public static Pattern parse(String text) throws JaxenException, org.jaxen.saxpath.SAXPathException {try{__CLR4_0_63s43s4l1l0dw4h.R.inc(4900);
        __CLR4_0_63s43s4l1l0dw4h.R.inc(4901);if ((((USE_HANDLER)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4902)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4903)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4904);XPathReader reader = XPathReaderFactory.createReader();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4905);PatternHandler handler = new PatternHandler();

            __CLR4_0_63s43s4l1l0dw4h.R.inc(4906);handler.setXPathFactory(new DefaultXPathFactory());
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4907);reader.setXPathHandler(handler);
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4908);reader.parse(text);

            __CLR4_0_63s43s4l1l0dw4h.R.inc(4909);return handler.getPattern();
        } }else {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4910);XPathReader reader = XPathReaderFactory.createReader();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4911);JaxenHandler handler = new JaxenHandler();

            __CLR4_0_63s43s4l1l0dw4h.R.inc(4912);handler.setXPathFactory(new DefaultXPathFactory());
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4913);reader.setXPathHandler(handler);
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4914);reader.parse(text);

            __CLR4_0_63s43s4l1l0dw4h.R.inc(4915);Pattern pattern = convertExpr(handler.getXPathExpr().getRootExpr());
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4916);return pattern.simplify();
        }
    }}finally{__CLR4_0_63s43s4l1l0dw4h.R.flushNeeded();}}

    protected static Pattern convertExpr(Expr expr) throws JaxenException {try{__CLR4_0_63s43s4l1l0dw4h.R.inc(4917);
        __CLR4_0_63s43s4l1l0dw4h.R.inc(4918);if ((((TRACE)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4919)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4920)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4921);System.out.println("Converting: " + expr + " into a pattern.");
        }

        }__CLR4_0_63s43s4l1l0dw4h.R.inc(4922);if ((((expr instanceof LocationPath)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4923)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4924)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4925);return convertExpr((LocationPath) expr);
        } }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(4926);if ((((expr instanceof FilterExpr)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4927)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4928)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4929);LocationPathPattern answer = new LocationPathPattern();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4930);answer.addFilter((FilterExpr) expr);
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4931);return answer;
        } }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(4932);if ((((expr instanceof UnionExpr)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4933)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4934)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4935);UnionExpr unionExpr = (UnionExpr) expr;
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4936);Pattern lhs = convertExpr(unionExpr.getLHS());
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4937);Pattern rhs = convertExpr(unionExpr.getRHS());
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4938);return new UnionPattern(lhs, rhs);
        } }else {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4939);LocationPathPattern answer = new LocationPathPattern();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4940);answer.addFilter(new DefaultFilterExpr(expr,
                    new PredicateSet()));
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4941);return answer;
        }
    }}}}finally{__CLR4_0_63s43s4l1l0dw4h.R.flushNeeded();}}

    protected static LocationPathPattern convertExpr(LocationPath locationPath) throws JaxenException {try{__CLR4_0_63s43s4l1l0dw4h.R.inc(4942);
        __CLR4_0_63s43s4l1l0dw4h.R.inc(4943);LocationPathPattern answer = new LocationPathPattern();
        //answer.setAbsolute( locationPath.isAbsolute() );
        __CLR4_0_63s43s4l1l0dw4h.R.inc(4944);List steps = locationPath.getSteps();

        // go through steps backwards
        __CLR4_0_63s43s4l1l0dw4h.R.inc(4945);LocationPathPattern path = answer;
        __CLR4_0_63s43s4l1l0dw4h.R.inc(4946);boolean first = true;
        __CLR4_0_63s43s4l1l0dw4h.R.inc(4947);for (ListIterator iter = steps.listIterator(steps.size()); (((iter.hasPrevious())&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4948)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4949)==0&false)); ) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4950);Step step = (Step) iter.previous();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4951);if ((((first)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4952)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4953)==0&false))) {{
                __CLR4_0_63s43s4l1l0dw4h.R.inc(4954);first = false;
                __CLR4_0_63s43s4l1l0dw4h.R.inc(4955);path = convertStep(path, step);
            } }else {{
                __CLR4_0_63s43s4l1l0dw4h.R.inc(4956);if ((((navigationStep(step))&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4957)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4958)==0&false))) {{
                    __CLR4_0_63s43s4l1l0dw4h.R.inc(4959);LocationPathPattern parent = new LocationPathPattern();
                    __CLR4_0_63s43s4l1l0dw4h.R.inc(4960);int axis = step.getAxis();
                    __CLR4_0_63s43s4l1l0dw4h.R.inc(4961);if ((((axis == Axis.DESCENDANT || axis == Axis.DESCENDANT_OR_SELF)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4962)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4963)==0&false))) {{
                        __CLR4_0_63s43s4l1l0dw4h.R.inc(4964);path.setAncestorPattern(parent);
                    } }else {{
                        __CLR4_0_63s43s4l1l0dw4h.R.inc(4965);path.setParentPattern(parent);
                    }
                    }__CLR4_0_63s43s4l1l0dw4h.R.inc(4966);path = parent;
                }
                }__CLR4_0_63s43s4l1l0dw4h.R.inc(4967);path = convertStep(path, step);
            }
        }}
        }__CLR4_0_63s43s4l1l0dw4h.R.inc(4968);if ((((locationPath.isAbsolute())&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4969)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4970)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4971);LocationPathPattern parent = new LocationPathPattern(NodeTypeTest.DOCUMENT_TEST);
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4972);path.setParentPattern(parent);
        }
        }__CLR4_0_63s43s4l1l0dw4h.R.inc(4973);return answer;
    }finally{__CLR4_0_63s43s4l1l0dw4h.R.flushNeeded();}}

    protected static LocationPathPattern convertStep(LocationPathPattern path, Step step) throws JaxenException {try{__CLR4_0_63s43s4l1l0dw4h.R.inc(4974);
        __CLR4_0_63s43s4l1l0dw4h.R.inc(4975);if ((((step instanceof DefaultAllNodeStep)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4976)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4977)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4978);int axis = step.getAxis();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4979);if ((((axis == Axis.ATTRIBUTE)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4980)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4981)==0&false))) {{
                __CLR4_0_63s43s4l1l0dw4h.R.inc(4982);path.setNodeTest(NodeTypeTest.ATTRIBUTE_TEST);
            } }else {{
                __CLR4_0_63s43s4l1l0dw4h.R.inc(4983);path.setNodeTest(NodeTypeTest.ELEMENT_TEST);
            }
        }} }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(4984);if ((((step instanceof DefaultCommentNodeStep)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4985)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4986)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4987);path.setNodeTest(NodeTypeTest.COMMENT_TEST);
        } }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(4988);if ((((step instanceof DefaultProcessingInstructionNodeStep)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4989)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4990)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4991);path.setNodeTest(NodeTypeTest.PROCESSING_INSTRUCTION_TEST);
        } }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(4992);if ((((step instanceof DefaultTextNodeStep)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4993)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4994)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4995);path.setNodeTest(TextNodeTest.SINGLETON);
        } }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(4996);if ((((step instanceof DefaultCommentNodeStep)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(4997)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(4998)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(4999);path.setNodeTest(NodeTypeTest.COMMENT_TEST);
        } }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(5000);if ((((step instanceof DefaultNameStep)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5001)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5002)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5003);DefaultNameStep nameStep = (DefaultNameStep) step;
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5004);String localName = nameStep.getLocalName();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5005);String prefix = nameStep.getPrefix();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5006);int axis = nameStep.getAxis();
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5007);short nodeType = Pattern.ELEMENT_NODE;
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5008);if ((((axis == Axis.ATTRIBUTE)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5009)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5010)==0&false))) {{
                __CLR4_0_63s43s4l1l0dw4h.R.inc(5011);nodeType = Pattern.ATTRIBUTE_NODE;
            }
            }__CLR4_0_63s43s4l1l0dw4h.R.inc(5012);if ((((nameStep.isMatchesAnyName())&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5013)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5014)==0&false))) {{
                __CLR4_0_63s43s4l1l0dw4h.R.inc(5015);if ((((prefix.length() == 0 || prefix.equals("*"))&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5016)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5017)==0&false))) {{
                    __CLR4_0_63s43s4l1l0dw4h.R.inc(5018);if ((((axis == Axis.ATTRIBUTE)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5019)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5020)==0&false))) {{
                        __CLR4_0_63s43s4l1l0dw4h.R.inc(5021);path.setNodeTest(NodeTypeTest.ATTRIBUTE_TEST);
                    } }else {{
                        __CLR4_0_63s43s4l1l0dw4h.R.inc(5022);path.setNodeTest(NodeTypeTest.ELEMENT_TEST);
                    }
                }} }else {{
                    __CLR4_0_63s43s4l1l0dw4h.R.inc(5023);path.setNodeTest(new NamespaceTest(prefix, nodeType));
                }
            }} }else {{
                __CLR4_0_63s43s4l1l0dw4h.R.inc(5024);path.setNodeTest(new NameTest(localName, nodeType));
                // XXXX: should support namespace in the test too
            }
            }__CLR4_0_63s43s4l1l0dw4h.R.inc(5025);return convertDefaultStep(path, nameStep);
        } }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(5026);if ((((step instanceof DefaultStep)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5027)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5028)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5029);return convertDefaultStep(path, (DefaultStep) step);
        } }else {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5030);throw new JaxenException("Cannot convert: " + step + " to a Pattern");
        }
        }}}}}}}__CLR4_0_63s43s4l1l0dw4h.R.inc(5031);return path;
    }finally{__CLR4_0_63s43s4l1l0dw4h.R.flushNeeded();}}

    protected static LocationPathPattern convertDefaultStep(LocationPathPattern path, DefaultStep step) throws JaxenException {try{__CLR4_0_63s43s4l1l0dw4h.R.inc(5032);
        __CLR4_0_63s43s4l1l0dw4h.R.inc(5033);List predicates = step.getPredicates();
        __CLR4_0_63s43s4l1l0dw4h.R.inc(5034);if ((((!predicates.isEmpty())&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5035)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5036)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5037);FilterExpr filter = new DefaultFilterExpr(new PredicateSet());
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5038);for (Iterator iter = predicates.iterator(); (((iter.hasNext())&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5039)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5040)==0&false)); ) {{
                __CLR4_0_63s43s4l1l0dw4h.R.inc(5041);filter.addPredicate((Predicate) iter.next());
            }
            }__CLR4_0_63s43s4l1l0dw4h.R.inc(5042);path.addFilter(filter);
        }
        }__CLR4_0_63s43s4l1l0dw4h.R.inc(5043);return path;
    }finally{__CLR4_0_63s43s4l1l0dw4h.R.flushNeeded();}}

    protected static boolean navigationStep(Step step) {try{__CLR4_0_63s43s4l1l0dw4h.R.inc(5044);
        __CLR4_0_63s43s4l1l0dw4h.R.inc(5045);if ((((step instanceof DefaultNameStep)&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5046)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5047)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5048);return true;
        } }else {__CLR4_0_63s43s4l1l0dw4h.R.inc(5049);if ((((step.getClass().equals(DefaultStep.class))&&(__CLR4_0_63s43s4l1l0dw4h.R.iget(5050)!=0|true))||(__CLR4_0_63s43s4l1l0dw4h.R.iget(5051)==0&false))) {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5052);return !step.getPredicates().isEmpty();
        } }else {{
            __CLR4_0_63s43s4l1l0dw4h.R.inc(5053);return true;
        }
    }}}finally{__CLR4_0_63s43s4l1l0dw4h.R.flushNeeded();}}

}

