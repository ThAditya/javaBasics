package DSA_ApnaCollege_question_list;

import java.util.Arrays;
import java.util.Scanner;

public class chocolateDistribution {

    public static int printDistribution(int arr[] , int m){
        Arrays.sort(arr);
        int max = Integer.MAX_VALUE;
        if(arr.length <= m){
            return 1;
        }
        for(int i=0;i<arr.length - m +1;i++){
            int minEle = arr[i];
            int maxEle = arr[i+m-1];

            max = Math.min(max, maxEle - minEle);
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(printDistribution(arr, m));
    }
}
