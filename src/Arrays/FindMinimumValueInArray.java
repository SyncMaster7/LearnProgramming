package Arrays;

import java.util.Scanner;

public class FindMinimumValueInArray {

    private static Scanner sc = new Scanner(System.in); // using private static for encapsulation reason.

    public static void main(String[] args) {
        System.out.println("Enter number count: ");
        int count = sc.nextInt();
        sc.nextLine();

        int[] returnArray = readIntegers(count);
        int returnMin = findMinimumValue(returnArray);

        System.out.println("Minimum value in the array is " + returnMin);
    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            sc.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMinimumValue(int[] array) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}
