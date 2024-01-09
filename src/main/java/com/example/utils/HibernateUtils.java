package com.example.utils;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static SessionFactory sessionFactory = null;

    static {
        Configuration configuration = new Configuration();
        configuration.configure();

        if(sessionFactory == null) {
            sessionFactory = configuration.buildSessionFactory();
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
