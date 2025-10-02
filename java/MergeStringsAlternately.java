// https://leetcode.com/problems/merge-strings-alternately/
public class MergeStringsAlternately {
    
    public static String mergeAlternately(String word1, String word2) {
        int index = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < index; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        sb.append(word1.substring(index));
        sb.append(word2.substring(index));

        return sb.toString();
    }

  
   public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
	}
}