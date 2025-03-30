
import java.util.*;

public class MaxSubArraySumI {

    public static void printSubArraysSum(int num[]) {
        int count = 0, sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            sum = 0;
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + ", ");
                    sum += num[k];
                }
                System.out.println();
                count++;
            }
            System.out.println("Sum : " + sum);
            if (min > sum)
                min = sum;
            if (max < sum)
                max = sum;
        }

        System.out.println("Total: " + count + " Max: " + max + " Min: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length:");
        int n = sc.nextInt();
        System.out.println("Elements: ");
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        printSubArraysSum(num);
    }
}
