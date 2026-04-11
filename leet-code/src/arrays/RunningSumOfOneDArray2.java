package arrays;

public class RunningSumOfOneDArray2 {
    public static void main (String[] args) {

        int[] runningSum = runningSum(new int[]{1,2,3,4});
        for(int num: runningSum) {
            System.out.println(num);
        }
    }

    static public int[] runningSum(int[] nums) {
        int[] outputArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = outputArray[i == 0 ? 0 : i - 1] + nums[i];
            outputArray[i] = sum;
        }

        return outputArray;
    }

}
