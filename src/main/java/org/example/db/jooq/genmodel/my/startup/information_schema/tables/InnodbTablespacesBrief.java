/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.InnodbTablespacesBriefRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class InnodbTablespacesBrief extends TableImpl<InnodbTablespacesBriefRecord> {

    private static final long serialVersionUID = 1522438367;

    /**
     * The reference instance of <code>information_schema.INNODB_TABLESPACES_BRIEF</code>
     */
    public static final InnodbTablespacesBrief INNODB_TABLESPACES_BRIEF = new InnodbTablespacesBrief();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbTablespacesBriefRecord> getRecordType() {
        return InnodbTablespacesBriefRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_BRIEF.SPACE</code>.
     */
    public final TableField<InnodbTablespacesBriefRecord, byte[]> SPACE = createField(DSL.name("SPACE"), org.jooq.impl.SQLDataType.VARBINARY(256), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_BRIEF.NAME</code>.
     */
    public final TableField<InnodbTablespacesBriefRecord, String> NAME = createField(DSL.name("NAME"), org.jooq.impl.SQLDataType.VARCHAR(268).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_BRIEF.PATH</code>.
     */
    public final TableField<InnodbTablespacesBriefRecord, String> PATH = createField(DSL.name("PATH"), org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_BRIEF.FLAG</code>.
     */
    public final TableField<InnodbTablespacesBriefRecord, byte[]> FLAG = createField(DSL.name("FLAG"), org.jooq.impl.SQLDataType.VARBINARY(256), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES_BRIEF.SPACE_TYPE</code>.
     */
    public final TableField<InnodbTablespacesBriefRecord, String> SPACE_TYPE = createField(DSL.name("SPACE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.INNODB_TABLESPACES_BRIEF</code> table reference
     */
    public InnodbTablespacesBrief() {
        this(DSL.name("INNODB_TABLESPACES_BRIEF"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLESPACES_BRIEF</code> table reference
     */
    public InnodbTablespacesBrief(String alias) {
        this(DSL.name(alias), INNODB_TABLESPACES_BRIEF);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLESPACES_BRIEF</code> table reference
     */
    public InnodbTablespacesBrief(Name alias) {
        this(alias, INNODB_TABLESPACES_BRIEF);
    }

    private InnodbTablespacesBrief(Name alias, Table<InnodbTablespacesBriefRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTablespacesBrief(Name alias, Table<InnodbTablespacesBriefRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbTablespacesBrief(Table<O> child, ForeignKey<O, InnodbTablespacesBriefRecord> key) {
        super(child, key, INNODB_TABLESPACES_BRIEF);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbTablespacesBrief as(String alias) {
        return new InnodbTablespacesBrief(DSL.name(alias), this);
    }

    @Override
    public InnodbTablespacesBrief as(Name alias) {
        return new InnodbTablespacesBrief(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespacesBrief rename(String name) {
        return new InnodbTablespacesBrief(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespacesBrief rename(Name name) {
        return new InnodbTablespacesBrief(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<byte[], String, String, byte[], String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
