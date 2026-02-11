package Cryptography;

import java.util.*;

public class PlayFairCipher {

    static char[][] matrix = new char[5][5];

    // Generate 5x5 key matrix
    static void generateMatrix(String key) {
        key = key.toUpperCase().replace("J", "I");
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : key.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                set.add(c);
            }
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            if (c != 'J') {
                set.add(c);
            }
        }

        Iterator<Character> it = set.iterator();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = it.next();
            }
        }
    }

    // Find character position
    static int[] findPos(char c) {
        if (c == 'J') c = 'I';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == c) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // ENCRYPTION
    static String encrypt(String text) {
        text = text.toUpperCase().replace("J", "I");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = (i + 1 < text.length()) ? text.charAt(i + 1) : 'X';

            if (a == b) {
                b = 'X';
                i--;
            }

            int[] p1 = findPos(a);
            int[] p2 = findPos(b);

            if (p1[0] == p2[0]) { // same row
                result.append(matrix[p1[0]][(p1[1] + 1) % 5]);
                result.append(matrix[p2[0]][(p2[1] + 1) % 5]);
            } 
            else if (p1[1] == p2[1]) { // same column
                result.append(matrix[(p1[0] + 1) % 5][p1[1]]);
                result.append(matrix[(p2[0] + 1) % 5][p2[1]]);
            } 
            else { // rectangle
                result.append(matrix[p1[0]][p2[1]]);
                result.append(matrix[p2[0]][p1[1]]);
            }
        }
        return result.toString();
    }

    // DECRYPTION
    static String decrypt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);

            int[] p1 = findPos(a);
            int[] p2 = findPos(b);

            if (p1[0] == p2[0]) { // same row
                result.append(matrix[p1[0]][(p1[1] + 4) % 5]);
                result.append(matrix[p2[0]][(p2[1] + 4) % 5]);
            } 
            else if (p1[1] == p2[1]) { // same column
                result.append(matrix[(p1[0] + 4) % 5][p1[1]]);
                result.append(matrix[(p2[0] + 4) % 5][p2[1]]);
            } 
            else { // rectangle
                result.append(matrix[p1[0]][p2[1]]);
                result.append(matrix[p2[0]][p1[1]]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Key: ");
        String key = sc.nextLine();

        System.out.print("Enter Plain Text: ");
        String plaintext = sc.nextLine();

        generateMatrix(key);

        System.out.println("\nKey Matrix:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        String cipherText = encrypt(plaintext);
        System.out.println("\nEncrypted Text: " + cipherText);

        String decryptedText = decrypt(cipherText);
        System.out.println("Decrypted Text: " + decryptedText);

        sc.close();
    }
}
 
