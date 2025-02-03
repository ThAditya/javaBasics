import java.util.Scanner;

public class SpiralMatrix {

    public static void spiralMatrix(int[][] arr){
        int sRow =0, endRow = arr.length-1;
        int sCol =0, endCol = arr.length-1;

        //top

        for(int i=sCol;i<endCol;i++){
            System.out.println(arr[sRow][i]);
        }

        //right
        for(int i=sRow+1;i<endRow;i++){
            System.out.println(arr[i][endCol]);
        }

        //bottom
        for(int i=endCol-1 ;i>=sCol;i--){
            System.out.println(arr[endRow][i]);
        }

        // left
        for(int i=sCol;i<endCol;i++){
            System.out.println(arr[sRow][i]);
        }
        
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
