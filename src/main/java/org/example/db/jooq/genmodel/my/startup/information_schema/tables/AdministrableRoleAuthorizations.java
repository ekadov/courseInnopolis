/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables;


import javax.annotation.processing.Generated;

import my.startup.information_schema.InformationSchema;
import my.startup.information_schema.tables.records.AdministrableRoleAuthorizationsRecord;

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
public class AdministrableRoleAuthorizations extends TableImpl<AdministrableRoleAuthorizationsRecord> {

    private static final long serialVersionUID = 907374139;

    /**
     * The reference instance of <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code>
     */
    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = new AdministrableRoleAuthorizations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdministrableRoleAuthorizationsRecord> getRecordType() {
        return AdministrableRoleAuthorizationsRecord.class;
    }

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.USER</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> USER = createField(DSL.name("USER"), org.jooq.impl.SQLDataType.VARCHAR(97), this, "");

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.HOST</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> HOST = createField(DSL.name("HOST"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), org.jooq.impl.SQLDataType.VARCHAR(97), this, "");

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.GRANTEE_HOST</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> GRANTEE_HOST = createField(DSL.name("GRANTEE_HOST"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_NAME</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> ROLE_NAME = createField(DSL.name("ROLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.ROLE_HOST</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> ROLE_HOST = createField(DSL.name("ROLE_HOST"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_GRANTABLE</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_DEFAULT</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_DEFAULT = createField(DSL.name("IS_DEFAULT"), org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS.IS_MANDATORY</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_MANDATORY = createField(DSL.name("IS_MANDATORY"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code> table reference
     */
    public AdministrableRoleAuthorizations() {
        this(DSL.name("ADMINISTRABLE_ROLE_AUTHORIZATIONS"), null);
    }

    /**
     * Create an aliased <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code> table reference
     */
    public AdministrableRoleAuthorizations(String alias) {
        this(DSL.name(alias), ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create an aliased <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code> table reference
     */
    public AdministrableRoleAuthorizations(Name alias) {
        this(alias, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AdministrableRoleAuthorizations(Table<O> child, ForeignKey<O, AdministrableRoleAuthorizationsRecord> key) {
        super(child, key, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public AdministrableRoleAuthorizations as(String alias) {
        return new AdministrableRoleAuthorizations(DSL.name(alias), this);
    }

    @Override
    public AdministrableRoleAuthorizations as(Name alias) {
        return new AdministrableRoleAuthorizations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(String name) {
        return new AdministrableRoleAuthorizations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(Name name) {
        return new AdministrableRoleAuthorizations(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}