/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.InnodbCmpmemResetRecord;

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
public class InnodbCmpmemReset extends TableImpl<InnodbCmpmemResetRecord> {

    private static final long serialVersionUID = -1071071937;

    /**
     * The reference instance of <code>information_schema.INNODB_CMPMEM_RESET</code>
     */
    public static final InnodbCmpmemReset INNODB_CMPMEM_RESET = new InnodbCmpmemReset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpmemResetRecord> getRecordType() {
        return InnodbCmpmemResetRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.page_size</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> PAGE_SIZE = createField(DSL.name("page_size"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.buffer_pool_instance</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> BUFFER_POOL_INSTANCE = createField(DSL.name("buffer_pool_instance"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.pages_used</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> PAGES_USED = createField(DSL.name("pages_used"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.pages_free</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> PAGES_FREE = createField(DSL.name("pages_free"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.relocation_ops</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Long> RELOCATION_OPS = createField(DSL.name("relocation_ops"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.relocation_time</code>.
     */
    public final TableField<InnodbCmpmemResetRecord, Integer> RELOCATION_TIME = createField(DSL.name("relocation_time"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    public InnodbCmpmemReset() {
        this(DSL.name("INNODB_CMPMEM_RESET"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    public InnodbCmpmemReset(String alias) {
        this(DSL.name(alias), INNODB_CMPMEM_RESET);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    public InnodbCmpmemReset(Name alias) {
        this(alias, INNODB_CMPMEM_RESET);
    }

    private InnodbCmpmemReset(Name alias, Table<InnodbCmpmemResetRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpmemReset(Name alias, Table<InnodbCmpmemResetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbCmpmemReset(Table<O> child, ForeignKey<O, InnodbCmpmemResetRecord> key) {
        super(child, key, INNODB_CMPMEM_RESET);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCmpmemReset as(String alias) {
        return new InnodbCmpmemReset(DSL.name(alias), this);
    }

    @Override
    public InnodbCmpmemReset as(Name alias) {
        return new InnodbCmpmemReset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmemReset rename(String name) {
        return new InnodbCmpmemReset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmemReset rename(Name name) {
        return new InnodbCmpmemReset(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, Long, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
