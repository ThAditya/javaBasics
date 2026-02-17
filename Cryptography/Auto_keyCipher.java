package Cryptography;

import java.util.Scanner;

public class Auto_keyCipher {

    // Convert char to number (A=0)
    static int charToInt(char c) {
        return c - 'A';
    }

    // Convert number to char
    static char intToChar(int n) {
        return (char) (n + 'A');
    }

    // ================= ENCRYPTION (STRING KEY) =================
    public static String Encryption(String txt, String key) {
        txt = txt.toUpperCase();
        key = key.toUpperCase();

        StringBuilder result = new StringBuilder();
        String newKey = key + txt;

        for (int i = 0; i < txt.length(); i++) {
            int t = charToInt(txt.charAt(i));
            int k = charToInt(newKey.charAt(i));
            int c = (t + k) % 26;
            result.append(intToChar(c));
        }
        return result.toString();
    }

    // ================= ENCRYPTION (INTEGER KEY) =================
    public static String Encryption(String txt, int key) {
        txt = txt.toUpperCase();
        StringBuilder result = new StringBuilder();
        int currentKey = key;

        for (int i = 0; i < txt.length(); i++) {
            int t = charToInt(txt.charAt(i));
            int c = (t + currentKey) % 26;
            result.append(intToChar(c));
            currentKey = t;   // auto key
        }
        return result.toString();
    }

    // ================= DECRYPTION (STRING KEY) =================
    public static String Decryption(String cipher, String key) {
        cipher = cipher.toUpperCase();
        key = key.toUpperCase();

        StringBuilder result = new StringBuilder();
        StringBuilder newKey = new StringBuilder(key);

        for (int i = 0; i < cipher.length(); i++) {
            int c = charToInt(cipher.charAt(i));
            int k = charToInt(newKey.charAt(i));
            int p = (c - k + 26) % 26;
            char plainChar = intToChar(p);
            result.append(plainChar);
            newKey.append(plainChar);
        }
        return result.toString();
    }

    // ================= DECRYPTION (INTEGER KEY) =================
    public static String Decryption(String cipher, int key) {
        cipher = cipher.toUpperCase();
        StringBuilder result = new StringBuilder();
        int currentKey = key;

        for (int i = 0; i < cipher.length(); i++) {
            int c = charToInt(cipher.charAt(i));
            int p = (c - currentKey + 26) % 26;
            char plainChar = intToChar(p);
            result.append(plainChar);
            currentKey = p;
        }
        return result.toString();
    }

    // ================= BRUTE FORCE =================
    public static void bruteForce(String cipher) {
        System.out.println("\nBrute Force Results:");
        for (int key = 0; key < 26; key++) {
            System.out.println("Key " + key + " -> " + Decryption(cipher, key));
        }
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== AUTO KEY CIPHER =====");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Brute Force (Integer Key)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    String txt = sc.next();

                    System.out.println("Select Key Type:");
                    System.out.println("1. Text Key");
                    System.out.println("2. Integer Key");
                    System.out.print("Enter choice: ");
                    int keyChoiceEnc = sc.nextInt();

                    if (keyChoiceEnc == 1) {
                        System.out.print("Enter text key: ");
                        String key = sc.next();
                        System.out.println("Encrypted Text: " + Encryption(txt, key));
                    } 
                    else if (keyChoiceEnc == 2) {
                        System.out.print("Enter integer key (0-25): ");
                        int key = sc.nextInt();
                        System.out.println("Encrypted Text: " + Encryption(txt, key));
                    } 
                    else {
                        System.out.println("Invalid key type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter cipher text: ");
                    String cipher = sc.next();

                    System.out.println("Select Key Type:");
                    System.out.println("1. Text Key");
                    System.out.println("2. Integer Key");
                    System.out.print("Enter choice: ");
                    int keyChoiceDec = sc.nextInt();

                    if (keyChoiceDec == 1) {
                        System.out.print("Enter text key: ");
                        String key = sc.next();
                        System.out.println("Decrypted Text: " + Decryption(cipher, key));
                    } 
                    else if (keyChoiceDec == 2) {
                        System.out.print("Enter integer key (0-25): ");
                        int key = sc.nextInt();
                        System.out.println("Decrypted Text: " + Decryption(cipher, key));
                    } 
                    else {
                        System.out.println("Invalid key type.");
                    }
                    break;

                case 3:
                    System.out.print("Enter cipher text: ");
                    String bruteCipher = sc.next();
                    bruteForce(bruteCipher);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
