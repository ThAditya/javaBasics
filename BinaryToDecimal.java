
import java.util.Scanner;

public class BinaryToDecimal {

    public static void binDec(int n) {
        int power = 0;
        int LD = 0;
        int decimal = 0;

        for (int i = n; i > 0; i--) {
            LD = n % 10;
            decimal = (int) (decimal + (LD * Math.pow(2, power)));
            power++;
            n = n / 10;
        }
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binDec(n);
    }
}
