import java.util.Scanner;

public class Main {

    // Method to add a value to the end of the array
    public static int[] addValueToEnd(int[] array, int value) {
        int[] newArray = new int[array.length + 1]; // Create a new array with one extra slot
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i]; // Copy elements from the original array
        }
        newArray[array.length] = value; // Add the new value to the end
        return newArray; // Return the new array
    }

    // Method to delete the last value from the array
    public static int[] deleteValueFromEnd(int[] array) {
        int[] newArray = new int[array.length - 1]; // Create a new array with one less slot
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i]; // Copy elements from the original array
        }
        return newArray; // Return the new array
    }

    // Method to insert a value at a specific index in the array
    public static int[] insertValueAtIndex(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1]; // Create a new array with one extra slot
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = value; // Insert the new value at the specified index
            } else {
                newArray[i] = array[j++]; // Copy elements from the original array
            }
        }
        return newArray; // Return the new array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[0]; // Initialize an empty array

        boolean quit = false;
        while (!quit) {
            System.out.println("1. Add value to end");
            System.out.println("2. Delete value from end");
            System.out.println("3. Insert value at index");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int valueToAdd = scanner.nextInt();
                    array = addValueToEnd(array, valueToAdd);
                    break;
                case 2:
                    if (array.length > 0) {
                        array = deleteValueFromEnd(array);
                    } else {
                        System.out.println("Array is empty.");
                    }
                    break;
                case 3:
                    System.out.print("Enter index to insert at: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    int valueToInsert = scanner.nextInt();
                    if (index >= 0 && index <= array.length) {
                        array = insertValueAtIndex(array, index, valueToInsert);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            // Print the current array
            System.out.print("Current array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}