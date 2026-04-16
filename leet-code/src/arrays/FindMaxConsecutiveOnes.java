package arrays;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                counter++;
                if (counter > 0 && counter > max) {
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }

        return max;
    }
}
