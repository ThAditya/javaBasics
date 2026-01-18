import java.util.Scanner;

public class kadanesAlgo {

    // public static int printMax(int arr[]){
    //     int maxSum = Integer.MIN_VALUE;
    //     int currSum = 0;
    //     // for(int i=0;i<arr.length;i++){
    //     //     currSum = currSum + arr[i];
    //     //     if(currSum < 0){
    //     //         currSum = 0;
    //     //     }
    //     //     maxSum = Math.max(currSum, maxSum);
    //     // }
    //     // return maxSum;


    //     //For taking minimum value from all negative input numbers

    //     for(int i=0;i<arr.length;i++){
    //         currSum = currSum + arr[i];
    //         maxSum = Math.max(currSum, maxSum);
    //     }
    //     return maxSum;
    // }

    public static int printMax(int arr[]){
        int n = arr.length,res = arr[0];
        int maxEnd = arr[0];
        for(int i=1;i<n;i++){

            maxEnd = Math.max(arr[i], maxEnd + arr[i]);

            res = Math.max(res, maxEnd);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println(printMax(arr));
    }
}
