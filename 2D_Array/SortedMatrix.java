import java.util.Scanner;

public class SortedMatrix {

    public static boolean findKey(int[][] arr, int key){
        
        //Brute force approach with nested loops and Time complexity is O(n^2)
        
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(arr[i][j] == key){
        //             System.out.println("Element is present at index: " + i + "," + j);
        //             return true;     
        //          }
        //     }
        // }


        //Optimized approach with Binary Search and Time complexity is O(nlogn)

        //From uppercorner

        // int row = 0, col = arr[0].length-1;

        // while(row < arr.length && col >= 0 ){
        //     if(arr[row][col] == key){
        //         System.out.println("Element found at Index: " + row + "," + col);
        //         return true;
        //     }

        //     else if(key <arr[row][col]){
        //         col--;
        //     }else{
        //         row++;
        //     }
            
        // }


        // From lower corner

        int row = arr.length - 1, col = 0;
while (row >= 0 && col < arr[0].length) {
    if (arr[row][col] == key) {
        System.out.println("Element found at Index: " + row + "," + col);
        return true;
    } else if (key < arr[row][col]) {
        row--;  // move up if key is smaller
    } else {
        col++;  // move right if key is larger
    }
}

System.out.println("Element Not Found!!");
return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows: ");
        int n = sc.nextInt();
        System.out.println("Columns: ");
        int m = sc.nextInt();

        System.out.println("Elements: ");
        int arr[][] = new int[n][m] ;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Key to find");
        int key = sc.nextInt();

        findKey(arr, key);
    }
}
