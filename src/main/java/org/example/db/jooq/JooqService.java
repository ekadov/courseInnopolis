package org.example.db.jooq;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JooqService {

    private static final String URL = "jdbc:mysql://192.168.0.105:3306/app";
    private static final String USERNAME = "databaseUser";
    private static final String PASSWORD = "databasePassword";

    public static DSLContext getContext() {
        try {
            var connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            DSLContext context = DSL.using(connection, SQLDialect.MYSQL);

            return context;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
