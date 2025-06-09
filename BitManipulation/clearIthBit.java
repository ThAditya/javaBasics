package BitManipulation;

import java.util.Scanner;

public class clearIthBit {

    public static int deleteIthBit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(deleteIthBit(n, i));
    }
}
