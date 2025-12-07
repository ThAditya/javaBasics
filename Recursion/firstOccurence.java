package Recursion;

import java.util.Scanner;

public class firstOccurence {

    public static int firstOccur(int[] arr,int k, int i){
        if(k == arr[i]) return i;

        if(i == arr.length-1) return -1;
        
        return firstOccur(arr, k, i+1);
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
        System.out.println(firstOccur(arr, k, i));
    }
}
