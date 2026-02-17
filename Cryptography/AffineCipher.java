import java.util.Scanner;

public class AffineCipher {

    // Convert char to number
    static int charToInt(char c) {
        return c - 'A';
    }

    // Convert number to char
    static char intToChar(int n) {
        return (char) (n + 'A');
    }

    // GCD function
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Find modular inverse of a under mod 26
    static int modInverse(int a) {
        for (int i = 1; i < 26; i++) {
            if ((a * i) % 26 == 1)
                return i;
        }
        return -1;
    }

    // ================= ENCRYPTION =================
    static String encrypt(String text, int a, int b) {
        text = text.toUpperCase();
        StringBuilder result = new StringBuilder();

        if (gcd(a, 26) != 1) {
            return "Invalid key 'a'. gcd(a,26) must be 1.";
        }

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                int x = charToInt(ch);
                int cipher = (a * x + b) % 26;
                result.append(intToChar(cipher));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // ================= DECRYPTION =================
    static String decrypt(String cipher, int a, int b) {
        cipher = cipher.toUpperCase();
        StringBuilder result = new StringBuilder();

        int a_inv = modInverse(a);
        if (a_inv == -1) {
            return "No modular inverse exists.";
        }

        for (char ch : cipher.toCharArray()) {
            if (Character.isLetter(ch)) {
                int y = charToInt(ch);
                int plain = (a_inv * (y - b + 26)) % 26;
                result.append(intToChar(plain));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // ================= BRUTE FORCE =================
    static void bruteForce(String cipher) {
        int[] validA = {1,3,5,7,9,11,15,17,19,21,23,25};

        for (int a : validA) {
            for (int b = 0; b < 26; b++) {
                System.out.println("a=" + a + " b=" + b + 
                    " -> " + decrypt(cipher, a, b));
            }
        }
    }

    // ================= MAIN MENU =================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== AFFINE CIPHER =====");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Brute Force");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    System.out.print("Enter key a: ");
                    int a = sc.nextInt();
                    System.out.print("Enter key b: ");
                    int b = sc.nextInt();
                    System.out.println("Encrypted: " + encrypt(text, a, b));
                    break;

                case 2:
                    System.out.print("Enter cipher: ");
                    String cipher = sc.nextLine();
                    System.out.print("Enter key a: ");
                    int da = sc.nextInt();
                    System.out.print("Enter key b: ");
                    int db = sc.nextInt();
                    System.out.println("Decrypted: " + decrypt(cipher, da, db));
                    break;

                case 3:
                    System.out.print("Enter cipher: ");
                    String brute = sc.nextLine();
                    bruteForce(brute);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
