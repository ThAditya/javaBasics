import java.util.Scanner;

public class tripletSum {

    public static void printTripletOutput(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                for (int k = 0; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] != 0){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printTripletOutput(arr);
    }
}
