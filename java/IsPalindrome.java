// https://leetcode.com/problems/palindrome-number/

class IsPalindrome {
    public static boolean isPalindrome(int x) {
    String str = String.valueOf(x);

    // slow
    // return str.equals(new StringBuilder(str).reverse().toString());


    boolean isPalindrome = true;
    for (int i = 0; i < str.length() / 2; i++) {
    if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        isPalindrome = false;
        break;
    }
    }
    return isPalindrome;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
    
}
