public class Itoa {
    public static void main(String[] args) {
        String[] letters = new String[1];
        letters[0] = "A";
        String[] letters2 = letters;
        System.out.println(letters[0]);
        letters2[0] = "B";
        System.out.println(letters[0]);
    };

//    public static String convert(int x, int base) {
//
//    }
}
