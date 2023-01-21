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
import java.util.LinkedList;

import org.jaxen.expr.DefaultXPathFactory;
import org.jaxen.expr.Expr;
import org.jaxen.expr.FilterExpr;
import org.jaxen.expr.FunctionCallExpr;
import org.jaxen.expr.LocationPath;
import org.jaxen.expr.Predicate;
import org.jaxen.expr.Predicated;
import org.jaxen.expr.Step;
import org.jaxen.expr.XPathExpr;
import org.jaxen.expr.XPathFactory;
import org.jaxen.saxpath.Operator;
import org.jaxen.saxpath.XPathHandler;

/** SAXPath <code>XPathHandler</code> implementation capable
 *  of building Jaxen expression trees which can walk various
 *  different object models.
 *
 *  @author bob mcwhirter (bob@werken.com)
 */
public class JaxenHandler implements XPathHandler
{public static class __CLR4_0_68g8gl1l0dv4j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private XPathFactory xpathFactory;
    private XPathExpr    xpath;
    
    /**
     * ????
     */
    protected boolean simplified;

    /**
     * This may be changed to an ArrayList in the future (i.e. version &gt;= 1.2). 
     * You really shouldn't be accessing this field directly, but
     * if you are please try to use it as a generic List. Don't use the 
     * methods that are only available in LinkedList.
     */
    protected LinkedList stack;

    /** Constructor
     */
    public JaxenHandler()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(304);
        __CLR4_0_68g8gl1l0dv4j.R.inc(305);this.stack        = new LinkedList();
        __CLR4_0_68g8gl1l0dv4j.R.inc(306);this.xpathFactory = new DefaultXPathFactory();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
    
    /** Set the Jaxen <code>XPathFactory</code> that constructs
     *  the XPath expression tree during the parse.
     *
     *  @param xpathFactory the factory to use during the parse
     */
    public void setXPathFactory(XPathFactory xpathFactory)
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(307);
        __CLR4_0_68g8gl1l0dv4j.R.inc(308);this.xpathFactory = xpathFactory;
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    /** Retrieve the Jaxen <code>XPathFactory</code> used
     *  during the parse to construct the XPath expression tree.
     *
     *  @return the <code>XPathFactory</code> used during the parse.
     */
    public XPathFactory getXPathFactory()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(309);
        __CLR4_0_68g8gl1l0dv4j.R.inc(310);return this.xpathFactory;
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    /** Retrieve the simplified Jaxen XPath expression tree.
     *
     *  <p>
     *  This method is only valid once <code>XPathReader.parse(...)</code>
     *  successfully returned.
     *  </p>
     *
     *  @return the XPath expression tree
     */
    public XPathExpr getXPathExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(311);
        __CLR4_0_68g8gl1l0dv4j.R.inc(312);return getXPathExpr( true );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    /** Retrieve the Jaxen XPath expression tree, optionally
     *  simplified.
     *
     *  <p>
     *  This method is only valid once <code>XPathReader.parse(...)</code>
     *  successfully returned.
     *  </p>
     *  
     *  @param shouldSimplify ????
     *
     *  @return the XPath expression tree
     */
    public XPathExpr getXPathExpr(boolean shouldSimplify)
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(313);
        __CLR4_0_68g8gl1l0dv4j.R.inc(314);if ( (((shouldSimplify && ! this.simplified )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(315)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(316)==0&false)))
        {{
            __CLR4_0_68g8gl1l0dv4j.R.inc(317);this.xpath.simplify();
            __CLR4_0_68g8gl1l0dv4j.R.inc(318);this.simplified = true;
        }

        }__CLR4_0_68g8gl1l0dv4j.R.inc(319);return this.xpath;
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startXPath()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(320);
        __CLR4_0_68g8gl1l0dv4j.R.inc(321);this.simplified = false;
        __CLR4_0_68g8gl1l0dv4j.R.inc(322);pushFrame();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
    
    public void endXPath() throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(323);
        __CLR4_0_68g8gl1l0dv4j.R.inc(324);this.xpath = getXPathFactory().createXPath( (Expr) pop() );
        __CLR4_0_68g8gl1l0dv4j.R.inc(325);popFrame();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startPathExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(326);
        __CLR4_0_68g8gl1l0dv4j.R.inc(327);pushFrame();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endPathExpr() throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(328);

