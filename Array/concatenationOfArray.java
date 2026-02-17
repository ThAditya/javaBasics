package Array;

import java.util.Arrays;
import java.util.Scanner;

public class concatenationOfArray{

    public static int[] getConcatenate(int[] arr){
        int n = arr.length;
        int temp[] = new int[2*n];
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
            temp[i+n] = arr[i];
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

        int res[] = getConcatenate(arr);
        System.out.println(Arrays.toString(res));

    }
}