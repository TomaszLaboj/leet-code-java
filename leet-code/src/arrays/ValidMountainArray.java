package arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(validMountainArray(arr));
        System.out.println(validMountainArray2(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean increasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
            if (
                arr[i] == arr[i - 1] ||
                (arr[i] > arr[i - 1] && !increasing) ||

                (i == 1 && arr[i] < arr[i - 1]) ||
                        (i == arr.length - 1 && increasing)
            )
            {
                return false;
            }
        }
        return true;
    }


    public static boolean validMountainArray2(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int i = 0;
        int j = arr.length - 1;
        while ( i + 1 < arr.length - 1 && arr[i] < arr[i + 1]) {
           i++;
        }
        while (j - 1 > 0 && arr[j] < arr[j - 1]) {
            j--;
        }
        System.out.println("i " + i + " j: " + j);
        return i == j;
    }
}
