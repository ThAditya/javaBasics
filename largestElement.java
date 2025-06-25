import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        
        
        //// Second largest
        int SecondMax = Integer.MIN_VALUE;
        // int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if((arr[i] > SecondMax) && (arr[i] != max)){
                SecondMax = arr[i];
            }
        }
        System.out.println("largest element is: "+SecondMax);
    }
}
