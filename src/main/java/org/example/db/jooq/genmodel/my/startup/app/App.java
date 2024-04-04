/*
 * This file is generated by jOOQ.
 */
package my.startup.app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import my.startup.DefaultCatalog;
import my.startup.app.tables.Contacts;
import my.startup.app.tables.People;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class App extends SchemaImpl {

    private static final long serialVersionUID = -1121766399;

    /**
     * The reference instance of <code>app</code>
     */
    public static final App APP = new App();

    /**
     * The table <code>app.Contacts</code>.
     */
    public final Contacts CONTACTS = my.startup.app.tables.Contacts.CONTACTS;

    /**
     * The table <code>app.People</code>.
     */
    public final People PEOPLE = my.startup.app.tables.People.PEOPLE;

    /**
     * No further instances allowed
     */
    private App() {
        super("app", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Contacts.CONTACTS,
            People.PEOPLE);
    }
}