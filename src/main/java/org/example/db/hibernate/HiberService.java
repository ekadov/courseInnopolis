package org.example.db.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HiberService {

    private SessionFactory initialize() {

        Properties properties = new Properties();
        //properties.setProperty(AvailableSettings., "org.hibernate.dialect.MySQLDialect")

        Configuration cfg = new Configuration();
        cfg.setProperties(properties);

        SessionFactory sessionFactory = null;
        try {
            sessionFactory = cfg.buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return sessionFactory;
    }
}
