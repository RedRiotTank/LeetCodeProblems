package org.example;

import org.addtwosum.ListNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        org.twosum.Solution solution = new org.twosum.Solution();
        org.searchinsert.Solution searchInsertSolution = new org.searchinsert.Solution();
        org.palindromenumber.Solution palindromeSolution = new org.palindromenumber.Solution();
        org.validparentheses.Solution validParenthesesSolution = new org.validparentheses.Solution();
        org.reverseinteger.Solution reverseInteger = new org.reverseinteger.Solution();
        org.lettercombinationsofaphonenumber.Solution letterComb = new org.lettercombinationsofaphonenumber.Solution();
        org.addtwosum.Solution addtwosum = new org.addtwosum.Solution();
        org.mergeintervals.Solution mergeintervals = new org.mergeintervals.Solution();

        int[] solTwoNum = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Solution: " + solTwoNum[0] + ", " + solTwoNum[1]);

        int[] solTwoNum2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Solution: " + solTwoNum2[0] + ", " + solTwoNum2[1]);
        int solSearchInsert = searchInsertSolution.searchInsert(new int[]{1, 3, 5}, 6);
        System.out.println("Solution: " + solSearchInsert);



        boolean solPalindrome = palindromeSolution.isPalindrome(0);
        System.out.println("Solution: " + solPalindrome);

        boolean solValidParentheses = validParenthesesSolution.isValid("){)");
        System.out.println("Solution: " + solValidParentheses);

        int solReversedInteger = reverseInteger.reverse(123);
        System.out.println("Solution " + solReversedInteger);

        List<String> solLetterCombinations = letterComb.letterCombinations("2347");
        System.out.println("Solution " + solLetterCombinations.toString());

        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9)));
        ListNode solAddTwoSum = addtwosum.addTwoNumbers(l1,l2);

        int[][] mi = new int[4][2];
        mi[0][0] = 1;
        mi[0][1] = 3;

        mi[1][0] = 2;
        mi[1][1] = 6;

        mi[2][0] = 8;
        mi[2][1] = 10;

        mi[3][0] = 15;
        mi[3][1] = 18;

        int[][] mi2 = new int[2][2];
        mi2[0][0] = 1;
        mi2[0][1] = 10;

        mi2[1][0] = 2;
        mi2[1][1] = 3;


        int[][] miresult = mergeintervals.merge(mi2);
        System.out.println(miresult);
    }
}