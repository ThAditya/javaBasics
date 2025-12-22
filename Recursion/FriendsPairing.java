package Recursion;

import java.util.Scanner;

public class FriendsPairing {

    public static int pairingWays(int n){
        if(n == 1 || n == 2){
            return n;
        }

        return pairingWays(n-1) + pairingWays(n-2)*(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pairingWays(n));
    }
}
