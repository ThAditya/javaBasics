package Array;

import java.util.Scanner;

public class SearchInSortedRotatedArray {


    public static int printIdx(int arr[], int k){
        int lo = 0;
        int hi = arr.length;
        int mid = lo + (hi - lo)/2;

        for(int i=0;i<mid;i++){
            if(arr[i] == k){
                return i;
            }
        }
        for (int i = mid+1; i < arr.length; i++) {
            if(arr[i] == k){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(printIdx(arr, k));
    }
}
