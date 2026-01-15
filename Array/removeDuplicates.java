package Array;

import java.util.Scanner;

public class removeDuplicates {

    public static int remDupl(int arr[]){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = remDupl(arr);
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
