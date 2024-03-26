package org.example.db.template;

public class Main {

    public static final String CONTACTS = "Contacts";

    public static void main(String[] args) {
        var list = JdbcTemplateService.getTemplate().queryForList("select * from ?;", CONTACTS);

        System.out.println(list);

        int id = 3;

        JdbcTemplateService.getTemplate().queryForList("select count(*) from ? ? ? ?;", Integer.class, CONTACTS, "User");



    }
}
