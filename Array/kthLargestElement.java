// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Scanner;

// public class kthLargestElement{

//     public static int[] getArrayElements(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number of Elements");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<n ; i++){
//             arr[i] = sc.nextInt();
//         }
//         return arr;
//     }

//     public static int[] sortarray(int arr[]){
//         Arrays.sort(arr);
//         //(arr, Collections.reverseOrder());
//          return arr;
//     }
//     public static void display(int arr[]){
//         Arrays.stream(arr)
//         .forEach(System.out::println);
//     }

//     public static void main(String args[]){
        
// //        int arr[] = getArrayElements();
//         int arr[] = new int[]{23,325,345,34,53,23};
//         arr = sortarray(arr);
//         display(arr);
//     }
// }