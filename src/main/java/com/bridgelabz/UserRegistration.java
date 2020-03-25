package com.bridgelabz;

public class UserRegistration {
    String nameRule = "(^[A-Z]{1}[a-z]{2,})$";
    String mobileRule = "^[0-9]{2}[ ][0-9]{10}$";


    public boolean welcomeMessage(String message) {
        return  message.contains("user");
    }

    public boolean validFirstName(String firstName) {
        return firstName.matches(nameRule);
    }

    public boolean validLastName(String lastName) {
        return lastName.matches(nameRule);
    }

    public boolean validMobile(String mobile) {
        return mobile.matches(mobileRule);
    }
}
