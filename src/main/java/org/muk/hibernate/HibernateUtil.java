package org.muk.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
 
    private static SessionFactory sessionFactory;
    private static  StandardServiceRegistry serviceRegistry;
    
    
    public static SessionFactory createSessionFactory(){
        Configuration configuration=new Configuration();
        configuration.configure();
        serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory=configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
     } 
  }