package arrays;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
      System.out.println(removeElements(nums, 2));
      int[] duplicates = {1,1,2};
      System.out.println(removeDuplicates(duplicates));
    }

    static int removeElements(int[]nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                nums[k] = num;
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    static int removeDuplicates(int[] nums) {
      int j = 1;
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] != nums[i -1]) {
              nums[j] = nums[i];
              j++;
          }
      }
      System.out.println(Arrays.toString(nums));
      return j;
    };
}
