package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.ConstructorParameters;
import java.util.ArrayList;

public class EmailParameterisedValidation {

    String email;
    boolean expectedResult;

    public EmailParameterisedValidation(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    
    public static ArrayList<Object[]> inputDetails() {
        ArrayList<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{"abc@yahoo.com", true});
        list.add(new Object[]{"abc-100@yahoo.com", true});
        list.add(new Object[]{"abc.100@yahoo.com", true});
        list.add(new Object[]{"abc111@abc.com", true});
        list.add(new Object[]{"abc-100@abc.net", true});
        list.add(new Object[]{"abc.100@abc.com.au", true});
        list.add(new Object[]{"abc@1.com", true});
        list.add(new Object[]{"abc@gmail.com.com", true});
        list.add(new Object[]{"abc+100@gmail.com", true});
        list.add(new Object[]{"abc", false});
        list.add(new Object[]{" abc@.com.my ", false});
        list.add(new Object[]{"abc123@gmail.a", false});//
        list.add(new Object[]{"abc123@.com", false});
        list.add(new Object[]{"abc123@.com.com", false});
        list.add(new Object[]{".abc@abc.com ", false});
        list.add(new Object[]{"abc()*@gmail.com", false});
        list.add(new Object[]{"abc@%*.com", false});
        list.add(new Object[]{"abc..2002@gmail.com ", false});
        list.add(new Object[]{"abc.@gmail.com", false});
        list.add(new Object[]{"abc@abc@gmail.com", false});
        list.add(new Object[]{"abc@gmail.com.1a", false});
        list.add(new Object[]{"abc@gmail.com.aa.au", false});
        return list;
    }

    @Test
    public void validateEmailSamples() {
        UserRegistrationUtilities validator = new UserRegistrationUtilities();
        Assertions.assertEquals(this.expectedResult, validator.validEmail(this.email));
    }
}
