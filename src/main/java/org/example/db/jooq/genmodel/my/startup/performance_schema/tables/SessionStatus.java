/*
 * This file is generated by jOOQ.
 */
package my.startup.performance_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.performance_schema.PerformanceSchema;
import my.startup.performance_schema.tables.records.SessionStatusRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class SessionStatus extends TableImpl<SessionStatusRecord> {

    private static final long serialVersionUID = -2020538498;

    /**
     * The reference instance of <code>performance_schema.session_status</code>
     */
    public static final SessionStatus SESSION_STATUS = new SessionStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionStatusRecord> getRecordType() {
        return SessionStatusRecord.class;
    }

    /**
     * Create a <code>performance_schema.session_status</code> table reference
     */
    public SessionStatus() {
        this(DSL.name("session_status"), null);
    }

    /**
     * Create an aliased <code>performance_schema.session_status</code> table reference
     */
    public SessionStatus(String alias) {
        this(DSL.name(alias), SESSION_STATUS);
    }

    /**
     * Create an aliased <code>performance_schema.session_status</code> table reference
     */
    public SessionStatus(Name alias) {
        this(alias, SESSION_STATUS);
    }

    private SessionStatus(Name alias, Table<SessionStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionStatus(Name alias, Table<SessionStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SessionStatus(Table<O> child, ForeignKey<O, SessionStatusRecord> key) {
        super(child, key, SESSION_STATUS);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public SessionStatus as(String alias) {
        return new SessionStatus(DSL.name(alias), this);
    }

    @Override
    public SessionStatus as(Name alias) {
        return new SessionStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionStatus rename(String name) {
        return new SessionStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionStatus rename(Name name) {
        return new SessionStatus(name, null);
    }
}