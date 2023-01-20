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


package org.jaxen.function;

import java.util.Iterator;
import java.util.List;

import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;

/**
 * <p>
 * <b>4.3</b> <code><i>boolean</i> lang(<i>string</i>)</code>
 * </p>
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath#function-lang">
 * <p>
 * The <b>lang</b> function returns true or false depending on whether
 * the language of the context node as specified by
 * <code>xml:lang</code> attributes is the same as or is a sublanguage
 * of the language specified by the argument string. The language of the
 * context node is determined by the value of the <code>xml:lang</code>
 * 
 * attribute on the context node, or, if the context node has no
 * <code>xml:lang</code> attribute, by the value of the
 * <code>xml:lang</code> attribute on the nearest ancestor of the
 * context node that has an <code>xml:lang</code> attribute. If there
 * is no such attribute, then <b><a href="#function-lang">lang</a></b>
 * returns false. If there is such an attribute, then <b><a
 * href="#function-lang">lang</a></b> returns true if the attribute
 * value is equal to the argument ignoring case, or if there is some
 * suffix starting with <code>-</code> such that the attribute value
 * is equal to the argument ignoring that suffix of the attribute value
 * and ignoring case. For example, <code>lang("en")</code> would
 * return true if the context node is any of these five elements:
 * </p>
 * 
 * <pre>
 *  &lt;para xml:lang=&quot;en&quot;/&gt;
 *  &lt;div xml:lang=&quot;en&quot;&gt;&lt;para/&gt;&lt;/div&gt;
 *  &lt;para xml:lang=&quot;EN&quot;/&gt;
 *  &lt;para xml:lang=&quot;en-us&quot;/&gt;
 * </pre>
 * 
 * </blockquote>
 * 
 * @author Attila Szegedi (szegedia @ freemail.hu)
 * @see <a href="https://www.w3.org/TR/xpath#function-lang"
 *      target="_top">XPath Specification</a>
 */
public class LangFunction implements Function
{public static class __CLR4_0_62fa2fal1l0dvu2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3183,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String LANG_LOCALNAME = "lang";
    private static final String XMLNS_URI = 
        "http://www.w3.org/XML/1998/namespace";
    

    /**
     * Create a new <code>LangFunction</code> object.
     */
    public LangFunction() {try{__CLR4_0_62fa2fal1l0dvu2.R.inc(3142);}finally{__CLR4_0_62fa2fal1l0dvu2.R.flushNeeded();}}
    
    
    /**
     * <p>
     * Determines whether or not the context node is written in the language specified
     * by the XPath string-value of <code>args.get(0)</code>,
     * as determined by the nearest <code>xml:lang</code> attribute in scope. 
     * </p>
     * 
     * @param context the context in which to evaluate the <code>lang()</code> function
     * @param args the arguments to the lang function
     * @return a <code>Boolean</code> indicating whether the context node is written in
     *     the specified language
     * @throws FunctionCallException if <code>args</code> does not have length one
     * 
     */
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62fa2fal1l0dvu2.R.inc(3143);
        __CLR4_0_62fa2fal1l0dvu2.R.inc(3144);if ((((args.size() != 1)&&(__CLR4_0_62fa2fal1l0dvu2.R.iget(3145)!=0|true))||(__CLR4_0_62fa2fal1l0dvu2.R.iget(3146)==0&false))) {{
            __CLR4_0_62fa2fal1l0dvu2.R.inc(3147);throw new FunctionCallException("lang() requires exactly one argument.");   
        }
        
        }__CLR4_0_62fa2fal1l0dvu2.R.inc(3148);Object arg = args.get(0);
            
