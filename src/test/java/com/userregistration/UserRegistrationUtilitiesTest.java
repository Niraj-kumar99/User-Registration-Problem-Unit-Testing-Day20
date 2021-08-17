package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationUtilitiesTest {

    UserRegistrationUtilities utilities = new UserRegistrationUtilities();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(utilities.validName("Niraj"));
    }

    @Test
    public void givenFirstName_WhenStartingNotCapital_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validName("niraj"));
    }

    @Test
    void givenFirstName_WhenShort_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validName("Ni"));
    }

    @Test
    public void givenFirstName_WithNumberOrSpecialChar_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validName("Nir@j"));
    }

    @Test
    public void givenMail_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(utilities.validEmail("nkj@gmail.com"));
    }

    @Test
    public void givenMail_WithoutAtTheRate_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validEmail("nkj.com"));
    }

    @Test
    public void givenMail_WithoutUserName_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validEmail("@gmail.com"));
    }

    @Test
    void givenMail_WithoutAnyDomain_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validEmail("nkj@gmail"));
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(utilities.validMobileNumber("4875976234"));
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validMobileNumber("49897890"));
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        Assertions.assertTrue(utilities.validPassword("Pass@word45"));
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validPassword("Pas33#"));
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
        Assertions.assertFalse(utilities.validPassword("pass$56word"));
    }
}
