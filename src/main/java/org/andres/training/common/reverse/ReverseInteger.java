package org.andres.training.common.reverse;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(getReverseInteger(123));
    }

    public static int getReverseInteger(int x) {
        int ans = 0;
        while (x != 0) {
            if (ans > 214748364 || ans < -214748364) {
                return 0;
            }
            ans = ans * 10 + x % 10;
            x = x/10;
        }

        return ans;
    }
}
