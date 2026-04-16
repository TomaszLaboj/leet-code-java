package arrays;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] nums = {4, 2, 0, 1, 2, 3, 0, 1, 0};
        duplicateZeros(nums);
    }

    static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i + 1 < arr.length) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
