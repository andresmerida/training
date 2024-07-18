package org.andres.training.coderbyte.codeland_username_validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
    
    public boolean usernameValid(String username) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]+$");
        Matcher matcher = pattern.matcher(username);
        if (username.length() < 4 || username.length() > 25) {
            return false;
        } else if (!Character.isLetter(username.charAt(0))) {
            return false;
        } else if (!matcher.find()) {
            return false;
        } else return '_' != username.charAt(username.length() - 1);
    }
}
