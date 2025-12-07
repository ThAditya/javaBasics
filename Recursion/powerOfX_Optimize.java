package Recursion;

import java.util.Scanner;

public class powerOfX_Optimize {

    public static int pow(int x, int n){
        if(n == 1) return x;
        int half = pow(x, n/2);
        int halfPow =  half*half;
        if(n%2 != 0) return a*halfPow;
        return halfPow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(x,n));
    }
}
