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
}
