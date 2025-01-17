package Sorting;

import java.util.Scanner;

public class insertionSort {

    public static void printInsertionArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            int currEle = arr[i];
           int prevEle = i-1;

           while(prevEle >= 0 && arr[prevEle] > currEle){
                arr[prevEle + 1] = arr[prevEle];
                prevEle--;
           }

           arr[prevEle + 1] = currEle;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i] + " ");
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

        printInsertionArray(arr);
    }
}
