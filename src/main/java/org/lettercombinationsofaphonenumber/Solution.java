package org.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.isEmpty()) return result;

        HashMap<Character, Set<Character>> keyboard = new HashMap<>(){{
            put('2', Set.of('a', 'b', 'c'));
            put('3', Set.of('d', 'e', 'f'));
            put('4', Set.of('g', 'h', 'i'));
            put('5', Set.of('j', 'k', 'l'));
            put('6', Set.of('m', 'n', 'o'));
            put('7', Set.of('p', 'q', 'r', 's'));
            put('8', Set.of('t', 'u', 'v'));
            put('9', Set.of('w', 'x', 'y', 'z'));
        }};


        boolean isfirst = true;

        for (Character digit : digits.toCharArray()) {
            Set<Character> letters = keyboard.get(digit);

            if (isfirst) {
                for (Character letter : letters)
                    result.add(letter.toString());

                isfirst = false;
            } else {
                List<String> tempList = new ArrayList<>();
                for (String perm : result)
                    for (Character letter : letters)
                        tempList.add(perm + letter);


                result = tempList;
            }
        }

        return result;
    }
}