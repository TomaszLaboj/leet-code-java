package arrays;

import java.util.Arrays;


// given array of numbers and a target numbers, find 2 numbers in the array which when added together give the target, retrun the index numbers of the nubmers
class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 4)));
    }

    static public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && (i != j) && !found) {
                    indices[0] = i;
                    indices[1] = j;
                    found = true;
                }
            }
        }
        return indices;
    }
}
