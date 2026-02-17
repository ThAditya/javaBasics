import java.util.ArrayList;
import java.util.Scanner;

public class BalanceTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        if (n % 2 == 0) {
            int sumLeft = 0;
            for (int i = 0; i < n / 2; i++) {
                sumLeft += list.get(i);
            }
            int sumRight = 0;
            for (int i = n / 2; i < n; i++) {
                sumRight += list.get(i);
            }

            if(sumLeft>sumRight){
                System.out.println(sumLeft - sumRight);
            }else if(sumLeft < sumRight){
                System.out.println(sumRight - sumLeft);
            }else{
                System.out.println(0);
            }
        }else{
            System.out.println("Invalid input size");
        }
    }
}
