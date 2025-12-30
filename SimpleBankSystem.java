import java.util.Scanner;

public class SimpleBankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] balance = new Long[n];
        for(int i=0; i<n;i++){
            balance[i] = sc.nextLong();
        }

    }
}
