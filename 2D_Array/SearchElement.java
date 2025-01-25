import java.util.Scanner;


public class SearchElement {

    public static boolean Search(int arr[][], int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==key){
                    System.out.println("Key found at indexes of Matrixes (" + i + ", " + j + ")" );
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
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

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();


        System.out.println(Search(arr, key));
    }
}
