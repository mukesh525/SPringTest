/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muk.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author mukesh
 */
public class HobbyValidator implements ConstraintValidator<IsHobyValid, String> {
private String ListofValidHobbies;
    @Override
    public void initialize(IsHobyValid isHobyValid) {
        this.ListofValidHobbies=isHobyValid.ListofValidHobbies();
    }

    @Override
    public boolean isValid(String t, ConstraintValidatorContext cvc) {
        if (t == null) {
            return false;
        }
        if (t.matches(ListofValidHobbies)) {
            return true;
        } else {
            return false;
        }
    }

}
