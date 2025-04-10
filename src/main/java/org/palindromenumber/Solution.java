package org.palindromenumber;
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int xCopy = x;
        int reversedNumber = 0;

        while (x > 0){
            int digit = x % 10;
            x = x / 10;

            reversedNumber = reversedNumber * 10 + digit;
        }

        return reversedNumber == xCopy;
    }
}
