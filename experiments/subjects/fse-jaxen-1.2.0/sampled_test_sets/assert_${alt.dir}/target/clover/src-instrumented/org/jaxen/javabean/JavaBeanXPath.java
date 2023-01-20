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

package org.jaxen.javabean;

import org.jaxen.Context;
import org.jaxen.BaseXPath;
import org.jaxen.JaxenException;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/** An XPath implementation for JavaBeans.
 *
 * <p>This is the main entry point for matching an XPath against a JavaBean
 * tree.  You create a compiled XPath object, then match it against
 * one or more context nodes using the {@link #selectNodes(Object)}
 * method, as in the following example:</p>
 *
 * <pre>
 * Node node = ...;
 * XPath path = new JavaBeanXPath("a/b/c");
 * List results = path.selectNodes(node);
 * </pre>
 *
 * @see BaseXPath
 *
 * @author <a href="mailto:bob@werken.com">bob mcwhirter</a>
 *
 * @version $Revision$
 */
public class JavaBeanXPath extends BaseXPath
{public static class __CLR4_0_636i36il1l0dw0o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * 
     */
    private static final long serialVersionUID = -1567521943360266313L;

    /** Construct given an XPath expression string.
     *
     *  @param xpathExpr The XPath expression.
     *
     *  @throws JaxenException if there is a syntax error while
     *          parsing the expression
     */
    public JavaBeanXPath(String xpathExpr) throws JaxenException
    {
        super( xpathExpr, DocumentNavigator.getInstance() );__CLR4_0_636i36il1l0dw0o.R.inc(4123);try{__CLR4_0_636i36il1l0dw0o.R.inc(4122);
    }finally{__CLR4_0_636i36il1l0dw0o.R.flushNeeded();}}

    protected Context getContext(Object node)
    {try{__CLR4_0_636i36il1l0dw0o.R.inc(4124);
        __CLR4_0_636i36il1l0dw0o.R.inc(4125);if ( (((node instanceof Context )&&(__CLR4_0_636i36il1l0dw0o.R.iget(4126)!=0|true))||(__CLR4_0_636i36il1l0dw0o.R.iget(4127)==0&false)))
        {{
            __CLR4_0_636i36il1l0dw0o.R.inc(4128);return (Context) node;
        }

        }__CLR4_0_636i36il1l0dw0o.R.inc(4129);if ( (((node instanceof Element )&&(__CLR4_0_636i36il1l0dw0o.R.iget(4130)!=0|true))||(__CLR4_0_636i36il1l0dw0o.R.iget(4131)==0&false)))
        {{
            __CLR4_0_636i36il1l0dw0o.R.inc(4132);return super.getContext( node );
        }

        }__CLR4_0_636i36il1l0dw0o.R.inc(4133);if ( (((node instanceof List )&&(__CLR4_0_636i36il1l0dw0o.R.iget(4134)!=0|true))||(__CLR4_0_636i36il1l0dw0o.R.iget(4135)==0&false)))
        {{
            __CLR4_0_636i36il1l0dw0o.R.inc(4136);List newList = new ArrayList();

            __CLR4_0_636i36il1l0dw0o.R.inc(4137);for ( Iterator listIter = ((List)node).iterator();
                  (((listIter.hasNext())&&(__CLR4_0_636i36il1l0dw0o.R.iget(4138)!=0|true))||(__CLR4_0_636i36il1l0dw0o.R.iget(4139)==0&false)); )
            {{
                __CLR4_0_636i36il1l0dw0o.R.inc(4140);newList.add( new Element( null, "root", listIter.next() ) );
            }

            }__CLR4_0_636i36il1l0dw0o.R.inc(4141);return super.getContext( newList );
        }

        }__CLR4_0_636i36il1l0dw0o.R.inc(4142);return super.getContext( new Element( null, "root", node ) );
    }finally{__CLR4_0_636i36il1l0dw0o.R.flushNeeded();}}

    public Object evaluate(Object node)
        throws JaxenException
    {try{__CLR4_0_636i36il1l0dw0o.R.inc(4143);
        __CLR4_0_636i36il1l0dw0o.R.inc(4144);Object result = super.evaluate( node );

        __CLR4_0_636i36il1l0dw0o.R.inc(4145);if ( (((result instanceof Element )&&(__CLR4_0_636i36il1l0dw0o.R.iget(4146)!=0|true))||(__CLR4_0_636i36il1l0dw0o.R.iget(4147)==0&false)))
        {{
            __CLR4_0_636i36il1l0dw0o.R.inc(4148);return ((Element)result).getObject();
        }
        }else {__CLR4_0_636i36il1l0dw0o.R.inc(4149);if ( (((result instanceof Collection )&&(__CLR4_0_636i36il1l0dw0o.R.iget(4150)!=0|true))||(__CLR4_0_636i36il1l0dw0o.R.iget(4151)==0&false)))
        {{
            __CLR4_0_636i36il1l0dw0o.R.inc(4152);List newList = new ArrayList();

            __CLR4_0_636i36il1l0dw0o.R.inc(4153);for ( Iterator listIter = ((Collection)result).iterator();
                  (((listIter.hasNext())&&(__CLR4_0_636i36il1l0dw0o.R.iget(4154)!=0|true))||(__CLR4_0_636i36il1l0dw0o.R.iget(4155)==0&false)); )
            {{
                __CLR4_0_636i36il1l0dw0o.R.inc(4156);Object member = listIter.next();

                __CLR4_0_636i36il1l0dw0o.R.inc(4157);if ( (((member instanceof Element )&&(__CLR4_0_636i36il1l0dw0o.R.iget(4158)!=0|true))||(__CLR4_0_636i36il1l0dw0o.R.iget(4159)==0&false)))
                {{
                    __CLR4_0_636i36il1l0dw0o.R.inc(4160);newList.add( ((Element)member).getObject() );
                }
                }else
                {{
                    __CLR4_0_636i36il1l0dw0o.R.inc(4161);newList.add( member );
                }
            }}

            }__CLR4_0_636i36il1l0dw0o.R.inc(4162);return newList;
        }

        }}__CLR4_0_636i36il1l0dw0o.R.inc(4163);return result;
    }finally{__CLR4_0_636i36il1l0dw0o.R.flushNeeded();}}
} 
