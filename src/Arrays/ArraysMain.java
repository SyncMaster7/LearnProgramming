package Arrays;

import java.util.Scanner;

public class ArraysMain {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers();
        int[] sortedDsc = sortArrayDsc(myIntegers);
        int[] sortedAsc = sortArrayAsc(myIntegers);

        System.out.println("\n===== Initial array of integers =====\n");
        printArray(myIntegers);
        System.out.println("\n===== Sorted array of integers, 'DSC' order =====\n");
        printArray(sortedDsc);
        System.out.println("\n===== Sorted array of integers, 'ASC' order =====\n");
        printArray(sortedAsc);
    }

    public static int[] getIntegers() {
        System.out.println("How many numbers would you like to insert?");
        int capacity = sc.nextInt();

        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array index " + i + " contents is " + array[i]);
        }
    }

    public static int[] sortArrayDsc(int[] array) {
        int[] sortedArrayDsc = new int[array.length];

        System.arraycopy(array, 0, sortedArrayDsc, 0, array.length);
        boolean flag = true;
        int temporaryNumber;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArrayDsc.length - 1; i++) {
                if (sortedArrayDsc[i] < sortedArrayDsc[i + 1]) {
                    temporaryNumber = sortedArrayDsc[i];
                    sortedArrayDsc[i] = sortedArrayDsc[i + 1];
                    sortedArrayDsc[i + 1] = temporaryNumber;
                    flag = true;
                }
            }
        }
        return sortedArrayDsc;
    }

    public static int[] sortArrayAsc(int[] array) {
        int[] sortedArrayAsc = new int[array.length];

        System.arraycopy(array, 0, sortedArrayAsc, 0, array.length);
        boolean flag = true;
        int temporaryNumber;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArrayAsc.length - 1; i++) {
                if (sortedArrayAsc[i] > sortedArrayAsc[i + 1]) {
                    temporaryNumber = sortedArrayAsc[i];
                    sortedArrayAsc[i] = sortedArrayAsc[i + 1];
                    sortedArrayAsc[i + 1] = temporaryNumber;
                    flag = true;
                }
            }
        }
        return sortedArrayAsc;
    }
}
