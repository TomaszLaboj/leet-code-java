package objects;

public class EqualsAndToString {

    static Dog myDog = new Dog("Dido", 2, "Spaniel", "Ginger");
    static Dog anotherDog = new Dog("Dido", 2, "Spaniel", "Ginger");

    public static void main(String[] args) {
        System.out.println(myDog.equals(anotherDog));
        System.out.println(myDog.hashCode());
        System.out.println(anotherDog.hashCode());

        Money cash = new Money(42, "USD");
        WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");

        System.out.println(voucher.equals(cash));

        System.out.println(cash.equals(voucher));

    }


}
