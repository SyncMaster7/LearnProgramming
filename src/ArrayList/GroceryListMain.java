package ArrayList;

import java.util.Scanner;

public class GroceryListMain {

    private static final Scanner sc = new Scanner(System.in);
    private static final GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> groceryList.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchForItem();
                case 6 -> quit = true;
            }
        }
    }

    public static void printInstructions() {

        System.out.println("\nPress\n");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search an item in the list.");
        System.out.println("\t 6 - To quit the application.\n");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemNumber - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNumber = sc.nextInt();
        sc.nextLine();
        groceryList.removeGroceryItem(itemNumber - 1);
    }

    public static void searchForItem() {
        System.out.print("Item number to search for: ");
        String searchItem = sc.nextLine();

        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in the grocery list.");
        } else {
            System.out.println(searchItem + " is not in the grocery list.");
        }
    }
}
