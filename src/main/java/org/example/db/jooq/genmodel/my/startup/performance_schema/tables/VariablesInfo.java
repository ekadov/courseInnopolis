/*
 * This file is generated by jOOQ.
 */
package my.startup.performance_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.performance_schema.PerformanceSchema;
import my.startup.performance_schema.tables.records.VariablesInfoRecord;

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
public class VariablesInfo extends TableImpl<VariablesInfoRecord> {

    private static final long serialVersionUID = -1477765131;

    /**
     * The reference instance of <code>performance_schema.variables_info</code>
     */
    public static final VariablesInfo VARIABLES_INFO = new VariablesInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VariablesInfoRecord> getRecordType() {
        return VariablesInfoRecord.class;
    }

    /**
     * Create a <code>performance_schema.variables_info</code> table reference
     */
    public VariablesInfo() {
        this(DSL.name("variables_info"), null);
    }

    /**
     * Create an aliased <code>performance_schema.variables_info</code> table reference
     */
    public VariablesInfo(String alias) {
        this(DSL.name(alias), VARIABLES_INFO);
    }

    /**
     * Create an aliased <code>performance_schema.variables_info</code> table reference
     */
    public VariablesInfo(Name alias) {
        this(alias, VARIABLES_INFO);
    }

    private VariablesInfo(Name alias, Table<VariablesInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private VariablesInfo(Name alias, Table<VariablesInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> VariablesInfo(Table<O> child, ForeignKey<O, VariablesInfoRecord> key) {
        super(child, key, VARIABLES_INFO);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public VariablesInfo as(String alias) {
        return new VariablesInfo(DSL.name(alias), this);
    }

    @Override
    public VariablesInfo as(Name alias) {
        return new VariablesInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VariablesInfo rename(String name) {
        return new VariablesInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VariablesInfo rename(Name name) {
        return new VariablesInfo(name, null);
    }
}
