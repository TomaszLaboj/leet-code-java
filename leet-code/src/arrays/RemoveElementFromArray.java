package arrays;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] nums = {3, 3};
      System.out.println(removeElements(nums, 3));
    }

    static int removeElements(int[] nums, int val) {
       int k = 0;
        for (int i = nums.length -1; i >= 0; i--) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }


}
