package Recursion;

import java.util.Scanner;

public class elementOcurrence {

    public static void findIndices(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }

        if (key == arr[i]) {
            System.out.print(i + " ");
        }
        findIndices(arr, key, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt(), i = 0;
        findIndices(arr, key, i);

    }
}
