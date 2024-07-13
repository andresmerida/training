package org.andres.training.hackerrank.append_and_delete;

public class AppendAndDelete {
    // write your code here
    public String appendAndDelete(String s, String t, int k) {
        if (s.length() + t.length() <= k) {
            return "Yes";
        }

        int n = 0;
        while (n < Math.min(s.length(), t.length()) && s.charAt(n) == t.charAt(n)) {
            n++;
        }

        k = k - ((s.length() - n) + (t.length() -n));
        if (k % 2 ==0 && k >= 0) {
            return "Yes";
        }
        return "No";
    }
}
