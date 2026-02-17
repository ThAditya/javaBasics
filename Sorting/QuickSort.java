package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSorting(int arr[],int si, int ei){
        if(si >= ei){
            return;
        }
        int pivotIdx = partition(arr, si, ei);

        quickSorting(arr, si, pivotIdx-1);   //left smaller elements from pivot

        quickSorting(arr, pivotIdx+1, ei);  //right greater elements from pivot

    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        // int j = arr[si];
        // while(si < ei){
        //     if(arr[si] < pivot){
        //         i++;
        //         int temp = arr[si];
        //         arr[si] = arr[i];
        //         arr[i] = temp;
        //     }
        //     si++;
        // }

        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        quickSorting(arr,0,n-1);
        printArr(arr);
    }
}
