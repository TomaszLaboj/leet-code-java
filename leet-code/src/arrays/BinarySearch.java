package arrays;

public class BinarySearch {
    static int binarySearch(int[] arr, int num) {
        int index = Math.floorDiv(arr.length, 2);

        while (index != 0 || index < arr.length - 1) {
            if (arr[index] == num) return index;
            else if (arr[index] < num) {
                index += Math.floorDiv(arr.length - index, 2);
            } else {
                index /= 2;
            }
        }

        return -1;

    }


    static int slidingWindowBinarySearch(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int med = 0;
        while (low <= high) {
            med = low + (high - low) / 2;
            System.out.println(med);
            if (arr[med] == num) return med;
            else if (arr[med] < num) {
                low = med + 1;
            } else {

                high = med - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 2;
        int result = binarySearch2(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }


    static int binarySearch2(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int med = 0;
        while (low <= high) {
            med = low + (high - low) / 2;
            if (nums[med] == target) return med;
            else if (nums[med] < target) {
                low = med + 1;
            } else {
                high = high - 1;
            }
        }
        return -1;
    }

}
