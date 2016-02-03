/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muk.dao;

import com.muk.entity.Student;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.muk.hibernate.HibernateUtil;

public class StudentDaoImpl implements StudentDao {

    //list is working as a database
    List<Student> students;
    private Session session;

    private StudentDaoImpl() {
        session = HibernateUtil.createSessionFactory().openSession();
        String hql = "from Student";
        Query query = session.createQuery(hql);
        students = query.list();

    }

    public static StudentDaoImpl getInstance() {
        return new StudentDaoImpl();
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int id) {
        session = HibernateUtil.createSessionFactory().openSession();
        String hql = "from Student where student_id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", (long)id);
        List<Student> listCategories = query.list();
        for (Student student1 : listCategories) {
            return student1;

        }

        return new Student();
    }

    @Override
    public void updateStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudentName(String Name) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public boolean isStudentValid(String Name) {
        boolean valid = true;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentname().equals(Name)) {
                valid = false;
            }
            break;

        }
        return valid;

    }

    @Override
    public void addStudent(Student student) {

        session = HibernateUtil.createSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();

        String hql = "from Student";
        Query query = session.createQuery(hql);
        students = query.list();
        session.close();
    }

    @Override
    public void deleteStudent(Student student) {

    }

}
