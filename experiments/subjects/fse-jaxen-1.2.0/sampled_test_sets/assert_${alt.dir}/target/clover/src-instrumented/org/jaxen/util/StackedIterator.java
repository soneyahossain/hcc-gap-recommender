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


package org.jaxen.util;

import org.jaxen.Navigator;

import java.util.*;

/**
 * @deprecated this iterator is no longer used to implement any of the Jaxen axes. If you have implemented
 * a navigator-specific axis based on this class, take a look at the DescendantAxisIterator for ideas
 * on how to remove that dependency.
 */
public abstract class StackedIterator implements Iterator {public static class __CLR4_0_66w96w9l1l0dwen{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,8989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private LinkedList iteratorStack;
    private Navigator navigator;

    private Set created;

    public StackedIterator(Object contextNode,
                           Navigator navigator) {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8937);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8938);this.iteratorStack = new LinkedList();
        __CLR4_0_66w96w9l1l0dwen.R.inc(8939);this.created = new HashSet();

        __CLR4_0_66w96w9l1l0dwen.R.inc(8940);init(contextNode,
                navigator);
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    protected StackedIterator() {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8941);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8942);this.iteratorStack = new LinkedList();
        __CLR4_0_66w96w9l1l0dwen.R.inc(8943);this.created = new HashSet();
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    protected void init(Object contextNode,
                        Navigator navigator) {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8944);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8945);this.navigator = navigator;

        //pushIterator( internalCreateIterator( contextNode ) );
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    protected Iterator internalCreateIterator(Object contextNode) {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8946);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8947);if ((((this.created.contains(contextNode))&&(__CLR4_0_66w96w9l1l0dwen.R.iget(8948)!=0|true))||(__CLR4_0_66w96w9l1l0dwen.R.iget(8949)==0&false))) {{
            __CLR4_0_66w96w9l1l0dwen.R.inc(8950);return null;
        }

        }__CLR4_0_66w96w9l1l0dwen.R.inc(8951);this.created.add(contextNode);

        __CLR4_0_66w96w9l1l0dwen.R.inc(8952);return createIterator(contextNode);
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    public boolean hasNext() {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8953);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8954);Iterator curIter = currentIterator();

        __CLR4_0_66w96w9l1l0dwen.R.inc(8955);if ((((curIter == null)&&(__CLR4_0_66w96w9l1l0dwen.R.iget(8956)!=0|true))||(__CLR4_0_66w96w9l1l0dwen.R.iget(8957)==0&false))) {{
            __CLR4_0_66w96w9l1l0dwen.R.inc(8958);return false;
        }

        }__CLR4_0_66w96w9l1l0dwen.R.inc(8959);return curIter.hasNext();
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    public Object next() throws NoSuchElementException {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8960);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8961);if ((((!hasNext())&&(__CLR4_0_66w96w9l1l0dwen.R.iget(8962)!=0|true))||(__CLR4_0_66w96w9l1l0dwen.R.iget(8963)==0&false))) {{
            __CLR4_0_66w96w9l1l0dwen.R.inc(8964);throw new NoSuchElementException();
        }

        }__CLR4_0_66w96w9l1l0dwen.R.inc(8965);Iterator curIter = currentIterator();
        __CLR4_0_66w96w9l1l0dwen.R.inc(8966);Object object = curIter.next();

        __CLR4_0_66w96w9l1l0dwen.R.inc(8967);pushIterator(internalCreateIterator(object));

        __CLR4_0_66w96w9l1l0dwen.R.inc(8968);return object;
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    public void remove() throws UnsupportedOperationException {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8969);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8970);throw new UnsupportedOperationException();
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    abstract protected Iterator createIterator(Object contextNode);

    protected void pushIterator(Iterator iter) {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8971);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8972);if ((((iter != null)&&(__CLR4_0_66w96w9l1l0dwen.R.iget(8973)!=0|true))||(__CLR4_0_66w96w9l1l0dwen.R.iget(8974)==0&false))) {{
            __CLR4_0_66w96w9l1l0dwen.R.inc(8975);this.iteratorStack.addFirst(iter); //addLast( iter );
        }
    }}finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    private Iterator currentIterator() {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8976);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8977);while ((((iteratorStack.size() > 0)&&(__CLR4_0_66w96w9l1l0dwen.R.iget(8978)!=0|true))||(__CLR4_0_66w96w9l1l0dwen.R.iget(8979)==0&false))) {{
            __CLR4_0_66w96w9l1l0dwen.R.inc(8980);Iterator curIter = (Iterator) iteratorStack.getFirst();

            __CLR4_0_66w96w9l1l0dwen.R.inc(8981);if ((((curIter.hasNext())&&(__CLR4_0_66w96w9l1l0dwen.R.iget(8982)!=0|true))||(__CLR4_0_66w96w9l1l0dwen.R.iget(8983)==0&false))) {{
                __CLR4_0_66w96w9l1l0dwen.R.inc(8984);return curIter;
            }

            }__CLR4_0_66w96w9l1l0dwen.R.inc(8985);iteratorStack.removeFirst();
        }

        }__CLR4_0_66w96w9l1l0dwen.R.inc(8986);return null;
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}

    protected Navigator getNavigator() {try{__CLR4_0_66w96w9l1l0dwen.R.inc(8987);
        __CLR4_0_66w96w9l1l0dwen.R.inc(8988);return this.navigator;
    }finally{__CLR4_0_66w96w9l1l0dwen.R.flushNeeded();}}
}
