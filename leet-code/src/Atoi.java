import java.util.Arrays;


public class Atoi {
    static int myAtoi(String s) {
        char[] str = new char[s.length()];
        // [0, 0, 1, 2]
        int sign = 1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') sign = -1;
            if (s.charAt(i) != ' ' && Character.isDigit(s.charAt(i))) {
                str[index] = s.charAt(i);
                index++;
            } else if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        System.out.println(index);
        System.out.println(Arrays.toString(str));
        int multiplier = 1;

        int result = 0;
        index--;
        while (index >= 0) {
            System.out.println((int) str[index]);
            result += (str[index] - '0') * multiplier;
            multiplier *= 10;
            index--;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        String s1 = "  -0012g4";
        String s2 = "123";
        String s3 = "-12";
        String s4 = "0012";
        System.out.println(myAtoi(s1));

    }
}
