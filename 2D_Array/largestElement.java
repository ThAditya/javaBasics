import java.util.Scanner;

public class largestElement {
    public static int maxElement(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum element is: ");
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of the Rows: ");
        int rows = sc.nextInt();
        System.out.println("length of the columns: ");
        int columns = sc.nextInt();

        System.out.println("Elements of the Rows and Columns: ");
        int arr[][] = new int[rows][columns];
        for(int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println(maxElement(arr));
    }
}
