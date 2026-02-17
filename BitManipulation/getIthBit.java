package BitManipulation;

import java.util.Scanner;

public class getIthBit {
    public static int ithBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) !=0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(ithBit(n, i));
    }
}
