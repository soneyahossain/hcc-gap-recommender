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

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Base of all SAXPath exceptions.
 *
 * @author bob mcwhirter (bob@werken.com)
 */
public class SAXPathException extends Exception {public static class __CLR4_0_6408408l1l0dw5l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,5233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     *
     */
    private static final long serialVersionUID = 4826444568928720706L;

    private static double javaVersion = 1.4;

    static {try{__CLR4_0_6408408l1l0dw5l.R.inc(5192);
        __CLR4_0_6408408l1l0dw5l.R.inc(5193);try {
            __CLR4_0_6408408l1l0dw5l.R.inc(5194);String versionString = System.getProperty("java.version");
            __CLR4_0_6408408l1l0dw5l.R.inc(5195);versionString = versionString.substring(0, 3);
            __CLR4_0_6408408l1l0dw5l.R.inc(5196);javaVersion = Double.valueOf(versionString).doubleValue();
        } catch (Exception ex) {
            // The version string format changed so presumably it's
            // 1.4 or later.
        }
    }finally{__CLR4_0_6408408l1l0dw5l.R.flushNeeded();}}

    /**
     * Create a new SAXPathException with a given message.
     *
     * @param message the error message
     */
    public SAXPathException(String message) {
        super(message);__CLR4_0_6408408l1l0dw5l.R.inc(5198);try{__CLR4_0_6408408l1l0dw5l.R.inc(5197);
    }finally{__CLR4_0_6408408l1l0dw5l.R.flushNeeded();}}

    /**
     * Create a new SAXPathException based on another exception
     *
     * @param cause the error source
     */
    public SAXPathException(Throwable cause) {
        super(cause.getMessage());__CLR4_0_6408408l1l0dw5l.R.inc(5200);try{__CLR4_0_6408408l1l0dw5l.R.inc(5199);
        __CLR4_0_6408408l1l0dw5l.R.inc(5201);initCause(cause);
    }finally{__CLR4_0_6408408l1l0dw5l.R.flushNeeded();}}

    /**
     * Create a new SAXPathException with the specified detail message
     * and root cause.
     *
     * @param message the detail message
     * @param cause   the cause of this exception
     */
    public SAXPathException(String message, Throwable cause) {
        super(message);__CLR4_0_6408408l1l0dw5l.R.inc(5203);try{__CLR4_0_6408408l1l0dw5l.R.inc(5202);
        __CLR4_0_6408408l1l0dw5l.R.inc(5204);initCause(cause);
    }finally{__CLR4_0_6408408l1l0dw5l.R.flushNeeded();}}


    private Throwable cause;
    private boolean causeSet = false;

    /**
     * Returns the exception that caused this exception.
     * This is necessary to implement Java 1.4 chained exception
     * functionality in a Java 1.3-compatible way.
     *
     * @return the exception that caused this exception
     */
    public Throwable getCause() {try{__CLR4_0_6408408l1l0dw5l.R.inc(5205);
        __CLR4_0_6408408l1l0dw5l.R.inc(5206);return cause;
    }finally{__CLR4_0_6408408l1l0dw5l.R.flushNeeded();}}


    /**
     * Sets the exception that caused this exception.
     * This is necessary to implement Java 1.4 chained exception
     * functionality in a Java 1.3-compatible way.
     *
     * @param cause the exception wrapped in this runtime exception
     * @return this exception
     */
    public Throwable initCause(Throwable cause) {try{__CLR4_0_6408408l1l0dw5l.R.inc(5207);
        __CLR4_0_6408408l1l0dw5l.R.inc(5208);if ((((causeSet)&&(__CLR4_0_6408408l1l0dw5l.R.iget(5209)!=0|true))||(__CLR4_0_6408408l1l0dw5l.R.iget(5210)==0&false))) {__CLR4_0_6408408l1l0dw5l.R.inc(5211);throw new IllegalStateException("Cause cannot be reset");
        }__CLR4_0_6408408l1l0dw5l.R.inc(5212);if ((((cause == this)&&(__CLR4_0_6408408l1l0dw5l.R.iget(5213)!=0|true))||(__CLR4_0_6408408l1l0dw5l.R.iget(5214)==0&false))) {__CLR4_0_6408408l1l0dw5l.R.inc(5215);throw new IllegalArgumentException("Exception cannot be its own cause");
        }__CLR4_0_6408408l1l0dw5l.R.inc(5216);causeSet = true;
        __CLR4_0_6408408l1l0dw5l.R.inc(5217);this.cause = cause;
        __CLR4_0_6408408l1l0dw5l.R.inc(5218);return this;
    }finally{__CLR4_0_6408408l1l0dw5l.R.flushNeeded();}}

    /**
     * Print this exception's stack trace, followed by the
     * source exception's trace, if any.
     *
     * @param s the stream on which to print the stack trace
     */
    public void printStackTrace(PrintStream s) {try{__CLR4_0_6408408l1l0dw5l.R.inc(5219);
        __CLR4_0_6408408l1l0dw5l.R.inc(5220);super.printStackTrace(s);
        __CLR4_0_6408408l1l0dw5l.R.inc(5221);if ((((javaVersion < 1.4 && getCause() != null)&&(__CLR4_0_6408408l1l0dw5l.R.iget(5222)!=0|true))||(__CLR4_0_6408408l1l0dw5l.R.iget(5223)==0&false))) {{
            __CLR4_0_6408408l1l0dw5l.R.inc(5224);s.print("Caused by: ");
            __CLR4_0_6408408l1l0dw5l.R.inc(5225);getCause().printStackTrace(s);
        }
    }}finally{__CLR4_0_6408408l1l0dw5l.R.flushNeeded();}}

    /**
     * Print this exception's stack trace, followed by the
     * source exception's stack trace, if any.
     *
     * @param s the writer on which to print the stack trace
     */
    public void printStackTrace(PrintWriter s) {try{__CLR4_0_6408408l1l0dw5l.R.inc(5226);
        __CLR4_0_6408408l1l0dw5l.R.inc(5227);super.printStackTrace(s);
        __CLR4_0_6408408l1l0dw5l.R.inc(5228);if ((((javaVersion < 1.4 && getCause() != null)&&(__CLR4_0_6408408l1l0dw5l.R.iget(5229)!=0|true))||(__CLR4_0_6408408l1l0dw5l.R.iget(5230)==0&false))) {{
            __CLR4_0_6408408l1l0dw5l.R.inc(5231);s.print("Caused by: ");
            __CLR4_0_6408408l1l0dw5l.R.inc(5232);getCause().printStackTrace(s);
        }
    }}finally{__CLR4_0_6408408l1l0dw5l.R.flushNeeded();}}

}
