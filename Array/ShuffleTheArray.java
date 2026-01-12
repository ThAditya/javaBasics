package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {

    public static int[] shuffled(int[] arr, int n){
        int temp[] = new int[arr.length];
        int j = m;
        for (int i = 0; i < m; i++) {
            temp[2*i] = arr[i];
            temp[2*i-1] = arr[j];
            j++;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[2*n];
        for(int i=0;i<2*n;i++){
            arr[i] = sc.nextInt();
        }
        // int m = sc.nextInt();
        int res = shuffled(arr, n);
        System.out.println(Arrays.toString(res));
    }
}
