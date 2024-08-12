package org.andres.training.design.patterns.decorator.example2;

public class DatabaseService {

    public String getMailFromUsername(String username) {
        return username + "@Mail";
    }

    public String getPhoneNumberFromUsername(String username) {
        return username + "@Phone";
    }

    public String getFacebookNameFromUsername(String username) {
        return username + "@Facebook";
    }
}
