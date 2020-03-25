package com.bridgelabz;

import com.sun.tools.javac.comp.Check;
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
    public void givenLastName_WhenNotProper_ShouldReturnTrue() {
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
        boolean emailCheck = registration.validEmail("xyz.com");
        Assert.assertEquals(false,emailCheck);
    }

}