        // PathExpr ::=   LocationPath
        //              | FilterExpr
        //              | FilterExpr / RelativeLocationPath
        //              | FilterExpr // RelativeLocationPath
        //
        // If the current stack-frame has two items, it's a
        // FilterExpr and a LocationPath (of some flavor).
        //
        // If the current stack-frame has one item, it's simply
        // a FilterExpr, and more than likely boils down to a
        // primary expr of some flavor.  But that's for another
        // method...

        __CLR4_0_68g8gl1l0dv4j.R.inc(329);FilterExpr   filterExpr;
        __CLR4_0_68g8gl1l0dv4j.R.inc(330);LocationPath locationPath;

        __CLR4_0_68g8gl1l0dv4j.R.inc(331);Object       popped;

        __CLR4_0_68g8gl1l0dv4j.R.inc(332);if ( (((stackSize() == 2 )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(333)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(334)==0&false)))
        {{
            __CLR4_0_68g8gl1l0dv4j.R.inc(335);locationPath = (LocationPath) pop();
            __CLR4_0_68g8gl1l0dv4j.R.inc(336);filterExpr   = (FilterExpr) pop();
        }
        }else
        {{
            __CLR4_0_68g8gl1l0dv4j.R.inc(337);popped = pop();

            __CLR4_0_68g8gl1l0dv4j.R.inc(338);if ( (((popped instanceof LocationPath )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(339)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(340)==0&false)))
            {{
                __CLR4_0_68g8gl1l0dv4j.R.inc(341);locationPath = (LocationPath) popped;
                __CLR4_0_68g8gl1l0dv4j.R.inc(342);filterExpr   = null;
            }
            }else
            {{
                __CLR4_0_68g8gl1l0dv4j.R.inc(343);locationPath = null;
                __CLR4_0_68g8gl1l0dv4j.R.inc(344);filterExpr   = (FilterExpr) popped;
            }
        }}
        }__CLR4_0_68g8gl1l0dv4j.R.inc(345);popFrame();

