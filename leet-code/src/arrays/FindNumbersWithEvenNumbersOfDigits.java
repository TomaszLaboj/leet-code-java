package arrays;

public class FindNumbersWithEvenNumbersOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 12, 2 , 213, 123, 1233};
        System.out.println(findEvens(arr));
    }

    static int findEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((String.valueOf(num).length() % 2 == 0)) {
                count++;
            }
        }
        return count;
    }
}
