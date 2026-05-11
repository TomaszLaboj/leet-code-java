package arrays;

public class DeletingItemsFromArray {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int length = 0;

        //add 6 items
        for (int i = 0; i < 6; i++) {
            intArray[i] = i;
            length++;
        }

        //delete last itme , just shorten the array
        length--;

        //delete the first item
        for (int i = 0; i < length; i++) {
            intArray[i] = intArray[i + 1];
        }

        // delete item at index
        for (int i = 3; i < length; i++) {
            intArray[i] = intArray[i + 1];
        }
        length--;
        // display array
        for (int i = 0; i < length; i++) {
            System.out.println(intArray[i]);
        }
    }






}
