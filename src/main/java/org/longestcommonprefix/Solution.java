package org.longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for(int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            for (String word : strs)
                if (i >= word.length() || word.charAt(i) != currentChar)
                    return strs[0].substring(0, i);
        }

        return strs[0];
    }
}
