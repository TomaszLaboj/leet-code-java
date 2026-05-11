package arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(heightChecker(nums));
    }

    public static int heightChecker(int[] heights) {
        int notMatch = 0;
        int[] expected = heights.clone();
        for (int i = expected.length - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (expected[j] > expected[j + 1]) {
                    int temp = expected[j];
                    expected[j] = expected[j + 1];
                    expected[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < expected.length; i++) {
            if (heights[i] != expected[i]) notMatch++;
        }

        return notMatch;
    }
}
