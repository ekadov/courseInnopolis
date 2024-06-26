/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.InnodbBufferPageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row21;
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
public class InnodbBufferPage extends TableImpl<InnodbBufferPageRecord> {

    private static final long serialVersionUID = 1412322953;

    /**
     * The reference instance of <code>information_schema.INNODB_BUFFER_PAGE</code>
     */
    public static final InnodbBufferPage INNODB_BUFFER_PAGE = new InnodbBufferPage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbBufferPageRecord> getRecordType() {
        return InnodbBufferPageRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.POOL_ID</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> POOL_ID = createField(DSL.name("POOL_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.BLOCK_ID</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> BLOCK_ID = createField(DSL.name("BLOCK_ID"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.SPACE</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> SPACE = createField(DSL.name("SPACE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.PAGE_NUMBER</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> PAGE_NUMBER = createField(DSL.name("PAGE_NUMBER"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.PAGE_TYPE</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> PAGE_TYPE = createField(DSL.name("PAGE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(21).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.FLUSH_TYPE</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> FLUSH_TYPE = createField(DSL.name("FLUSH_TYPE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.FIX_COUNT</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> FIX_COUNT = createField(DSL.name("FIX_COUNT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.IS_HASHED</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> IS_HASHED = createField(DSL.name("IS_HASHED"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.NEWEST_MODIFICATION</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> NEWEST_MODIFICATION = createField(DSL.name("NEWEST_MODIFICATION"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.OLDEST_MODIFICATION</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> OLDEST_MODIFICATION = createField(DSL.name("OLDEST_MODIFICATION"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.ACCESS_TIME</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> ACCESS_TIME = createField(DSL.name("ACCESS_TIME"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.TABLE_NAME</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(341).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.INDEX_NAME</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), org.jooq.impl.SQLDataType.VARCHAR(341).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.NUMBER_RECORDS</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> NUMBER_RECORDS = createField(DSL.name("NUMBER_RECORDS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.DATA_SIZE</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> DATA_SIZE = createField(DSL.name("DATA_SIZE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.COMPRESSED_SIZE</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> COMPRESSED_SIZE = createField(DSL.name("COMPRESSED_SIZE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.PAGE_STATE</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> PAGE_STATE = createField(DSL.name("PAGE_STATE"), org.jooq.impl.SQLDataType.VARCHAR(21).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.IO_FIX</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> IO_FIX = createField(DSL.name("IO_FIX"), org.jooq.impl.SQLDataType.VARCHAR(21).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.IS_OLD</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> IS_OLD = createField(DSL.name("IS_OLD"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK</code>.
     */
    public final TableField<InnodbBufferPageRecord, ULong> FREE_PAGE_CLOCK = createField(DSL.name("FREE_PAGE_CLOCK"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE.IS_STALE</code>.
     */
    public final TableField<InnodbBufferPageRecord, String> IS_STALE = createField(DSL.name("IS_STALE"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.INNODB_BUFFER_PAGE</code> table reference
     */
    public InnodbBufferPage() {
        this(DSL.name("INNODB_BUFFER_PAGE"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE</code> table reference
     */
    public InnodbBufferPage(String alias) {
        this(DSL.name(alias), INNODB_BUFFER_PAGE);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE</code> table reference
     */
    public InnodbBufferPage(Name alias) {
        this(alias, INNODB_BUFFER_PAGE);
    }

    private InnodbBufferPage(Name alias, Table<InnodbBufferPageRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbBufferPage(Name alias, Table<InnodbBufferPageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbBufferPage(Table<O> child, ForeignKey<O, InnodbBufferPageRecord> key) {
        super(child, key, INNODB_BUFFER_PAGE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbBufferPage as(String alias) {
        return new InnodbBufferPage(DSL.name(alias), this);
    }

    @Override
    public InnodbBufferPage as(Name alias) {
        return new InnodbBufferPage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPage rename(String name) {
        return new InnodbBufferPage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPage rename(Name name) {
        return new InnodbBufferPage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<ULong, ULong, ULong, ULong, String, ULong, ULong, String, ULong, ULong, ULong, String, String, ULong, ULong, ULong, String, String, String, ULong, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
