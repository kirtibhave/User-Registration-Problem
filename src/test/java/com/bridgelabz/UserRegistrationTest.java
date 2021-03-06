package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    @Test
    public void welcomeMessage_WhenProper_ShouldReturnTrue() {
        boolean message = registration.welcomeMessage("Welcome to user registration problem");
        Assert.assertEquals(true, message);
    }

    @Test
    public void welcomeMessage_WhenNotProper_ShouldReturnFalse() {
        boolean message = registration.welcomeMessage("Welcome to registration problem");
        Assert.assertEquals(false, message);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstNameCheck = registration.validFirstName("Kirti");
        Assert.assertEquals(true, firstNameCheck);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean firstNameCheck = registration.validFirstName("sjklrwstffi");
        Assert.assertEquals(false, firstNameCheck);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastNameCheck = registration.validLastName("Bhave");
        Assert.assertEquals(true, lastNameCheck);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean lastNameCheck = registration.validLastName("Bj");
        Assert.assertEquals(false, lastNameCheck);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean emailCheck = registration.validEmail("abc.xyz@bI.co.in");
        Assert.assertEquals(true, emailCheck);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean emailCheck = registration.validEmail("abc@.co.in");
        Assert.assertEquals(false, emailCheck);
    }

    @Test
    public void givenMobileFormat_WhenProper_ShouldReturnTrue() {
        boolean mobileCheck = registration.validMobile("91 9876589890");
        Assert.assertEquals(true, mobileCheck);
    }

    @Test
    public void givenMobileFormat_WhenNotProper_ShouldReturnFalse() {
        boolean mobileCheck = registration.validMobile("5789898902");
        Assert.assertEquals(false, mobileCheck);
    }

    @Test
    public void givenPasswordFormat_WhenSatisfiesRule1_ShouldReturnTrue() {
        boolean password1 = registration.minimumCharacterMethod("jihjjhjkj");
        Assert.assertEquals(true, password1);
    }

    @Test
    public void givenPasswordFormat_WhenNotSatisfiesRule1_ShouldReturnFalse() {
        boolean password1 = registration.minimumCharacterMethod("jlkk");
        Assert.assertEquals(false, password1);
    }

    @Test
    public void givenPasswordFormat_WhenSatisfiesRule2_ShouldReturnTrue() {
        boolean password2 = registration.upperCaseMethod("hHjhkjlklk");
        Assert.assertEquals(true, password2);
    }

    @Test
    public void givenPasswordFormat_WhenNotSatisfiesRule2_ShouldReturnFalse() {
        boolean password2 = registration.upperCaseMethod("ckldjll");
        Assert.assertEquals(false, password2);
    }

    @Test
    public void givenPasswordFormat_WhenSatisfiesRule3_ShouldReturnTrue() {
        boolean password3 = registration.numericNumberMethod("gvDhhjhkj9");
        Assert.assertEquals(true, password3);
    }

    @Test
    public void givenPasswordFormat_WhenNotSatisfiesRule3_ShouldReturnFalse() {
        boolean password3 = registration.numericNumberMethod("djkdUvhjnc");
        Assert.assertEquals(false, password3);
    }

    @Test
    public void givenPasswordFormat_WhenSatisfiesRule4_ShouldReturnTrue(){
        boolean password4 = registration.specialCharacterMethod("ghhgF@hj12");
        Assert.assertEquals(true,password4);
    }

    @Test
    public void givenPasswordFormat_WhenNotSatisfiesRule4_ShouldReturnFalse(){
        boolean password4 = registration.specialCharacterMethod("bkjhddfW12");
        Assert.assertEquals(false,password4);
    }

}


