/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.FilesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class Files extends TableImpl<FilesRecord> {

    private static final long serialVersionUID = 1889565042;

    /**
     * The reference instance of <code>information_schema.FILES</code>
     */
    public static final Files FILES = new Files();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilesRecord> getRecordType() {
        return FilesRecord.class;
    }

    /**
     * The column <code>information_schema.FILES.FILE_ID</code>.
     */
    public final TableField<FilesRecord, Long> FILE_ID = createField(DSL.name("FILE_ID"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.FILE_NAME</code>.
     */
    public final TableField<FilesRecord, String> FILE_NAME = createField(DSL.name("FILE_NAME"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public final TableField<FilesRecord, String> FILE_TYPE = createField(DSL.name("FILE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public final TableField<FilesRecord, String> TABLESPACE_NAME = createField(DSL.name("TABLESPACE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(268).nullable(false), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public final TableField<FilesRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.CHAR.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public final TableField<FilesRecord, byte[]> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public final TableField<FilesRecord, byte[]> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public final TableField<FilesRecord, String> LOGFILE_GROUP_NAME = createField(DSL.name("LOGFILE_GROUP_NAME"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public final TableField<FilesRecord, Long> LOGFILE_GROUP_NUMBER = createField(DSL.name("LOGFILE_GROUP_NUMBER"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.ENGINE</code>.
     */
    public final TableField<FilesRecord, String> ENGINE = createField(DSL.name("ENGINE"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public final TableField<FilesRecord, byte[]> FULLTEXT_KEYS = createField(DSL.name("FULLTEXT_KEYS"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public final TableField<FilesRecord, byte[]> DELETED_ROWS = createField(DSL.name("DELETED_ROWS"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public final TableField<FilesRecord, byte[]> UPDATE_COUNT = createField(DSL.name("UPDATE_COUNT"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public final TableField<FilesRecord, Long> FREE_EXTENTS = createField(DSL.name("FREE_EXTENTS"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public final TableField<FilesRecord, Long> TOTAL_EXTENTS = createField(DSL.name("TOTAL_EXTENTS"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> EXTENT_SIZE = createField(DSL.name("EXTENT_SIZE"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> INITIAL_SIZE = createField(DSL.name("INITIAL_SIZE"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> MAXIMUM_SIZE = createField(DSL.name("MAXIMUM_SIZE"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public final TableField<FilesRecord, Long> AUTOEXTEND_SIZE = createField(DSL.name("AUTOEXTEND_SIZE"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> CREATION_TIME = createField(DSL.name("CREATION_TIME"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> LAST_UPDATE_TIME = createField(DSL.name("LAST_UPDATE_TIME"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> LAST_ACCESS_TIME = createField(DSL.name("LAST_ACCESS_TIME"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> RECOVER_TIME = createField(DSL.name("RECOVER_TIME"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public final TableField<FilesRecord, byte[]> TRANSACTION_COUNTER = createField(DSL.name("TRANSACTION_COUNTER"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.VERSION</code>.
     */
    public final TableField<FilesRecord, Long> VERSION = createField(DSL.name("VERSION"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public final TableField<FilesRecord, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public final TableField<FilesRecord, byte[]> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public final TableField<FilesRecord, byte[]> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public final TableField<FilesRecord, byte[]> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public final TableField<FilesRecord, byte[]> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public final TableField<FilesRecord, byte[]> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.DATA_FREE</code>.
     */
    public final TableField<FilesRecord, Long> DATA_FREE = createField(DSL.name("DATA_FREE"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> CREATE_TIME = createField(DSL.name("CREATE_TIME"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public final TableField<FilesRecord, byte[]> CHECK_TIME = createField(DSL.name("CHECK_TIME"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.CHECKSUM</code>.
     */
    public final TableField<FilesRecord, byte[]> CHECKSUM = createField(DSL.name("CHECKSUM"), org.jooq.impl.SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.FILES.STATUS</code>.
     */
    public final TableField<FilesRecord, String> STATUS = createField(DSL.name("STATUS"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.FILES.EXTRA</code>.
     */
    public final TableField<FilesRecord, String> EXTRA = createField(DSL.name("EXTRA"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>information_schema.FILES</code> table reference
     */
    public Files() {
        this(DSL.name("FILES"), null);
    }

    /**
     * Create an aliased <code>information_schema.FILES</code> table reference
     */
    public Files(String alias) {
        this(DSL.name(alias), FILES);
    }

    /**
     * Create an aliased <code>information_schema.FILES</code> table reference
     */
    public Files(Name alias) {
        this(alias, FILES);
    }

    private Files(Name alias, Table<FilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Files(Name alias, Table<FilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Files(Table<O> child, ForeignKey<O, FilesRecord> key) {
        super(child, key, FILES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Files as(String alias) {
        return new Files(DSL.name(alias), this);
    }

    @Override
    public Files as(Name alias) {
        return new Files(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(String name) {
        return new Files(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Files rename(Name name) {
        return new Files(name, null);
    }
}
