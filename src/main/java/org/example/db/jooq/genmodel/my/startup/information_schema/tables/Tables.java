/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.enums.TablesRowFormat;
import my.startup.information_schema.enums.TablesTableType;
import my.startup.information_schema.tables.records.TablesRecord;

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
public class Tables extends TableImpl<TablesRecord> {

    private static final long serialVersionUID = 238993044;

    /**
     * The reference instance of <code>information_schema.TABLES</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablesRecord> getRecordType() {
        return TablesRecord.class;
    }

    /**
     * The column <code>information_schema.TABLES.TABLE_CATALOG</code>.
     */
    public final TableField<TablesRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_SCHEMA</code>.
     */
    public final TableField<TablesRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_NAME</code>.
     */
    public final TableField<TablesRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_TYPE</code>.
     */
    public final TableField<TablesRecord, TablesTableType> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(11).nullable(false).asEnumDataType(my.startup.information_schema.enums.TablesTableType.class), this, "");

    /**
     * The column <code>information_schema.TABLES.ENGINE</code>.
     */
    public final TableField<TablesRecord, String> ENGINE = createField(DSL.name("ENGINE"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.TABLES.VERSION</code>.
     */
    public final TableField<TablesRecord, Integer> VERSION = createField(DSL.name("VERSION"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.TABLES.ROW_FORMAT</code>.
     */
    public final TableField<TablesRecord, TablesRowFormat> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), org.jooq.impl.SQLDataType.VARCHAR(10).asEnumDataType(my.startup.information_schema.enums.TablesRowFormat.class), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_ROWS</code>.
     */
    public final TableField<TablesRecord, ULong> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.AVG_ROW_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.DATA_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.MAX_DATA_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.INDEX_LENGTH</code>.
     */
    public final TableField<TablesRecord, ULong> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.DATA_FREE</code>.
     */
    public final TableField<TablesRecord, ULong> DATA_FREE = createField(DSL.name("DATA_FREE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.AUTO_INCREMENT</code>.
     */
    public final TableField<TablesRecord, ULong> AUTO_INCREMENT = createField(DSL.name("AUTO_INCREMENT"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.CREATE_TIME</code>.
     */
    public final TableField<TablesRecord, Timestamp> CREATE_TIME = createField(DSL.name("CREATE_TIME"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.UPDATE_TIME</code>.
     */
    public final TableField<TablesRecord, Timestamp> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>information_schema.TABLES.CHECK_TIME</code>.
     */
    public final TableField<TablesRecord, Timestamp> CHECK_TIME = createField(DSL.name("CHECK_TIME"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_COLLATION</code>.
     */
    public final TableField<TablesRecord, String> TABLE_COLLATION = createField(DSL.name("TABLE_COLLATION"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.TABLES.CHECKSUM</code>.
     */
    public final TableField<TablesRecord, Long> CHECKSUM = createField(DSL.name("CHECKSUM"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.TABLES.CREATE_OPTIONS</code>.
     */
    public final TableField<TablesRecord, String> CREATE_OPTIONS = createField(DSL.name("CREATE_OPTIONS"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_COMMENT</code>.
     */
    public final TableField<TablesRecord, String> TABLE_COMMENT = createField(DSL.name("TABLE_COMMENT"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>information_schema.TABLES</code> table reference
     */
    public Tables() {
        this(DSL.name("TABLES"), null);
    }

    /**
     * Create an aliased <code>information_schema.TABLES</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>information_schema.TABLES</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    private Tables(Name alias, Table<TablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tables(Name alias, Table<TablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Tables(Table<O> child, ForeignKey<O, TablesRecord> key) {
        super(child, key, TABLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(String name) {
        return new Tables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(Name name) {
        return new Tables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, TablesTableType, String, Integer, TablesRowFormat, ULong, ULong, ULong, ULong, ULong, ULong, ULong, Timestamp, Timestamp, Timestamp, String, Long, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
