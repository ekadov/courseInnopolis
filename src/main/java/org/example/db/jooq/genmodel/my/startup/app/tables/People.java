/*
 * This file is generated by jOOQ.
 */
package my.startup.app.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import my.startup.app.App;
import my.startup.app.Indexes;
import my.startup.app.Keys;
import my.startup.app.tables.records.PeopleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class People extends TableImpl<PeopleRecord> {

    private static final long serialVersionUID = 1880799185;

    /**
     * The reference instance of <code>app.People</code>
     */
    public static final People PEOPLE = new People();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PeopleRecord> getRecordType() {
        return PeopleRecord.class;
    }

    /**
     * The column <code>app.People.id</code>.
     */
    public final TableField<PeopleRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>app.People.first_name</code>.
     */
    public final TableField<PeopleRecord, String> FIRST_NAME = createField(DSL.name("first_name"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>app.People.last_name</code>.
     */
    public final TableField<PeopleRecord, String> LAST_NAME = createField(DSL.name("last_name"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>app.People</code> table reference
     */
    public People() {
        this(DSL.name("People"), null);
    }

    /**
     * Create an aliased <code>app.People</code> table reference
     */
    public People(String alias) {
        this(DSL.name(alias), PEOPLE);
    }

    /**
     * Create an aliased <code>app.People</code> table reference
     */
    public People(Name alias) {
        this(alias, PEOPLE);
    }

    private People(Name alias, Table<PeopleRecord> aliased) {
        this(alias, aliased, null);
    }

    private People(Name alias, Table<PeopleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> People(Table<O> child, ForeignKey<O, PeopleRecord> key) {
        super(child, key, PEOPLE);
    }

    @Override
    public Schema getSchema() {
        return App.APP;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PEOPLE_PRIMARY);
    }

    @Override
    public Identity<PeopleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PEOPLE;
    }

    @Override
    public UniqueKey<PeopleRecord> getPrimaryKey() {
        return Keys.KEY_PEOPLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<PeopleRecord>> getKeys() {
        return Arrays.<UniqueKey<PeopleRecord>>asList(Keys.KEY_PEOPLE_PRIMARY);
    }

    @Override
    public People as(String alias) {
        return new People(DSL.name(alias), this);
    }

    @Override
    public People as(Name alias) {
        return new People(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public People rename(String name) {
        return new People(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public People rename(Name name) {
        return new People(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
