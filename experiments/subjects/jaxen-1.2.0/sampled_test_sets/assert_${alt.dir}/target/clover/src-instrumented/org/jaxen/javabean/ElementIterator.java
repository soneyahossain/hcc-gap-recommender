/* $$ This file has been instrumented by Clover 4.0.6#20150918095238309 $$ */package org.jaxen.javabean;

import java.util.Iterator;

public class ElementIterator
    implements Iterator
{public static class __CLR4_0_6368368l1l0dw0d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_0_6();if(20150918095238309L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.0.6#20150918095238309,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0074\u0067\u002f\u004f\u004d\u0043\u002d\u0046\u0053\u0045\u002f\u0073\u0075\u0062\u006a\u0065\u0063\u0074\u0073\u002f\u006a\u0061\u0078\u0065\u006e\u002d\u0031\u002e\u0032\u002e\u0030\u002f\u0073\u0061\u006d\u0070\u006c\u0065\u0064\u005f\u0074\u0065\u0073\u0074\u005f\u0073\u0065\u0074\u0073\u002f\u0061\u0073\u0073\u0065\u0072\u0074\u005f\u0024\u007b\u0061\u006c\u0074\u002e\u0064\u0069\u0072\u007d\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1649094664504L,8589935092L,4122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_0_6_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Element parent;
    private String name;
    private Iterator iterator;

    public ElementIterator(Element parent,
                           String name,
                           Iterator iterator)
    {try{__CLR4_0_6368368l1l0dw0d.R.inc(4112);
        __CLR4_0_6368368l1l0dw0d.R.inc(4113);this.parent    = parent;
        __CLR4_0_6368368l1l0dw0d.R.inc(4114);this.name     = name;
        __CLR4_0_6368368l1l0dw0d.R.inc(4115);this.iterator = iterator;
    }finally{__CLR4_0_6368368l1l0dw0d.R.flushNeeded();}}

    public boolean hasNext()
    {try{__CLR4_0_6368368l1l0dw0d.R.inc(4116);
        __CLR4_0_6368368l1l0dw0d.R.inc(4117);return this.iterator.hasNext();
    }finally{__CLR4_0_6368368l1l0dw0d.R.flushNeeded();}}

    public Object next()
    {try{__CLR4_0_6368368l1l0dw0d.R.inc(4118);
        __CLR4_0_6368368l1l0dw0d.R.inc(4119);return new Element( parent,
                            this.name,
                            this.iterator.next() );
    }finally{__CLR4_0_6368368l1l0dw0d.R.flushNeeded();}}

    public void remove()
    {try{__CLR4_0_6368368l1l0dw0d.R.inc(4120);
        __CLR4_0_6368368l1l0dw0d.R.inc(4121);throw new UnsupportedOperationException();
    }finally{__CLR4_0_6368368l1l0dw0d.R.flushNeeded();}}
}
