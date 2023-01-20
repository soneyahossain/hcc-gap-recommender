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

import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.FunctionCallException;
import org.jaxen.Navigator;
import org.jaxen.UnsupportedAxisException;
import org.jaxen.JaxenRuntimeException;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Iterator;
import java.util.Locale;

/**
 * <p>
 * <b>4.2</b> <code><i>string</i> string(<i>object</i>)</code>
 * </p>
 * 
 * 
 * <blockquote cite="http://www.w3.org/TR/xpath">
 * <p>
 * The <b>string</b> function converts
 * an object to a string as follows:
 * </p>
 * 
 * <ul>
 * 
 * <li>
 * <p>
 * A node-set is converted to a string by returning the <a
 * href="https://www.w3.org/TR/xpath#dt-string-value" target="_top">string-value</a> of the node in the node-set
 * that is first in <a href="https://www.w3.org/TR/xpath#dt-document-order" target="_top">document order</a>. If
 * the node-set is empty, an empty string is returned.
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * A number is converted to a string as follows
 * </p>
 * 
 * <ul>
 * 
 * <li>
 * <p>
 * NaN is converted to the string <code>NaN</code>
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * positive zero is converted to the string <code>0</code>
 * </p>
 * </li>
 * 
 * <li>
 * 
 * <p>
 * negative zero is converted to the string <code>0</code>
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * positive infinity is converted to the string <code>Infinity</code>
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * negative infinity is converted to the string <code>-Infinity</code>
 * 
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * if the number is an integer, the number is represented in decimal
 * form as a <a href="https://www.w3.org/TR/xpath#NT-Number" target="_top">Number</a> with no decimal point and
 * no leading zeros, preceded by a minus sign (<code>-</code>) if
 * the number is negative
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * otherwise, the number is represented in decimal form as a Number including a decimal point with at least
 * one digit before the decimal point and at least one digit after the
 * decimal point, preceded by a minus sign (<code>-</code>) if the
 * number is negative; there must be no leading zeros before the decimal
 * point apart possibly from the one required digit immediately before
 * the decimal point; beyond the one required digit after the decimal
 * point there must be as many, but only as many, more digits as are
 * needed to uniquely distinguish the number from all other IEEE 754
 * numeric values.
 * </p>
 * 
 * </li>
 * 
 * </ul>
 * 
 * </li>
 * 
 * <li>
 * <p>
 * The boolean false value is converted to the string <code>false</code>.
 * The boolean true value is converted to the string <code>true</code>.
 * </p>
 * </li>
 * 
 * <li>
 * <p>
 * An object of a type other than the four basic types is converted to a
 * string in a way that is dependent on that type.
 * </p>
 * 
 * </li>
 * 
 * </ul>
 * 
 * <p>
 * If the argument is omitted, it defaults to a node-set with the
 * context node as its only member.
 * </p>
 * 
 * </blockquote>
 * 
 * @author bob mcwhirter (bob @ werken.com)
 * @see <a href="https://www.w3.org/TR/xpath#function-string"
 *      target="_top">Section 4.2 of the XPath Specification</a>
 */
public class StringFunction implements Function
{public static class __CLR4_0_62om2oml1l0dvwr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,3578,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static DecimalFormat format = (DecimalFormat) NumberFormat.getInstance(Locale.ENGLISH);
    
