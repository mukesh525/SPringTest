/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muk.controller;

import com.muk.entity.Student;
import java.util.List;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.muk.hibernate.HibernateUtil;

/**
 *
 * @author mukesh
 */
public class StudentnameValid implements ConstraintValidator<IsNameValid, String> {

    private Session session;

    @Override
    public void initialize(IsNameValid inv) {
        // this.ListofValidHobbies=isHobyValid.ListofValidHobbies();
    }

    @Override
    public boolean isValid(String t, ConstraintValidatorContext cvc) {
        session = HibernateUtil.createSessionFactory().openSession();
        String hql = "from Student where studentname = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name", t);
        List<Student> listNames = query.list();

        if (t==null) {
            return false;

        } 
        else if (listNames.size() > 0) {
            return false;
        }
        else {
            return true;
        }
        
        
        
  
        
        
        
        
        
        
        
        
        
        

    }
}
