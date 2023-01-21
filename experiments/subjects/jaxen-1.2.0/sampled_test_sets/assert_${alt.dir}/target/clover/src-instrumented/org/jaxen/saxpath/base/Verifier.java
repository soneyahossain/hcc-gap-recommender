/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ *//*--
 *
 * $Id$
 *
 * Copyright 2000-2004 Jason Hunter & Brett McLaughlin.
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
 */

package org.jaxen.saxpath.base;

/**
 * A utility class to handle well-formedness checks on names.
 *
 * @author Brett McLaughlin
 * @author Elliotte Rusty Harold
 * @author Jason Hunter
 * @author Bradley S. Huffman
 */
final class Verifier {public static class __CLR4_0_644t44tl1l0dw9m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,7621,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * This is a utility function for determining whether a specified
     * character is a name character according to production 4 of the
     * XML 1.0 specification.
     *
     * @param c <code>char</code> to check for XML name compliance.
     * @return <code>boolean</code> true if it's a name character,
     * false otherwise
     */
    static boolean isXMLNCNameCharacter(char c) {try{__CLR4_0_644t44tl1l0dw9m.R.inc(5357);

        __CLR4_0_644t44tl1l0dw9m.R.inc(5358);return (isXMLLetter(c) || isXMLDigit(c) || c == '.' || c == '-'
                || c == '_' || isXMLCombiningChar(c)
                || isXMLExtender(c));
    }finally{__CLR4_0_644t44tl1l0dw9m.R.flushNeeded();}}

    /**
     * This is a utility function for determining whether a specified
     * character is a legal name start character according to production 5
     * of the XML 1.0 specification. This production does allow names
     * to begin with colons which the Namespaces in XML Recommendation
     * disallows.
     *
     * @param c <code>char</code> to check for XML name start compliance
     * @return true if it's a name start character, false otherwise
     */
    static boolean isXMLNCNameStartCharacter(char c) {try{__CLR4_0_644t44tl1l0dw9m.R.inc(5359);

        __CLR4_0_644t44tl1l0dw9m.R.inc(5360);return (isXMLLetter(c) || c == '_');

    }finally{__CLR4_0_644t44tl1l0dw9m.R.flushNeeded();}}

