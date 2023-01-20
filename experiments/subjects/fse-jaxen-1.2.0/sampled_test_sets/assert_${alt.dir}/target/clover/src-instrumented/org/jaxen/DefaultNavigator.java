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



package org.jaxen;

import java.util.Iterator;

import org.jaxen.pattern.Pattern;
import org.jaxen.util.AncestorAxisIterator;
import org.jaxen.util.AncestorOrSelfAxisIterator;
import org.jaxen.util.DescendantAxisIterator;
import org.jaxen.util.DescendantOrSelfAxisIterator;
import org.jaxen.util.FollowingAxisIterator;
import org.jaxen.util.FollowingSiblingAxisIterator;
import org.jaxen.util.PrecedingAxisIterator;
import org.jaxen.util.PrecedingSiblingAxisIterator;
import org.jaxen.util.SelfAxisIterator;

/** Default implementation of {@link Navigator}.
 *
 *  <p>
 *  This implementation is an abstract class, since
 *  some required operations cannot be implemented without
 *  additional knowledge of the object model.
 *  </p>
 *
 *  <p>
 *  When possible, default method implementations build
 *  upon each other, to reduce the number of methods required
 *  to be implemented for each object model.  All methods,
 *  of course, may be overridden, to provide more-efficient
 *  implementations.
 *  </p>
 *
 *  @author bob mcwhirter (bob@werken.com)
 *  @author Erwin Bolwidt (ejb@klomp.org)
 */
