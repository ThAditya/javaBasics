package Sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void printSelectionArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallEle = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallEle] < arr[j]  /* arr[smallEle] > arr[j] for ascending order */ ){
                    
                    smallEle = j;
                }
            }

            int temp = arr[smallEle];
            arr[smallEle] = arr[i];
            arr[i] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printSelectionArray(arr);
    }
}
