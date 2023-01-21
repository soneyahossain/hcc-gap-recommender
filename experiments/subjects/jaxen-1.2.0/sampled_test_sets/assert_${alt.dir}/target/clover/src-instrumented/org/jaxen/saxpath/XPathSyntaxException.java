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

package org.jaxen.saxpath;


/**
 * Represents a syntax error in an XPath expression.
 * This is a compile-time error that is detectable irrespective of 
 * the context in which the XPath expression is evaluated.
 */
public class XPathSyntaxException extends SAXPathException
{public static class __CLR4_0_641d41dl1l0dw63{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,5260,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * 
     */
    private static final long serialVersionUID = 3567675610742422397L;
    private String xpath;
    private int    position;
    private final static String lineSeparator = System.getProperty("line.separator");

    /**
     * Creates a new XPathSyntaxException.
     * 
     * @param xpath the incorrect XPath expression 
     * @param position the index of the character at which the syntax error was detected
     * @param message the detail message
     */
    public XPathSyntaxException(String xpath,
                                int position,
                                String message)
    {
        super( message );__CLR4_0_641d41dl1l0dw63.R.inc(5234);try{__CLR4_0_641d41dl1l0dw63.R.inc(5233);
        __CLR4_0_641d41dl1l0dw63.R.inc(5235);this.position = position;
        __CLR4_0_641d41dl1l0dw63.R.inc(5236);this.xpath    = xpath;
    }finally{__CLR4_0_641d41dl1l0dw63.R.flushNeeded();}}

    /**
     * <p>
     * Returns the index of the character at which the syntax error was detected
     * in the XPath expression.
     * </p>
     * 
     * @return the character index in the XPath expression  
     *     at which the syntax error was detected
     */
    public int getPosition()
    {try{__CLR4_0_641d41dl1l0dw63.R.inc(5237);
        __CLR4_0_641d41dl1l0dw63.R.inc(5238);return this.position;
    }finally{__CLR4_0_641d41dl1l0dw63.R.flushNeeded();}}

    /**
     * <p>
     * Returns the syntactically incorrect XPath expression.
     * </p>
     * 
     * @return the syntactically incorrect XPath expression
     */
    public String getXPath()
    {try{__CLR4_0_641d41dl1l0dw63.R.inc(5239);
        __CLR4_0_641d41dl1l0dw63.R.inc(5240);return this.xpath;
    }finally{__CLR4_0_641d41dl1l0dw63.R.flushNeeded();}}

    public String toString()
    {try{__CLR4_0_641d41dl1l0dw63.R.inc(5241);
        __CLR4_0_641d41dl1l0dw63.R.inc(5242);return getClass() + ": " + getXPath() + ": " + getPosition() + ": " + getMessage();
    }finally{__CLR4_0_641d41dl1l0dw63.R.flushNeeded();}}

    /**
     * <p>
     * Returns a string in the form <code>"   ^"</code> which, when placed on the line
     * below the XPath expression in a monospaced font, should point to the
     * location of the error.
     * </p>
     * 
     * @return the position marker 
     */
    private String getPositionMarker()
    {try{__CLR4_0_641d41dl1l0dw63.R.inc(5243);
        __CLR4_0_641d41dl1l0dw63.R.inc(5244);int pos = getPosition();
        __CLR4_0_641d41dl1l0dw63.R.inc(5245);StringBuffer buf = new StringBuffer(pos+1);
        __CLR4_0_641d41dl1l0dw63.R.inc(5246);for ( int i = 0 ; (((i < pos )&&(__CLR4_0_641d41dl1l0dw63.R.iget(5247)!=0|true))||(__CLR4_0_641d41dl1l0dw63.R.iget(5248)==0&false)); ++i )
        {{
            __CLR4_0_641d41dl1l0dw63.R.inc(5249);buf.append(" ");
        }

        }__CLR4_0_641d41dl1l0dw63.R.inc(5250);buf.append("^");

        __CLR4_0_641d41dl1l0dw63.R.inc(5251);return buf.toString();
        
    }finally{__CLR4_0_641d41dl1l0dw63.R.flushNeeded();}}

    /**
     * <p>
     * Returns a long formatted description of the error,
     * including line breaks.
     * </p>
     * 
     * @return a longer description of the error on multiple lines
     */
    public String getMultilineMessage()
    {try{__CLR4_0_641d41dl1l0dw63.R.inc(5252);
        __CLR4_0_641d41dl1l0dw63.R.inc(5253);StringBuffer buf = new StringBuffer();

        __CLR4_0_641d41dl1l0dw63.R.inc(5254);buf.append( getMessage() );
        __CLR4_0_641d41dl1l0dw63.R.inc(5255);buf.append( lineSeparator );
        __CLR4_0_641d41dl1l0dw63.R.inc(5256);buf.append( getXPath() );
        __CLR4_0_641d41dl1l0dw63.R.inc(5257);buf.append( lineSeparator );

        __CLR4_0_641d41dl1l0dw63.R.inc(5258);buf.append( getPositionMarker() );

        __CLR4_0_641d41dl1l0dw63.R.inc(5259);return buf.toString();
    }finally{__CLR4_0_641d41dl1l0dw63.R.flushNeeded();}}

}
