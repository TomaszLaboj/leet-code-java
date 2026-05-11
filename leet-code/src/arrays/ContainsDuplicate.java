package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println(hasDuplicate(nums));
    }

    static boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num:nums) {
            s.add(num);
        }
        if (s.size() != nums.length) {
            return true;
        }
        return false;

    }
}
