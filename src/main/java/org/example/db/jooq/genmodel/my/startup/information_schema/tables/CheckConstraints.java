/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.CheckConstraintsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class CheckConstraints extends TableImpl<CheckConstraintsRecord> {

    private static final long serialVersionUID = 2126171779;

    /**
     * The reference instance of <code>information_schema.CHECK_CONSTRAINTS</code>
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = new CheckConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CheckConstraintsRecord> getRecordType() {
        return CheckConstraintsRecord.class;
    }

    /**
     * The column <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public final TableField<CheckConstraintsRecord, String> CHECK_CLAUSE = createField(DSL.name("CHECK_CLAUSE"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>information_schema.CHECK_CONSTRAINTS</code> table reference
     */
    public CheckConstraints() {
        this(DSL.name("CHECK_CONSTRAINTS"), null);
    }

    /**
     * Create an aliased <code>information_schema.CHECK_CONSTRAINTS</code> table reference
     */
    public CheckConstraints(String alias) {
        this(DSL.name(alias), CHECK_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.CHECK_CONSTRAINTS</code> table reference
     */
    public CheckConstraints(Name alias) {
        this(alias, CHECK_CONSTRAINTS);
    }

    private CheckConstraints(Name alias, Table<CheckConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraints(Name alias, Table<CheckConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CheckConstraints(Table<O> child, ForeignKey<O, CheckConstraintsRecord> key) {
        super(child, key, CHECK_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CheckConstraints as(String alias) {
        return new CheckConstraints(DSL.name(alias), this);
    }

    @Override
    public CheckConstraints as(Name alias) {
        return new CheckConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraints rename(String name) {
        return new CheckConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CheckConstraints rename(Name name) {
        return new CheckConstraints(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
