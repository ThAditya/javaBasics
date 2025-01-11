package DSA_ApnaCollege_question_list;

import java.util.Scanner;

public class MaxSumArray {

    public static int printMaxArray(int[] arr){
        int sum =0, max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum = sum + arr[k];
                } 
                if(max<sum) max = sum;   
            }
            sum = 0;
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(printMaxArray(arr));
    }
}
