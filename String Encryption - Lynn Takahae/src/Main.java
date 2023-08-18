import java.util.Scanner;

public class Main {
    // our method to encrypt a string
    public static String encrypt(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char lastChar = input.charAt(input.length() - 1);
        // Constructed the encrypted string by moving the last character to the front and adding "ay" at the end
        // e.g. pizza encrypted = apizzay.
        String encrypted = lastChar + input.substring(0, input.length() - 1) + "ay";
        return encrypted;
    }

    // our method to decrypt an encrypted string
    public static String decrypt(String encrypted) {
        if (encrypted == null || encrypted.isEmpty()) {
            return encrypted;
        }

        // Extract the original string by removing the first character, moving the rest to the end, and removing the last two characters
        // same with the pizza example but changing it back to original now. apizzay becomes pizza
        String decrypted = encrypted.substring(1, encrypted.length() - 2) + encrypted.charAt(0);
        return decrypted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string, any :D : ");
        String original = scanner.nextLine();
        // Reads the user's input string and uses that word for the run

        // Encrypt the original string using the encrypt method
        String encrypted = encrypt(original);
        System.out.println("ENCRYPTED: " + encrypted);
        // Prints the encrypted string

        // Decrypt the encrypted string using the decrypt method
        String decrypted = decrypt(encrypted);
        System.out.println("DECRYPTED: " + decrypted);
        // Prints the decrypted string

        scanner.close();
    }
}