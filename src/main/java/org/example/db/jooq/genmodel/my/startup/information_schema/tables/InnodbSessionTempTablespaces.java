/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.InnodbSessionTempTablespacesRecord;

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
import org.jooq.types.UInteger;
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
public class InnodbSessionTempTablespaces extends TableImpl<InnodbSessionTempTablespacesRecord> {

    private static final long serialVersionUID = 1960441792;

    /**
     * The reference instance of <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code>
     */
    public static final InnodbSessionTempTablespaces INNODB_SESSION_TEMP_TABLESPACES = new InnodbSessionTempTablespaces();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSessionTempTablespacesRecord> getRecordType() {
        return InnodbSessionTempTablespacesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.ID</code>.
     */
    public final TableField<InnodbSessionTempTablespacesRecord, UInteger> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.SPACE</code>.
     */
    public final TableField<InnodbSessionTempTablespacesRecord, UInteger> SPACE = createField(DSL.name("SPACE"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.PATH</code>.
     */
    public final TableField<InnodbSessionTempTablespacesRecord, String> PATH = createField(DSL.name("PATH"), org.jooq.impl.SQLDataType.VARCHAR(1333).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.SIZE</code>.
     */
    public final TableField<InnodbSessionTempTablespacesRecord, ULong> SIZE = createField(DSL.name("SIZE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.STATE</code>.
     */
    public final TableField<InnodbSessionTempTablespacesRecord, String> STATE = createField(DSL.name("STATE"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES.PURPOSE</code>.
     */
    public final TableField<InnodbSessionTempTablespacesRecord, String> PURPOSE = createField(DSL.name("PURPOSE"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code> table reference
     */
    public InnodbSessionTempTablespaces() {
        this(DSL.name("INNODB_SESSION_TEMP_TABLESPACES"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code> table reference
     */
    public InnodbSessionTempTablespaces(String alias) {
        this(DSL.name(alias), INNODB_SESSION_TEMP_TABLESPACES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code> table reference
     */
    public InnodbSessionTempTablespaces(Name alias) {
        this(alias, INNODB_SESSION_TEMP_TABLESPACES);
    }

    private InnodbSessionTempTablespaces(Name alias, Table<InnodbSessionTempTablespacesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSessionTempTablespaces(Name alias, Table<InnodbSessionTempTablespacesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbSessionTempTablespaces(Table<O> child, ForeignKey<O, InnodbSessionTempTablespacesRecord> key) {
        super(child, key, INNODB_SESSION_TEMP_TABLESPACES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSessionTempTablespaces as(String alias) {
        return new InnodbSessionTempTablespaces(DSL.name(alias), this);
    }

    @Override
    public InnodbSessionTempTablespaces as(Name alias) {
        return new InnodbSessionTempTablespaces(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSessionTempTablespaces rename(String name) {
        return new InnodbSessionTempTablespaces(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSessionTempTablespaces rename(Name name) {
        return new InnodbSessionTempTablespaces(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UInteger, UInteger, String, ULong, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
