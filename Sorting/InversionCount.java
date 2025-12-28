package Sorting;

import java.util.Scanner;

public class InversionCount {

    // // // // // Brute force approach with time complexity of O(n^2);

    // public static int invCount(int[] arr){
    //     int count=0;
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]> arr[j]){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    

    public static int merge(int arr[], int si, int mid, int ei){
        int i= si, j= mid, k = 0, count=0;
        int temp[] = new int[(ei - si + 1)];

        while(i < mid && j <= ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                count += (mid-i);
                j++;
            }
            k++;
        }

        while(i< mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        while(j <= ei){
            temp[k] = arr[j];
            k++;
            j++;
        }
        for(i = si, k=0; i <= ei; i++, k++){
            arr[i] = temp[k];
        }
        return count;
    }

    public static int mergeSort(int arr[], int si, int ei){
        int Count = 0;

        if(ei > si){
            int mid = (si + ei)/2;
            Count = mergeSort(arr, si, mid);
            Count += mergeSort(arr, mid+1, ei);
            Count += merge(arr, si, mid+1, ei);
        }
        return Count;
    }

    public static int invCount(int arr[]){
        int n = arr.length;
        return mergeSort(arr, 0, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(invCount(arr));
    }
}
