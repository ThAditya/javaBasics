package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayAlternatly {

    public static int[] rearrangeArr(int[] arr){
        int lo = 0,  hi = arr.length-1, k=0;
        int mid = lo+(hi-lo)/2;
        int temp[] = new int[arr.length];
        
        while(lo <= hi){
            temp[k++] = arr[hi--];
            temp[k++] = arr[lo++];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = rearrangeArr(arr); 
        System.out.println(Arrays.toString(res));
    }
}
