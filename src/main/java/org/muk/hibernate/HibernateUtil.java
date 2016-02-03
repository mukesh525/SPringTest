/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muk.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static final String HIBERNATE_CFG = "hibernateAnnotations.cfg.xml";

    private static SessionFactory buildSessionFactory() 
    {
        
       SessionFactory sessionFactory= new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();

        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  }