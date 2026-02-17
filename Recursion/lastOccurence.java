package Recursion;

import java.util.Scanner;

public class lastOccurence {

    public static int lastOccur(int[] arr, int k, int i){
        if(i == arr.length) return -1;
        int isFound = lastOccur(arr, k, i+1);
        if(isFound != -1) return isFound;

        if(arr[i] == k) return i;

        return isFound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int i=0;
        System.out.println(lastOccur(arr, k, i));
    }
}