    static {try{__CLR4_0_62om2oml1l0dvwr.R.inc(3478);
        __CLR4_0_62om2oml1l0dvwr.R.inc(3479);DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);
        __CLR4_0_62om2oml1l0dvwr.R.inc(3480);symbols.setNaN("NaN");
        __CLR4_0_62om2oml1l0dvwr.R.inc(3481);symbols.setInfinity("Infinity");
        __CLR4_0_62om2oml1l0dvwr.R.inc(3482);format.setGroupingUsed(false);
        __CLR4_0_62om2oml1l0dvwr.R.inc(3483);format.setMaximumFractionDigits(32);
        __CLR4_0_62om2oml1l0dvwr.R.inc(3484);format.setDecimalFormatSymbols(symbols);
    }finally{__CLR4_0_62om2oml1l0dvwr.R.flushNeeded();}}

    /**
     * Create a new <code>StringFunction</code> object.
     */
    public StringFunction() {try{__CLR4_0_62om2oml1l0dvwr.R.inc(3485);}finally{__CLR4_0_62om2oml1l0dvwr.R.flushNeeded();}}
    
    /**
     * Returns the string-value of <code>args.get(0)</code> 
     * or of the context node if <code>args</code> is empty.
     * 
     * @param context the context at the point in the
     *         expression where the function is called
     * @param args list with zero or one element
     * 
     * @return a <code>String</code> 
     * 
     * @throws FunctionCallException if <code>args</code> has more than one item
     */    
    public Object call(Context context,
                       List args) throws FunctionCallException
    {try{__CLR4_0_62om2oml1l0dvwr.R.inc(3486);
        __CLR4_0_62om2oml1l0dvwr.R.inc(3487);int size = args.size();

        __CLR4_0_62om2oml1l0dvwr.R.inc(3488);if ( (((size == 0 )&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3489)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3490)==0&false)))
        {{
            __CLR4_0_62om2oml1l0dvwr.R.inc(3491);return evaluate( context.getNodeSet(),
                             context.getNavigator() );
        }
        }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3492);if ( (((size == 1 )&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3493)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3494)==0&false)))
        {{
            __CLR4_0_62om2oml1l0dvwr.R.inc(3495);return evaluate( args.get(0),
                             context.getNavigator() );
        }

        }}__CLR4_0_62om2oml1l0dvwr.R.inc(3496);throw new FunctionCallException( "string() takes at most argument." );
    }finally{__CLR4_0_62om2oml1l0dvwr.R.flushNeeded();}}
    
    /**
     * Returns the XPath string-value of <code>obj</code>.
     * This operation is only defined if obj is a node, node-set,
     * <code>String</code>, <code>Number</code>, or 
     * <code>Boolean</code>. For other types this function
     * returns the empty string. 
     * 
     * @param obj the node, node-set, string, number, or boolean
     *      whose string-value is calculated
     * @param nav the navigator used to calculate the string-value
     * 
     * @return a <code>String</code>. May be empty but is never null.
     */    
    public static String evaluate(Object obj,
                                  Navigator nav)
    {try{__CLR4_0_62om2oml1l0dvwr.R.inc(3497);
        __CLR4_0_62om2oml1l0dvwr.R.inc(3498);try
        {
            // Workaround because XOM uses lists for Text nodes
            // so we need to check for that first
            __CLR4_0_62om2oml1l0dvwr.R.inc(3499);if ((((nav != null && nav.isText(obj))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3500)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3501)==0&false)))
            {{
                __CLR4_0_62om2oml1l0dvwr.R.inc(3502);return nav.getTextStringValue(obj);
            }
            
            }__CLR4_0_62om2oml1l0dvwr.R.inc(3503);if ((((obj instanceof List)&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3504)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3505)==0&false)))
            {{
                __CLR4_0_62om2oml1l0dvwr.R.inc(3506);List list = (List) obj;
                __CLR4_0_62om2oml1l0dvwr.R.inc(3507);if ((((list.isEmpty())&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3508)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3509)==0&false)))
                {{
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3510);return "";
                }
                // do not recurse: only first list should unwrap
                }__CLR4_0_62om2oml1l0dvwr.R.inc(3511);obj = list.get(0);
            }
            
            }__CLR4_0_62om2oml1l0dvwr.R.inc(3512);if ((((nav != null)&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3513)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3514)==0&false))) {{
                // This stack of instanceof really suggests there's 
                // a failure to take advantage of polymorphism here
                __CLR4_0_62om2oml1l0dvwr.R.inc(3515);if ((((nav.isElement(obj))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3516)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3517)==0&false)))
                {{
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3518);return nav.getElementStringValue(obj);
                }
                }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3519);if ((((nav.isAttribute(obj))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3520)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3521)==0&false)))
                {{
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3522);return nav.getAttributeStringValue(obj);
                }
    
                }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3523);if ((((nav.isDocument(obj))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3524)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3525)==0&false)))
                {{
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3526);Iterator childAxisIterator = nav.getChildAxisIterator(obj);
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3527);while ((((childAxisIterator.hasNext())&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3528)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3529)==0&false)))
                    {{
                        __CLR4_0_62om2oml1l0dvwr.R.inc(3530);Object descendant = childAxisIterator.next();
                        __CLR4_0_62om2oml1l0dvwr.R.inc(3531);if ((((nav.isElement(descendant))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3532)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3533)==0&false)))
                        {{
                            __CLR4_0_62om2oml1l0dvwr.R.inc(3534);return nav.getElementStringValue(descendant);
                        }
                    }}
                }}
                }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3535);if ((((nav.isProcessingInstruction(obj))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3536)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3537)==0&false)))
                {{
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3538);return nav.getProcessingInstructionData(obj);
                }
                }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3539);if ((((nav.isComment(obj))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3540)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3541)==0&false)))
                {{
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3542);return nav.getCommentStringValue(obj);
                }
                }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3543);if ((((nav.isText(obj))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3544)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3545)==0&false)))
                {{
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3546);return nav.getTextStringValue(obj);
                }
                }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3547);if ((((nav.isNamespace(obj))&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3548)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3549)==0&false)))
                {{
                    __CLR4_0_62om2oml1l0dvwr.R.inc(3550);return nav.getNamespaceStringValue(obj);
                }
            }}}}}}}}
            
            }__CLR4_0_62om2oml1l0dvwr.R.inc(3551);if ((((obj instanceof String)&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3552)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3553)==0&false)))
            {{
                __CLR4_0_62om2oml1l0dvwr.R.inc(3554);return (String) obj;
            }
            }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3555);if ((((obj instanceof Boolean)&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3556)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3557)==0&false)))
            {{
                __CLR4_0_62om2oml1l0dvwr.R.inc(3558);return stringValue(((Boolean) obj).booleanValue());
            }
            }else {__CLR4_0_62om2oml1l0dvwr.R.inc(3559);if ((((obj instanceof Number)&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3560)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3561)==0&false)))
            {{
                __CLR4_0_62om2oml1l0dvwr.R.inc(3562);return stringValue(((Number) obj).doubleValue());
            }
            
        }}}}
        catch (UnsupportedAxisException e)
        {
            __CLR4_0_62om2oml1l0dvwr.R.inc(3563);throw new JaxenRuntimeException(e);
        }
        
        __CLR4_0_62om2oml1l0dvwr.R.inc(3564);return "";

    }finally{__CLR4_0_62om2oml1l0dvwr.R.flushNeeded();}}

    private static String stringValue(double value)
    {try{__CLR4_0_62om2oml1l0dvwr.R.inc(3565);
        
        // DecimalFormat formats negative zero as "-0".
        // Therefore we need to test for zero explicitly here.
        __CLR4_0_62om2oml1l0dvwr.R.inc(3566);if ((((value == 0)&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3567)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3568)==0&false))) {__CLR4_0_62om2oml1l0dvwr.R.inc(3569);return "0";
        
        // need to synchronize object for thread-safety
        }__CLR4_0_62om2oml1l0dvwr.R.inc(3570);String result = null;
        __CLR4_0_62om2oml1l0dvwr.R.inc(3571);synchronized (format) {
            __CLR4_0_62om2oml1l0dvwr.R.inc(3572);result = format.format(value);
        }
        __CLR4_0_62om2oml1l0dvwr.R.inc(3573);return result;
        
    }finally{__CLR4_0_62om2oml1l0dvwr.R.flushNeeded();}}

    private static String stringValue(boolean value)
    {try{__CLR4_0_62om2oml1l0dvwr.R.inc(3574);
        __CLR4_0_62om2oml1l0dvwr.R.inc(3575);return (((value )&&(__CLR4_0_62om2oml1l0dvwr.R.iget(3576)!=0|true))||(__CLR4_0_62om2oml1l0dvwr.R.iget(3577)==0&false))? "true" : "false";
    }finally{__CLR4_0_62om2oml1l0dvwr.R.flushNeeded();}}

}
