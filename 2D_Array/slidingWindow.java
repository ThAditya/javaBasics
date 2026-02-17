import java.util.ArrayList;
import java.util.Scanner;

public class slidingWindow{

    public static void subArray(int[] arr, int n, int k){
        int s = 0;
        int e = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while(e<n){
            int currWindowSize = e-s+1;
            al.add(arr[e]);
            if(currWindowSize<k) e++;

            else if(currWindowSize == k){
                System.out.println(al);
                al.remove(0);
                s++;
                e++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        subArray(arr,n,k);
    }
}