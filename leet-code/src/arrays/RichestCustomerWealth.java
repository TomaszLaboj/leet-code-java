package arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3}, {2,3,4}, {5,6,6}};
        System.out.println(richestCustomerWealth(nums));
        System.out.println(richestCustomerWealth2(nums));
    }

    static int richestCustomerWealth(int[][] grid) {
        int[] sums = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int sum = 0;
            for(int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
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

    static int richestCustomerWealth2(int[][] grid) {
        int maxCustomerWealthSoFar = 0;
        for(int[] customer : grid) {
            int currentCustomerWealth = 0;
            for(int account : customer) {
                currentCustomerWealth += account;
            }
            maxCustomerWealthSoFar = Math.max(maxCustomerWealthSoFar, currentCustomerWealth);
        }
        return maxCustomerWealthSoFar;
    }
}
