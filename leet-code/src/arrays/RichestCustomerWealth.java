package arrays;

import java.util.Arrays;
import java.util.List;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3}, {2,3,4}, {5,6,6}};
        System.out.println(richestCustomerWealth(nums));
    }

    static int richestCustomerWealth(int[][] grid) {
        int[] sums = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int sum = 0;
            for(int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            };
            sums[i] = sum;
        }
        int max = sums[0];
        for (int num : sums) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
