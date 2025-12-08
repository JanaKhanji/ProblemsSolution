// https://leetcode.com/problems/search-insert-position/description/

class SearchInsertPosition {
    
    public static int search(int[] nums, int target) {
        int index = -1;

        if (target <= nums[0]) {
            index = 0;
        } else if (target > nums[nums.length -1]) {
            index = nums.length -1 + 1;
        } else {
            for (int i = 0; i <= nums.length -1; i++) {
                if (nums[i] == target) {
                    index = i;
                    break;  
                } else if (nums[i] < target && nums[i+1] > target) {
                   index = i + 1;
                   break;
                }
            }
        }
        return index;
    }
  
   public static void main(String[] args) {
    //    int[] nums = new int[] {1,3,5,6};
    //    System.out.println(search(nums, 7)); // output 4

    //     int[] nums = new int[] {1,3,5,6};
    //    System.out.println(search(nums, 5)); // output 2


    //     int[] nums = new int[] {1,3,5,6};
    //    System.out.println(search(nums, 2)); // output 1


    //    int[] nums = new int[] {1,3};
    //    System.out.println(search(nums, 2)); // output 1

   }
	
}
