/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.StSpatialReferenceSystemsRecord;

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
public class StSpatialReferenceSystems extends TableImpl<StSpatialReferenceSystemsRecord> {

    private static final long serialVersionUID = -87728180;

    /**
     * The reference instance of <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code>
     */
    public static final StSpatialReferenceSystems ST_SPATIAL_REFERENCE_SYSTEMS = new StSpatialReferenceSystems();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StSpatialReferenceSystemsRecord> getRecordType() {
        return StSpatialReferenceSystemsRecord.class;
    }

    /**
     * The column <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_NAME</code>.
     */
    public final TableField<StSpatialReferenceSystemsRecord, String> SRS_NAME = createField(DSL.name("SRS_NAME"), org.jooq.impl.SQLDataType.VARCHAR(80).nullable(false), this, "");

    /**
     * The column <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.SRS_ID</code>.
     */
    public final TableField<StSpatialReferenceSystemsRecord, UInteger> SRS_ID = createField(DSL.name("SRS_ID"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION</code>.
     */
    public final TableField<StSpatialReferenceSystemsRecord, String> ORGANIZATION = createField(DSL.name("ORGANIZATION"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.ORGANIZATION_COORDSYS_ID</code>.
     */
    public final TableField<StSpatialReferenceSystemsRecord, UInteger> ORGANIZATION_COORDSYS_ID = createField(DSL.name("ORGANIZATION_COORDSYS_ID"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.DEFINITION</code>.
     */
    public final TableField<StSpatialReferenceSystemsRecord, String> DEFINITION = createField(DSL.name("DEFINITION"), org.jooq.impl.SQLDataType.VARCHAR(4096).nullable(false), this, "");

    /**
     * The column <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS.DESCRIPTION</code>.
     */
    public final TableField<StSpatialReferenceSystemsRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), org.jooq.impl.SQLDataType.VARCHAR(2048), this, "");

    /**
     * Create a <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code> table reference
     */
    public StSpatialReferenceSystems() {
        this(DSL.name("ST_SPATIAL_REFERENCE_SYSTEMS"), null);
    }

    /**
     * Create an aliased <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code> table reference
     */
    public StSpatialReferenceSystems(String alias) {
        this(DSL.name(alias), ST_SPATIAL_REFERENCE_SYSTEMS);
    }

    /**
     * Create an aliased <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code> table reference
     */
    public StSpatialReferenceSystems(Name alias) {
        this(alias, ST_SPATIAL_REFERENCE_SYSTEMS);
    }

    private StSpatialReferenceSystems(Name alias, Table<StSpatialReferenceSystemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private StSpatialReferenceSystems(Name alias, Table<StSpatialReferenceSystemsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> StSpatialReferenceSystems(Table<O> child, ForeignKey<O, StSpatialReferenceSystemsRecord> key) {
        super(child, key, ST_SPATIAL_REFERENCE_SYSTEMS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public StSpatialReferenceSystems as(String alias) {
        return new StSpatialReferenceSystems(DSL.name(alias), this);
    }

    @Override
    public StSpatialReferenceSystems as(Name alias) {
        return new StSpatialReferenceSystems(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StSpatialReferenceSystems rename(String name) {
        return new StSpatialReferenceSystems(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StSpatialReferenceSystems rename(Name name) {
        return new StSpatialReferenceSystems(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, UInteger, String, UInteger, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