        __CLR4_0_62fa2fal1l0dvu2.R.inc(3149);try {
            __CLR4_0_62fa2fal1l0dvu2.R.inc(3150);return evaluate(context.getNodeSet(), arg, context.getNavigator() );
        }
        catch(UnsupportedAxisException e) {
            __CLR4_0_62fa2fal1l0dvu2.R.inc(3151);throw new FunctionCallException("Can't evaluate lang()", 
                                                 e);
        }
       
    }finally{__CLR4_0_62fa2fal1l0dvu2.R.flushNeeded();}}

    private static Boolean evaluate(List contextNodes, Object lang, Navigator nav)
      throws UnsupportedAxisException
    {try{__CLR4_0_62fa2fal1l0dvu2.R.inc(3152);
        __CLR4_0_62fa2fal1l0dvu2.R.inc(3153);return (((evaluate(contextNodes.get(0), 
            StringFunction.evaluate(lang, nav), nav)
            )&&(__CLR4_0_62fa2fal1l0dvu2.R.iget(3154)!=0|true))||(__CLR4_0_62fa2fal1l0dvu2.R.iget(3155)==0&false))? Boolean.TRUE : Boolean.FALSE;
    }finally{__CLR4_0_62fa2fal1l0dvu2.R.flushNeeded();}}

    private static boolean evaluate(Object node, String lang, Navigator nav)
      throws UnsupportedAxisException
    {try{__CLR4_0_62fa2fal1l0dvu2.R.inc(3156);
        
        __CLR4_0_62fa2fal1l0dvu2.R.inc(3157);Object element = node;
        __CLR4_0_62fa2fal1l0dvu2.R.inc(3158);if ((((! nav.isElement(element))&&(__CLR4_0_62fa2fal1l0dvu2.R.iget(3159)!=0|true))||(__CLR4_0_62fa2fal1l0dvu2.R.iget(3160)==0&false))) {{
            __CLR4_0_62fa2fal1l0dvu2.R.inc(3161);element = nav.getParentNode(node);
        }
        }__CLR4_0_62fa2fal1l0dvu2.R.inc(3162);while ((((element != null && nav.isElement(element))&&(__CLR4_0_62fa2fal1l0dvu2.R.iget(3163)!=0|true))||(__CLR4_0_62fa2fal1l0dvu2.R.iget(3164)==0&false))) 
        {{
            __CLR4_0_62fa2fal1l0dvu2.R.inc(3165);Iterator attrs = nav.getAttributeAxisIterator(element);
            __CLR4_0_62fa2fal1l0dvu2.R.inc(3166);while((((attrs.hasNext())&&(__CLR4_0_62fa2fal1l0dvu2.R.iget(3167)!=0|true))||(__CLR4_0_62fa2fal1l0dvu2.R.iget(3168)==0&false)))
            {{
                __CLR4_0_62fa2fal1l0dvu2.R.inc(3169);Object attr = attrs.next();
                __CLR4_0_62fa2fal1l0dvu2.R.inc(3170);if((((LANG_LOCALNAME.equals(nav.getAttributeName(attr)) && 
                   XMLNS_URI.equals(nav.getAttributeNamespaceUri(attr)))&&(__CLR4_0_62fa2fal1l0dvu2.R.iget(3171)!=0|true))||(__CLR4_0_62fa2fal1l0dvu2.R.iget(3172)==0&false)))
                {{
                    __CLR4_0_62fa2fal1l0dvu2.R.inc(3173);return 
                        isSublang(nav.getAttributeStringValue(attr), lang);
                }
            }}
            }__CLR4_0_62fa2fal1l0dvu2.R.inc(3174);element = nav.getParentNode(element);
        }
        }__CLR4_0_62fa2fal1l0dvu2.R.inc(3175);return false;
    }finally{__CLR4_0_62fa2fal1l0dvu2.R.flushNeeded();}}
    
    private static boolean isSublang(String sublang, String lang)
    {try{__CLR4_0_62fa2fal1l0dvu2.R.inc(3176);
        __CLR4_0_62fa2fal1l0dvu2.R.inc(3177);if((((sublang.equalsIgnoreCase(lang))&&(__CLR4_0_62fa2fal1l0dvu2.R.iget(3178)!=0|true))||(__CLR4_0_62fa2fal1l0dvu2.R.iget(3179)==0&false)))
        {{
            __CLR4_0_62fa2fal1l0dvu2.R.inc(3180);return true;
        }
        }__CLR4_0_62fa2fal1l0dvu2.R.inc(3181);int ll = lang.length();
        __CLR4_0_62fa2fal1l0dvu2.R.inc(3182);return 
            sublang.length() > ll && 
            sublang.charAt(ll) == '-' && 
            sublang.substring(0, ll).equalsIgnoreCase(lang);
    }finally{__CLR4_0_62fa2fal1l0dvu2.R.flushNeeded();}}
    
}

