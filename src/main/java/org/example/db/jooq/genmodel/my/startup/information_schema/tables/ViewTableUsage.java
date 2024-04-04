/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.ViewTableUsageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class ViewTableUsage extends TableImpl<ViewTableUsageRecord> {

    private static final long serialVersionUID = 70297896;

    /**
     * The reference instance of <code>information_schema.VIEW_TABLE_USAGE</code>
     */
    public static final ViewTableUsage VIEW_TABLE_USAGE = new ViewTableUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableUsageRecord> getRecordType() {
        return ViewTableUsageRecord.class;
    }

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.VIEW_CATALOG</code>.
     */
    public final TableField<ViewTableUsageRecord, String> VIEW_CATALOG = createField(DSL.name("VIEW_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.VIEW_SCHEMA</code>.
     */
    public final TableField<ViewTableUsageRecord, String> VIEW_SCHEMA = createField(DSL.name("VIEW_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.VIEW_NAME</code>.
     */
    public final TableField<ViewTableUsageRecord, String> VIEW_NAME = createField(DSL.name("VIEW_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.TABLE_CATALOG</code>.
     */
    public final TableField<ViewTableUsageRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.TABLE_SCHEMA</code>.
     */
    public final TableField<ViewTableUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.VIEW_TABLE_USAGE.TABLE_NAME</code>.
     */
    public final TableField<ViewTableUsageRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>information_schema.VIEW_TABLE_USAGE</code> table reference
     */
    public ViewTableUsage() {
        this(DSL.name("VIEW_TABLE_USAGE"), null);
    }

    /**
     * Create an aliased <code>information_schema.VIEW_TABLE_USAGE</code> table reference
     */
    public ViewTableUsage(String alias) {
        this(DSL.name(alias), VIEW_TABLE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.VIEW_TABLE_USAGE</code> table reference
     */
    public ViewTableUsage(Name alias) {
        this(alias, VIEW_TABLE_USAGE);
    }

    private ViewTableUsage(Name alias, Table<ViewTableUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableUsage(Name alias, Table<ViewTableUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ViewTableUsage(Table<O> child, ForeignKey<O, ViewTableUsageRecord> key) {
        super(child, key, VIEW_TABLE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ViewTableUsage as(String alias) {
        return new ViewTableUsage(DSL.name(alias), this);
    }

    @Override
    public ViewTableUsage as(Name alias) {
        return new ViewTableUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsage rename(String name) {
        return new ViewTableUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsage rename(Name name) {
        return new ViewTableUsage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
