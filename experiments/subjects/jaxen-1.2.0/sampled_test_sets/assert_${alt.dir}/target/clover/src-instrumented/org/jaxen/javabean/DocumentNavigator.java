/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ *//*
 $Id$

 Copyright 2003 The Werken Company. All Rights Reserved.
 
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are
met:

  * Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.

  * Neither the name of the Jaxen Project nor the names of its
    contributors may be used to endorse or promote products derived 
    from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

 */
package org.jaxen.javabean;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Collection;

import org.jaxen.DefaultNavigator;
import org.jaxen.FunctionCallException;
import org.jaxen.NamedAccessNavigator;
import org.jaxen.Navigator;
import org.jaxen.XPath;
import org.jaxen.JaxenConstants;
import org.jaxen.util.SingleObjectIterator;

/** 
 * Interface for navigating around a JavaBean object model.
 *
 * <p>
 * This class is not intended for direct usage, but is
 * used by the Jaxen engine during evaluation.
 * </p>
 *
 * @see XPath
 *
 * @author <a href="mailto:bob@werken.com">bob mcwhirter</a>
 */
public class DocumentNavigator
    extends DefaultNavigator
    implements NamedAccessNavigator
{public static class __CLR4_0_632j32jl1l0dw00{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * 
     */
    private static final long serialVersionUID = -1768605107626726499L;

    /** Empty Class array. */
    private static final Class[] EMPTY_CLASS_ARRAY = new Class[0];

    /** Empty Object array. */
    private static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

    /** Singleton implementation.
     */
    private static final DocumentNavigator instance = new DocumentNavigator();

    /** Retrieve the singleton instance of this <code>DocumentNavigator</code>.
     */
    public static Navigator getInstance()
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3979);
        __CLR4_0_632j32jl1l0dw00.R.inc(3980);return instance;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public boolean isElement(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3981);
        __CLR4_0_632j32jl1l0dw00.R.inc(3982);return (obj instanceof Element);
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public boolean isComment(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3983);
        __CLR4_0_632j32jl1l0dw00.R.inc(3984);return false;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public boolean isText(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3985);
        __CLR4_0_632j32jl1l0dw00.R.inc(3986);return ( obj instanceof String );
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public boolean isAttribute(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3987);
        __CLR4_0_632j32jl1l0dw00.R.inc(3988);return false;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public boolean isProcessingInstruction(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3989);
        __CLR4_0_632j32jl1l0dw00.R.inc(3990);return false;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public boolean isDocument(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3991);
        __CLR4_0_632j32jl1l0dw00.R.inc(3992);return false;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public boolean isNamespace(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3993);
        __CLR4_0_632j32jl1l0dw00.R.inc(3994);return false;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getElementName(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3995);
        __CLR4_0_632j32jl1l0dw00.R.inc(3996);return ((Element)obj).getName();
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getElementNamespaceUri(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3997);
        __CLR4_0_632j32jl1l0dw00.R.inc(3998);return "";
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getElementQName(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(3999);
        __CLR4_0_632j32jl1l0dw00.R.inc(4000);return "";
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getAttributeName(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4001);
        __CLR4_0_632j32jl1l0dw00.R.inc(4002);return "";
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getAttributeNamespaceUri(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4003);
        __CLR4_0_632j32jl1l0dw00.R.inc(4004);return "";
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getAttributeQName(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4005);
        __CLR4_0_632j32jl1l0dw00.R.inc(4006);return "";
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public Iterator getChildAxisIterator(Object contextNode)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4007);
        __CLR4_0_632j32jl1l0dw00.R.inc(4008);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    /**
     * Retrieves an <code>Iterator</code> over the child elements that
     * match the supplied name.
     *
     * @param contextNode  the origin context node
     * @param localName  the local name of the children to return, always present
     * @param namespacePrefix  the prefix of the namespace of the children to return
     * @param namespaceURI  the namespace URI of the children to return
     * @return an Iterator that traverses the named children, or null if none
     */
    public Iterator getChildAxisIterator(Object contextNode,
                                         String localName,
                                         String namespacePrefix,
                                         String namespaceURI)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4009);
        __CLR4_0_632j32jl1l0dw00.R.inc(4010);Class cls = ((Element)contextNode).getObject().getClass();

        __CLR4_0_632j32jl1l0dw00.R.inc(4011);String methodName = javacase( localName );

        __CLR4_0_632j32jl1l0dw00.R.inc(4012);Method method = null;
        
        __CLR4_0_632j32jl1l0dw00.R.inc(4013);try
        {
            __CLR4_0_632j32jl1l0dw00.R.inc(4014);method = cls.getMethod( "get" + methodName, EMPTY_CLASS_ARRAY );
        }
        catch (NoSuchMethodException e)
        {
            __CLR4_0_632j32jl1l0dw00.R.inc(4015);try
            {
                __CLR4_0_632j32jl1l0dw00.R.inc(4016);method = cls.getMethod( "get" + methodName + "s", EMPTY_CLASS_ARRAY );
            }
            catch (NoSuchMethodException ee)
            {
                __CLR4_0_632j32jl1l0dw00.R.inc(4017);try
                {
                    __CLR4_0_632j32jl1l0dw00.R.inc(4018);method = cls.getMethod( localName, EMPTY_CLASS_ARRAY );
                }
                catch (NoSuchMethodException eee)
                {
                    __CLR4_0_632j32jl1l0dw00.R.inc(4019);method = null;
                }
            }
        }

        __CLR4_0_632j32jl1l0dw00.R.inc(4020);if ( (((method == null )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4021)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4022)==0&false)))
        {{
            __CLR4_0_632j32jl1l0dw00.R.inc(4023);return JaxenConstants.EMPTY_ITERATOR;
        }

        }__CLR4_0_632j32jl1l0dw00.R.inc(4024);try
        {
            __CLR4_0_632j32jl1l0dw00.R.inc(4025);Object result = method.invoke( ((Element)contextNode).getObject(), EMPTY_OBJECT_ARRAY );
            
            __CLR4_0_632j32jl1l0dw00.R.inc(4026);if ( (((result == null )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4027)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4028)==0&false)))
            {{
                __CLR4_0_632j32jl1l0dw00.R.inc(4029);return JaxenConstants.EMPTY_ITERATOR;
            } 
            
            }__CLR4_0_632j32jl1l0dw00.R.inc(4030);if ( (((result instanceof Collection )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4031)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4032)==0&false)))
            {{
                __CLR4_0_632j32jl1l0dw00.R.inc(4033);return new ElementIterator( (Element) contextNode, localName, ((Collection)result).iterator() );
            }
            
            }__CLR4_0_632j32jl1l0dw00.R.inc(4034);if ( (((result.getClass().isArray() )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4035)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4036)==0&false)))
            {{
                __CLR4_0_632j32jl1l0dw00.R.inc(4037);return JaxenConstants.EMPTY_ITERATOR;
            }
            
            }__CLR4_0_632j32jl1l0dw00.R.inc(4038);return new SingleObjectIterator( new Element( (Element) contextNode, localName, result ) );
        }
        catch (IllegalAccessException e)
        {
            // swallow
        }
        catch (InvocationTargetException e)
        {
            // swallow
        }

        __CLR4_0_632j32jl1l0dw00.R.inc(4039);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public Iterator getParentAxisIterator(Object contextNode)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4040);
        __CLR4_0_632j32jl1l0dw00.R.inc(4041);if ( (((contextNode instanceof Element )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4042)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4043)==0&false)))
        {{
            __CLR4_0_632j32jl1l0dw00.R.inc(4044);return new SingleObjectIterator( ((Element)contextNode).getParent() );
        }

        }__CLR4_0_632j32jl1l0dw00.R.inc(4045);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public Iterator getAttributeAxisIterator(Object contextNode)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4046);
        __CLR4_0_632j32jl1l0dw00.R.inc(4047);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    /**
     * Retrieves an <code>Iterator</code> over the attribute elements that
     * match the supplied name.
     *
     * @param contextNode  the origin context node
     * @param localName  the local name of the attributes to return, always present
     * @param namespacePrefix  the prefix of the namespace of the attributes to return
     * @param namespaceURI  the namespace URI of the attributes to return
     * @return an Iterator that traverses the named attributes, not null
     */
    public Iterator getAttributeAxisIterator(Object contextNode,
                                             String localName,
                                             String namespacePrefix,
                                             String namespaceURI) {try{__CLR4_0_632j32jl1l0dw00.R.inc(4048);
        __CLR4_0_632j32jl1l0dw00.R.inc(4049);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}
        
    public Iterator getNamespaceAxisIterator(Object contextNode)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4050);
        __CLR4_0_632j32jl1l0dw00.R.inc(4051);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public Object getDocumentNode(Object contextNode)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4052);
        __CLR4_0_632j32jl1l0dw00.R.inc(4053);return null;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public Object getParentNode(Object contextNode)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4054);
        __CLR4_0_632j32jl1l0dw00.R.inc(4055);if ( (((contextNode instanceof Element )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4056)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4057)==0&false)))
        {{
            __CLR4_0_632j32jl1l0dw00.R.inc(4058);return ((Element)contextNode).getParent();
        }

        }__CLR4_0_632j32jl1l0dw00.R.inc(4059);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getTextStringValue(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4060);
        __CLR4_0_632j32jl1l0dw00.R.inc(4061);if ( (((obj instanceof Element )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4062)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4063)==0&false)))
        {{
            __CLR4_0_632j32jl1l0dw00.R.inc(4064);return ((Element)obj).getObject().toString();
        }
        }__CLR4_0_632j32jl1l0dw00.R.inc(4065);return obj.toString();
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getElementStringValue(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4066);
        __CLR4_0_632j32jl1l0dw00.R.inc(4067);if ( (((obj instanceof Element )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4068)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4069)==0&false)))
        {{
            __CLR4_0_632j32jl1l0dw00.R.inc(4070);return ((Element)obj).getObject().toString();
        }
        }__CLR4_0_632j32jl1l0dw00.R.inc(4071);return obj.toString();
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getAttributeStringValue(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4072);
        __CLR4_0_632j32jl1l0dw00.R.inc(4073);return obj.toString();
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getNamespaceStringValue(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4074);
        __CLR4_0_632j32jl1l0dw00.R.inc(4075);return obj.toString();
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getNamespacePrefix(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4076);
        __CLR4_0_632j32jl1l0dw00.R.inc(4077);return null;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getCommentStringValue(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4078);
        __CLR4_0_632j32jl1l0dw00.R.inc(4079);return null;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}
    
    public String translateNamespacePrefixToUri(String prefix, Object context)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4080);
        __CLR4_0_632j32jl1l0dw00.R.inc(4081);return null;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}
    
    public short getNodeType(Object node) 
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4082);
        __CLR4_0_632j32jl1l0dw00.R.inc(4083);return 0;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}
    
    public Object getDocument(String uri) throws FunctionCallException
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4084);
        __CLR4_0_632j32jl1l0dw00.R.inc(4085);return null;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getProcessingInstructionTarget(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4086);
        __CLR4_0_632j32jl1l0dw00.R.inc(4087);return null;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public String getProcessingInstructionData(Object obj)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4088);
        __CLR4_0_632j32jl1l0dw00.R.inc(4089);return null;
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    public XPath parseXPath(String xpath)
        throws org.jaxen.saxpath.SAXPathException
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4090);
        __CLR4_0_632j32jl1l0dw00.R.inc(4091);return new JavaBeanXPath( xpath );
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}

    protected String javacase(String name)
    {try{__CLR4_0_632j32jl1l0dw00.R.inc(4092);
        __CLR4_0_632j32jl1l0dw00.R.inc(4093);if ( (((name.length() == 0 )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4094)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4095)==0&false)))
        {{
            __CLR4_0_632j32jl1l0dw00.R.inc(4096);return name;
        }
        }else {__CLR4_0_632j32jl1l0dw00.R.inc(4097);if ( (((name.length() == 1 )&&(__CLR4_0_632j32jl1l0dw00.R.iget(4098)!=0|true))||(__CLR4_0_632j32jl1l0dw00.R.iget(4099)==0&false)))
        {{
            __CLR4_0_632j32jl1l0dw00.R.inc(4100);return name.toUpperCase();
        } 

        }}__CLR4_0_632j32jl1l0dw00.R.inc(4101);return name.substring( 0, 1 ).toUpperCase() + name.substring( 1 );
    }finally{__CLR4_0_632j32jl1l0dw00.R.flushNeeded();}}
}
