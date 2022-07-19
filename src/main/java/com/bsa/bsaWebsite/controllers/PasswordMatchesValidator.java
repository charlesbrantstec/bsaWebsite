package com.bsa.bsaWebsite.controllers;

import com.bsa.bsaWebsite.controllers.validation.PasswordMatches;
import com.bsa.bsaWebsite.models.User;

import javax.validation.*;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        User user = (User) obj;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}
