package arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 0, 0};
        int m = 3;
       int[] nums2 = {7, 8};
       int n = 2;
       mergeSortedArrays(nums, m, nums2, n);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1;
        int y = n - 1;

        for (int z = m + n -1; z > 0; z--) {
            if (nums1[x] < nums2[y]) {
                nums1[z] = nums2[y];
                y--;
            } else {
                nums1[z] = nums1[x];
                x--;
            }

        }

        System.out.println(Arrays.toString(nums1));
    }


    static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        for (int k = m + n - 1; k > 0; k--) {
            if (j >= 0) {
                if (nums1[i] < nums2[j]) {
                    nums1[k] = nums2[j];
                    j--;
                } else {
                    nums1[k] = nums1[i];
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1;
        int y = n - 1;

        for (int z = m + n - 1; z > 0; z-- ) {
            System.out.println(y);
            if (y >= 0) {
                if (nums1[x] < nums2[y]) {
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
}
