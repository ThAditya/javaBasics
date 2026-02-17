package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {

    public static int[] printInsertionArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            int currEle = arr[i];
            int prevEle = i-1;

            while(prevEle >= 0 && arr[prevEle] > currEle){
                arr[prevEle + 1] = arr[prevEle];
                prevEle--;
            }

            arr[prevEle + 1] = currEle;
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

        int res[] = printInsertionArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
