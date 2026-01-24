package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class DutchAlgorithm {

    public static int[] SortedArr(int[] arr){
        int lo = 0, mid = 0, hi = arr.length-1;
        while(mid <= hi){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                mid++;
                lo++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--; 
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = SortedArr(arr); 
        System.out.println(Arrays.toString(res));
    }
}
