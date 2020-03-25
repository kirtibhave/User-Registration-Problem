package com.bridgelabz;

public class UserRegistration {
    String nameRule = "(^[A-Z]{1}[a-z]{2,})$";
    String mobileRule = "^[0-9]{2}[ ][0-9]{10}$";
    String emailRule = "^[a-zA-Z]{3,}([+|-|.|_]?[a-zA-Z0-9]+)?[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]+)?$";
    String minimumCharacterRule = "^[a-zA-Z]{8,}";
    String upperCaseRule = "^(?=.*[A-Z])[A-Za-z]{8,}$";
    String numericNumberRule = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{8,}$";
    String specialCharacterRule = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

    public boolean welcomeMessage(String message) {
        return  message.contains("user");
    }

    public boolean validFirstName(String firstName) {
        return firstName.matches(nameRule);
    }

    public boolean validLastName(String lastName) {
        return lastName.matches(nameRule);
    }

    public boolean validEmail(String email) {
        return  email.matches(emailRule);
    }

    public boolean validMobile(String mobile) {
        return mobile.matches(mobileRule);
    }

    public boolean minimumCharacterMethod(String minimumCharacter) {
        return minimumCharacter.matches(minimumCharacterRule);
    }

    public boolean upperCaseMethod(String upperCaseCharacter) {
        return upperCaseCharacter.matches(upperCaseRule);
    }

    public boolean numericNumberMethod(String numericNumber) {
        return numericNumber.matches(numericNumberRule);
    }

    public boolean specialCharacterMethod(String specialCharacter) {
        return specialCharacter.matches(specialCharacterRule);
    }
}
