package arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("jar", "jam"));
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                int count = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), count + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }

        }
        for (int i = 0; i < t.length(); i++) {
            if (tMap.containsKey(t.charAt(i))) {
                int count = tMap.get(t.charAt(i));
                tMap.put(t.charAt(i), count + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }
        return sMap.equals(tMap);
    }


    static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sMap.equals(tMap);
    }
}
