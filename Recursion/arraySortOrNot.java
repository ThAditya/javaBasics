package Recursion;

import java.util.Scanner;

public class arraySortOrNot {
    // For Ascending order
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1) return true;
        if(arr[i]> arr[i+1]) return false;

        return isSorted(arr, i+1);
    }

    // For Descending Order
    public static boolean isSortedDES(int arr[], int i){
        if(i == arr.length-1) return true;
        if(arr[i] > arr[i+1]) return false;

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        // System.out.println(isSorted(arr, i));
        System.out.println(isSortedDES(arr, i));
    }
}
