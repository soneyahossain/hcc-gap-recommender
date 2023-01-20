/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ *//*
 * $Header$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Copyright 2000-2004 bob mcwhirter & James Strachan.
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

package org.jaxen.saxpath.base;


@java.lang.SuppressWarnings({"fallthrough"}) class TokenTypes {public static class __CLR4_0_642r42rl1l0dw6i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,5357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final int EOF = -1;
    static final int SKIP = -2;
    static final int ERROR = -3;

    static final int EQUALS = 1;
    static final int NOT_EQUALS = 2;

    static final int LESS_THAN_SIGN = 3;
    static final int LESS_THAN_OR_EQUALS_SIGN = 4;
    static final int GREATER_THAN_SIGN = 5;
    static final int GREATER_THAN_OR_EQUALS_SIGN = 6;

    static final int PLUS = 7;
    static final int MINUS = 8;
    static final int STAR = 9;
    static final int MOD = 10;
    static final int DIV = 11;

    static final int SLASH = 12;
    static final int DOUBLE_SLASH = 13;
    static final int DOT = 14;
    static final int DOT_DOT = 15;

    static final int IDENTIFIER = 16;

    static final int AT = 17;
    static final int PIPE = 18;
    static final int COLON = 19;
    static final int DOUBLE_COLON = 20;

    static final int LEFT_BRACKET = 21;
    static final int RIGHT_BRACKET = 22;
    static final int LEFT_PAREN = 23;
    static final int RIGHT_PAREN = 24;

    // 25 was NOT but there is no such token in XPath
    static final int DOLLAR = 25;
    static final int LITERAL = 26;
    static final int AND = 27;
    static final int OR = 28;

    // No need for an integer token type. All numbers
    // in XPath are doubles.
    static final int DOUBLE = 29;
    static final int COMMA = 30;
    // split star into two token types
    static final int STAR_OPERATOR = 31;

    static String getTokenText(int tokenType) {try{__CLR4_0_642r42rl1l0dw6i.R.inc(5283);
        boolean __CLB4_0_6_bool0=false;__CLR4_0_642r42rl1l0dw6i.R.inc(5284);switch (tokenType) {
            case ERROR:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5285);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5286);return "(error)";
            case SKIP:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5287);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5288);return "(skip)";
            case EOF:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5289);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5290);return "(eof)";
            case 0:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5291);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5292);return "Unrecognized token type: 0";
            case EQUALS:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5293);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5294);return "=";
            case NOT_EQUALS:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5295);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5296);return "!=";
            case LESS_THAN_SIGN:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5297);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5298);return "<";
            case LESS_THAN_OR_EQUALS_SIGN:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5299);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5300);return "<=";
            case GREATER_THAN_SIGN:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5301);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5302);return ">";
            case GREATER_THAN_OR_EQUALS_SIGN:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5303);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5304);return ">=";
            case PLUS:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5305);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5306);return "+";
            case MINUS:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5307);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5308);return "-";
            case STAR:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5309);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5310);return "*";
            case STAR_OPERATOR:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5311);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5312);return "*";
            case DIV:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5313);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5314);return "div";
            case MOD:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5315);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5316);return "mod";
            case SLASH:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5317);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5318);return "/";
            case DOUBLE_SLASH:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5319);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5320);return "//";
            case DOT:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5321);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5322);return ".";
            case DOT_DOT:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5323);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5324);return "..";
            case IDENTIFIER:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5325);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5326);return "(identifier)";
            case AT:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5327);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5328);return "@";
            case PIPE:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5329);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5330);return "|";
            case COLON:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5331);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5332);return ":";
            case DOUBLE_COLON:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5333);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5334);return "::";
            case LEFT_BRACKET:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5335);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5336);return "[";
            case RIGHT_BRACKET:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5337);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5338);return "]";
            case LEFT_PAREN:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5339);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5340);return "(";
            case RIGHT_PAREN:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5341);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5342);return ")";
            case DOLLAR:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5343);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5344);return "$";
            case LITERAL:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5345);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5346);return "(literal)";
            case AND:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5347);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5348);return "and";
            case OR:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5349);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5350);return "or";
            case DOUBLE:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5351);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5352);return "(double)";
            case COMMA:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5353);__CLB4_0_6_bool0=true;}
                __CLR4_0_642r42rl1l0dw6i.R.inc(5354);return ",";
            default:if (!__CLB4_0_6_bool0) {__CLR4_0_642r42rl1l0dw6i.R.inc(5355);__CLB4_0_6_bool0=true;}
                // This method is only called from an error handler, and only
                // to provide an exception message. In other words, the string
                // returned by this method is only used in an exception message.
                // Something has already gone wrong, and is being reported.
                // Thus there's no real reason to throw another exception here.
                // Just return a string and this message will be reported in an
                // exception anyway.
                __CLR4_0_642r42rl1l0dw6i.R.inc(5356);return ("Unrecognized token type: " + tokenType);
        }
    }finally{__CLR4_0_642r42rl1l0dw6i.R.flushNeeded();}}
}
