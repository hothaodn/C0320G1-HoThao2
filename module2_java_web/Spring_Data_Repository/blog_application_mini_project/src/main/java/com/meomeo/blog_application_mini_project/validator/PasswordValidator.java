package com.meomeo.blog_application_mini_project.validator;

import com.meomeo.blog_application_mini_project.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PasswordValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        if(!(user.getPassword().equals(user.getRePassword()))){
            errors.rejectValue("rePassword","Please re-type two duplicated passwords");
        }
    }
}
