package BitManipulation;

import java.util.Scanner;

public class powerOrNot {

public static boolean power(int n){
    // int bitMask = (~n);
    return (n & (n-1))==0;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(n));
    }
}
