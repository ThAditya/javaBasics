import java.util.Scanner;

public class SpiralMatrix {

    public static void spiralMatrix(int[][] arr){
        int startRow =0, endRow = arr.length-1;
        int startCol =0, endCol = arr.length-1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of row: ");
        int n = sc..nextInt();
        System.out.println("Length of column: ");
        int m = sc..nextInt();

        System.out.println("Elements of Array: ");
        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        spiralMatrix(arr);
    }
}
