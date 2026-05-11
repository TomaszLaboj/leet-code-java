package arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println(removeElement(nums, 3));

    }


    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        return k;
    }
}
