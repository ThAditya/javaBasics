package BitManipulation;

import java.util.Scanner;

public class updateIthBit {

    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask= ~(1 << i );
        return n & bitMask;
    }

    public static int updationInBit(int n, int i, int newBit){
        if(newBit == 1){
            return setIthBit(n, i);
        }
        return clearIthBit(n, i);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int newBit = sc.nextInt();
        System.out.println(updationInBit(n, i, newBit));
    }
}
