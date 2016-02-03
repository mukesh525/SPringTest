/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muk.entity;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.muk.hibernate.HibernateUtil;

/**
 *
 * @author mukesh
 */
public class StudentDaoImpl implements StudentDao {

    //list is working as a database
    List<Student> students;
    private Session session;

    @Override
    public List<Student> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    //        session = HibernateUtil.createSessionFactory().openSession();
//        String hql = "from Student where studentname = :name";
//        Query query = session.createQuery(hql);
//        query.setParameter("id", t);
//        List<Student> listNames = query.list();
    }

    @Override
    public Student getStudent(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getStudentName(String Name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

//        session = HibernateUtil.createSessionFactory().openSession();
//        String hql = "from Student where studentname = :name";
//        Query query = session.createQuery(hql);
//        query.setParameter("name", Name);
//        List<Student> listNames = query.list();

    }

    @Override
    public boolean isStudentValid(String Name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        
    }

}
