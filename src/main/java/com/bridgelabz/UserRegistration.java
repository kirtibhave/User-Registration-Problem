package com.bridgelabz;

public class UserRegistration {
    String nameRule = "(^[A-Z]{1}[a-z]{2,})$";

    public boolean welcomeMessage(String message) {
        return  message.contains("user");
    }

    public boolean validFirstName(String firstName) {
        return firstName.matches(nameRule);
    }

    public boolean validLastName(String lastName) {
        return lastName.matches(nameRule);
    }
}
