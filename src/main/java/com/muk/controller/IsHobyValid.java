/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muk.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint (validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsHobyValid {
   
    String message() default "Please Provide a valid hobby;"+
            "Accepted hobby are-Music,Cricket,Hockey and Coding (Choose anyone)";
    Class<?>[] group() default {};
    Class<?extends Payload>[] Payload() default {};
}
