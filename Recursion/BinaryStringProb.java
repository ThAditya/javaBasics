package Recursion;

import java.util.Scanner;

public class BinaryStringProb {

    public static void binString(int n, int Lp, String sb){
        if(n == 0){
            System.out.println(sb);
            return;
        }
        binString(n-1, 0, sb+"0");
        if(Lp == 0){
            binString(n-1, 1, sb+"1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Lp = 0;
        String sb = new String();
        binString(n, Lp, sb);
    }
}
