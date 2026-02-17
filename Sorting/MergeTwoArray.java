package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

    public static int[] SortedArr(int arr1[], int arr2[]){
        int temp[] = new int[arr1.length + arr2.length]; 
        int i = 0, j = 0, k = 0;
        while(i<arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                temp[k] = arr1[i];
                i++;
            }else{
                temp[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length){
            temp[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            temp[k] = arr2[j];
            j++;
            k++;
        }

        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[]= new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[]= new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        int res[] = SortedArr(arr1, arr2); 
        System.out.println(Arrays.toString(res));
    }
}
