/*
 * This file is generated by jOOQ.
 */
package my.startup.performance_schema.tables.records;


import javax.annotation.processing.Generated;

import my.startup.performance_schema.tables.PersistedVariables;

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
public class PersistedVariablesRecord extends TableRecordImpl<PersistedVariablesRecord> {

    private static final long serialVersionUID = 1715522276;

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersistedVariablesRecord
     */
    public PersistedVariablesRecord() {
        super(PersistedVariables.PERSISTED_VARIABLES);
    }
}
