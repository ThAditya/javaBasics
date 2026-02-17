package Recursion;

import java.util.Scanner;

public class SumFirstNaturalNum {

    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        return n+printSum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
    
}
