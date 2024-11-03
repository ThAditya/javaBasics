
import java.util.Scanner;

public class ReverseAnArray {

    public static void ReverseArray(int[] arr1) {
        int i = 0;
        int j = arr1.length - 1;
        int temp = 0;
        while (i < j) {
            temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i++;
            j--;
        }

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

        ReverseArray(arr1);
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + " ");
        }
        System.out.println();
    }
}
