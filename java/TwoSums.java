public class TwoSums {
 public static int[] twoSum(int[] nums, int target) {
       for (int i = 0; i < nums.length; i++) {
            int otherNum = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == otherNum) {
                    return new int[]{i, j};
                }
            }
       }
       return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};

        int[] result = twoSum(nums, 9);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}