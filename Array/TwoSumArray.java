package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumArray {

    public static int[] SumIndices(int[] arr, int target){
        // // // // Brute force approach
        
        // int n = arr.length;
        // int temp[] = new int[2];
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         if(arr[i] + arr[j] == target){
        //             temp[0] = i;
        //             temp[1]= j;
        //         }
        //     }
        // }
        // return temp;
                    
        // // // // Using HashMap
                    
        int temp[] = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if(mp.containsKey(need)){
                temp[0] = mp.get(need);
                temp[1] = i;
                return temp; 
            }
            mp.put(arr[i], i);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = SumIndices(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
