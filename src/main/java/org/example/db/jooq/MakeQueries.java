package org.example.db.jooq;

import static org.example.db.jooq.pojo.tables.Contacts.CONTACTS;

public class MakeQueries {

    private static final String CONTACTS_TABLE = "Contacts";

    public static void main(String[] args) {

        var list = JooqService.getContext().select().from(CONTACTS_TABLE).fetch();

        System.out.println(list);

        /*JooqService.getContext()
                .insertInto(CONTACTS,
                        CONTACTS.ID, CONTACTS.NAME, CONTACTS.SURNAME)
                .values(50, "John", "Petrov")
                .execute();*/

        JooqService.getContext()
                .update(CONTACTS)
                .set(CONTACTS.NAME, "Alex")
                .where("id=50")
                .execute();



    }

}
