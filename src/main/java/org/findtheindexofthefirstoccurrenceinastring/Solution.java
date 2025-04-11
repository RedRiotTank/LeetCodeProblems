package org.findtheindexofthefirstoccurrenceinastring;

class Solution {
    public int strStr(String haystack, String needle) {
        boolean started = false;

        int haystackInitiationIndex = 0;
        int needleIndex = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (needleIndex == needle.length()) return haystackInitiationIndex;

            else if (!started && haystack.charAt(i) == needle.charAt(needleIndex)) {
                needleIndex++;
                started = true;
                haystackInitiationIndex = i;
            }
            else if (started && haystack.charAt(i) == needle.charAt(needleIndex)) {
                needleIndex++;
            }
            else if (started) {
                i = haystackInitiationIndex;
                needleIndex = 0;
                started = false;
            }
        }

        if (needleIndex == needle.length()) return haystackInitiationIndex;

        return -1;
    }
}

