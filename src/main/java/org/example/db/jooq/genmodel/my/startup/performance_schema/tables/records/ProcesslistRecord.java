/*
 * This file is generated by jOOQ.
 */
package my.startup.performance_schema.tables.records;


import javax.annotation.processing.Generated;

import my.startup.performance_schema.tables.Processlist;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcesslistRecord extends TableRecordImpl<ProcesslistRecord> {

    private static final long serialVersionUID = 2136415758;

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProcesslistRecord
     */
    public ProcesslistRecord() {
        super(Processlist.PROCESSLIST);
    }
}
