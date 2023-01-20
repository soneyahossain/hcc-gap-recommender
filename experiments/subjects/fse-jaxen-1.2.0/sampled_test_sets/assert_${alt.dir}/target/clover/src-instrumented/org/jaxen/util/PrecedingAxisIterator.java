/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package org.jaxen.util;

/*
 * $Header$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Copyright 2000-2005 bob mcwhirter & James Strachan.
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

import org.jaxen.JaxenConstants;
import org.jaxen.JaxenRuntimeException;
import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * <p>
 * Represents the XPath <code>preceding</code> axis.
 * The "<code>preceding</code> axis contains all nodes in the same document as the context
 * node that are before the context node in document order, excluding any ancestors
 * and excluding attribute nodes and namespace nodes."
 *
 * <p>
 * This implementation of '<code>preceding</code>' works like so:
 * the <code>preceding</code> axis includes preceding siblings of this node and
 * their descendants. Also, for each ancestor node of this node, it includes
 * all preceding siblings of that ancestor, and their descendants. Finally, it
 * includes the ancestor nodes themselves.
 * </p>
 *
 * <p>
 * The reversed <code>descendant-or-self</code> axes that are required are calculated using a
 * stack of reversed 'child-or-self' axes. When asked for a node, it is always taken
 * from a child-or-self axis. If it was the last node on that axis, the node is returned.
 * Otherwise, this axis is pushed on the stack, and the process is repeated with the child-or-self
 * of the node. Eventually this recurses down to the last descendant of any node, then works
 * back up to the root.
 * </p>
 *
 * <p>
 * Most object models could provide a faster implementation of the reversed
 * 'children-or-self' used here.</p>
 *
 * @version 1.2b12
 */
public class PrecedingAxisIterator implements Iterator {public static class __CLR4_0_66sr6srl1l0dwe1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,8869,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Iterator ancestorOrSelf;
    private Iterator precedingSibling;
    private ListIterator childrenOrSelf;
    private ArrayList stack;

    private Navigator navigator;

