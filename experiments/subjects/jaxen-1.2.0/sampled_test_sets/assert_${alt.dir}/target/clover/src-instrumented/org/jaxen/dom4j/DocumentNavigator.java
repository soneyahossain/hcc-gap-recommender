/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package org.jaxen.dom4j;

/*
 * $Header$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Copyright 2000-2005 bob mcwhirter & James Strachan.
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

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.jaxen.XPath;
import org.jaxen.*;
import org.jaxen.saxpath.SAXPathException;
import org.jaxen.util.SingleObjectIterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Interface for navigating around the DOM4J object model.
 *
 * <p>
 * This class is not intended for direct usage, but is
 * used by the Jaxen engine during evaluation.
 * </p>
 *
 * @author <a href="mailto:bob@werken.com">bob mcwhirter</a>
 * @author Stephen Colebourne
 * @see XPath
 */
public class DocumentNavigator extends DefaultNavigator implements NamedAccessNavigator {public static class __CLR4_0_6zjzjl1l0dvd6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,1514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     *
     */
    private static final long serialVersionUID = 5582300797286535936L;
    private transient SAXReader reader;

    /**
     * Retrieve the singleton instance of this <code>DocumentNavigator</code>.
     */
    public static Navigator getInstance() {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1279);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1280);return Singleton.instance;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public boolean isElement(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1281);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1282);return obj instanceof Element;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public boolean isComment(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1283);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1284);return obj instanceof Comment;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public boolean isText(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1285);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1286);return (obj instanceof Text
                ||
                obj instanceof CDATA);
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public boolean isAttribute(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1287);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1288);return obj instanceof Attribute;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public boolean isProcessingInstruction(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1289);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1290);return obj instanceof ProcessingInstruction;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public boolean isDocument(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1291);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1292);return obj instanceof Document;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public boolean isNamespace(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1293);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1294);return obj instanceof Namespace;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getElementName(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1295);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1296);Element elem = (Element) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1297);return elem.getName();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getElementNamespaceUri(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1298);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1299);Element elem = (Element) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1300);String uri = elem.getNamespaceURI();
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1301);if ((((uri == null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1302)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1303)==0&false)))
            {__CLR4_0_6zjzjl1l0dvd6.R.inc(1304);return "";
        }else
            {__CLR4_0_6zjzjl1l0dvd6.R.inc(1305);return uri;
    }}finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getElementQName(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1306);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1307);Element elem = (Element) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1308);return elem.getQualifiedName();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getAttributeName(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1309);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1310);Attribute attr = (Attribute) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1311);return attr.getName();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getAttributeNamespaceUri(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1312);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1313);Attribute attr = (Attribute) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1314);String uri = attr.getNamespaceURI();
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1315);if ((((uri == null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1316)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1317)==0&false)))
            {__CLR4_0_6zjzjl1l0dvd6.R.inc(1318);return "";
        }else
            {__CLR4_0_6zjzjl1l0dvd6.R.inc(1319);return uri;
    }}finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getAttributeQName(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1320);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1321);Attribute attr = (Attribute) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1322);return attr.getQualifiedName();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public Iterator getChildAxisIterator(Object contextNode) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1323);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1324);Iterator result = null;
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1325);if ((((contextNode instanceof Branch)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1326)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1327)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1328);Branch node = (Branch) contextNode;
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1329);result = node.nodeIterator();
        }
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1330);if ((((result != null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1331)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1332)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1333);return result;
        }
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1334);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    /**
     * Retrieves an <code>Iterator</code> over the child elements that
     * match the supplied name.
     *
     * @param contextNode     the origin context node
     * @param localName       the local name of the children to return, always present
     * @param namespacePrefix the prefix of the namespace of the children to return
     * @param namespaceURI    the uri of the namespace of the children to return
     * @return an Iterator that traverses the named children, or null if none
     */
    public Iterator getChildAxisIterator(
            Object contextNode, String localName, String namespacePrefix, String namespaceURI) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1335);

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1336);if ((((contextNode instanceof Element)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1337)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1338)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1339);Element node = (Element) contextNode;
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1340);return node.elementIterator(QName.get(localName, namespacePrefix, namespaceURI));
        }
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1341);if ((((contextNode instanceof Document)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1342)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1343)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1344);Document node = (Document) contextNode;
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1345);Element el = node.getRootElement();
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1346);if ((((el == null || el.getName().equals(localName) == false)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1347)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1348)==0&false))) {{
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1349);return JaxenConstants.EMPTY_ITERATOR;
            }
            }__CLR4_0_6zjzjl1l0dvd6.R.inc(1350);if ((((namespaceURI != null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1351)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1352)==0&false))) {{
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1353);if ((((namespaceURI.equals(el.getNamespaceURI()) == false)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1354)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1355)==0&false))) {{
                    __CLR4_0_6zjzjl1l0dvd6.R.inc(1356);return JaxenConstants.EMPTY_ITERATOR;
                }
            }}
            }__CLR4_0_6zjzjl1l0dvd6.R.inc(1357);return new SingleObjectIterator(el);
        }

        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1358);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public Iterator getParentAxisIterator(Object contextNode) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1359);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1360);if ((((contextNode instanceof Document)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1361)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1362)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1363);return JaxenConstants.EMPTY_ITERATOR;
        }

        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1364);Node node = (Node) contextNode;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1365);Object parent = node.getParent();

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1366);if ((((parent == null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1367)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1368)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1369);parent = node.getDocument();
        }

        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1370);return new SingleObjectIterator(parent);
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public Iterator getAttributeAxisIterator(Object contextNode) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1371);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1372);if ((((!(contextNode instanceof Element))&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1373)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1374)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1375);return JaxenConstants.EMPTY_ITERATOR;
        }

        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1376);Element elem = (Element) contextNode;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1377);return elem.attributeIterator();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    /**
     * Retrieves an <code>Iterator</code> over the attribute elements that
     * match the supplied name.
     *
     * @param contextNode     the origin context node
     * @param localName       the local name of the attributes to return, always present
     * @param namespacePrefix the prefix of the namespace of the attributes to return
     * @param namespaceURI    the URI of the namespace of the attributes to return
     * @return an Iterator that traverses the named attributes, not null
     */
    public Iterator getAttributeAxisIterator(
            Object contextNode, String localName, String namespacePrefix, String namespaceURI) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1378);

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1379);if ((((contextNode instanceof Element)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1380)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1381)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1382);Element node = (Element) contextNode;
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1383);Attribute attr = node.attribute(QName.get(localName, namespacePrefix, namespaceURI));
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1384);if ((((attr == null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1385)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1386)==0&false))) {{
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1387);return JaxenConstants.EMPTY_ITERATOR;
            }
            }__CLR4_0_6zjzjl1l0dvd6.R.inc(1388);return new SingleObjectIterator(attr);
        }
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1389);return JaxenConstants.EMPTY_ITERATOR;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public Iterator getNamespaceAxisIterator(Object contextNode) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1390);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1391);if ((((!(contextNode instanceof Element))&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1392)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1393)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1394);return JaxenConstants.EMPTY_ITERATOR;
        }

        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1395);Element element = (Element) contextNode;
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1396);List nsList = new ArrayList();
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1397);HashSet prefixes = new HashSet();
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1398);for (Element context = element; (((context != null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1399)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1400)==0&false)); context = context.getParent()) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1401);List declaredNS = new ArrayList(context.declaredNamespaces());
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1402);declaredNS.add(context.getNamespace());

            __CLR4_0_6zjzjl1l0dvd6.R.inc(1403);for (Iterator iter = context.attributes().iterator(); (((iter.hasNext())&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1404)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1405)==0&false)); ) {{
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1406);Attribute attr = (Attribute) iter.next();
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1407);declaredNS.add(attr.getNamespace());
            }

            }__CLR4_0_6zjzjl1l0dvd6.R.inc(1408);for (Iterator iter = declaredNS.iterator(); (((iter.hasNext())&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1409)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1410)==0&false)); ) {{
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1411);Namespace namespace = (Namespace) iter.next();
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1412);if ((((namespace != Namespace.NO_NAMESPACE)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1413)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1414)==0&false))) {{
                    __CLR4_0_6zjzjl1l0dvd6.R.inc(1415);String prefix = namespace.getPrefix();
                    __CLR4_0_6zjzjl1l0dvd6.R.inc(1416);if ((((!prefixes.contains(prefix))&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1417)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1418)==0&false))) {{
                        __CLR4_0_6zjzjl1l0dvd6.R.inc(1419);prefixes.add(prefix);
                        __CLR4_0_6zjzjl1l0dvd6.R.inc(1420);nsList.add(namespace.asXPathResult(element));
                    }
                }}
            }}
        }}
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1421);nsList.add(Namespace.XML_NAMESPACE.asXPathResult(element));
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1422);return nsList.iterator();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public Object getDocumentNode(Object contextNode) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1423);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1424);if ((((contextNode instanceof Document)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1425)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1426)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1427);return contextNode;
        } }else {__CLR4_0_6zjzjl1l0dvd6.R.inc(1428);if ((((contextNode instanceof Node)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1429)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1430)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1431);Node node = (Node) contextNode;
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1432);return node.getDocument();
        }
        }}__CLR4_0_6zjzjl1l0dvd6.R.inc(1433);return null;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    /**
     * Returns a parsed form of the given XPath string, which will be suitable
     * for queries on DOM4J documents.
     */
    public XPath parseXPath(String xpath) throws SAXPathException {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1434);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1435);return new Dom4jXPath(xpath);
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public Object getParentNode(Object contextNode) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1436);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1437);if ((((contextNode instanceof Node)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1438)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1439)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1440);Node node = (Node) contextNode;
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1441);Object answer = node.getParent();
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1442);if ((((answer == null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1443)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1444)==0&false))) {{
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1445);answer = node.getDocument();
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1446);if ((((answer == contextNode)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1447)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1448)==0&false))) {{
                    __CLR4_0_6zjzjl1l0dvd6.R.inc(1449);return null;
                }
            }}
            }__CLR4_0_6zjzjl1l0dvd6.R.inc(1450);return answer;
        }
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1451);return null;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getTextStringValue(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1452);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1453);return getNodeStringValue((Node) obj);
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getElementStringValue(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1454);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1455);return getNodeStringValue((Node) obj);
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getAttributeStringValue(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1456);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1457);return getNodeStringValue((Node) obj);
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    private String getNodeStringValue(Node node) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1458);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1459);return node.getStringValue();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getNamespaceStringValue(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1460);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1461);Namespace ns = (Namespace) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1462);return ns.getURI();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getNamespacePrefix(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1463);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1464);Namespace ns = (Namespace) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1465);return ns.getPrefix();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getCommentStringValue(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1466);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1467);Comment cmt = (Comment) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1468);return cmt.getText();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String translateNamespacePrefixToUri(String prefix, Object context) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1469);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1470);Element element = null;
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1471);if ((((context instanceof Element)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1472)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1473)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1474);element = (Element) context;
        } }else {__CLR4_0_6zjzjl1l0dvd6.R.inc(1475);if ((((context instanceof Node)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1476)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1477)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1478);Node node = (Node) context;
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1479);element = node.getParent();
        }
        }}__CLR4_0_6zjzjl1l0dvd6.R.inc(1480);if ((((element != null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1481)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1482)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1483);Namespace namespace = element.getNamespaceForPrefix(prefix);

            __CLR4_0_6zjzjl1l0dvd6.R.inc(1484);if ((((namespace != null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1485)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1486)==0&false))) {{
                __CLR4_0_6zjzjl1l0dvd6.R.inc(1487);return namespace.getURI();
            }
        }}
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1488);return null;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public short getNodeType(Object node) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1489);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1490);if ((((node instanceof Node)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1491)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1492)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1493);return ((Node) node).getNodeType();
        }
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1494);return 0;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public Object getDocument(String uri) throws FunctionCallException {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1495);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1496);try {
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1497);return getSAXReader().read(uri);
        } catch (DocumentException e) {
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1498);throw new FunctionCallException("Failed to parse document for URI: " + uri, e);
        }
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getProcessingInstructionTarget(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1499);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1500);ProcessingInstruction pi = (ProcessingInstruction) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1501);return pi.getTarget();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public String getProcessingInstructionData(Object obj) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1502);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1503);ProcessingInstruction pi = (ProcessingInstruction) obj;

        __CLR4_0_6zjzjl1l0dvd6.R.inc(1504);return pi.getText();
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    // Properties
    //-------------------------------------------------------------------------
    public SAXReader getSAXReader() {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1505);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1506);if ((((reader == null)&&(__CLR4_0_6zjzjl1l0dvd6.R.iget(1507)!=0|true))||(__CLR4_0_6zjzjl1l0dvd6.R.iget(1508)==0&false))) {{
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1509);reader = new SAXReader();
            __CLR4_0_6zjzjl1l0dvd6.R.inc(1510);reader.setMergeAdjacentText(true);
        }
        }__CLR4_0_6zjzjl1l0dvd6.R.inc(1511);return reader;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    public void setSAXReader(SAXReader reader) {try{__CLR4_0_6zjzjl1l0dvd6.R.inc(1512);
        __CLR4_0_6zjzjl1l0dvd6.R.inc(1513);this.reader = reader;
    }finally{__CLR4_0_6zjzjl1l0dvd6.R.flushNeeded();}}

    /**
     * Singleton implementation.
     */
    private static class Singleton {
        /**
         * Singleton instance.
         */
        private static DocumentNavigator instance = new DocumentNavigator();
    }

}
