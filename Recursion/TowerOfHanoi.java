package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void countWays(int n, String src, String help, String des){
        if(n == 1){
            System.out.println("transfer disk" + n + "from"+ src + "to" + des);
            return;
        }
        countWays(n-1, src, des, help);
        System.out.println("transfer disk" + n + "from"+ src + "to" + des);
        countWays(n-1, help, src, des);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countWays(n, "A", "B", "C");
    }
}
