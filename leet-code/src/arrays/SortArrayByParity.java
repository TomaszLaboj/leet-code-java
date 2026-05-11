package arrays;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity3(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int writeIndex = 0;

        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] % 2 == 0) {
                int temp = nums[writeIndex];
                nums[writeIndex] = nums[readIndex];
                nums[readIndex] = temp;
                writeIndex++;
            }
        }
        return nums;
    }

    public static int[] sortArrayByParity2(int[] nums) {
        int[] output = new int[nums.length];
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                output[i] = nums[i];
            } else {
                output[j] = nums[i];
                j--;
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
    }

    public static int[] sortArrayByParity3(int[] nums) {
        int writer = 0;
        for (int reader = 0; reader < nums.length ; reader++) {
            if (nums[reader] % 2 == 0) {
                int temp = nums[writer];
                nums[writer] = nums[reader];
                nums[reader] = temp;
                writer++;
            }
        }
        return nums;
    }

}
