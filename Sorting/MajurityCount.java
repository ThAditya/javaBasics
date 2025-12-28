package Sorting;

import java.util.Scanner;

public class MajurityCount {

    // // // // // Brute force approch containing time complexity O(n^2)

    // public static int countEle(int[] arr, int n){
    //     int max = n/2;
    //     int count = 0;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }

    //         if(count > max){
    //             return arr[i];
    //         }
    //     }
    //     return -1;

    // }

    public static int countEle(int[] arr, int n, int si, int ei){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(countEle(arr,n, 0, n-1));
    }
}
