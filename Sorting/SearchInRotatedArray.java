package Sorting;

import java.util.Scanner;

public class SearchInRotatedArray {

    public static int findIdx(int arr[], int target, int si, int ei){
        if(si > ei) return -1 ;

        int mid = si + (ei - si)/2;
        // CASE FOUND
        if(arr[mid] == target) return mid;

        // MID ON LINE 1
        if(arr[si] <= arr[mid]){

            //CASE A: WHEN TARGET LIE IN LINE 1 IN BETWEEN STARTING INDEX AND MID
            if(arr[si] <= target && target <= arr[mid]){
                return findIdx(arr, target, si, mid-1);
            }
            
            //CASE B: WHEN TARGET LIE IN LINE 1 IN BETWEEN MID AND ENDING INDEX
            else{
                return findIdx(arr, target, mid+1, ei);
            }
        }
        
        // MID ON LINE 2
        else{
            
            //CASE A: WHEN TARGET LIE IN LINE 2 IN BETWEEN MID AND ENDING INDEX
            if(arr[mid] <= target && target <= arr[ei]){
                return findIdx(arr, target, mid+1, ei);
            }
            
            //CASE B: WHEN TARGET LIE IN LINE 2 IN BETWEEN STARTING INDEX AND MID
            else{
                return findIdx(arr, target, si, mid-1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(findIdx(arr, target, 0, n-1));
    }
}
