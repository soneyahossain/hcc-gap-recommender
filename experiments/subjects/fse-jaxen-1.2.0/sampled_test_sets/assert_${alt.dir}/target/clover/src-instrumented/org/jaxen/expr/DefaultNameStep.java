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
package org.jaxen.expr;

import org.jaxen.*;
import org.jaxen.expr.iter.IterableAxis;
import org.jaxen.saxpath.Axis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Expression object that represents any flavor
 * of name-test steps within an XPath.
 * <p>
 * This includes simple steps, such as "foo",
 * non-default-axis steps, such as "following-sibling::foo"
 * or "@foo", and namespace-aware steps, such
 * as "foo:bar".
 *
 * @author bob mcwhirter (bob@werken.com)
 * @author Stephen Colebourne
 * @deprecated this class will become non-public in the future;
 * use the interface instead
 */
public class DefaultNameStep extends DefaultStep implements NameStep {public static class __CLR4_0_61j51j5l1l0dvju{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,2207,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     *
     */
    private static final long serialVersionUID = 428414912247718390L;

    /**
     * Our prefix, bound through the current Context.
     * The empty-string ("") if no prefix was specified.
     * Decidedly NOT-NULL, due to SAXPath constraints.
     * This is the 'foo' in 'foo:bar'.
     */
    private String prefix;

    /**
     * Our local-name.
     * This is the 'bar' in 'foo:bar'.
     */
    private String localName;

    /**
     * Quick flag denoting if the local name was '*'
     */
    private boolean matchesAnyName;

    /**
     * Quick flag denoting if we have a namespace prefix
     **/
    private boolean hasPrefix;

