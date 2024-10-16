
import java.util.Scanner;

public class PrimeNum {

    // public static boolean prime(int n) {
    //     boolean flag = true;
    //     if (n < 1) {
    //         flag = false;
    //     }
    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             flag = false;
    //             break;
    //         }
    //     }
    //     return flag;
    // }
    //////////    or

    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(prime(n)); // This will not print anything because the function is not returning anything

    }
}
