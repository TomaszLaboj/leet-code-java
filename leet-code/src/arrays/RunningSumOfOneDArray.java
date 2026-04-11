package arrays;

public class RunningSumOfOneDArray {
    public static void main (String[] args) {

        int[] runningSum = runningSum(new int[]{1,2,3,4});
        for(int num: runningSum) {
            System.out.println(num);
        }
    }

    static public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] outputArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            outputArray[i] = sum;
        }

        return outputArray;
    }

}

