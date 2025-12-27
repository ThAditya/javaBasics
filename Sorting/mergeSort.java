package Sorting;

import java.util.Scanner;

public class mergeSort {

    public static void printMergeArr(int arr[], int si, int ei){
        if(si == ei || si > ei){
            return;
        }
        int mid = si + (ei - si)/2;
        printMergeArr(arr, si, mid); // for solving left part 
        printMergeArr(arr, mid+1, ei); // for solving right part
        merge(arr, si, mid, ei);
    }

    public static void  merge(int arr[], int si, int mid, int ei){
        // if(arr[si]<mid)
        
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i]>arr[j]){
                temp[k] = arr[i];
                i++;k++;
            }else{
                temp[k] = arr[j];
                j++;k++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int si = arr[0];
        int ei = arr[arr.length-1];
        printMergeArr(arr,si,ei);
    }
}
