package org.validparentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray())
            if (isOpeningBrack(c)) stack.push(getCorrespondence(c));
            else if(getCorrespondence(c) != (!stack.empty() ? stack.pop() : 0)) return false;

        return stack.isEmpty();
    }

    private int getCorrespondence(char c) {
        return switch (c) {
            case '(', ')' -> 1;
            case '{', '}' -> 2;
            case '[', ']' -> 3;

            default -> throw new IllegalArgumentException("Invalid bracket: " + c);
        };
    }

    private boolean isOpeningBrack(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
