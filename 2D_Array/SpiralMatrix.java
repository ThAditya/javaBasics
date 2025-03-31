import java.util.Scanner;

public class SpiralMatrix {

    public static void spiralMatrix(int[][] arr){
        int startRow = 0, EndRow = arr.length-1;
        int startCol = 0, EndCol = arr.length-1;

        while(startRow <= EndRow && startCol <= EndCol){
            //top
            for(int j=startCol;j<=EndCol;j++){
                System.out.print(arr[startRow][j] + " ");
            }

            // right
            for(int i=startRow+1;i<=EndRow;i++){
                System.out.print(arr[i][EndCol]+" ");
            }

            //bottom
            for(int j=EndCol-1;j>=startCol;j--){
                if(startRow == EndRow) break;
                System.out.print(arr[EndRow][j]+" ");
            }

            //left
            for(int i=EndRow-1;i>startRow;i--){
                if(startCol==EndCol) break;
                System.out.print(arr[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            EndCol--;
            EndRow--;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of row: ");
        int n = sc.nextInt();
        System.out.println("Length of column: ");
        int m = sc.nextInt();

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
