package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {

    public static int[] printArr(int arr[]){
        int n = arr.length;
        int sum[] = new int[n], cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            sum[i] = cnt;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = printArr(arr);
        System.out.println(Arrays.toString(res));
    }
}
