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
}