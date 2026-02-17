import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("length of the Rows: ");
        int n = sc.nextInt(); // input number of elements in the array as Rows
        System.out.println("length of the Columns: ");
        int m = sc.nextInt(); // input number of elements in the array as Columns
        System.out.println("Elements of the Rows and Columns: ");
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array in the form of Matrix: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
