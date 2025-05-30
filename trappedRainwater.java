import java.util.Scanner;

public class trappedRainwater {

    public static int printTrappedRainwater(int arr[]){

        // for minimum 2 walls to trapped water
        if(arr.length < 3) System.out.println("No water Tapped");

        // for finding maximum from left site
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        
        // for finding maximum from right site
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        // for finding lowest length wall from left and right and subtract it from waterLevel 

        int trappedWater = 0;

        for(int i=0;i<arr.length;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(printTrappedRainwater(arr));
    }
}