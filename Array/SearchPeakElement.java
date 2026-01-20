package Array;

import java.util.Scanner;

public class SearchPeakElement {

    public static int searchIdx(int arr[], int n){
        int lo = 1;
        int hi = n-2;
    
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
    
            if(arr[mid] > arr[mid+1] && arr[mid]> arr[mid-1]){
                return mid;
            }
    
            if(arr[mid] < arr[mid + 1]) lo = mid +1;
    
            else hi = mid -1 ;
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

        System.out.println(searchIdx(arr, n));
    }
}
