package Sorting;

import java.util.Scanner;

public class MergeSortString {


    public static String[] mergeSort(String arr[], int si, int ei){
        if(si == ei){ 
            String[] A = { arr[si] };
            return A;
        }
        int mid = si + (ei - si)/2;
        String arr1[] =  mergeSort(arr, si, mid);
        String arr2[] = mergeSort(arr, mid+1, ei);
        
        return merge(arr1, arr2);
    }

    public static String[] merge(String[] arr1, String arr2[]){
        int m = arr1.length;
        int n = arr2.length;

        String arr3[] = new String[m+n];
        int idx =0, i=0, j = 0;

        while(i < m && j < n){
            if(isAlphabetically(arr1[i], arr2[j])){
                arr3[idx] = arr1[i];
                i++;
            }else{
                arr3[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        while(i < m){
            arr3[idx] = arr1[i];
            idx++;
            i++;
        }

        while(j < n){
            arr3[idx] = arr2[j];
            idx++;
            j++;
        }
        return arr3;
    }

    public static boolean isAlphabetically(String arr1, String arr2){
        if(arr1.compareTo(arr2)<0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        String[] a = mergeSort(arr, 0, n-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
