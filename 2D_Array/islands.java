import java.util.Scanner;

public class islands{

    public static int countIslands(int[][] arr, int n, int m){
        int count = 0;

        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                // if(arr[i][j] == 1 && )
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(countIslands(arr, n, m));
    }
}