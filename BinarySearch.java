
import java.util.Scanner;

public class BinarySearch {

    public static void Searching(int arr1[], int key) {
        int start = 0;
        int end = arr1.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr1[mid] == key) {
                System.out.println("Element is present at index " + mid);
            } else if (arr1[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
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

        System.out.println("key value: ");
        int key = sc.nextInt();

        Searching(arr1, key);
    }
}
