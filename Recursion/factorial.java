package Recursion;

import java.util.Scanner;

public class factorial {

    public static int printFact(int n){
        if(n==1){
            return 1;
        }
        return n*printFact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((printFact(n)));
    }
}
