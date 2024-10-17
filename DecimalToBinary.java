
import java.util.Scanner;

public class DecimalToBinary {

    static int rem = 0;
    static int pow = 0;
    static int binary = 0;

    public static void decToBin(int n) {
        while (n > 0) {
            rem = n % 2;
            binary = (int) (binary + (rem * Math.pow(10, pow)));
            pow++;
            n = n / 2;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBin(n);
    }
}
