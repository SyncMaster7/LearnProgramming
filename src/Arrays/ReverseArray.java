package Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Initial array is " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed array is " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temporaryElement = array[i];

            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temporaryElement;
        }
    }
}
