/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muk.validator;

import com.muk.dao.StudentDao;
import com.muk.dao.StudentDaoImpl;
import com.muk.entity.Student;
import java.util.List;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


/**
 *
 * @author mukesh
 */
public class StudentnameValid implements ConstraintValidator<IsNameValid, String> {

    private StudentDaoImpl dao;

    @Override
    public void initialize(IsNameValid inv) {
        // this.ListofValidHobbies=isHobyValid.ListofValidHobbies();
    }

    @Override
    public boolean isValid(String t, ConstraintValidatorContext cvc) {
        dao = new StudentDaoImpl();
        if (t == null) {
            return false;

        } else return dao.isStudentValid(t);

    }
}