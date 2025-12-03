package Recursion;

import java.util.Scanner;

public class decreaseNum {
    public static void printNUM(int n){
        if(n == 1) {
            System.out.println(n);
            return; 
        }
        System.out.print(n+" ");
        printNUM(n-1);
    }
    public static void increaseNum(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increaseNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNUM(n);
        increaseNum(n);
    }
}
