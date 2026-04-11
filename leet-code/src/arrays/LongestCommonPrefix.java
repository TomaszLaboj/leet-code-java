package arrays;

public class LongestCommonPrefix {
     public static void main(String[] args) {
         String[] input = { "ab", "a" };
         String output = longestCommonPrefix(input);
         System.out.println(output);
     }

     static String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder();
        char [] firstWord = strs[0].toCharArray();
        int index = 0;
        for (char letter:firstWord) {
            boolean allEqual = true;
            for (int i = 1; i < strs.length; i++) {
                if (index == strs[i].length() || (letter != strs[i].charAt(index))) {
                    allEqual = false;
                    break;
                }
            }
            if (allEqual) {
                lcp.append(letter);
                index++;
            } else {
                return lcp.toString();
            }
        }
        return lcp.toString();
     };
}
