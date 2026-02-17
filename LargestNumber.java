
import java.util.*;

public class LargestNumber {

    public static int largestNumber(int[] arr1) {
        // int largest = key;
        // for (int i = 0; i < arr1.length; i++) {
        //     if (arr1[i] == largest) {
        //         return i;
        //     }
        // }
        // return -1;

        //                      Largest number
        // int largest = Integer.MIN_VALUE;
        // for (int i = 0; i < arr1.length; i++) {
        //     if (arr1[i] > largest) {
        //         largest = arr1[i];
        //     }
        // }
        // return largest;
        //                      Smallest number
        int Smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < Smallest) {
                Smallest = arr1[i];
            }
        }

        return Smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length: ");
        int n = sc.nextInt();
        System.out.println("Elements: ");
        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // System.out.println("Largest number is: " + largestNumber(arr1));
        System.out.println("Smallest number is: " + largestNumber(arr1));
    }
}
