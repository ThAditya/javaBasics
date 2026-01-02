package Array;

import java.util.Scanner;

public class PlusOneDigit {

    public static int[] plusOne(int []arr, int n){
        for(int i=n-1;i>=0;i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int result[] = new int[n+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(plusOne(arr, n));
    }
}
