import java.io.*;
import java.util.Scanner;

 class CaesarCipher {
    static Scanner sc = new Scanner(System.in); // Corrected capitalization of 'static'

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // Changed 'sc' to lowercase, matches the declaration.

        System.out.print("Enter a key (integer): ");
        int key = sc.nextInt(); // Changed key to integer for Caesar cipher logic.

        // Encrypt the string using Caesar Cipher
        String encrypted = encrypt(str, key);

        System.out.println("Encrypted string: " + encrypted);
    }

    // Method to encrypt the string using Caesar Cipher
    public static String encrypt(String str, int key) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base + key) % 26 + base); // Shift within alphabet bounds
            }

            encrypted.append(ch);
        }

        return encrypted.toString();
    }
}
