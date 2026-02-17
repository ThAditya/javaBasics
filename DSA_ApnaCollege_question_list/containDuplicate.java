package DSA_ApnaCollege_question_list;

import java.util.Scanner;
import java.util.Arrays;

public class containDuplicate {

    public static boolean printDuplicate(int arr[]){
        // int temp = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     temp = arr[i];
        //     for(int j = i+1;j<arr.length;j++){
        //         if(temp == arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

                            //or


        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1] ){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(printDuplicate(arr));
    }
}
