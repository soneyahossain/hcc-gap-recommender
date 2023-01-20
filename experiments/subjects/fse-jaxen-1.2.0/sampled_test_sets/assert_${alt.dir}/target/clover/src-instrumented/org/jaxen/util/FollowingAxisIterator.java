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

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Represents the XPath <code>following</code> axis.
 * The "<code>following</code> axis contains all nodes in the same document as the context
 * node that are after the context node in document order, excluding any descendants
 * and excluding attribute nodes and namespace nodes."
 *
 * @version 1.2b12
 */
public class FollowingAxisIterator implements Iterator {public static class __CLR4_0_66q16q1l1l0dwdi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,8760,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Object contextNode;

    private Navigator navigator;

    private Iterator siblings;

    private Iterator currentSibling;

    /**
     * Create a new <code>following</code> axis iterator.
     *
     * @param contextNode the node to start from
     * @param navigator   the object model specific navigator
     */
    public FollowingAxisIterator(Object contextNode,
                                 Navigator navigator) throws UnsupportedAxisException {try{__CLR4_0_66q16q1l1l0dwdi.R.inc(8713);
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8714);this.contextNode = contextNode;
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8715);this.navigator = navigator;
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8716);this.siblings = navigator.getFollowingSiblingAxisIterator(contextNode);
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8717);this.currentSibling = JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_66q16q1l1l0dwdi.R.flushNeeded();}}

    private boolean goForward() {try{__CLR4_0_66q16q1l1l0dwdi.R.inc(8718);
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8719);while ((((!siblings.hasNext())&&(__CLR4_0_66q16q1l1l0dwdi.R.iget(8720)!=0|true))||(__CLR4_0_66q16q1l1l0dwdi.R.iget(8721)==0&false))) {{
            __CLR4_0_66q16q1l1l0dwdi.R.inc(8722);if ((((!goUp())&&(__CLR4_0_66q16q1l1l0dwdi.R.iget(8723)!=0|true))||(__CLR4_0_66q16q1l1l0dwdi.R.iget(8724)==0&false))) {{
                __CLR4_0_66q16q1l1l0dwdi.R.inc(8725);return false;
            }
        }}

        }__CLR4_0_66q16q1l1l0dwdi.R.inc(8726);Object nextSibling = siblings.next();

        __CLR4_0_66q16q1l1l0dwdi.R.inc(8727);this.currentSibling = new DescendantOrSelfAxisIterator(nextSibling, navigator);

        __CLR4_0_66q16q1l1l0dwdi.R.inc(8728);return true;
    }finally{__CLR4_0_66q16q1l1l0dwdi.R.flushNeeded();}}

    private boolean goUp() {try{__CLR4_0_66q16q1l1l0dwdi.R.inc(8729);
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8730);if ((((contextNode == null
                ||
                navigator.isDocument(contextNode))&&(__CLR4_0_66q16q1l1l0dwdi.R.iget(8731)!=0|true))||(__CLR4_0_66q16q1l1l0dwdi.R.iget(8732)==0&false))) {{
            __CLR4_0_66q16q1l1l0dwdi.R.inc(8733);return false;
        }

        }__CLR4_0_66q16q1l1l0dwdi.R.inc(8734);try {
            __CLR4_0_66q16q1l1l0dwdi.R.inc(8735);contextNode = navigator.getParentNode(contextNode);

            __CLR4_0_66q16q1l1l0dwdi.R.inc(8736);if ((((contextNode != null
                    &&
                    !navigator.isDocument(contextNode))&&(__CLR4_0_66q16q1l1l0dwdi.R.iget(8737)!=0|true))||(__CLR4_0_66q16q1l1l0dwdi.R.iget(8738)==0&false))) {{
                __CLR4_0_66q16q1l1l0dwdi.R.inc(8739);siblings = navigator.getFollowingSiblingAxisIterator(contextNode);
                __CLR4_0_66q16q1l1l0dwdi.R.inc(8740);return true;
            } }else {{
                __CLR4_0_66q16q1l1l0dwdi.R.inc(8741);return false;
            }
        }} catch (UnsupportedAxisException e) {
            __CLR4_0_66q16q1l1l0dwdi.R.inc(8742);throw new JaxenRuntimeException(e);
        }
    }finally{__CLR4_0_66q16q1l1l0dwdi.R.flushNeeded();}}

    /**
     * Returns true if there are any following nodes remaining;
     * false otherwise.
     *
     * @return true if any following nodes remain
     * @see java.util.Iterator#hasNext()
     */
    public boolean hasNext() {try{__CLR4_0_66q16q1l1l0dwdi.R.inc(8743);
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8744);while ((((!currentSibling.hasNext())&&(__CLR4_0_66q16q1l1l0dwdi.R.iget(8745)!=0|true))||(__CLR4_0_66q16q1l1l0dwdi.R.iget(8746)==0&false))) {{
            __CLR4_0_66q16q1l1l0dwdi.R.inc(8747);if ((((!goForward())&&(__CLR4_0_66q16q1l1l0dwdi.R.iget(8748)!=0|true))||(__CLR4_0_66q16q1l1l0dwdi.R.iget(8749)==0&false))) {{
                __CLR4_0_66q16q1l1l0dwdi.R.inc(8750);return false;
            }
        }}

        }__CLR4_0_66q16q1l1l0dwdi.R.inc(8751);return true;
    }finally{__CLR4_0_66q16q1l1l0dwdi.R.flushNeeded();}}

    /**
     * Returns the next following node.
     *
     * @return the next following node
     * @throws NoSuchElementException if no following nodes remain
     * @see java.util.Iterator#next()
     */
    public Object next() throws NoSuchElementException {try{__CLR4_0_66q16q1l1l0dwdi.R.inc(8752);
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8753);if ((((!hasNext())&&(__CLR4_0_66q16q1l1l0dwdi.R.iget(8754)!=0|true))||(__CLR4_0_66q16q1l1l0dwdi.R.iget(8755)==0&false))) {{
            __CLR4_0_66q16q1l1l0dwdi.R.inc(8756);throw new NoSuchElementException();
        }

        }__CLR4_0_66q16q1l1l0dwdi.R.inc(8757);return currentSibling.next();
    }finally{__CLR4_0_66q16q1l1l0dwdi.R.flushNeeded();}}

    /**
     * This operation is not supported.
     *
     * @throws UnsupportedOperationException always
     */
    public void remove() throws UnsupportedOperationException {try{__CLR4_0_66q16q1l1l0dwdi.R.inc(8758);
        __CLR4_0_66q16q1l1l0dwdi.R.inc(8759);throw new UnsupportedOperationException();
    }finally{__CLR4_0_66q16q1l1l0dwdi.R.flushNeeded();}}
}
