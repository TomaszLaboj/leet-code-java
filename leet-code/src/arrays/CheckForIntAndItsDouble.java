package arrays;

public class CheckForIntAndItsDouble {
    public static void main(String[] args) {

        int[] arr = {0, 0};
        System.out.println(checkIfExists(arr));
    }

    public static boolean checkIfExists(int[] arr) {
        if (arr == null) {
            return false;
        }
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i != j && Math.multiplyExact(arr[i], 2) == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
