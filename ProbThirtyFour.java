
// 34. Find First and Last Position of Element in Sorted Array
import java.util.Arrays;
import java.util.Scanner; // Import for potential debugging

public class ProbThirtyFour {

    public static int[] findFirstAndLastPosition(int[] nums, int target) {
        int[] arr = new int[2];
        int lb = 0;
        int hb = nums.length - 1;
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        while (lb < hb) {
            int mid = lb + (hb - lb) / 2;
            if (nums[mid] < target) {
                lb = mid + 1;
            } else {
                hb = mid;
            }

        }
        if (nums[lb] != target) {
            return new int[]{-1, -1};
        }

        arr[0] = lb;
        hb = nums.length;

        while (lb < hb) {
            int mid = lb + (hb - lb) / 2;

            if (nums[mid] <= target) {
                lb = mid + 1;
            } else {
                hb = mid;
            }
        }

        arr[1] = lb - 1;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numbers length: ");
        int n = sc.nextInt();
        System.out.println("numbers of array");
        int[] nums = new int[n]; // Example array with multiple occurrences
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        System.out.println("target:  ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(findFirstAndLastPosition(nums, target)));
    }
}
