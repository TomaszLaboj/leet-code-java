package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -2, 0, 1, 2, 3};
        System.out.println(Arrays.toString(squaresSorted(nums)));
    }

    static int[] squaresSorted(int[] nums) {
        int[] squared = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squared[i] = (int) Math.pow(nums[i], 2);
        }

        for ( int j = 0; j < squared.length - 1; j++) {
            for (int i = 0; i < squared.length - 1; i++) {
                if (squared[i] > squared[i + 1]) {
                    int hold = squared[i + 1];
                    squared[i + 1] = squared[i];
                    squared[i] = hold;
                }
            }
        }
       return squared;
    }

}
