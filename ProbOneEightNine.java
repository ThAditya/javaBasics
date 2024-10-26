// 189. Rotate Array

import java.util.Scanner;

public class ProbOneEightNine {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array: ");
        int n = sc.nextInt();
        System.out.println("Elements of array: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("value of k:");
        int k = sc.nextInt();

        ProbOneEightNine obj = new ProbOneEightNine();
        obj.rotate(nums, k);

        // Print the rotated array (outside the rotate function)
        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

}
