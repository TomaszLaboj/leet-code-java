package arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckForIntAndItsDouble {
    public static void main(String[] args) {

        int[] arr = {0, 0};
        System.out.println(checkIfExists(arr));
        System.out.println(checkIfExists2(arr));
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

    public static boolean checkIfExists2(int[] arr) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int num : arr) {
            if (seenNumbers.contains(num * 2) || (num % 2 == 0 && seenNumbers.contains(num / 2))) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}
