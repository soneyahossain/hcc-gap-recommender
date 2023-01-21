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


package org.jaxen.saxpath.helpers;

import org.jaxen.saxpath.SAXPathException;
import org.jaxen.saxpath.XPathHandler;

/**
 * Default base class for SAXPath event handlers.
 * <p>
 * This class is available as a convenience base class for SAXPath
 * applications: it provides a default do-nothing implementation
 * for all of the callbacks in the core SAXPath handler class, {@link
 * org.jaxen.saxpath.XPathHandler}.
 * <p>
 * Application writers can extend this class when they need to
 * implement only part of the <code>XPathHandler</code>
 * interface. Parser writers can instantiate
 * this class to provide default handlers when the application has not
 * supplied its own.
 */

public class DefaultXPathHandler implements XPathHandler {public static class __CLR4_0_66mq6mql1l0dwcn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,8638,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void startXPath() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8594);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endXPath() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8595);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startPathExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8596);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endPathExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8597);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startAbsoluteLocationPath() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8598);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endAbsoluteLocationPath() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8599);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startRelativeLocationPath() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8600);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endRelativeLocationPath() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8601);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startNameStep(int axis,
                              String prefix,
                              String localName) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8602);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endNameStep() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8603);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startTextNodeStep(int axis) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8604);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endTextNodeStep() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8605);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startCommentNodeStep(int axis) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8606);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endCommentNodeStep() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8607);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startAllNodeStep(int axis) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8608);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endAllNodeStep() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8609);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startProcessingInstructionNodeStep(int axis,
                                                   String name) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8610);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endProcessingInstructionNodeStep() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8611);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startPredicate() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8612);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endPredicate() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8613);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startFilterExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8614);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endFilterExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8615);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startOrExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8616);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endOrExpr(boolean create) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8617);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startAndExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8618);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endAndExpr(boolean create) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8619);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startEqualityExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8620);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endEqualityExpr(int operator) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8621);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startRelationalExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8622);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endRelationalExpr(int operator) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8623);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startAdditiveExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8624);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endAdditiveExpr(int operator) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8625);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startMultiplicativeExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8626);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endMultiplicativeExpr(int operator) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8627);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startUnaryExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8628);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endUnaryExpr(int operator) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8629);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startUnionExpr() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8630);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endUnionExpr(boolean create) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8631);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void number(int number) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8632);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void number(double number) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8633);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void literal(String literal) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8634);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void variableReference(String prefix,
                                  String variableName) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8635);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void startFunction(String prefix,
                              String functionName) throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8636);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

    public void endFunction() throws SAXPathException {try{__CLR4_0_66mq6mql1l0dwcn.R.inc(8637);
    }finally{__CLR4_0_66mq6mql1l0dwcn.R.flushNeeded();}}

}