        __CLR4_0_68g8gl1l0dv4j.R.inc(346);push( getXPathFactory().createPathExpr( filterExpr,
                                               locationPath ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startAbsoluteLocationPath() throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(347);
        __CLR4_0_68g8gl1l0dv4j.R.inc(348);pushFrame();

        __CLR4_0_68g8gl1l0dv4j.R.inc(349);push( getXPathFactory().createAbsoluteLocationPath() );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endAbsoluteLocationPath() throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(350);
        __CLR4_0_68g8gl1l0dv4j.R.inc(351);endLocationPath();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startRelativeLocationPath() throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(352);
        __CLR4_0_68g8gl1l0dv4j.R.inc(353);pushFrame();

        __CLR4_0_68g8gl1l0dv4j.R.inc(354);push( getXPathFactory().createRelativeLocationPath() );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endRelativeLocationPath() throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(355);
        __CLR4_0_68g8gl1l0dv4j.R.inc(356);endLocationPath();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected void endLocationPath() throws JaxenException 
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(357);
        __CLR4_0_68g8gl1l0dv4j.R.inc(358);LocationPath path = (LocationPath) peekFrame().removeFirst();

        __CLR4_0_68g8gl1l0dv4j.R.inc(359);addSteps( path,
                  popFrame().iterator() );

        __CLR4_0_68g8gl1l0dv4j.R.inc(360);push( path );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected void addSteps(LocationPath locationPath,
                          Iterator stepIter)
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(361);
        __CLR4_0_68g8gl1l0dv4j.R.inc(362);while ( (((stepIter.hasNext() )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(363)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(364)==0&false)))
        {{
            __CLR4_0_68g8gl1l0dv4j.R.inc(365);locationPath.addStep( (Step) stepIter.next() );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startNameStep(int axis,
                              String prefix,
                              String localName) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(366);
        __CLR4_0_68g8gl1l0dv4j.R.inc(367);pushFrame();

        __CLR4_0_68g8gl1l0dv4j.R.inc(368);push( getXPathFactory().createNameStep( axis,
                                               prefix,
                                               localName ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endNameStep() 
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(369);
        __CLR4_0_68g8gl1l0dv4j.R.inc(370);endStep();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
    
    public void startTextNodeStep(int axis) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(371);
        //System.err.println("startTextNodeStep()");
        __CLR4_0_68g8gl1l0dv4j.R.inc(372);pushFrame();
        
        __CLR4_0_68g8gl1l0dv4j.R.inc(373);push( getXPathFactory().createTextNodeStep( axis ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
    
    public void endTextNodeStep()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(374);
        __CLR4_0_68g8gl1l0dv4j.R.inc(375);endStep();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startCommentNodeStep(int axis) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(376);
        __CLR4_0_68g8gl1l0dv4j.R.inc(377);pushFrame();

        __CLR4_0_68g8gl1l0dv4j.R.inc(378);push( getXPathFactory().createCommentNodeStep( axis ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endCommentNodeStep()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(379);
        __CLR4_0_68g8gl1l0dv4j.R.inc(380);endStep();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
        
    public void startAllNodeStep(int axis) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(381);
        __CLR4_0_68g8gl1l0dv4j.R.inc(382);pushFrame();

        __CLR4_0_68g8gl1l0dv4j.R.inc(383);push( getXPathFactory().createAllNodeStep( axis ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endAllNodeStep()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(384);
        __CLR4_0_68g8gl1l0dv4j.R.inc(385);endStep();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startProcessingInstructionNodeStep(int axis,
                                                   String name) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(386);
        __CLR4_0_68g8gl1l0dv4j.R.inc(387);pushFrame();

        __CLR4_0_68g8gl1l0dv4j.R.inc(388);push( getXPathFactory().createProcessingInstructionNodeStep( axis,
                                                                    name ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
    
    public void endProcessingInstructionNodeStep()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(389);
        __CLR4_0_68g8gl1l0dv4j.R.inc(390);endStep();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected void endStep()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(391);
        __CLR4_0_68g8gl1l0dv4j.R.inc(392);Step step = (Step) peekFrame().removeFirst();

        __CLR4_0_68g8gl1l0dv4j.R.inc(393);addPredicates( step,
                       popFrame().iterator() );

        __CLR4_0_68g8gl1l0dv4j.R.inc(394);push( step );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
    
    public void startPredicate()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(395);
        __CLR4_0_68g8gl1l0dv4j.R.inc(396);pushFrame();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
    
    public void endPredicate() throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(397);
        __CLR4_0_68g8gl1l0dv4j.R.inc(398);Predicate predicate = getXPathFactory().createPredicate( (Expr) pop() );

        __CLR4_0_68g8gl1l0dv4j.R.inc(399);popFrame();

        __CLR4_0_68g8gl1l0dv4j.R.inc(400);push( predicate );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startFilterExpr() 
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(401);
        __CLR4_0_68g8gl1l0dv4j.R.inc(402);pushFrame();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endFilterExpr() throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(403);
        __CLR4_0_68g8gl1l0dv4j.R.inc(404);Expr expr = (Expr) peekFrame().removeFirst();
        
        __CLR4_0_68g8gl1l0dv4j.R.inc(405);FilterExpr filter = getXPathFactory().createFilterExpr( expr );

        __CLR4_0_68g8gl1l0dv4j.R.inc(406);Iterator predIter = popFrame().iterator();

        __CLR4_0_68g8gl1l0dv4j.R.inc(407);addPredicates( filter,
                       predIter );

        __CLR4_0_68g8gl1l0dv4j.R.inc(408);push( filter );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected void addPredicates(Predicated obj,
                               Iterator predIter)
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(409);
        __CLR4_0_68g8gl1l0dv4j.R.inc(410);while ( (((predIter.hasNext() )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(411)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(412)==0&false)))
        {{
            __CLR4_0_68g8gl1l0dv4j.R.inc(413);obj.addPredicate( (Predicate) predIter.next() );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected void returnExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(414);
        __CLR4_0_68g8gl1l0dv4j.R.inc(415);Expr expr = (Expr) pop();
        __CLR4_0_68g8gl1l0dv4j.R.inc(416);popFrame();
        __CLR4_0_68g8gl1l0dv4j.R.inc(417);push( expr );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startOrExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(418);
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endOrExpr(boolean create) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(419);

        __CLR4_0_68g8gl1l0dv4j.R.inc(420);if ( (((create )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(421)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(422)==0&false)))
        {{
            __CLR4_0_68g8gl1l0dv4j.R.inc(423);Expr rhs = (Expr) pop();
            __CLR4_0_68g8gl1l0dv4j.R.inc(424);Expr lhs = (Expr) pop();

            __CLR4_0_68g8gl1l0dv4j.R.inc(425);push( getXPathFactory().createOrExpr( lhs,
                                                 rhs ) );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startAndExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(426);
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endAndExpr(boolean create) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(427);

        __CLR4_0_68g8gl1l0dv4j.R.inc(428);if ( (((create )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(429)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(430)==0&false)))
        {{

            __CLR4_0_68g8gl1l0dv4j.R.inc(431);Expr rhs = (Expr) pop();
            __CLR4_0_68g8gl1l0dv4j.R.inc(432);Expr lhs = (Expr) pop();

            __CLR4_0_68g8gl1l0dv4j.R.inc(433);push( getXPathFactory().createAndExpr( lhs,
                                                  rhs ) );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startEqualityExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(434);
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endEqualityExpr(int operator) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(435);

        __CLR4_0_68g8gl1l0dv4j.R.inc(436);if ( (((operator != Operator.NO_OP )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(437)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(438)==0&false)))
        {{
            
            __CLR4_0_68g8gl1l0dv4j.R.inc(439);Expr rhs = (Expr) pop();
            __CLR4_0_68g8gl1l0dv4j.R.inc(440);Expr lhs = (Expr) pop();
            
            __CLR4_0_68g8gl1l0dv4j.R.inc(441);push( getXPathFactory().createEqualityExpr( lhs,
                                                        rhs,
                                                        operator ) );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startRelationalExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(442);
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endRelationalExpr(int operator) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(443);

        __CLR4_0_68g8gl1l0dv4j.R.inc(444);if ( (((operator != Operator.NO_OP )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(445)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(446)==0&false)))
        {{

            __CLR4_0_68g8gl1l0dv4j.R.inc(447);Expr rhs = (Expr) pop();
            __CLR4_0_68g8gl1l0dv4j.R.inc(448);Expr lhs = (Expr) pop();

            __CLR4_0_68g8gl1l0dv4j.R.inc(449);push( getXPathFactory().createRelationalExpr( lhs,
                                                         rhs,
                                                         operator ) );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startAdditiveExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(450);
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endAdditiveExpr(int operator) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(451);

        __CLR4_0_68g8gl1l0dv4j.R.inc(452);if ( (((operator != Operator.NO_OP )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(453)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(454)==0&false)))
        {{
            
            __CLR4_0_68g8gl1l0dv4j.R.inc(455);Expr rhs = (Expr) pop();
            __CLR4_0_68g8gl1l0dv4j.R.inc(456);Expr lhs = (Expr) pop();
            
            __CLR4_0_68g8gl1l0dv4j.R.inc(457);push( getXPathFactory().createAdditiveExpr( lhs,
                                                        rhs,
                                                        operator ) );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startMultiplicativeExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(458);
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endMultiplicativeExpr(int operator) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(459);

        __CLR4_0_68g8gl1l0dv4j.R.inc(460);if ( (((operator != Operator.NO_OP )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(461)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(462)==0&false)))
        {{

            __CLR4_0_68g8gl1l0dv4j.R.inc(463);Expr rhs = (Expr) pop();
            __CLR4_0_68g8gl1l0dv4j.R.inc(464);Expr lhs = (Expr) pop();
            
            __CLR4_0_68g8gl1l0dv4j.R.inc(465);push( getXPathFactory().createMultiplicativeExpr( lhs,
                                                             rhs,
                                                             operator ) );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startUnaryExpr()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(466);
     }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endUnaryExpr(int operator) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(467);

        __CLR4_0_68g8gl1l0dv4j.R.inc(468);if ( (((operator != Operator.NO_OP )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(469)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(470)==0&false)))
        {{
            __CLR4_0_68g8gl1l0dv4j.R.inc(471);push( getXPathFactory().createUnaryExpr( (Expr) pop(),
                                                    operator ) );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startUnionExpr() 
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(472);
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endUnionExpr(boolean create) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(473);

        __CLR4_0_68g8gl1l0dv4j.R.inc(474);if ( (((create )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(475)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(476)==0&false)))
        {{

            __CLR4_0_68g8gl1l0dv4j.R.inc(477);Expr rhs = (Expr) pop();
            __CLR4_0_68g8gl1l0dv4j.R.inc(478);Expr lhs = (Expr) pop();

            __CLR4_0_68g8gl1l0dv4j.R.inc(479);push( getXPathFactory().createUnionExpr( lhs,
                                                    rhs ) );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void number(int number) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(480);
        __CLR4_0_68g8gl1l0dv4j.R.inc(481);push( getXPathFactory().createNumberExpr( number ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void number(double number) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(482);
        __CLR4_0_68g8gl1l0dv4j.R.inc(483);push( getXPathFactory().createNumberExpr( number ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void literal(String literal) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(484);
        __CLR4_0_68g8gl1l0dv4j.R.inc(485);push( getXPathFactory().createLiteralExpr( literal ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void variableReference(String prefix,
                                  String variableName) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(486);
        __CLR4_0_68g8gl1l0dv4j.R.inc(487);push( getXPathFactory().createVariableReferenceExpr( prefix,
                                                             variableName ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void startFunction(String prefix,
                              String functionName) throws JaxenException
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(488);
        __CLR4_0_68g8gl1l0dv4j.R.inc(489);pushFrame();
        __CLR4_0_68g8gl1l0dv4j.R.inc(490);push( getXPathFactory().createFunctionCallExpr( prefix,
                                                        functionName ) );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    public void endFunction()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(491);
        __CLR4_0_68g8gl1l0dv4j.R.inc(492);FunctionCallExpr function = (FunctionCallExpr) peekFrame().removeFirst();

        __CLR4_0_68g8gl1l0dv4j.R.inc(493);addParameters( function,
                       popFrame().iterator() );

        __CLR4_0_68g8gl1l0dv4j.R.inc(494);push( function );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected void addParameters(FunctionCallExpr function,
                               Iterator paramIter)
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(495);
        __CLR4_0_68g8gl1l0dv4j.R.inc(496);while ( (((paramIter.hasNext() )&&(__CLR4_0_68g8gl1l0dv4j.R.iget(497)!=0|true))||(__CLR4_0_68g8gl1l0dv4j.R.iget(498)==0&false)))
        {{
            __CLR4_0_68g8gl1l0dv4j.R.inc(499);function.addParameter( (Expr) paramIter.next() );
        }
    }}finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected int stackSize()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(500);
        __CLR4_0_68g8gl1l0dv4j.R.inc(501);return peekFrame().size();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected void push(Object obj)
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(502);
        __CLR4_0_68g8gl1l0dv4j.R.inc(503);peekFrame().addLast( obj );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected Object pop()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(504);
        __CLR4_0_68g8gl1l0dv4j.R.inc(505);return peekFrame().removeLast();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected boolean canPop()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(506);
        __CLR4_0_68g8gl1l0dv4j.R.inc(507);return ( peekFrame().size() > 0 );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected void pushFrame()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(508);
        __CLR4_0_68g8gl1l0dv4j.R.inc(509);this.stack.addLast( new LinkedList() );
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected LinkedList popFrame()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(510);
        __CLR4_0_68g8gl1l0dv4j.R.inc(511);return (LinkedList) this.stack.removeLast();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}

    protected LinkedList peekFrame()
    {try{__CLR4_0_68g8gl1l0dv4j.R.inc(512);
        __CLR4_0_68g8gl1l0dv4j.R.inc(513);return (LinkedList) this.stack.getLast();
    }finally{__CLR4_0_68g8gl1l0dv4j.R.flushNeeded();}}
}
