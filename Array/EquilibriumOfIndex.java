package Array;
import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumOfIndex {

    public static int retIndex(int[] arr){
        int total = Arrays.stream(arr).sum();
        int leftSum = 0;
        int res = -1;
        for(int i=0;i<arr.length;i++){
            int rightSum = total - leftSum - arr[i];

            if(leftSum == rightSum){
                res = i;
                break;
            }

            leftSum += arr[i];
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

        System.out.println(retIndex(arr));
    }
}