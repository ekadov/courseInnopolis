/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables.records;


import javax.annotation.processing.Generated;

import my.startup.information_schema.tables.EnabledRoles;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class EnabledRolesRecord extends TableRecordImpl<EnabledRolesRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1344972742;

    /**
     * Setter for <code>information_schema.ENABLED_ROLES.ROLE_NAME</code>.
     */
    public void setRoleName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.ENABLED_ROLES.ROLE_NAME</code>.
     */
    public String getRoleName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.ENABLED_ROLES.ROLE_HOST</code>.
     */
    public void setRoleHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.ENABLED_ROLES.ROLE_HOST</code>.
     */
    public String getRoleHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.ENABLED_ROLES.IS_DEFAULT</code>.
     */
    public void setIsDefault(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.ENABLED_ROLES.IS_DEFAULT</code>.
     */
    public String getIsDefault() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.ENABLED_ROLES.IS_MANDATORY</code>.
     */
    public void setIsMandatory(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.ENABLED_ROLES.IS_MANDATORY</code>.
     */
    public String getIsMandatory() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EnabledRoles.ENABLED_ROLES.ROLE_NAME;
    }

    @Override
    public Field<String> field2() {
        return EnabledRoles.ENABLED_ROLES.ROLE_HOST;
    }

    @Override
    public Field<String> field3() {
        return EnabledRoles.ENABLED_ROLES.IS_DEFAULT;
    }

    @Override
    public Field<String> field4() {
        return EnabledRoles.ENABLED_ROLES.IS_MANDATORY;
    }

    @Override
    public String component1() {
        return getRoleName();
    }

    @Override
    public String component2() {
        return getRoleHost();
    }

    @Override
    public String component3() {
        return getIsDefault();
    }

    @Override
    public String component4() {
        return getIsMandatory();
    }

    @Override
    public String value1() {
        return getRoleName();
    }

    @Override
    public String value2() {
        return getRoleHost();
    }

    @Override
    public String value3() {
        return getIsDefault();
    }

    @Override
    public String value4() {
        return getIsMandatory();
    }

    @Override
    public EnabledRolesRecord value1(String value) {
        setRoleName(value);
        return this;
    }

    @Override
    public EnabledRolesRecord value2(String value) {
        setRoleHost(value);
        return this;
    }

    @Override
    public EnabledRolesRecord value3(String value) {
        setIsDefault(value);
        return this;
    }

    @Override
    public EnabledRolesRecord value4(String value) {
        setIsMandatory(value);
        return this;
    }

    @Override
    public EnabledRolesRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EnabledRolesRecord
     */
    public EnabledRolesRecord() {
        super(EnabledRoles.ENABLED_ROLES);
    }

    /**
     * Create a detached, initialised EnabledRolesRecord
     */
    public EnabledRolesRecord(String roleName, String roleHost, String isDefault, String isMandatory) {
        super(EnabledRoles.ENABLED_ROLES);

        set(0, roleName);
        set(1, roleHost);
        set(2, isDefault);
        set(3, isMandatory);
    }
}
