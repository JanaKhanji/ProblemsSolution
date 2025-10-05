// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class FindNumbersWithEvenDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int el: nums) {
            if (String.valueOf(el).length() % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
