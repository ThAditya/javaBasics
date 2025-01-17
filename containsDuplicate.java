import java.util.Arrays;
import java.util.Scanner;

public class containsDuplicate {

    public static boolean printDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Integers:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Does Array contains Duplicate value: " +printDuplicate(arr));
    }
}
