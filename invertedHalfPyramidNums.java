
import java.util.Scanner;

public class invertedHalfPyramidNums {

    public static void invHalfPymNms(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        invHalfPymNms(n);
    }
}
