package Sorting;

import java.util.Scanner;

public class MajorityCount {

    // // // // // Brute force approch containing time complexity O(n^2)

    // public static int countEle(int[] arr, int n){
    //     int max = n/2;
    //     int count = 0;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }

    //         if(count > max){
    //             return arr[i];
    //         }
    //     }
    //     return -1;

    // }
    
    // // // // // for time complexity O(n*logn);

    // count the element which are coming from left or right side for finding majority of any element
    private static int countMajorEle(int arr[], int num, int si, int ei){
        int count = 0;
        for(int i = si; i <= ei;i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }


    // breakdown element then count its appearence

    private static int majorityElementRec(int arr[], int si, int ei){
        // if size = 1 then si is number
        if(si == ei){
            return arr[si];
        }

        // find medium 
        int mid = si+(ei- si)/2;

        // check from left side from si to mid
        int left = majorityElementRec(arr, si, mid);
        int right = majorityElementRec(arr, mid+1, ei); //        // check from left side from si to mid

        // if the two halves agree on the majorityelement, return it.

        if(left == right){
            return left;
        }

        // otherwise, count each element and returnthe "winner".
        int countLeft = countMajorEle(arr, left, si, ei);
        int countRight = countMajorEle(arr, right, si, ei);

        return countLeft > countRight ? left : right;
    }

    public static int countEle(int[] arr){
        return majorityElementRec(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(countEle(arr));
    }
}