    /**
     * Create a new <code>preceding</code> axis iterator.
     *
     * @param contextNode the node to start from
     * @param navigator   the object model specific navigator
     */
    public PrecedingAxisIterator(Object contextNode,
                                 Navigator navigator) throws UnsupportedAxisException {try{__CLR4_0_66sr6srl1l0dwe1.R.inc(8811);
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8812);this.navigator = navigator;
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8813);this.ancestorOrSelf = navigator.getAncestorOrSelfAxisIterator(contextNode);
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8814);this.precedingSibling = JaxenConstants.EMPTY_ITERATOR;
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8815);this.childrenOrSelf = JaxenConstants.EMPTY_LIST_ITERATOR;
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8816);this.stack = new ArrayList();
    }finally{__CLR4_0_66sr6srl1l0dwe1.R.flushNeeded();}}


    /**
     * Returns true if there are any preceding nodes remaining; false otherwise.
     *
     * @return true if any preceding nodes remain; false otherwise
     * @see java.util.Iterator#hasNext()
     */
    public boolean hasNext() {try{__CLR4_0_66sr6srl1l0dwe1.R.inc(8817);
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8818);try {
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8819);while ((((!childrenOrSelf.hasPrevious())&&(__CLR4_0_66sr6srl1l0dwe1.R.iget(8820)!=0|true))||(__CLR4_0_66sr6srl1l0dwe1.R.iget(8821)==0&false))) {{
                __CLR4_0_66sr6srl1l0dwe1.R.inc(8822);if ((((stack.isEmpty())&&(__CLR4_0_66sr6srl1l0dwe1.R.iget(8823)!=0|true))||(__CLR4_0_66sr6srl1l0dwe1.R.iget(8824)==0&false))) {{
                    __CLR4_0_66sr6srl1l0dwe1.R.inc(8825);while ((((!precedingSibling.hasNext())&&(__CLR4_0_66sr6srl1l0dwe1.R.iget(8826)!=0|true))||(__CLR4_0_66sr6srl1l0dwe1.R.iget(8827)==0&false))) {{
                        __CLR4_0_66sr6srl1l0dwe1.R.inc(8828);if ((((!ancestorOrSelf.hasNext())&&(__CLR4_0_66sr6srl1l0dwe1.R.iget(8829)!=0|true))||(__CLR4_0_66sr6srl1l0dwe1.R.iget(8830)==0&false))) {{
                            __CLR4_0_66sr6srl1l0dwe1.R.inc(8831);return false;
                        }
                        }__CLR4_0_66sr6srl1l0dwe1.R.inc(8832);Object contextNode = ancestorOrSelf.next();
                        __CLR4_0_66sr6srl1l0dwe1.R.inc(8833);precedingSibling = new PrecedingSiblingAxisIterator(contextNode, navigator);
                    }
                    }__CLR4_0_66sr6srl1l0dwe1.R.inc(8834);Object node = precedingSibling.next();
                    __CLR4_0_66sr6srl1l0dwe1.R.inc(8835);childrenOrSelf = childrenOrSelf(node);
                } }else {{
                    __CLR4_0_66sr6srl1l0dwe1.R.inc(8836);childrenOrSelf = (ListIterator) stack.remove(stack.size() - 1);
                }
            }}
            }__CLR4_0_66sr6srl1l0dwe1.R.inc(8837);return true;
        } catch (UnsupportedAxisException e) {
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8838);throw new JaxenRuntimeException(e);
        }
    }finally{__CLR4_0_66sr6srl1l0dwe1.R.flushNeeded();}}

    private ListIterator childrenOrSelf(Object node) {try{__CLR4_0_66sr6srl1l0dwe1.R.inc(8839);
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8840);try {
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8841);ArrayList reversed = new ArrayList();
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8842);reversed.add(node);
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8843);Iterator childAxisIterator = navigator.getChildAxisIterator(node);
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8844);if ((((childAxisIterator != null)&&(__CLR4_0_66sr6srl1l0dwe1.R.iget(8845)!=0|true))||(__CLR4_0_66sr6srl1l0dwe1.R.iget(8846)==0&false))) {{
                __CLR4_0_66sr6srl1l0dwe1.R.inc(8847);while ((((childAxisIterator.hasNext())&&(__CLR4_0_66sr6srl1l0dwe1.R.iget(8848)!=0|true))||(__CLR4_0_66sr6srl1l0dwe1.R.iget(8849)==0&false))) {{
                    __CLR4_0_66sr6srl1l0dwe1.R.inc(8850);reversed.add(childAxisIterator.next());
                }
            }}
            }__CLR4_0_66sr6srl1l0dwe1.R.inc(8851);return reversed.listIterator(reversed.size());
        } catch (UnsupportedAxisException e) {
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8852);throw new JaxenRuntimeException(e);
        }
    }finally{__CLR4_0_66sr6srl1l0dwe1.R.flushNeeded();}}

    /**
     * Returns the next preceding node.
     *
     * @return the next preceding node
     * @throws NoSuchElementException if no preceding nodes remain
     * @see java.util.Iterator#next()
     */
    public Object next() throws NoSuchElementException {try{__CLR4_0_66sr6srl1l0dwe1.R.inc(8853);
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8854);if ((((!hasNext())&&(__CLR4_0_66sr6srl1l0dwe1.R.iget(8855)!=0|true))||(__CLR4_0_66sr6srl1l0dwe1.R.iget(8856)==0&false))) {{
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8857);throw new NoSuchElementException();
        }
        }__CLR4_0_66sr6srl1l0dwe1.R.inc(8858);while (true) {{
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8859);Object result = childrenOrSelf.previous();
            __CLR4_0_66sr6srl1l0dwe1.R.inc(8860);if ((((childrenOrSelf.hasPrevious())&&(__CLR4_0_66sr6srl1l0dwe1.R.iget(8861)!=0|true))||(__CLR4_0_66sr6srl1l0dwe1.R.iget(8862)==0&false))) {{
                // if this isn't 'self' construct 'descendant-or-self'
                __CLR4_0_66sr6srl1l0dwe1.R.inc(8863);stack.add(childrenOrSelf);
                __CLR4_0_66sr6srl1l0dwe1.R.inc(8864);childrenOrSelf = childrenOrSelf(result);
                __CLR4_0_66sr6srl1l0dwe1.R.inc(8865);continue;
            }
            }__CLR4_0_66sr6srl1l0dwe1.R.inc(8866);return result;
        }
    }}finally{__CLR4_0_66sr6srl1l0dwe1.R.flushNeeded();}}


    /**
     * This operation is not supported.
     *
     * @throws UnsupportedOperationException always
     */
    public void remove() throws UnsupportedOperationException {try{__CLR4_0_66sr6srl1l0dwe1.R.inc(8867);
        __CLR4_0_66sr6srl1l0dwe1.R.inc(8868);throw new UnsupportedOperationException();
    }finally{__CLR4_0_66sr6srl1l0dwe1.R.flushNeeded();}}

}
