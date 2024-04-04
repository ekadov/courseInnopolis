/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.TablespacesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class Tablespaces extends TableImpl<TablespacesRecord> {

    private static final long serialVersionUID = 87207802;

    /**
     * The reference instance of <code>information_schema.TABLESPACES</code>
     */
    public static final Tablespaces TABLESPACES = new Tablespaces();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablespacesRecord> getRecordType() {
        return TablespacesRecord.class;
    }

    /**
     * The column <code>information_schema.TABLESPACES.TABLESPACE_NAME</code>.
     */
    public final TableField<TablespacesRecord, String> TABLESPACE_NAME = createField(DSL.name("TABLESPACE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.ENGINE</code>.
     */
    public final TableField<TablespacesRecord, String> ENGINE = createField(DSL.name("ENGINE"), org.jooq.impl.SQLDataType.VARCHAR(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.TABLESPACE_TYPE</code>.
     */
    public final TableField<TablespacesRecord, String> TABLESPACE_TYPE = createField(DSL.name("TABLESPACE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(21).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.LOGFILE_GROUP_NAME</code>.
     */
    public final TableField<TablespacesRecord, String> LOGFILE_GROUP_NAME = createField(DSL.name("LOGFILE_GROUP_NAME"), org.jooq.impl.SQLDataType.VARCHAR(21).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.EXTENT_SIZE</code>.
     */
    public final TableField<TablespacesRecord, ULong> EXTENT_SIZE = createField(DSL.name("EXTENT_SIZE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.AUTOEXTEND_SIZE</code>.
     */
    public final TableField<TablespacesRecord, ULong> AUTOEXTEND_SIZE = createField(DSL.name("AUTOEXTEND_SIZE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.MAXIMUM_SIZE</code>.
     */
    public final TableField<TablespacesRecord, ULong> MAXIMUM_SIZE = createField(DSL.name("MAXIMUM_SIZE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.NODEGROUP_ID</code>.
     */
    public final TableField<TablespacesRecord, ULong> NODEGROUP_ID = createField(DSL.name("NODEGROUP_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.TABLESPACE_COMMENT</code>.
     */
    public final TableField<TablespacesRecord, String> TABLESPACE_COMMENT = createField(DSL.name("TABLESPACE_COMMENT"), org.jooq.impl.SQLDataType.VARCHAR(682).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.TABLESPACES</code> table reference
     */
    public Tablespaces() {
        this(DSL.name("TABLESPACES"), null);
    }

    /**
     * Create an aliased <code>information_schema.TABLESPACES</code> table reference
     */
    public Tablespaces(String alias) {
        this(DSL.name(alias), TABLESPACES);
    }

    /**
     * Create an aliased <code>information_schema.TABLESPACES</code> table reference
     */
    public Tablespaces(Name alias) {
        this(alias, TABLESPACES);
    }

    private Tablespaces(Name alias, Table<TablespacesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tablespaces(Name alias, Table<TablespacesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Tablespaces(Table<O> child, ForeignKey<O, TablespacesRecord> key) {
        super(child, key, TABLESPACES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Tablespaces as(String alias) {
        return new Tablespaces(DSL.name(alias), this);
    }

    @Override
    public Tablespaces as(Name alias) {
        return new Tablespaces(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tablespaces rename(String name) {
        return new Tablespaces(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tablespaces rename(Name name) {
        return new Tablespaces(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, ULong, ULong, ULong, ULong, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}