package Array;

import java.util.Arrays;
import java.util.Scanner;

public class chocalateDistribution {

    public static int minDistribution(int[] arr, int n,int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n-m;i++){
            int diff = arr[m-1+i] - arr[i];
            if(min > diff){
                min = diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(minDistribution(arr, n, m));
    }
}
