package org.reverseinteger;

public class Solution {
    public int reverse(int x) {
        int digit;
        int reversed = 0;

        while (x != 0){
            digit = x % 10;

            try {
                reversed = Math.multiplyExact(reversed, 10);
                reversed = Math.addExact(reversed, digit);

            }catch (ArithmeticException e){
                return 0;
            }

            x = x / 10;
        }

        return reversed;
    }
}
