package org.addtwosum;

import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ZERO;

        BigInteger multiplier = BigInteger.ONE;

        while (true) {
            num1 = num1.add(BigInteger.valueOf(l1.val).multiply(multiplier));
            if (l1.next == null) break;
            l1 = l1.next;
            multiplier = multiplier.multiply(BigInteger.TEN);
        }

        multiplier = BigInteger.ONE;

        while (true) {
            num2 = num2.add(BigInteger.valueOf(l2.val).multiply(multiplier));
            if (l2.next == null) break;
            l2 = l2.next;
            multiplier = multiplier.multiply(BigInteger.TEN);
        }

        BigInteger sum = num1.add(num2);

        if (sum.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }

        ListNode result = new ListNode();
        ListNode resultCopy = result;

        while (true) {
            BigInteger[] divmod = sum.divideAndRemainder(BigInteger.TEN);
            int digit = divmod[1].intValue();
            sum = divmod[0];

            resultCopy.val = digit;

            if (sum.equals(BigInteger.ZERO)) break;

            resultCopy.next = new ListNode();
            resultCopy = resultCopy.next;
        }

        return result;
    }
}
