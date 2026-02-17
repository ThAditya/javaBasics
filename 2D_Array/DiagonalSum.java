import java.util.Scanner;

public class DiagonalSum {

    public static void printDiagonalSum(int[][] arr){

        int sum = 0;
        int sum1 = 0;


        //Brute Force Approach with Time Complexity is O(n^2)

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i == j){
        //             sum += arr[i][j];
        //         }

        //         if(i + j == arr.length-1){
        //             sum1 += arr[i][j];
        //         }
        //     }
        // }

        // Optimized Approach with Time Complexity is O(n)

        for(int i=0;i<arr.length;i++){
            //Sum of 1st Diagonal
            sum += arr[i][i];

            // Sum of 2nd Diagonal

            if(i != arr.length-i-1) sum1 += arr[i][arr.length-i-1];
        }

        int total = sum + sum1;
        System.out.println("Total: " + total + ", sum of 1st Diagonal: " + sum + ", sum of 2nd Diagonal: " + sum1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printDiagonalSum(arr);
    }
}
