package DSA_ApnaCollege_question_list;

import java.util.Scanner;

public class PreffixMaxSumArray {

    public static int printPrefixSum(int[] arr) {
        
        int max = Integer.MIN_VALUE, sum = 0;
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];

        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];     
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i == 0){
                    sum = prefixSum[j];
                }else{
                    sum = prefixSum[j] - prefixSum[i-1];
                }

                if(max < sum) max = sum;
            }
        }
        return max;
    
        
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(printPrefixSum(arr));
    }
}
