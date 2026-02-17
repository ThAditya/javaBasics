import java.util.Scanner;

public class OrderOFArrays {

    public static int[] mergeArrays(int[] arr, int arr1[]) {
        
        int temp[] = new int[arr.length + arr1.length];
        int L = arr[0], R = arr1[0], idx = 0;
        while(L <= arr.length || R <= arr1.length) {
            if(arr[L] < arr[R]){
                temp[idx] = arr[L];
                idx++;
                L++;
            }else{
                temp[idx] = arr[R];
                idx++;
                R++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int [] arr1 = new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println(mergeArrays(arr, arr1));
    }
}
