package Sorting;

import java.util.Scanner;

public class BubbleSort {
    // large elements come to the end of array by swapping with Adjacent elements

    public static void printBubbleSort(int[] arr){
        int swap = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            
        }
        if(swap == 0){
            System.out.println("Array is already Sorted");
        }else{
            for(int i=0;i<arr.length;i++){
                System.out.print(+arr[i] + " ");
            }
            System.out.println();
        }
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printBubbleSort(arr);
    }
}
