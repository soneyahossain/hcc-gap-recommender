/*
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
package org.jaxen.expr;

/**
 * Represents an XPath additive expression. This is production 25 in the
 * <a href="https://www.w3.org/TR/xpath#NT-AdditiveExpr">XPath 1.0 specification</a>:
 *
 * <table><tr valign="baseline"><td><a name="NT-AdditiveExpr"></a>[25]&nbsp;&nbsp;&nbsp;</td><td>AdditiveExpr</td><td>&nbsp;&nbsp;&nbsp;::=&nbsp;&nbsp;&nbsp;</td><td><a href="https://www.w3.org/TR/xpath#NT-MultiplicativeExpr">MultiplicativeExpr</a></td><td></td>
 * </tr>
 * <tr valign="baseline">
 * <td></td><td></td><td></td><td>| <a href="https://www.w3.org/TR/xpath#NT-AdditiveExpr">AdditiveExpr</a> '+' <a href="https://www.w3.org/TR/xpath#NT-MultiplicativeExpr">MultiplicativeExpr</a></td><td></td>
 * </tr>
 *
 * <tr valign="baseline">
 * <td></td><td></td><td></td><td>| <a href="https://www.w3.org/TR/xpath#NT-AdditiveExpr">AdditiveExpr</a> '-' <a href="https://www.w3.org/TR/xpath#NT-AdditiveExpr#NT-MultiplicativeExpr">MultiplicativeExpr</a>
 * </tr></table>
 */
public interface AdditiveExpr extends BinaryExpr {
}
