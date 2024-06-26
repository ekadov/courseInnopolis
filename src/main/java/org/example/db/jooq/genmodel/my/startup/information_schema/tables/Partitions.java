/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.PartitionsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class Partitions extends TableImpl<PartitionsRecord> {

    private static final long serialVersionUID = -979796735;

    /**
     * The reference instance of <code>information_schema.PARTITIONS</code>
     */
    public static final Partitions PARTITIONS = new Partitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PartitionsRecord> getRecordType() {
        return PartitionsRecord.class;
    }

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
     */
    public final TableField<PartitionsRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
     */
    public final TableField<PartitionsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_NAME</code>.
     */
    public final TableField<PartitionsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_NAME = createField(DSL.name("PARTITION_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
     */
    public final TableField<PartitionsRecord, String> SUBPARTITION_NAME = createField(DSL.name("SUBPARTITION_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
     */
    public final TableField<PartitionsRecord, UInteger> PARTITION_ORDINAL_POSITION = createField(DSL.name("PARTITION_ORDINAL_POSITION"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
     */
    public final TableField<PartitionsRecord, UInteger> SUBPARTITION_ORDINAL_POSITION = createField(DSL.name("SUBPARTITION_ORDINAL_POSITION"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_METHOD = createField(DSL.name("PARTITION_METHOD"), org.jooq.impl.SQLDataType.VARCHAR(13), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
     */
    public final TableField<PartitionsRecord, String> SUBPARTITION_METHOD = createField(DSL.name("SUBPARTITION_METHOD"), org.jooq.impl.SQLDataType.VARCHAR(13), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_EXPRESSION = createField(DSL.name("PARTITION_EXPRESSION"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
     */
    public final TableField<PartitionsRecord, String> SUBPARTITION_EXPRESSION = createField(DSL.name("SUBPARTITION_EXPRESSION"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_DESCRIPTION = createField(DSL.name("PARTITION_DESCRIPTION"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
     */
    public final TableField<PartitionsRecord, ULong> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
     */
    public final TableField<PartitionsRecord, ULong> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
     */
    public final TableField<PartitionsRecord, ULong> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
     */
    public final TableField<PartitionsRecord, ULong> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
     */
    public final TableField<PartitionsRecord, ULong> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.DATA_FREE</code>.
     */
    public final TableField<PartitionsRecord, ULong> DATA_FREE = createField(DSL.name("DATA_FREE"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.CREATE_TIME</code>.
     */
    public final TableField<PartitionsRecord, Timestamp> CREATE_TIME = createField(DSL.name("CREATE_TIME"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
     */
    public final TableField<PartitionsRecord, Timestamp> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.CHECK_TIME</code>.
     */
    public final TableField<PartitionsRecord, Timestamp> CHECK_TIME = createField(DSL.name("CHECK_TIME"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.CHECKSUM</code>.
     */
    public final TableField<PartitionsRecord, Long> CHECKSUM = createField(DSL.name("CHECKSUM"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
     */
    public final TableField<PartitionsRecord, String> PARTITION_COMMENT = createField(DSL.name("PARTITION_COMMENT"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.NODEGROUP</code>.
     */
    public final TableField<PartitionsRecord, String> NODEGROUP = createField(DSL.name("NODEGROUP"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
     */
    public final TableField<PartitionsRecord, String> TABLESPACE_NAME = createField(DSL.name("TABLESPACE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(268), this, "");

    /**
     * Create a <code>information_schema.PARTITIONS</code> table reference
     */
    public Partitions() {
        this(DSL.name("PARTITIONS"), null);
    }

    /**
     * Create an aliased <code>information_schema.PARTITIONS</code> table reference
     */
    public Partitions(String alias) {
        this(DSL.name(alias), PARTITIONS);
    }

    /**
     * Create an aliased <code>information_schema.PARTITIONS</code> table reference
     */
    public Partitions(Name alias) {
        this(alias, PARTITIONS);
    }

    private Partitions(Name alias, Table<PartitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Partitions(Name alias, Table<PartitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Partitions(Table<O> child, ForeignKey<O, PartitionsRecord> key) {
        super(child, key, PARTITIONS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Partitions as(String alias) {
        return new Partitions(DSL.name(alias), this);
    }

    @Override
    public Partitions as(Name alias) {
        return new Partitions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Partitions rename(String name) {
        return new Partitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Partitions rename(Name name) {
        return new Partitions(name, null);
    }
}