    /**
     * Determine whether a specified character
     * is a letter according to production 84 of the XML 1.0 specification.
     *
     * @param c <code>char</code> to check for XML name compliance
     * @return <code>String</code> true if it's a letter, false otherwise
     */
    static boolean isXMLLetter(char c) {try{__CLR4_0_644t44tl1l0dw9m.R.inc(5361);
        // Note that order is very important here.  The search proceeds 
        // from lowest to highest values, so that no searching occurs 
        // above the character's value.  BTW, the first line is equivalent to:
        // if (c >= 0x0041 && c <= 0x005A) return true;

        __CLR4_0_644t44tl1l0dw9m.R.inc(5362);if ((((c < 0x0041)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5363)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5364)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5365);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5366);if ((((c <= 0x005a)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5367)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5368)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5369);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5370);if ((((c < 0x0061)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5371)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5372)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5373);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5374);if ((((c <= 0x007A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5375)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5376)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5377);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5378);if ((((c < 0x00C0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5379)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5380)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5381);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5382);if ((((c <= 0x00D6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5383)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5384)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5385);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5386);if ((((c < 0x00D8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5387)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5388)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5389);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5390);if ((((c <= 0x00F6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5391)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5392)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5393);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5394);if ((((c < 0x00F8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5395)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5396)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5397);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5398);if ((((c <= 0x00FF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5399)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5400)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5401);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5402);if ((((c < 0x0100)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5403)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5404)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5405);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5406);if ((((c <= 0x0131)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5407)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5408)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5409);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5410);if ((((c < 0x0134)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5411)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5412)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5413);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5414);if ((((c <= 0x013E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5415)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5416)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5417);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5418);if ((((c < 0x0141)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5419)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5420)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5421);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5422);if ((((c <= 0x0148)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5423)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5424)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5425);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5426);if ((((c < 0x014A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5427)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5428)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5429);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5430);if ((((c <= 0x017E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5431)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5432)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5433);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5434);if ((((c < 0x0180)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5435)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5436)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5437);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5438);if ((((c <= 0x01C3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5439)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5440)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5441);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5442);if ((((c < 0x01CD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5443)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5444)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5445);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5446);if ((((c <= 0x01F0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5447)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5448)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5449);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5450);if ((((c < 0x01F4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5451)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5452)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5453);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5454);if ((((c <= 0x01F5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5455)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5456)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5457);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5458);if ((((c < 0x01FA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5459)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5460)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5461);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5462);if ((((c <= 0x0217)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5463)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5464)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5465);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5466);if ((((c < 0x0250)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5467)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5468)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5469);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5470);if ((((c <= 0x02A8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5471)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5472)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5473);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5474);if ((((c < 0x02BB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5475)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5476)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5477);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5478);if ((((c <= 0x02C1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5479)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5480)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5481);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5482);if ((((c == 0x0386)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5483)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5484)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5485);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5486);if ((((c < 0x0388)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5487)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5488)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5489);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5490);if ((((c <= 0x038A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5491)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5492)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5493);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5494);if ((((c == 0x038C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5495)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5496)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5497);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5498);if ((((c < 0x038E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5499)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5500)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5501);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5502);if ((((c <= 0x03A1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5503)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5504)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5505);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5506);if ((((c < 0x03A3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5507)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5508)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5509);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5510);if ((((c <= 0x03CE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5511)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5512)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5513);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5514);if ((((c < 0x03D0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5515)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5516)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5517);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5518);if ((((c <= 0x03D6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5519)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5520)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5521);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5522);if ((((c == 0x03DA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5523)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5524)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5525);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5526);if ((((c == 0x03DC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5527)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5528)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5529);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5530);if ((((c == 0x03DE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5531)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5532)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5533);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5534);if ((((c == 0x03E0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5535)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5536)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5537);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5538);if ((((c < 0x03E2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5539)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5540)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5541);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5542);if ((((c <= 0x03F3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5543)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5544)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5545);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5546);if ((((c < 0x0401)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5547)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5548)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5549);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5550);if ((((c <= 0x040C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5551)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5552)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5553);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5554);if ((((c < 0x040E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5555)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5556)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5557);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5558);if ((((c <= 0x044F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5559)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5560)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5561);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5562);if ((((c < 0x0451)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5563)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5564)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5565);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5566);if ((((c <= 0x045C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5567)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5568)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5569);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5570);if ((((c < 0x045E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5571)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5572)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5573);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5574);if ((((c <= 0x0481)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5575)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5576)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5577);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5578);if ((((c < 0x0490)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5579)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5580)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5581);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5582);if ((((c <= 0x04C4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5583)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5584)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5585);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5586);if ((((c < 0x04C7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5587)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5588)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5589);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5590);if ((((c <= 0x04C8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5591)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5592)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5593);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5594);if ((((c < 0x04CB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5595)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5596)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5597);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5598);if ((((c <= 0x04CC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5599)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5600)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5601);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5602);if ((((c < 0x04D0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5603)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5604)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5605);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5606);if ((((c <= 0x04EB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5607)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5608)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5609);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5610);if ((((c < 0x04EE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5611)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5612)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5613);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5614);if ((((c <= 0x04F5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5615)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5616)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5617);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5618);if ((((c < 0x04F8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5619)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5620)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5621);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5622);if ((((c <= 0x04F9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5623)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5624)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5625);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5626);if ((((c < 0x0531)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5627)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5628)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5629);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5630);if ((((c <= 0x0556)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5631)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5632)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5633);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5634);if ((((c == 0x0559)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5635)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5636)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5637);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5638);if ((((c < 0x0561)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5639)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5640)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5641);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5642);if ((((c <= 0x0586)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5643)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5644)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5645);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5646);if ((((c < 0x05D0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5647)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5648)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5649);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5650);if ((((c <= 0x05EA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5651)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5652)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5653);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5654);if ((((c < 0x05F0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5655)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5656)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5657);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5658);if ((((c <= 0x05F2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5659)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5660)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5661);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5662);if ((((c < 0x0621)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5663)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5664)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5665);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5666);if ((((c <= 0x063A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5667)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5668)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5669);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5670);if ((((c < 0x0641)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5671)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5672)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5673);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5674);if ((((c <= 0x064A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5675)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5676)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5677);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5678);if ((((c < 0x0671)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5679)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5680)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5681);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5682);if ((((c <= 0x06B7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5683)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5684)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5685);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5686);if ((((c < 0x06BA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5687)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5688)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5689);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5690);if ((((c <= 0x06BE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5691)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5692)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5693);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5694);if ((((c < 0x06C0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5695)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5696)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5697);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5698);if ((((c <= 0x06CE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5699)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5700)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5701);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5702);if ((((c < 0x06D0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5703)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5704)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5705);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5706);if ((((c <= 0x06D3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5707)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5708)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5709);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5710);if ((((c == 0x06D5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5711)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5712)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5713);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5714);if ((((c < 0x06E5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5715)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5716)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5717);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5718);if ((((c <= 0x06E6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5719)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5720)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5721);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5722);if ((((c < 0x0905)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5723)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5724)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5725);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5726);if ((((c <= 0x0939)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5727)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5728)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5729);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5730);if ((((c == 0x093D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5731)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5732)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5733);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5734);if ((((c < 0x0958)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5735)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5736)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5737);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5738);if ((((c <= 0x0961)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5739)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5740)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5741);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5742);if ((((c < 0x0985)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5743)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5744)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5745);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5746);if ((((c <= 0x098C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5747)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5748)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5749);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5750);if ((((c < 0x098F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5751)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5752)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5753);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5754);if ((((c <= 0x0990)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5755)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5756)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5757);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5758);if ((((c < 0x0993)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5759)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5760)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5761);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5762);if ((((c <= 0x09A8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5763)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5764)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5765);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5766);if ((((c < 0x09AA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5767)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5768)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5769);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5770);if ((((c <= 0x09B0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5771)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5772)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5773);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5774);if ((((c == 0x09B2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5775)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5776)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5777);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5778);if ((((c < 0x09B6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5779)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5780)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5781);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5782);if ((((c <= 0x09B9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5783)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5784)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5785);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5786);if ((((c < 0x09DC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5787)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5788)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5789);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5790);if ((((c <= 0x09DD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5791)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5792)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5793);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5794);if ((((c < 0x09DF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5795)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5796)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5797);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5798);if ((((c <= 0x09E1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5799)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5800)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5801);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5802);if ((((c < 0x09F0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5803)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5804)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5805);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5806);if ((((c <= 0x09F1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5807)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5808)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5809);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5810);if ((((c < 0x0A05)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5811)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5812)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5813);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5814);if ((((c <= 0x0A0A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5815)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5816)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5817);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5818);if ((((c < 0x0A0F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5819)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5820)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5821);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5822);if ((((c <= 0x0A10)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5823)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5824)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5825);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5826);if ((((c < 0x0A13)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5827)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5828)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5829);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5830);if ((((c <= 0x0A28)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5831)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5832)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5833);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5834);if ((((c < 0x0A2A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5835)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5836)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5837);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5838);if ((((c <= 0x0A30)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5839)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5840)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5841);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5842);if ((((c < 0x0A32)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5843)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5844)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5845);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5846);if ((((c <= 0x0A33)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5847)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5848)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5849);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5850);if ((((c < 0x0A35)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5851)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5852)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5853);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5854);if ((((c <= 0x0A36)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5855)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5856)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5857);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5858);if ((((c < 0x0A38)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5859)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5860)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5861);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5862);if ((((c <= 0x0A39)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5863)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5864)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5865);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5866);if ((((c < 0x0A59)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5867)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5868)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5869);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5870);if ((((c <= 0x0A5C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5871)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5872)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5873);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5874);if ((((c == 0x0A5E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5875)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5876)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5877);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5878);if ((((c < 0x0A72)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5879)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5880)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5881);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5882);if ((((c <= 0x0A74)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5883)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5884)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5885);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5886);if ((((c < 0x0A85)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5887)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5888)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5889);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5890);if ((((c <= 0x0A8B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5891)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5892)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5893);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5894);if ((((c == 0x0A8D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5895)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5896)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5897);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5898);if ((((c < 0x0A8F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5899)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5900)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5901);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5902);if ((((c <= 0x0A91)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5903)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5904)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5905);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5906);if ((((c < 0x0A93)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5907)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5908)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5909);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5910);if ((((c <= 0x0AA8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5911)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5912)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5913);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5914);if ((((c < 0x0AAA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5915)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5916)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5917);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5918);if ((((c <= 0x0AB0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5919)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5920)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5921);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5922);if ((((c < 0x0AB2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5923)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5924)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5925);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5926);if ((((c <= 0x0AB3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5927)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5928)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5929);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5930);if ((((c < 0x0AB5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5931)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5932)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5933);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5934);if ((((c <= 0x0AB9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5935)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5936)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5937);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5938);if ((((c == 0x0ABD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5939)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5940)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5941);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5942);if ((((c == 0x0AE0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5943)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5944)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5945);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5946);if ((((c < 0x0B05)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5947)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5948)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5949);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5950);if ((((c <= 0x0B0C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5951)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5952)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5953);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5954);if ((((c < 0x0B0F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5955)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5956)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5957);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5958);if ((((c <= 0x0B10)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5959)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5960)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5961);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5962);if ((((c < 0x0B13)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5963)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5964)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5965);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5966);if ((((c <= 0x0B28)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5967)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5968)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5969);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5970);if ((((c < 0x0B2A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5971)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5972)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5973);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5974);if ((((c <= 0x0B30)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5975)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5976)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5977);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5978);if ((((c < 0x0B32)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5979)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5980)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5981);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5982);if ((((c <= 0x0B33)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5983)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5984)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5985);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5986);if ((((c < 0x0B36)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5987)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5988)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5989);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5990);if ((((c <= 0x0B39)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5991)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5992)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5993);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5994);if ((((c == 0x0B3D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5995)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(5996)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(5997);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(5998);if ((((c < 0x0B5C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(5999)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6000)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6001);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6002);if ((((c <= 0x0B5D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6003)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6004)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6005);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6006);if ((((c < 0x0B5F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6007)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6008)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6009);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6010);if ((((c <= 0x0B61)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6011)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6012)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6013);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6014);if ((((c < 0x0B85)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6015)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6016)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6017);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6018);if ((((c <= 0x0B8A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6019)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6020)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6021);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6022);if ((((c < 0x0B8E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6023)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6024)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6025);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6026);if ((((c <= 0x0B90)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6027)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6028)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6029);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6030);if ((((c < 0x0B92)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6031)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6032)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6033);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6034);if ((((c <= 0x0B95)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6035)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6036)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6037);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6038);if ((((c < 0x0B99)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6039)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6040)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6041);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6042);if ((((c <= 0x0B9A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6043)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6044)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6045);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6046);if ((((c == 0x0B9C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6047)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6048)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6049);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6050);if ((((c < 0x0B9E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6051)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6052)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6053);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6054);if ((((c <= 0x0B9F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6055)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6056)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6057);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6058);if ((((c < 0x0BA3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6059)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6060)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6061);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6062);if ((((c <= 0x0BA4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6063)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6064)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6065);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6066);if ((((c < 0x0BA8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6067)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6068)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6069);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6070);if ((((c <= 0x0BAA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6071)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6072)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6073);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6074);if ((((c < 0x0BAE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6075)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6076)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6077);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6078);if ((((c <= 0x0BB5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6079)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6080)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6081);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6082);if ((((c < 0x0BB7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6083)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6084)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6085);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6086);if ((((c <= 0x0BB9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6087)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6088)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6089);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6090);if ((((c < 0x0C05)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6091)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6092)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6093);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6094);if ((((c <= 0x0C0C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6095)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6096)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6097);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6098);if ((((c < 0x0C0E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6099)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6100)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6101);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6102);if ((((c <= 0x0C10)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6103)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6104)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6105);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6106);if ((((c < 0x0C12)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6107)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6108)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6109);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6110);if ((((c <= 0x0C28)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6111)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6112)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6113);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6114);if ((((c < 0x0C2A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6115)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6116)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6117);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6118);if ((((c <= 0x0C33)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6119)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6120)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6121);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6122);if ((((c < 0x0C35)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6123)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6124)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6125);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6126);if ((((c <= 0x0C39)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6127)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6128)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6129);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6130);if ((((c < 0x0C60)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6131)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6132)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6133);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6134);if ((((c <= 0x0C61)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6135)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6136)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6137);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6138);if ((((c < 0x0C85)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6139)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6140)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6141);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6142);if ((((c <= 0x0C8C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6143)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6144)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6145);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6146);if ((((c < 0x0C8E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6147)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6148)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6149);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6150);if ((((c <= 0x0C90)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6151)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6152)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6153);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6154);if ((((c < 0x0C92)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6155)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6156)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6157);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6158);if ((((c <= 0x0CA8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6159)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6160)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6161);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6162);if ((((c < 0x0CAA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6163)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6164)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6165);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6166);if ((((c <= 0x0CB3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6167)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6168)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6169);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6170);if ((((c < 0x0CB5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6171)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6172)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6173);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6174);if ((((c <= 0x0CB9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6175)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6176)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6177);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6178);if ((((c == 0x0CDE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6179)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6180)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6181);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6182);if ((((c < 0x0CE0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6183)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6184)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6185);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6186);if ((((c <= 0x0CE1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6187)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6188)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6189);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6190);if ((((c < 0x0D05)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6191)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6192)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6193);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6194);if ((((c <= 0x0D0C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6195)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6196)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6197);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6198);if ((((c < 0x0D0E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6199)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6200)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6201);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6202);if ((((c <= 0x0D10)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6203)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6204)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6205);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6206);if ((((c < 0x0D12)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6207)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6208)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6209);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6210);if ((((c <= 0x0D28)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6211)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6212)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6213);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6214);if ((((c < 0x0D2A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6215)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6216)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6217);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6218);if ((((c <= 0x0D39)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6219)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6220)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6221);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6222);if ((((c < 0x0D60)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6223)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6224)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6225);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6226);if ((((c <= 0x0D61)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6227)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6228)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6229);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6230);if ((((c < 0x0E01)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6231)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6232)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6233);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6234);if ((((c <= 0x0E2E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6235)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6236)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6237);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6238);if ((((c == 0x0E30)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6239)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6240)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6241);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6242);if ((((c < 0x0E32)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6243)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6244)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6245);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6246);if ((((c <= 0x0E33)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6247)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6248)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6249);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6250);if ((((c < 0x0E40)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6251)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6252)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6253);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6254);if ((((c <= 0x0E45)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6255)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6256)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6257);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6258);if ((((c < 0x0E81)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6259)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6260)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6261);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6262);if ((((c <= 0x0E82)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6263)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6264)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6265);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6266);if ((((c == 0x0E84)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6267)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6268)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6269);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6270);if ((((c < 0x0E87)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6271)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6272)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6273);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6274);if ((((c <= 0x0E88)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6275)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6276)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6277);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6278);if ((((c == 0x0E8A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6279)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6280)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6281);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6282);if ((((c == 0x0E8D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6283)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6284)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6285);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6286);if ((((c < 0x0E94)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6287)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6288)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6289);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6290);if ((((c <= 0x0E97)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6291)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6292)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6293);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6294);if ((((c < 0x0E99)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6295)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6296)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6297);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6298);if ((((c <= 0x0E9F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6299)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6300)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6301);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6302);if ((((c < 0x0EA1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6303)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6304)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6305);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6306);if ((((c <= 0x0EA3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6307)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6308)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6309);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6310);if ((((c == 0x0EA5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6311)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6312)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6313);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6314);if ((((c == 0x0EA7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6315)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6316)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6317);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6318);if ((((c < 0x0EAA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6319)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6320)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6321);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6322);if ((((c <= 0x0EAB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6323)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6324)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6325);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6326);if ((((c < 0x0EAD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6327)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6328)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6329);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6330);if ((((c <= 0x0EAE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6331)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6332)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6333);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6334);if ((((c == 0x0EB0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6335)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6336)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6337);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6338);if ((((c < 0x0EB2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6339)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6340)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6341);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6342);if ((((c <= 0x0EB3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6343)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6344)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6345);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6346);if ((((c == 0x0EBD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6347)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6348)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6349);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6350);if ((((c < 0x0EC0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6351)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6352)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6353);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6354);if ((((c <= 0x0EC4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6355)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6356)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6357);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6358);if ((((c < 0x0F40)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6359)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6360)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6361);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6362);if ((((c <= 0x0F47)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6363)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6364)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6365);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6366);if ((((c < 0x0F49)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6367)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6368)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6369);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6370);if ((((c <= 0x0F69)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6371)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6372)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6373);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6374);if ((((c < 0x10A0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6375)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6376)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6377);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6378);if ((((c <= 0x10C5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6379)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6380)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6381);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6382);if ((((c < 0x10D0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6383)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6384)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6385);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6386);if ((((c <= 0x10F6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6387)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6388)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6389);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6390);if ((((c == 0x1100)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6391)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6392)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6393);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6394);if ((((c < 0x1102)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6395)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6396)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6397);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6398);if ((((c <= 0x1103)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6399)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6400)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6401);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6402);if ((((c < 0x1105)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6403)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6404)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6405);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6406);if ((((c <= 0x1107)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6407)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6408)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6409);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6410);if ((((c == 0x1109)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6411)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6412)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6413);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6414);if ((((c < 0x110B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6415)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6416)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6417);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6418);if ((((c <= 0x110C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6419)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6420)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6421);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6422);if ((((c < 0x110E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6423)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6424)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6425);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6426);if ((((c <= 0x1112)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6427)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6428)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6429);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6430);if ((((c == 0x113C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6431)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6432)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6433);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6434);if ((((c == 0x113E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6435)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6436)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6437);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6438);if ((((c == 0x1140)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6439)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6440)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6441);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6442);if ((((c == 0x114C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6443)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6444)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6445);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6446);if ((((c == 0x114E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6447)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6448)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6449);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6450);if ((((c == 0x1150)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6451)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6452)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6453);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6454);if ((((c < 0x1154)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6455)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6456)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6457);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6458);if ((((c <= 0x1155)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6459)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6460)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6461);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6462);if ((((c == 0x1159)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6463)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6464)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6465);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6466);if ((((c < 0x115F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6467)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6468)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6469);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6470);if ((((c <= 0x1161)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6471)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6472)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6473);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6474);if ((((c == 0x1163)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6475)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6476)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6477);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6478);if ((((c == 0x1165)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6479)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6480)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6481);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6482);if ((((c == 0x1167)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6483)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6484)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6485);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6486);if ((((c == 0x1169)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6487)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6488)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6489);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6490);if ((((c < 0x116D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6491)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6492)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6493);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6494);if ((((c <= 0x116E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6495)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6496)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6497);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6498);if ((((c < 0x1172)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6499)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6500)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6501);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6502);if ((((c <= 0x1173)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6503)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6504)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6505);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6506);if ((((c == 0x1175)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6507)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6508)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6509);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6510);if ((((c == 0x119E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6511)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6512)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6513);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6514);if ((((c == 0x11A8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6515)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6516)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6517);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6518);if ((((c == 0x11AB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6519)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6520)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6521);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6522);if ((((c < 0x11AE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6523)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6524)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6525);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6526);if ((((c <= 0x11AF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6527)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6528)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6529);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6530);if ((((c < 0x11B7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6531)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6532)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6533);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6534);if ((((c <= 0x11B8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6535)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6536)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6537);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6538);if ((((c == 0x11BA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6539)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6540)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6541);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6542);if ((((c < 0x11BC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6543)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6544)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6545);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6546);if ((((c <= 0x11C2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6547)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6548)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6549);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6550);if ((((c == 0x11EB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6551)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6552)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6553);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6554);if ((((c == 0x11F0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6555)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6556)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6557);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6558);if ((((c == 0x11F9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6559)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6560)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6561);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6562);if ((((c < 0x1E00)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6563)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6564)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6565);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6566);if ((((c <= 0x1E9B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6567)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6568)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6569);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6570);if ((((c < 0x1EA0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6571)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6572)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6573);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6574);if ((((c <= 0x1EF9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6575)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6576)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6577);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6578);if ((((c < 0x1F00)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6579)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6580)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6581);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6582);if ((((c <= 0x1F15)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6583)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6584)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6585);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6586);if ((((c < 0x1F18)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6587)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6588)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6589);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6590);if ((((c <= 0x1F1D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6591)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6592)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6593);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6594);if ((((c < 0x1F20)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6595)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6596)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6597);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6598);if ((((c <= 0x1F45)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6599)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6600)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6601);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6602);if ((((c < 0x1F48)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6603)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6604)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6605);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6606);if ((((c <= 0x1F4D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6607)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6608)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6609);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6610);if ((((c < 0x1F50)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6611)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6612)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6613);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6614);if ((((c <= 0x1F57)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6615)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6616)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6617);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6618);if ((((c == 0x1F59)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6619)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6620)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6621);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6622);if ((((c == 0x1F5B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6623)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6624)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6625);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6626);if ((((c == 0x1F5D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6627)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6628)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6629);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6630);if ((((c < 0x1F5F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6631)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6632)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6633);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6634);if ((((c <= 0x1F7D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6635)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6636)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6637);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6638);if ((((c < 0x1F80)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6639)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6640)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6641);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6642);if ((((c <= 0x1FB4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6643)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6644)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6645);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6646);if ((((c < 0x1FB6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6647)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6648)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6649);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6650);if ((((c <= 0x1FBC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6651)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6652)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6653);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6654);if ((((c == 0x1FBE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6655)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6656)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6657);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6658);if ((((c < 0x1FC2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6659)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6660)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6661);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6662);if ((((c <= 0x1FC4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6663)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6664)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6665);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6666);if ((((c < 0x1FC6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6667)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6668)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6669);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6670);if ((((c <= 0x1FCC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6671)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6672)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6673);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6674);if ((((c < 0x1FD0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6675)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6676)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6677);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6678);if ((((c <= 0x1FD3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6679)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6680)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6681);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6682);if ((((c < 0x1FD6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6683)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6684)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6685);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6686);if ((((c <= 0x1FDB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6687)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6688)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6689);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6690);if ((((c < 0x1FE0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6691)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6692)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6693);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6694);if ((((c <= 0x1FEC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6695)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6696)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6697);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6698);if ((((c < 0x1FF2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6699)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6700)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6701);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6702);if ((((c <= 0x1FF4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6703)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6704)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6705);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6706);if ((((c < 0x1FF6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6707)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6708)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6709);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6710);if ((((c <= 0x1FFC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6711)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6712)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6713);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6714);if ((((c == 0x2126)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6715)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6716)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6717);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6718);if ((((c < 0x212A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6719)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6720)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6721);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6722);if ((((c <= 0x212B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6723)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6724)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6725);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6726);if ((((c == 0x212E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6727)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6728)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6729);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6730);if ((((c < 0x2180)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6731)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6732)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6733);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6734);if ((((c <= 0x2182)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6735)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6736)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6737);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6738);if ((((c == 0x3007)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6739)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6740)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6741);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6742);if ((((c < 0x3021)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6743)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6744)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6745);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6746);if ((((c <= 0x3029)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6747)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6748)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6749);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6750);if ((((c < 0x3041)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6751)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6752)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6753);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6754);if ((((c <= 0x3094)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6755)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6756)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6757);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6758);if ((((c < 0x30A1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6759)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6760)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6761);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6762);if ((((c <= 0x30FA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6763)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6764)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6765);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6766);if ((((c < 0x3105)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6767)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6768)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6769);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6770);if ((((c <= 0x312C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6771)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6772)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6773);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6774);if ((((c < 0x4E00)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6775)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6776)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6777);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6778);if ((((c <= 0x9FA5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6779)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6780)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6781);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6782);if ((((c < 0xAC00)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6783)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6784)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6785);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6786);if ((((c <= 0xD7A3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6787)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6788)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6789);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(6790);return false;

    }finally{__CLR4_0_644t44tl1l0dw9m.R.flushNeeded();}}

    /**
     * Determine whether a specified character
     * is a combining character according to production 87
     * of the XML 1.0 specification.
     *
     * @param c <code>char</code> to check
     * @return <code>boolean</code> true if it's a combining character,
     * false otherwise
     */
    static boolean isXMLCombiningChar(char c) {try{__CLR4_0_644t44tl1l0dw9m.R.inc(6791);
        // CombiningChar
        __CLR4_0_644t44tl1l0dw9m.R.inc(6792);if ((((c < 0x0300)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6793)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6794)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6795);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6796);if ((((c <= 0x0345)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6797)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6798)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6799);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6800);if ((((c < 0x0360)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6801)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6802)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6803);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6804);if ((((c <= 0x0361)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6805)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6806)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6807);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6808);if ((((c < 0x0483)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6809)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6810)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6811);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6812);if ((((c <= 0x0486)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6813)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6814)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6815);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6816);if ((((c < 0x0591)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6817)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6818)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6819);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6820);if ((((c <= 0x05A1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6821)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6822)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6823);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(6824);if ((((c < 0x05A3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6825)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6826)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6827);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6828);if ((((c <= 0x05B9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6829)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6830)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6831);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6832);if ((((c < 0x05BB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6833)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6834)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6835);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6836);if ((((c <= 0x05BD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6837)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6838)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6839);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6840);if ((((c == 0x05BF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6841)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6842)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6843);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6844);if ((((c < 0x05C1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6845)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6846)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6847);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6848);if ((((c <= 0x05C2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6849)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6850)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6851);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(6852);if ((((c == 0x05C4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6853)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6854)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6855);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6856);if ((((c < 0x064B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6857)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6858)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6859);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6860);if ((((c <= 0x0652)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6861)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6862)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6863);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6864);if ((((c == 0x0670)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6865)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6866)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6867);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6868);if ((((c < 0x06D6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6869)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6870)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6871);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6872);if ((((c <= 0x06DC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6873)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6874)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6875);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(6876);if ((((c < 0x06DD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6877)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6878)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6879);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6880);if ((((c <= 0x06DF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6881)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6882)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6883);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6884);if ((((c < 0x06E0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6885)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6886)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6887);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6888);if ((((c <= 0x06E4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6889)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6890)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6891);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6892);if ((((c < 0x06E7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6893)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6894)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6895);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6896);if ((((c <= 0x06E8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6897)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6898)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6899);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(6900);if ((((c < 0x06EA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6901)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6902)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6903);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6904);if ((((c <= 0x06ED)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6905)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6906)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6907);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6908);if ((((c < 0x0901)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6909)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6910)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6911);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6912);if ((((c <= 0x0903)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6913)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6914)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6915);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6916);if ((((c == 0x093C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6917)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6918)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6919);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6920);if ((((c < 0x093E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6921)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6922)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6923);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6924);if ((((c <= 0x094C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6925)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6926)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6927);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(6928);if ((((c == 0x094D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6929)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6930)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6931);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6932);if ((((c < 0x0951)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6933)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6934)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6935);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6936);if ((((c <= 0x0954)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6937)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6938)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6939);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6940);if ((((c < 0x0962)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6941)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6942)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6943);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6944);if ((((c <= 0x0963)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6945)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6946)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6947);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6948);if ((((c < 0x0981)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6949)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6950)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6951);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6952);if ((((c <= 0x0983)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6953)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6954)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6955);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(6956);if ((((c == 0x09BC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6957)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6958)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6959);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6960);if ((((c == 0x09BE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6961)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6962)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6963);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6964);if ((((c == 0x09BF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6965)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6966)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6967);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6968);if ((((c < 0x09C0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6969)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6970)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6971);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6972);if ((((c <= 0x09C4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6973)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6974)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6975);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6976);if ((((c < 0x09C7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6977)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6978)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6979);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6980);if ((((c <= 0x09C8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6981)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6982)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6983);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(6984);if ((((c < 0x09CB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6985)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6986)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6987);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6988);if ((((c <= 0x09CD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6989)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6990)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6991);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6992);if ((((c == 0x09D7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6993)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6994)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6995);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(6996);if ((((c < 0x09E2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(6997)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(6998)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(6999);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7000);if ((((c <= 0x09E3)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7001)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7002)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7003);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7004);if ((((c == 0x0A02)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7005)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7006)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7007);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7008);if ((((c == 0x0A3C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7009)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7010)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7011);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7012);if ((((c == 0x0A3E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7013)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7014)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7015);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7016);if ((((c == 0x0A3F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7017)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7018)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7019);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7020);if ((((c < 0x0A40)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7021)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7022)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7023);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7024);if ((((c <= 0x0A42)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7025)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7026)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7027);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7028);if ((((c < 0x0A47)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7029)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7030)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7031);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7032);if ((((c <= 0x0A48)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7033)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7034)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7035);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7036);if ((((c < 0x0A4B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7037)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7038)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7039);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7040);if ((((c <= 0x0A4D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7041)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7042)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7043);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7044);if ((((c < 0x0A70)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7045)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7046)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7047);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7048);if ((((c <= 0x0A71)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7049)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7050)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7051);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7052);if ((((c < 0x0A81)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7053)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7054)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7055);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7056);if ((((c <= 0x0A83)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7057)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7058)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7059);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7060);if ((((c == 0x0ABC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7061)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7062)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7063);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7064);if ((((c < 0x0ABE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7065)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7066)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7067);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7068);if ((((c <= 0x0AC5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7069)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7070)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7071);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7072);if ((((c < 0x0AC7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7073)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7074)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7075);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7076);if ((((c <= 0x0AC9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7077)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7078)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7079);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7080);if ((((c < 0x0ACB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7081)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7082)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7083);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7084);if ((((c <= 0x0ACD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7085)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7086)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7087);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7088);if ((((c < 0x0B01)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7089)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7090)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7091);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7092);if ((((c <= 0x0B03)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7093)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7094)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7095);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7096);if ((((c == 0x0B3C)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7097)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7098)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7099);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7100);if ((((c < 0x0B3E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7101)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7102)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7103);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7104);if ((((c <= 0x0B43)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7105)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7106)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7107);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7108);if ((((c < 0x0B47)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7109)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7110)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7111);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7112);if ((((c <= 0x0B48)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7113)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7114)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7115);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7116);if ((((c < 0x0B4B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7117)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7118)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7119);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7120);if ((((c <= 0x0B4D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7121)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7122)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7123);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7124);if ((((c < 0x0B56)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7125)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7126)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7127);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7128);if ((((c <= 0x0B57)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7129)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7130)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7131);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7132);if ((((c < 0x0B82)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7133)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7134)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7135);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7136);if ((((c <= 0x0B83)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7137)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7138)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7139);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7140);if ((((c < 0x0BBE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7141)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7142)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7143);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7144);if ((((c <= 0x0BC2)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7145)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7146)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7147);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7148);if ((((c < 0x0BC6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7149)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7150)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7151);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7152);if ((((c <= 0x0BC8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7153)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7154)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7155);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7156);if ((((c < 0x0BCA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7157)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7158)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7159);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7160);if ((((c <= 0x0BCD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7161)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7162)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7163);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7164);if ((((c == 0x0BD7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7165)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7166)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7167);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7168);if ((((c < 0x0C01)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7169)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7170)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7171);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7172);if ((((c <= 0x0C03)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7173)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7174)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7175);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7176);if ((((c < 0x0C3E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7177)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7178)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7179);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7180);if ((((c <= 0x0C44)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7181)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7182)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7183);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7184);if ((((c < 0x0C46)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7185)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7186)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7187);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7188);if ((((c <= 0x0C48)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7189)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7190)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7191);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7192);if ((((c < 0x0C4A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7193)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7194)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7195);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7196);if ((((c <= 0x0C4D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7197)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7198)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7199);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7200);if ((((c < 0x0C55)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7201)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7202)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7203);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7204);if ((((c <= 0x0C56)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7205)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7206)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7207);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7208);if ((((c < 0x0C82)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7209)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7210)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7211);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7212);if ((((c <= 0x0C83)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7213)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7214)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7215);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7216);if ((((c < 0x0CBE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7217)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7218)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7219);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7220);if ((((c <= 0x0CC4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7221)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7222)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7223);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7224);if ((((c < 0x0CC6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7225)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7226)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7227);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7228);if ((((c <= 0x0CC8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7229)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7230)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7231);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7232);if ((((c < 0x0CCA)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7233)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7234)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7235);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7236);if ((((c <= 0x0CCD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7237)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7238)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7239);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7240);if ((((c < 0x0CD5)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7241)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7242)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7243);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7244);if ((((c <= 0x0CD6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7245)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7246)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7247);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7248);if ((((c < 0x0D02)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7249)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7250)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7251);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7252);if ((((c <= 0x0D03)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7253)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7254)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7255);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7256);if ((((c < 0x0D3E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7257)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7258)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7259);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7260);if ((((c <= 0x0D43)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7261)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7262)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7263);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7264);if ((((c < 0x0D46)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7265)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7266)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7267);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7268);if ((((c <= 0x0D48)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7269)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7270)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7271);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7272);if ((((c < 0x0D4A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7273)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7274)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7275);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7276);if ((((c <= 0x0D4D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7277)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7278)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7279);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7280);if ((((c == 0x0D57)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7281)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7282)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7283);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7284);if ((((c == 0x0E31)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7285)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7286)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7287);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7288);if ((((c < 0x0E34)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7289)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7290)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7291);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7292);if ((((c <= 0x0E3A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7293)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7294)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7295);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7296);if ((((c < 0x0E47)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7297)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7298)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7299);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7300);if ((((c <= 0x0E4E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7301)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7302)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7303);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7304);if ((((c == 0x0EB1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7305)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7306)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7307);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7308);if ((((c < 0x0EB4)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7309)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7310)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7311);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7312);if ((((c <= 0x0EB9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7313)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7314)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7315);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7316);if ((((c < 0x0EBB)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7317)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7318)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7319);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7320);if ((((c <= 0x0EBC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7321)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7322)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7323);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7324);if ((((c < 0x0EC8)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7325)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7326)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7327);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7328);if ((((c <= 0x0ECD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7329)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7330)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7331);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7332);if ((((c < 0x0F18)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7333)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7334)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7335);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7336);if ((((c <= 0x0F19)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7337)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7338)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7339);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7340);if ((((c == 0x0F35)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7341)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7342)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7343);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7344);if ((((c == 0x0F37)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7345)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7346)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7347);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7348);if ((((c == 0x0F39)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7349)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7350)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7351);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7352);if ((((c == 0x0F3E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7353)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7354)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7355);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7356);if ((((c == 0x0F3F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7357)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7358)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7359);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7360);if ((((c < 0x0F71)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7361)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7362)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7363);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7364);if ((((c <= 0x0F84)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7365)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7366)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7367);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7368);if ((((c < 0x0F86)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7369)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7370)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7371);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7372);if ((((c <= 0x0F8B)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7373)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7374)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7375);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7376);if ((((c < 0x0F90)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7377)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7378)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7379);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7380);if ((((c <= 0x0F95)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7381)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7382)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7383);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7384);if ((((c == 0x0F97)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7385)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7386)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7387);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7388);if ((((c < 0x0F99)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7389)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7390)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7391);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7392);if ((((c <= 0x0FAD)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7393)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7394)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7395);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7396);if ((((c < 0x0FB1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7397)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7398)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7399);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7400);if ((((c <= 0x0FB7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7401)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7402)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7403);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7404);if ((((c == 0x0FB9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7405)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7406)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7407);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7408);if ((((c < 0x20D0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7409)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7410)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7411);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7412);if ((((c <= 0x20DC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7413)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7414)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7415);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7416);if ((((c == 0x20E1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7417)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7418)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7419);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7420);if ((((c < 0x302A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7421)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7422)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7423);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7424);if ((((c <= 0x302F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7425)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7426)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7427);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7428);if ((((c == 0x3099)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7429)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7430)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7431);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7432);if ((((c == 0x309A)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7433)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7434)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7435);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7436);return false;

    }finally{__CLR4_0_644t44tl1l0dw9m.R.flushNeeded();}}

    /**
     * Determine whether a specified
     * character is an extender according to production 88 of the XML 1.0
     * specification.
     *
     * @param c <code>char</code> to check
     * @return true if it's an extender, false otherwise
     */
    static boolean isXMLExtender(char c) {try{__CLR4_0_644t44tl1l0dw9m.R.inc(7437);

        __CLR4_0_644t44tl1l0dw9m.R.inc(7438);if ((((c < 0x00B6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7439)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7440)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7441);return false;  // quick short circuit

        // Extenders                               
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7442);if ((((c == 0x00B7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7443)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7444)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7445);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7446);if ((((c == 0x02D0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7447)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7448)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7449);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7450);if ((((c == 0x02D1)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7451)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7452)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7453);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7454);if ((((c == 0x0387)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7455)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7456)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7457);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7458);if ((((c == 0x0640)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7459)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7460)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7461);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7462);if ((((c == 0x0E46)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7463)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7464)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7465);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7466);if ((((c == 0x0EC6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7467)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7468)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7469);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7470);if ((((c == 0x3005)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7471)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7472)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7473);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7474);if ((((c < 0x3031)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7475)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7476)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7477);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7478);if ((((c <= 0x3035)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7479)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7480)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7481);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7482);if ((((c < 0x309D)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7483)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7484)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7485);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7486);if ((((c <= 0x309E)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7487)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7488)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7489);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7490);if ((((c < 0x30FC)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7491)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7492)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7493);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7494);if ((((c <= 0x30FE)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7495)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7496)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7497);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7498);return false;

    }finally{__CLR4_0_644t44tl1l0dw9m.R.flushNeeded();}}

    /**
     * Determine whether a specified Unicode character
     * is a digit according to production 88 of the XML 1.0 specification.
     *
     * @param c <code>char</code> to check for XML digit compliance
     * @return <code>boolean</code> true if it's a digit, false otherwise
     */
    static boolean isXMLDigit(char c) {try{__CLR4_0_644t44tl1l0dw9m.R.inc(7499);

        __CLR4_0_644t44tl1l0dw9m.R.inc(7500);if ((((c < 0x0030)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7501)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7502)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7503);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7504);if ((((c <= 0x0039)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7505)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7506)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7507);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7508);if ((((c < 0x0660)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7509)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7510)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7511);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7512);if ((((c <= 0x0669)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7513)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7514)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7515);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7516);if ((((c < 0x06F0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7517)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7518)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7519);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7520);if ((((c <= 0x06F9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7521)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7522)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7523);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7524);if ((((c < 0x0966)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7525)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7526)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7527);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7528);if ((((c <= 0x096F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7529)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7530)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7531);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7532);if ((((c < 0x09E6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7533)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7534)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7535);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7536);if ((((c <= 0x09EF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7537)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7538)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7539);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7540);if ((((c < 0x0A66)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7541)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7542)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7543);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7544);if ((((c <= 0x0A6F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7545)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7546)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7547);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7548);if ((((c < 0x0AE6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7549)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7550)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7551);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7552);if ((((c <= 0x0AEF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7553)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7554)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7555);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7556);if ((((c < 0x0B66)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7557)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7558)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7559);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7560);if ((((c <= 0x0B6F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7561)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7562)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7563);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7564);if ((((c < 0x0BE7)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7565)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7566)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7567);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7568);if ((((c <= 0x0BEF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7569)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7570)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7571);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7572);if ((((c < 0x0C66)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7573)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7574)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7575);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7576);if ((((c <= 0x0C6F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7577)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7578)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7579);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7580);if ((((c < 0x0CE6)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7581)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7582)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7583);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7584);if ((((c <= 0x0CEF)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7585)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7586)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7587);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7588);if ((((c < 0x0D66)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7589)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7590)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7591);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7592);if ((((c <= 0x0D6F)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7593)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7594)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7595);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7596);if ((((c < 0x0E50)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7597)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7598)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7599);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7600);if ((((c <= 0x0E59)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7601)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7602)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7603);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7604);if ((((c < 0x0ED0)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7605)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7606)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7607);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7608);if ((((c <= 0x0ED9)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7609)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7610)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7611);return true;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7612);if ((((c < 0x0F20)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7613)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7614)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7615);return false;
        }__CLR4_0_644t44tl1l0dw9m.R.inc(7616);if ((((c <= 0x0F29)&&(__CLR4_0_644t44tl1l0dw9m.R.iget(7617)!=0|true))||(__CLR4_0_644t44tl1l0dw9m.R.iget(7618)==0&false))) {__CLR4_0_644t44tl1l0dw9m.R.inc(7619);return true;

        }__CLR4_0_644t44tl1l0dw9m.R.inc(7620);return false;
    }finally{__CLR4_0_644t44tl1l0dw9m.R.flushNeeded();}}

}
