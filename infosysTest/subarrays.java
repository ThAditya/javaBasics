package infosysTest;

import java.util.Scanner;

public class subarrays {

    public static void sumOfSubArray(int arr[], int n){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            sum += arr[i];
            for(int j=i+2;j<n;j++){
                sum += arr[j];
                for(int k=i;k<=j;k++){
                }
                System.out.println(sum);
            }
        }

        // if(maxSum < sum){
        //     maxSum = sum;
        // }

        // return maxSum;
    }

    public static int countSubArray(int[] arr, int n){

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                int sum = 0;
    
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum % 2 == 0) {
                        cnt++;
                    }
                }
    
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(countSubArray(arr, n));
        // System.out.println(sumOfSubArray(arr, n));
        sumOfSubArray(arr, n);
    }
}
