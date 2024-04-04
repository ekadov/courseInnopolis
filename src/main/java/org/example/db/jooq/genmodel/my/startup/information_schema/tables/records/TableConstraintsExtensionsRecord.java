/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.tables.records;


import javax.annotation.processing.Generated;

import my.startup.information_schema.tables.TableConstraintsExtensions;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TableConstraintsExtensionsRecord extends TableRecordImpl<TableConstraintsExtensionsRecord> implements Record6<String, String, String, String, JSON, JSON> {

    private static final long serialVersionUID = 252951892;

    /**
     * Setter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_CATALOG</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_SCHEMA</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_NAME</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public void setEngineAttribute(JSON value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public JSON getEngineAttribute() {
        return (JSON) get(4);
    }

    /**
     * Setter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public void setSecondaryEngineAttribute(JSON value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public JSON getSecondaryEngineAttribute() {
        return (JSON) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, JSON, JSON> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, JSON, JSON> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.CONSTRAINT_NAME;
    }

    @Override
    public Field<String> field4() {
        return TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.TABLE_NAME;
    }

    @Override
    public Field<JSON> field5() {
        return TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.ENGINE_ATTRIBUTE;
    }

    @Override
    public Field<JSON> field6() {
        return TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE;
    }

    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    @Override
    public String component2() {
        return getConstraintSchema();
    }

    @Override
    public String component3() {
        return getConstraintName();
    }

    @Override
    public String component4() {
        return getTableName();
    }

    @Override
    public JSON component5() {
        return getEngineAttribute();
    }

    @Override
    public JSON component6() {
        return getSecondaryEngineAttribute();
    }

    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    @Override
    public String value2() {
        return getConstraintSchema();
    }

    @Override
    public String value3() {
        return getConstraintName();
    }

    @Override
    public String value4() {
        return getTableName();
    }

    @Override
    public JSON value5() {
        return getEngineAttribute();
    }

    @Override
    public JSON value6() {
        return getSecondaryEngineAttribute();
    }

    @Override
    public TableConstraintsExtensionsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    public TableConstraintsExtensionsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    public TableConstraintsExtensionsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    public TableConstraintsExtensionsRecord value4(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public TableConstraintsExtensionsRecord value5(JSON value) {
        setEngineAttribute(value);
        return this;
    }

    @Override
    public TableConstraintsExtensionsRecord value6(JSON value) {
        setSecondaryEngineAttribute(value);
        return this;
    }

    @Override
    public TableConstraintsExtensionsRecord values(String value1, String value2, String value3, String value4, JSON value5, JSON value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TableConstraintsExtensionsRecord
     */
    public TableConstraintsExtensionsRecord() {
        super(TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS);
    }

    /**
     * Create a detached, initialised TableConstraintsExtensionsRecord
     */
    public TableConstraintsExtensionsRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableName, JSON engineAttribute, JSON secondaryEngineAttribute) {
        super(TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS);

        set(0, constraintCatalog);
        set(1, constraintSchema);
        set(2, constraintName);
        set(3, tableName);
        set(4, engineAttribute);
        set(5, secondaryEngineAttribute);
    }
}
