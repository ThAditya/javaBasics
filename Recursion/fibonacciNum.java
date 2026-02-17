package Recursion;

import java.util.Scanner;

public class fibonacciNum {

    public static void fibNUM(int n, int a, int b){
        if(n==0 || n==1){
            System.out.println(n);
            return;
        }
        a = b;
        b = fib(n-1) + fib(n-2);
        System.out.println(a);
    }

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(fib(n));
        fibNUM(n, a, b);
    }
}