    /**
     * Constructor.
     *
     * @param axis         the axis to work through
     * @param prefix       the name prefix
     * @param localName    the local name
     * @param predicateSet the set of predicates
     */
    public DefaultNameStep(IterableAxis axis,
                           String prefix,
                           String localName,
                           PredicateSet predicateSet) {
        super(axis, predicateSet);__CLR4_0_61j51j5l1l0dvju.R.inc(1986);try{__CLR4_0_61j51j5l1l0dvju.R.inc(1985);

        __CLR4_0_61j51j5l1l0dvju.R.inc(1987);this.prefix = prefix;
        __CLR4_0_61j51j5l1l0dvju.R.inc(1988);this.localName = localName;
        __CLR4_0_61j51j5l1l0dvju.R.inc(1989);this.matchesAnyName = "*".equals(localName);
        __CLR4_0_61j51j5l1l0dvju.R.inc(1990);this.hasPrefix = (this.prefix != null && this.prefix.length() > 0);
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Gets the namespace prefix.
     *
     * @return the prefix
     */
    public String getPrefix() {try{__CLR4_0_61j51j5l1l0dvju.R.inc(1991);
        __CLR4_0_61j51j5l1l0dvju.R.inc(1992);return this.prefix;
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Gets the local name.
     *
     * @return the local name
     */
    public String getLocalName() {try{__CLR4_0_61j51j5l1l0dvju.R.inc(1993);
        __CLR4_0_61j51j5l1l0dvju.R.inc(1994);return this.localName;
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Does this step match any name? (i.e. Is it '*'?)
     *
     * @return true if it matches any name
     */
    public boolean isMatchesAnyName() {try{__CLR4_0_61j51j5l1l0dvju.R.inc(1995);
        __CLR4_0_61j51j5l1l0dvju.R.inc(1996);return matchesAnyName;
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Gets the step as a fully defined XPath.
     *
     * @return the full XPath for this step
     */
    public String getText() {try{__CLR4_0_61j51j5l1l0dvju.R.inc(1997);
        __CLR4_0_61j51j5l1l0dvju.R.inc(1998);StringBuffer buf = new StringBuffer(64);
        __CLR4_0_61j51j5l1l0dvju.R.inc(1999);buf.append(getAxisName()).append("::");
        __CLR4_0_61j51j5l1l0dvju.R.inc(2000);if ((((getPrefix() != null && getPrefix().length() > 0)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2001)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2002)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2003);buf.append(getPrefix()).append(':');
        }
        }__CLR4_0_61j51j5l1l0dvju.R.inc(2004);return buf.append(getLocalName()).append(super.getText()).toString();
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Evaluate the context node set to find the new node set.
     * <p>
     * This method overrides the version in <code>DefaultStep</code> for performance.
     */
    public List evaluate(Context context) throws JaxenException {try{__CLR4_0_61j51j5l1l0dvju.R.inc(2005);

        __CLR4_0_61j51j5l1l0dvju.R.inc(2006);List contextNodeSet = context.getNodeSet();
        __CLR4_0_61j51j5l1l0dvju.R.inc(2007);int contextSize = contextNodeSet.size();
        // optimize for context size 0
        __CLR4_0_61j51j5l1l0dvju.R.inc(2008);if ((((contextSize == 0)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2009)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2010)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2011);return Collections.EMPTY_LIST;
        }
        }__CLR4_0_61j51j5l1l0dvju.R.inc(2012);ContextSupport support = context.getContextSupport();
        __CLR4_0_61j51j5l1l0dvju.R.inc(2013);IterableAxis iterableAxis = getIterableAxis();
        __CLR4_0_61j51j5l1l0dvju.R.inc(2014);boolean namedAccess = (!matchesAnyName && iterableAxis.supportsNamedAccess(support));

        // optimize for context size 1 (common case, avoids lots of object creation)
        __CLR4_0_61j51j5l1l0dvju.R.inc(2015);if ((((contextSize == 1)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2016)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2017)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2018);Object contextNode = contextNodeSet.get(0);
            __CLR4_0_61j51j5l1l0dvju.R.inc(2019);if ((((namedAccess)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2020)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2021)==0&false))) {{
                // get the iterator over the nodes and check it
                __CLR4_0_61j51j5l1l0dvju.R.inc(2022);String uri = null;
                __CLR4_0_61j51j5l1l0dvju.R.inc(2023);if ((((hasPrefix)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2024)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2025)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2026);uri = support.translateNamespacePrefixToUri(prefix);
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2027);if ((((uri == null)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2028)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2029)==0&false))) {{
                        __CLR4_0_61j51j5l1l0dvju.R.inc(2030);throw new UnresolvableException("XPath expression uses unbound namespace prefix " + prefix);
                    }
                }}
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2031);Iterator axisNodeIter = iterableAxis.namedAccessIterator(
                        contextNode, support, localName, prefix, uri);
                __CLR4_0_61j51j5l1l0dvju.R.inc(2032);if ((((axisNodeIter == null || !axisNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2033)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2034)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2035);return Collections.EMPTY_LIST;
                }

                // convert iterator to list for predicate test
                // no need to filter as named access guarantees this
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2036);List newNodeSet = new ArrayList();
                __CLR4_0_61j51j5l1l0dvju.R.inc(2037);while ((((axisNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2038)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2039)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2040);newNodeSet.add(axisNodeIter.next());
                }

                // evaluate the predicates
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2041);return getPredicateSet().evaluatePredicates(newNodeSet, support);

            } }else {{
                // get the iterator over the nodes and check it
                __CLR4_0_61j51j5l1l0dvju.R.inc(2042);Iterator axisNodeIter = iterableAxis.iterator(contextNode, support);
                __CLR4_0_61j51j5l1l0dvju.R.inc(2043);if ((((axisNodeIter == null || !axisNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2044)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2045)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2046);return Collections.EMPTY_LIST;
                }

                // run through iterator, filtering using matches()
                // adding to list for predicate test
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2047);List newNodeSet = new ArrayList(contextSize);
                __CLR4_0_61j51j5l1l0dvju.R.inc(2048);while ((((axisNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2049)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2050)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2051);Object eachAxisNode = axisNodeIter.next();
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2052);if ((((matches(eachAxisNode, support))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2053)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2054)==0&false))) {{
                        __CLR4_0_61j51j5l1l0dvju.R.inc(2055);newNodeSet.add(eachAxisNode);
                    }
                }}

                // evaluate the predicates
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2056);return getPredicateSet().evaluatePredicates(newNodeSet, support);
            }
        }}

        // full case
        }__CLR4_0_61j51j5l1l0dvju.R.inc(2057);IdentitySet unique = new IdentitySet();
        __CLR4_0_61j51j5l1l0dvju.R.inc(2058);List interimSet = new ArrayList(contextSize);
        __CLR4_0_61j51j5l1l0dvju.R.inc(2059);List newNodeSet = new ArrayList(contextSize);

        __CLR4_0_61j51j5l1l0dvju.R.inc(2060);if ((((namedAccess)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2061)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2062)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2063);String uri = null;
            __CLR4_0_61j51j5l1l0dvju.R.inc(2064);if ((((hasPrefix)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2065)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2066)==0&false))) {{
                __CLR4_0_61j51j5l1l0dvju.R.inc(2067);uri = support.translateNamespacePrefixToUri(prefix);
                __CLR4_0_61j51j5l1l0dvju.R.inc(2068);if ((((uri == null)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2069)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2070)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2071);throw new UnresolvableException("XPath expression uses unbound namespace prefix " + prefix);
                }
            }}
            }__CLR4_0_61j51j5l1l0dvju.R.inc(2072);for (int i = 0; (((i < contextSize)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2073)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2074)==0&false)); ++i) {{
                __CLR4_0_61j51j5l1l0dvju.R.inc(2075);Object eachContextNode = contextNodeSet.get(i);

                __CLR4_0_61j51j5l1l0dvju.R.inc(2076);Iterator axisNodeIter = iterableAxis.namedAccessIterator(
                        eachContextNode, support, localName, prefix, uri);
                __CLR4_0_61j51j5l1l0dvju.R.inc(2077);if ((((axisNodeIter == null || !axisNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2078)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2079)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2080);continue;
                }

                }__CLR4_0_61j51j5l1l0dvju.R.inc(2081);while ((((axisNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2082)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2083)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2084);Object eachAxisNode = axisNodeIter.next();
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2085);interimSet.add(eachAxisNode);
                }

                // evaluate the predicates
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2086);List predicateNodes = getPredicateSet().evaluatePredicates(interimSet, support);

                // ensure only one of each node in the result
                __CLR4_0_61j51j5l1l0dvju.R.inc(2087);Iterator predicateNodeIter = predicateNodes.iterator();
                __CLR4_0_61j51j5l1l0dvju.R.inc(2088);while ((((predicateNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2089)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2090)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2091);Object eachPredicateNode = predicateNodeIter.next();
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2092);if ((((!unique.contains(eachPredicateNode))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2093)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2094)==0&false))) {{
                        __CLR4_0_61j51j5l1l0dvju.R.inc(2095);unique.add(eachPredicateNode);
                        __CLR4_0_61j51j5l1l0dvju.R.inc(2096);newNodeSet.add(eachPredicateNode);
                    }
                }}
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2097);interimSet.clear();
            }

        }} }else {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2098);for (int i = 0; (((i < contextSize)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2099)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2100)==0&false)); ++i) {{
                __CLR4_0_61j51j5l1l0dvju.R.inc(2101);Object eachContextNode = contextNodeSet.get(i);

                __CLR4_0_61j51j5l1l0dvju.R.inc(2102);Iterator axisNodeIter = axisIterator(eachContextNode, support);
                __CLR4_0_61j51j5l1l0dvju.R.inc(2103);if ((((axisNodeIter == null || !axisNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2104)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2105)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2106);continue;
                }

                /* See jaxen-106. Might be able to optimize this by doing
                 * specific matching for individual axes. For instance on namespace axis
                 * we should only get namespace nodes and on attribute axes we only get
                 * attribute nodes. Self and parent axes have single members.
                 * Children, descendant, ancestor, and sibling axes never
                 * see any attributes or namespaces
                 */

                // ensure only unique matching nodes in the result
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2107);while ((((axisNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2108)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2109)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2110);Object eachAxisNode = axisNodeIter.next();

                    __CLR4_0_61j51j5l1l0dvju.R.inc(2111);if ((((matches(eachAxisNode, support))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2112)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2113)==0&false))) {{
                        __CLR4_0_61j51j5l1l0dvju.R.inc(2114);interimSet.add(eachAxisNode);
                    }
                }}

                // evaluate the predicates
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2115);List predicateNodes = getPredicateSet().evaluatePredicates(interimSet, support);

                // ensure only one of each node in the result
                __CLR4_0_61j51j5l1l0dvju.R.inc(2116);Iterator predicateNodeIter = predicateNodes.iterator();
                __CLR4_0_61j51j5l1l0dvju.R.inc(2117);while ((((predicateNodeIter.hasNext())&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2118)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2119)==0&false))) {{
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2120);Object eachPredicateNode = predicateNodeIter.next();
                    __CLR4_0_61j51j5l1l0dvju.R.inc(2121);if ((((!unique.contains(eachPredicateNode))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2122)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2123)==0&false))) {{
                        __CLR4_0_61j51j5l1l0dvju.R.inc(2124);unique.add(eachPredicateNode);
                        __CLR4_0_61j51j5l1l0dvju.R.inc(2125);newNodeSet.add(eachPredicateNode);
                    }
                }}
                }__CLR4_0_61j51j5l1l0dvju.R.inc(2126);interimSet.clear();
            }
        }}

        }__CLR4_0_61j51j5l1l0dvju.R.inc(2127);return newNodeSet;
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Checks whether the node matches this step.
     *
     * @param node           the node to check
     * @param contextSupport the context support
     * @return true if matches
     * @throws JaxenException
     */
    public boolean matches(Object node, ContextSupport contextSupport) throws JaxenException {try{__CLR4_0_61j51j5l1l0dvju.R.inc(2128);

        __CLR4_0_61j51j5l1l0dvju.R.inc(2129);Navigator nav = contextSupport.getNavigator();
        __CLR4_0_61j51j5l1l0dvju.R.inc(2130);String myUri = null;
        __CLR4_0_61j51j5l1l0dvju.R.inc(2131);String nodeName = null;
        __CLR4_0_61j51j5l1l0dvju.R.inc(2132);String nodeUri = null;

        __CLR4_0_61j51j5l1l0dvju.R.inc(2133);if ((((nav.isElement(node))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2134)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2135)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2136);nodeName = nav.getElementName(node);
            __CLR4_0_61j51j5l1l0dvju.R.inc(2137);nodeUri = nav.getElementNamespaceUri(node);
        } }else {__CLR4_0_61j51j5l1l0dvju.R.inc(2138);if ((((nav.isText(node))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2139)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2140)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2141);return false;
        } }else {__CLR4_0_61j51j5l1l0dvju.R.inc(2142);if ((((nav.isAttribute(node))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2143)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2144)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2145);if ((((getAxis() != Axis.ATTRIBUTE)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2146)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2147)==0&false))) {{
                __CLR4_0_61j51j5l1l0dvju.R.inc(2148);return false;
            }
            }__CLR4_0_61j51j5l1l0dvju.R.inc(2149);nodeName = nav.getAttributeName(node);
            __CLR4_0_61j51j5l1l0dvju.R.inc(2150);nodeUri = nav.getAttributeNamespaceUri(node);

        } }else {__CLR4_0_61j51j5l1l0dvju.R.inc(2151);if ((((nav.isDocument(node))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2152)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2153)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2154);return false;
        } }else {__CLR4_0_61j51j5l1l0dvju.R.inc(2155);if ((((nav.isNamespace(node))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2156)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2157)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2158);if ((((getAxis() != Axis.NAMESPACE)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2159)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2160)==0&false))) {{
                // Only works for namespace::*
                __CLR4_0_61j51j5l1l0dvju.R.inc(2161);return false;
            }
            }__CLR4_0_61j51j5l1l0dvju.R.inc(2162);nodeName = nav.getNamespacePrefix(node);
        } }else {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2163);return false;
        }

        }}}}}__CLR4_0_61j51j5l1l0dvju.R.inc(2164);if ((((hasPrefix)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2165)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2166)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2167);myUri = contextSupport.translateNamespacePrefixToUri(this.prefix);
            __CLR4_0_61j51j5l1l0dvju.R.inc(2168);if ((((myUri == null)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2169)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2170)==0&false))) {{
                __CLR4_0_61j51j5l1l0dvju.R.inc(2171);throw new UnresolvableException("Cannot resolve namespace prefix '" + this.prefix + "'");
            }
        }} }else {__CLR4_0_61j51j5l1l0dvju.R.inc(2172);if ((((matchesAnyName)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2173)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2174)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2175);return true;
        }

        // If we map to a non-empty namespace and the node does not
        // or vice-versa, fail-fast.
        }}__CLR4_0_61j51j5l1l0dvju.R.inc(2176);if ((((hasNamespace(myUri) != hasNamespace(nodeUri))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2177)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2178)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2179);return false;
        }

        // To fail-fast, we check the equality of
        // local-names first.  Shorter strings compare
        // quicker.
        }__CLR4_0_61j51j5l1l0dvju.R.inc(2180);if ((((matchesAnyName || nodeName.equals(getLocalName()))&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2181)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2182)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2183);return matchesNamespaceURIs(myUri, nodeUri);
        }

        }__CLR4_0_61j51j5l1l0dvju.R.inc(2184);return false;
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Checks whether the URI represents a namespace.
     *
     * @param uri the URI to check
     * @return true if non-null and non-empty
     */
    private boolean hasNamespace(String uri) {try{__CLR4_0_61j51j5l1l0dvju.R.inc(2185);
        __CLR4_0_61j51j5l1l0dvju.R.inc(2186);return (uri != null && uri.length() > 0);
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Compares two namespace URIs, handling null.
     *
     * @param uri1 the first URI
     * @param uri2 the second URI
     * @return true if equal, where null==""
     */
    protected boolean matchesNamespaceURIs(String uri1, String uri2) {try{__CLR4_0_61j51j5l1l0dvju.R.inc(2187);
        __CLR4_0_61j51j5l1l0dvju.R.inc(2188);if ((((uri1 == uri2)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2189)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2190)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2191);return true;
        }
        }__CLR4_0_61j51j5l1l0dvju.R.inc(2192);if ((((uri1 == null)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2193)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2194)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2195);return (uri2.length() == 0);
        }
        }__CLR4_0_61j51j5l1l0dvju.R.inc(2196);if ((((uri2 == null)&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2197)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2198)==0&false))) {{
            __CLR4_0_61j51j5l1l0dvju.R.inc(2199);return (uri1.length() == 0);
        }
        }__CLR4_0_61j51j5l1l0dvju.R.inc(2200);return uri1.equals(uri2);
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

    /**
     * Returns a full information debugging string.
     *
     * @return a debugging string
     */
    public String toString() {try{__CLR4_0_61j51j5l1l0dvju.R.inc(2201);
        __CLR4_0_61j51j5l1l0dvju.R.inc(2202);String prefix = getPrefix();
        __CLR4_0_61j51j5l1l0dvju.R.inc(2203);String qName = ((("".equals(prefix) )&&(__CLR4_0_61j51j5l1l0dvju.R.iget(2204)!=0|true))||(__CLR4_0_61j51j5l1l0dvju.R.iget(2205)==0&false))? getLocalName() : getPrefix() + ":" + getLocalName();
        __CLR4_0_61j51j5l1l0dvju.R.inc(2206);return "[(DefaultNameStep): " + qName + "]";
    }finally{__CLR4_0_61j51j5l1l0dvju.R.flushNeeded();}}

}
