package Recursion;

import java.util.Scanner;

public class convertIntToString {

    static String dig[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int n){
        if(n == 0) return;

        int LastDig = n%10;
        printDigits(n/10);
        System.out.print(dig[LastDig] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);
    }
}
