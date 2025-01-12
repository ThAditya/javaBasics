import java.util.Scanner;

public class kadanesAlgo {

    public static int printMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if(sum < 0) sum = 0;
            max = Math.max(sum, max);

        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println(printMax(arr));
    }
}
