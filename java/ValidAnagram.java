// https://leetcode.com/problems/valid-anagram/description/
import java.util.*;

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] arg) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    // Slow Function
    public static boolean isAnagramSlow(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> sCounts = new HashMap<>();
        Map<Character, Integer> tCounts = new HashMap<>();

        for (char c : s.toCharArray()) {
            sCounts.put(c, sCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tCounts.put(c, tCounts.getOrDefault(c, 0) + 1);
        }

        return sCounts.equals(tCounts);
    }
}