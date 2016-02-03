package com.muk.validator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsHobyValid {

    String message() default "Please Provide a valid hobby;"
            + "Accepted hobby are-Music,Cricket,Hockey and Coding (Choose anyone)";
    String ListofValidHobbies()default "Music|Cricket|Hockey|Coding";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
