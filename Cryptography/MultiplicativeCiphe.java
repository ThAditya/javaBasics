package Cryptography;

import java.util.Scanner;

public class MultiplicativeCipher {

    public static String Encryption(String msg, int key) {
        StringBuilder str = new StringBuilder();
        msg = msg.toUpperCase();

        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                int x = ch - 'A';
                int encrypted = (x * key) % 26;
                str.append((char) (encrypted + 'A'));
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }


    public static String Decryption(String msg, int key) {
        msg = msg.toUpperCase();
        int inverse = modInverse(key, 26);

        if (inverse == -1) {
            return "Invalid key! No modular inverse.";
        }

        StringBuilder res = new StringBuilder();
        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                int x = ch - 'A';
                int decrypted = (x * inverse) % 26;
                res.append((char) (decrypted + 'A'));
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }


    private static int modInverse(int key, int mod) {
        key = key % mod;
        for (int i = 1; i < mod; i++) {
            if ((key * i) % mod == 1)
                return i;
        }
        return -1;
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter message: ");
                    String encMsg = sc.nextLine();
                    System.out.print("Enter key: ");
                    int encKey = sc.nextInt();
                    System.out.println("Encrypted: " + Encryption(encMsg, encKey));
                    break;

                case 2:
                    System.out.print("Enter ciphertext: ");
                    String decMsg = sc.nextLine();
                    System.out.print("Enter key: ");
                    int decKey = sc.nextInt();
                    System.out.println("Decrypted: " + Decryption(decMsg, decKey));
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
