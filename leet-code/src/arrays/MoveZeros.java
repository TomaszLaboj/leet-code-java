package arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        moveZeroes(arr);
    }

    static public void moveZeroes(int[] nums) {
        int stop = nums.length;
        for (int i = 0; i < stop; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
                i--;
                stop--;
            }
        }
        System.out.println("array" + Arrays.toString(nums));
    }

    static public void moveZeroes2(int[] nums) {
        int writePointer = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                int temp = nums[writePointer];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = temp;
                writePointer++;
            }
        }

    }
}
