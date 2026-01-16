// https://leetcode.com/problems/longest-substring-without-repeating-characters/


class LongestSubstringWithoutRepeatingCharts {
     public static int getLengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        String longestSubString = "";
        int lengthWithNoRepeat = 0;
        for(int i = 0; i < s.length(); i++) {
                if (longestSubString.contains(s.charAt(i) + "")) {
                    longestSubString = longestSubString.substring(longestSubString.indexOf(s.charAt(i)) + 1);
                }
                longestSubString += s.charAt(i);
                lengthWithNoRepeat = Math.max(lengthWithNoRepeat, longestSubString.length());
        }
        return lengthWithNoRepeat;
    }

    public static void main(String[] args) {
        // String s = "abcabcbb";
        // String s = "bbbbb";
        // String s = "pwwkew";
        String s = "aab";
        // String s = "dvdf";
        System.out.println(getLengthOfLongestSubstring(s));
    }
}
