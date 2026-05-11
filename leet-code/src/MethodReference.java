public class MethodReference {
    interface StringFunc {
        String func(String n);
    }

    static class MyStringOps {
        static String strReverse(String str) {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        }

        static class MethodRefDemo {
            static String stringOp(StringFunc sf, String s) {
                return sf.func(s);
            }

            public static void main(String[] args) {
                String inStr = "Lambdas add power to java";
                String outStr;

                outStr = stringOp(MyStringOps::strReverse, inStr);

                System.out.println("Original string: " + inStr);
                System.out.println("String reversed: " + outStr);
            }
        }
    }



}
