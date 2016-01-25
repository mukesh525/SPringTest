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

    @Override
    public void initialize(IsHobyValid isHobyValid) {
    }

    @Override
    public boolean isValid(String t, ConstraintValidatorContext cvc) {
        if (t == null) {
            return false;
        }
        if (t.matches("Music|Cricket|Hockey|Coding")) {
            return true;
        } else {
            return false;
        }
    }

}
