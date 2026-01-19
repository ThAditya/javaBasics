package Array;

import java.util.Scanner;

public class SubArraySumEqualsToK {

    public static int printMax(int arr[], int k){
        int n = arr.length;
        int res = 0, cnt=0;
        int prefSum = 0;
        int prefarr[] = new int[n];
        for(int i=0;i<n;i++){
            prefSum += arr[i];
            prefarr[i] = prefSum;
        }
        int currSum = arr[0];
        for(int i=0;i<n;i++){
            for(int j = i ; j< n; j++){
                currSum = prefarr[j] - (i > 0 ? prefarr[i-1] : 0);
                if (currSum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(printMax(arr, k));
    }
}
