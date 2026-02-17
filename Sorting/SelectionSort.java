package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort{

    public static int[] ascSort(int arr[]){
      
        for (int i = 0; i < arr.length; i++) {
            int midIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[midIdx] > arr[j]){
                    midIdx = j;
                }
            }

            int temp = arr[midIdx];
            arr[midIdx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = ascSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}