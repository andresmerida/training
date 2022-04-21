package org.andres.training.strings.strong.password;

import java.util.HashSet;
import java.util.Set;

public class StrongPasswordTest {
    public static void main(String[] args) {
        var n = 3;
        var password = "Ab1";
        System.out.println(minimunNumber(n, password));
    }

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */
    public static int minimunNumber(int n, String password) {
        var lowercase = false;
        var uppercase = false;
        var number = false;
        var specialCharacter = false;

        char[] specialChars = "!@#$%^&*()-+".toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (char c : specialChars) {
            characterSet.add(c);
        }

        for (var i = 0; i < n; i++) {
            var c = password.charAt(i);
            if (c >= '0' && c <= '9') number = true;
            if (c >= 'a' && c <= 'z') lowercase = true;
            if (c >= 'A' && c <= 'Z') uppercase = true;
            if (characterSet.contains(c)) specialCharacter = true;
        }

        var need = 0;
        need += number ? 0 : 1;
        need += lowercase ? 0 : 1;
        need += uppercase ? 0 : 1;
        need += specialCharacter ? 0 : 1;

        return n + need < 6 ? 6 - n : need;
    }
}
