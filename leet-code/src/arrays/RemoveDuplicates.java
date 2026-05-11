package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] duplicates = {1, 1, 2};
        System.out.println(removeDuplicates(duplicates));
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
    }

}
