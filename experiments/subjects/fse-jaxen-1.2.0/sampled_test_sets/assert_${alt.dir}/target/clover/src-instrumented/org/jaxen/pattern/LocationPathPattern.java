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
import org.jaxen.Navigator;
import org.jaxen.expr.FilterExpr;
import org.jaxen.util.SingletonList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p><code>LocationPathPattern</code> matches any node using a
 * location path such as A/B/C.
 * The parentPattern and ancestorPattern properties are used to
 * chain location path patterns together</p>
 *
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @version $Revision$
 * @deprecated will be removed in Jaxen 2.0
 */
public class LocationPathPattern extends Pattern {public static class __CLR4_0_63hj3hjl1l0dw2k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4668,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The node test to perform on this step of the path
     */
    private NodeTest nodeTest = AnyNodeTest.getInstance();

    /**
     * Patterns matching my parent node
     */
    private Pattern parentPattern;

    /**
     * Patterns matching one of my ancestors
     */
    private Pattern ancestorPattern;

    /**
     * The filters to match against
     */
    private List filters;

    /**
     * Whether this lcoation path is absolute or not
     */
    private boolean absolute;


    public LocationPathPattern() {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4519);
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    public LocationPathPattern(NodeTest nodeTest) {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4520);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4521);this.nodeTest = nodeTest;
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    public Pattern simplify() {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4522);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4523);if ((((parentPattern != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4524)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4525)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4526);parentPattern = parentPattern.simplify();
        }
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4527);if ((((ancestorPattern != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4528)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4529)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4530);ancestorPattern = ancestorPattern.simplify();
        }
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4531);if ((((filters == null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4532)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4533)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4534);if ((((parentPattern == null && ancestorPattern == null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4535)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4536)==0&false))) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4537);return nodeTest;
            }
            }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4538);if ((((parentPattern != null && ancestorPattern == null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4539)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4540)==0&false))) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4541);if ((((nodeTest instanceof AnyNodeTest)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4542)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4543)==0&false))) {{
                    __CLR4_0_63hj3hjl1l0dw2k.R.inc(4544);return parentPattern;
                }
            }}
        }}
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4545);return this;
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    /**
     * Adds a filter to this pattern
     */
    public void addFilter(FilterExpr filter) {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4546);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4547);if ((((filters == null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4548)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4549)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4550);filters = new ArrayList();
        }
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4551);filters.add(filter);
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    /**
     * Adds a pattern for the parent of the current
     * context node used in this pattern.
     */
    public void setParentPattern(Pattern parentPattern) {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4552);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4553);this.parentPattern = parentPattern;
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    /**
     * Adds a pattern for an ancestor of the current
     * context node used in this pattern.
     */
    public void setAncestorPattern(Pattern ancestorPattern) {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4554);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4555);this.ancestorPattern = ancestorPattern;
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    /**
     * Allows the NodeTest to be set
     */
    public void setNodeTest(NodeTest nodeTest) throws JaxenException {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4556);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4557);if ((((this.nodeTest instanceof AnyNodeTest)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4558)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4559)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4560);this.nodeTest = nodeTest;
        } }else {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4561);throw new JaxenException("Attempt to overwrite nodeTest: " + this.nodeTest + " with: " + nodeTest);
        }
    }}finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    /**
     * @return true if the pattern matches the given node
     */
    public boolean matches(Object node, Context context) throws JaxenException {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4562);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4563);Navigator navigator = context.getNavigator();

