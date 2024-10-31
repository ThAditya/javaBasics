
import java.util.Scanner;

public class LinearSearch {

    public static int LinearSearching(int arr1[], int key) {
        if (key == 0) {
            return -1;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == key) {
                return i;
            }
        }
        return -1;
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

        System.out.println(LinearSearching(arr1, key));

    }
}
