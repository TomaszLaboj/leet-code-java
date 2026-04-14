package arrays;

public class MathDivision {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 2;
        System.out.println("Dividing Math.divideExact(5, 2) : " + Math.divideExact(5, 2));
        System.out.println("Dividing 5 / 2, returns 2 as it's integer division : " + 5 / 2);
        System.out.println("Dividing 5 / 2, this time the type of the quotient and dividend is double : " + num1 / num2);
        System.out.println("Dividing Math.floorDiv(5, 2) : " + Math.floorDiv(5, 2));
        System.out.println("Dividing Math.ceilDiv(5, 2) : " + Math.ceilDiv(5, 2));
    }
}