public abstract class DefaultNavigator implements Navigator
{public static class __CLR4_0_65t5tl1l0dv1x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Throws <code>UnsupportedAxisException</code>
     * 
     * @param contextNode
     * @return never returns
     * @throws UnsupportedAxisException always
     */
    public Iterator getChildAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(209);
        __CLR4_0_65t5tl1l0dv1x.R.inc(210);throw new UnsupportedAxisException("child");
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    /* (non-Javadoc)
     * @see org.jaxen.Navigator#getDescendantAxisIterator(java.lang.Object)
     */
    public Iterator getDescendantAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(211);
        __CLR4_0_65t5tl1l0dv1x.R.inc(212);return new DescendantAxisIterator( contextNode,
                                           this );
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    /** Throws <code>UnsupportedAxisException</code>
     * 
     * @param  contextNode
     * @return never returns
     * @throws UnsupportedAxisException
     */
    public Iterator getParentAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(213);
        __CLR4_0_65t5tl1l0dv1x.R.inc(214);throw new UnsupportedAxisException("parent");
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public Iterator getAncestorAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(215);
        __CLR4_0_65t5tl1l0dv1x.R.inc(216);return new AncestorAxisIterator( contextNode,
                                         this );
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}


    public Iterator getFollowingSiblingAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(217);
        __CLR4_0_65t5tl1l0dv1x.R.inc(218);return new FollowingSiblingAxisIterator( contextNode,
                                                 this );
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}


    public Iterator getPrecedingSiblingAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(219);
        __CLR4_0_65t5tl1l0dv1x.R.inc(220);return new PrecedingSiblingAxisIterator( contextNode,
                                                 this );
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public Iterator getFollowingAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(221);
        __CLR4_0_65t5tl1l0dv1x.R.inc(222);return new FollowingAxisIterator( contextNode,
                                          this );

        // throw new UnsupportedAxisException("following");
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}


    public Iterator getPrecedingAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(223);
        __CLR4_0_65t5tl1l0dv1x.R.inc(224);return new PrecedingAxisIterator( contextNode,
                                         this );

        // throw new UnsupportedAxisException("preceding");
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    /** Throws <code>UnsupportedAxisException</code>. Subclasses that 
     * support the attribute axis must override this method.
     * 
     * @param contextNode
     * @return never returns
     * @throws UnsupportedAxisException
     */
    public Iterator getAttributeAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(225);
        __CLR4_0_65t5tl1l0dv1x.R.inc(226);throw new UnsupportedAxisException("attribute");
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    /** Throws <code>UnsupportedAxisException</code>. Subclasses that 
     * support the namespace axis must override this method.
     * 
     * @param contextNode
     * @return never returns
     * @throws UnsupportedAxisException
     */
    public Iterator getNamespaceAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(227);
        __CLR4_0_65t5tl1l0dv1x.R.inc(228);throw new UnsupportedAxisException("namespace");
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public Iterator getSelfAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(229);
        __CLR4_0_65t5tl1l0dv1x.R.inc(230);return new SelfAxisIterator( contextNode );
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public Iterator getDescendantOrSelfAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(231);
        __CLR4_0_65t5tl1l0dv1x.R.inc(232);return new DescendantOrSelfAxisIterator( contextNode,
                                                 this );
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public Iterator getAncestorOrSelfAxisIterator(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(233);
        __CLR4_0_65t5tl1l0dv1x.R.inc(234);return new AncestorOrSelfAxisIterator( contextNode,
                                               this );
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public Object getDocumentNode(Object contextNode)
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(235);
        __CLR4_0_65t5tl1l0dv1x.R.inc(236);return null;
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}
    
    public String translateNamespacePrefixToUri(String prefix, Object element)
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(237);
        __CLR4_0_65t5tl1l0dv1x.R.inc(238);return null;
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public String getProcessingInstructionTarget(Object obj)
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(239);
        __CLR4_0_65t5tl1l0dv1x.R.inc(240);return null;
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public String getProcessingInstructionData(Object obj)
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(241);
        __CLR4_0_65t5tl1l0dv1x.R.inc(242);return null;
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    public short getNodeType(Object node)
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(243);
        __CLR4_0_65t5tl1l0dv1x.R.inc(244);if ( (((isElement(node) )&&(__CLR4_0_65t5tl1l0dv1x.R.iget(245)!=0|true))||(__CLR4_0_65t5tl1l0dv1x.R.iget(246)==0&false))) 
        {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(247);return Pattern.ELEMENT_NODE;
        }
        }else {__CLR4_0_65t5tl1l0dv1x.R.inc(248);if ( (((isAttribute(node) )&&(__CLR4_0_65t5tl1l0dv1x.R.iget(249)!=0|true))||(__CLR4_0_65t5tl1l0dv1x.R.iget(250)==0&false))) 
        {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(251);return Pattern.ATTRIBUTE_NODE;
        }
        }else {__CLR4_0_65t5tl1l0dv1x.R.inc(252);if ( (((isText(node) )&&(__CLR4_0_65t5tl1l0dv1x.R.iget(253)!=0|true))||(__CLR4_0_65t5tl1l0dv1x.R.iget(254)==0&false))) 
        {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(255);return Pattern.TEXT_NODE;
        }
        }else {__CLR4_0_65t5tl1l0dv1x.R.inc(256);if ( (((isComment(node) )&&(__CLR4_0_65t5tl1l0dv1x.R.iget(257)!=0|true))||(__CLR4_0_65t5tl1l0dv1x.R.iget(258)==0&false))) 
        {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(259);return Pattern.COMMENT_NODE;
        }
        }else {__CLR4_0_65t5tl1l0dv1x.R.inc(260);if ( (((isDocument(node) )&&(__CLR4_0_65t5tl1l0dv1x.R.iget(261)!=0|true))||(__CLR4_0_65t5tl1l0dv1x.R.iget(262)==0&false))) 
        {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(263);return Pattern.DOCUMENT_NODE;
        }
        }else {__CLR4_0_65t5tl1l0dv1x.R.inc(264);if ( (((isProcessingInstruction(node) )&&(__CLR4_0_65t5tl1l0dv1x.R.iget(265)!=0|true))||(__CLR4_0_65t5tl1l0dv1x.R.iget(266)==0&false))) 
        {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(267);return Pattern.PROCESSING_INSTRUCTION_NODE;
        }
        }else {__CLR4_0_65t5tl1l0dv1x.R.inc(268);if ( (((isNamespace(node) )&&(__CLR4_0_65t5tl1l0dv1x.R.iget(269)!=0|true))||(__CLR4_0_65t5tl1l0dv1x.R.iget(270)==0&false))) 
        {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(271);return Pattern.NAMESPACE_NODE;
        }
        }else {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(272);return Pattern.UNKNOWN_NODE;
        }
    }}}}}}}}finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}
    
    /**
     * Default inefficient implementation. Subclasses 
     * should override this method.
     *
     * @param contextNode   the node whose parent to return
     * @return the parent node
     * @throws UnsupportedAxisException if the parent axis is not supported
     */
    public Object getParentNode(Object contextNode) throws UnsupportedAxisException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(273);
        __CLR4_0_65t5tl1l0dv1x.R.inc(274);Iterator iter = getParentAxisIterator( contextNode );
        __CLR4_0_65t5tl1l0dv1x.R.inc(275);if ( (((iter != null && iter.hasNext() )&&(__CLR4_0_65t5tl1l0dv1x.R.iget(276)!=0|true))||(__CLR4_0_65t5tl1l0dv1x.R.iget(277)==0&false)))
        {{
            __CLR4_0_65t5tl1l0dv1x.R.inc(278);return iter.next();
        }
        }__CLR4_0_65t5tl1l0dv1x.R.inc(279);return null;
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    /**
     *  Default implementation that always returns null. Override in subclass
     *  if the subclass can load documents. 
     *
     * @param url the URL of the document to load
     *
     * @return null
     * @throws FunctionCallException if an error occurs while loading the
     *    URL; e.g. an I/O error or the document is malformed
     */
    public Object getDocument(String url) throws FunctionCallException
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(280);
        __CLR4_0_65t5tl1l0dv1x.R.inc(281);return null;
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}

    /**
     *  Default implementation that cannot find elements. Override in subclass
     *  if subclass does know about attribute types.
     *
     *  @param contextNode   a node from the document in which to look for the
     *                       id
     *  @param elementId   id to look for
     *
     *  @return   null
     */
    public Object getElementById(Object contextNode, String elementId)
    {try{__CLR4_0_65t5tl1l0dv1x.R.inc(282);
        __CLR4_0_65t5tl1l0dv1x.R.inc(283);return null;
    }finally{__CLR4_0_65t5tl1l0dv1x.R.flushNeeded();}}
    
}