/*        
        if ( isAbsolute() )
        {
            node = navigator.getDocumentNode( node );
        }
*/
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4564);if ((((!nodeTest.matches(node, context))&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4565)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4566)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4567);return false;
        }

        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4568);if ((((parentPattern != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4569)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4570)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4571);Object parent = navigator.getParentNode(node);
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4572);if ((((parent == null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4573)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4574)==0&false))) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4575);return false;
            }
            }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4576);if ((((!parentPattern.matches(parent, context))&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4577)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4578)==0&false))) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4579);return false;
            }
        }}

        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4580);if ((((ancestorPattern != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4581)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4582)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4583);Object ancestor = navigator.getParentNode(node);
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4584);while (true) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4585);if ((((ancestorPattern.matches(ancestor, context))&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4586)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4587)==0&false))) {{
                    __CLR4_0_63hj3hjl1l0dw2k.R.inc(4588);break;
                }
                }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4589);if ((((ancestor == null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4590)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4591)==0&false))) {{
                    __CLR4_0_63hj3hjl1l0dw2k.R.inc(4592);return false;
                }
                }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4593);if ((((navigator.isDocument(ancestor))&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4594)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4595)==0&false))) {{
                    __CLR4_0_63hj3hjl1l0dw2k.R.inc(4596);return false;
                }
                }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4597);ancestor = navigator.getParentNode(ancestor);
            }
        }}

        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4598);if ((((filters != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4599)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4600)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4601);List list = new SingletonList(node);

            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4602);context.setNodeSet(list);

            // XXXX: filters aren't positional, so should we clone context?

            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4603);boolean answer = true;

            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4604);for (Iterator iter = filters.iterator(); (((iter.hasNext())&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4605)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4606)==0&false)); ) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4607);FilterExpr filter = (FilterExpr) iter.next();

                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4608);if ((((!filter.asBoolean(context))&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4609)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4610)==0&false))) {{
                    __CLR4_0_63hj3hjl1l0dw2k.R.inc(4611);answer = false;
                    __CLR4_0_63hj3hjl1l0dw2k.R.inc(4612);break;
                }
            }}
            // restore context

            }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4613);context.setNodeSet(list);

            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4614);return answer;
        }
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4615);return true;
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    public double getPriority() {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4616);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4617);if ((((filters != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4618)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4619)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4620);return 0.5;
        }
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4621);return nodeTest.getPriority();
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}


    public short getMatchType() {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4622);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4623);return nodeTest.getMatchType();
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    public String getText() {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4624);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4625);StringBuffer buffer = new StringBuffer();
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4626);if ((((absolute)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4627)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4628)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4629);buffer.append("/");
        }
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4630);if ((((ancestorPattern != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4631)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4632)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4633);String text = ancestorPattern.getText();
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4634);if ((((text.length() > 0)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4635)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4636)==0&false))) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4637);buffer.append(text);
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4638);buffer.append("//");
            }
        }}
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4639);if ((((parentPattern != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4640)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4641)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4642);String text = parentPattern.getText();
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4643);if ((((text.length() > 0)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4644)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4645)==0&false))) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4646);buffer.append(text);
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4647);buffer.append("/");
            }
        }}
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4648);buffer.append(nodeTest.getText());

        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4649);if ((((filters != null)&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4650)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4651)==0&false))) {{
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4652);buffer.append("[");
            __CLR4_0_63hj3hjl1l0dw2k.R.inc(4653);for (Iterator iter = filters.iterator(); (((iter.hasNext())&&(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4654)!=0|true))||(__CLR4_0_63hj3hjl1l0dw2k.R.iget(4655)==0&false)); ) {{
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4656);FilterExpr filter = (FilterExpr) iter.next();
                __CLR4_0_63hj3hjl1l0dw2k.R.inc(4657);buffer.append(filter.getText());
            }
            }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4658);buffer.append("]");
        }
        }__CLR4_0_63hj3hjl1l0dw2k.R.inc(4659);return buffer.toString();
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    public String toString() {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4660);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4661);return super.toString() + "[ absolute: " + absolute + " parent: " + parentPattern + " ancestor: "
                + ancestorPattern + " filters: " + filters + " nodeTest: "
                + nodeTest + " ]";
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    public boolean isAbsolute() {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4662);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4663);return absolute;
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    public void setAbsolute(boolean absolute) {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4664);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4665);this.absolute = absolute;
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

    public boolean hasAnyNodeTest() {try{__CLR4_0_63hj3hjl1l0dw2k.R.inc(4666);
        __CLR4_0_63hj3hjl1l0dw2k.R.inc(4667);return nodeTest instanceof AnyNodeTest;
    }finally{__CLR4_0_63hj3hjl1l0dw2k.R.flushNeeded();}}

}
