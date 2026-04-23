package arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums = {0};
        int m = 0;
       int[] nums2 = {1};
       int n = 1;
       merge(nums, m, nums2, n);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
       int x = m - 1;
       int y = n - 1;

       for (int z = m + n -1; z >= 0; z--) {
           if (y >= 0) {

               if (x < 0 || nums1[x] < nums2[y]) {
                   nums1[z] = nums2[y];
                   y--;
               } else {
                   nums1[z] = nums1[x];
                   x--;
               }
           }
       }
        System.out.println(Arrays.toString(nums1));
    }

    static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        int y = 0;
        for (int z = 0; z < nums1.length; z++) {
            if (nums2[y] < nums1[x] || nums1[x] == 0) {
                nums1[x] = nums2[y];
                x++;
                y++;
            }
        }
    }
}
