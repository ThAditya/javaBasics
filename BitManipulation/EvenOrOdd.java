package BitManipulation;

import java.util.*;

public class EvenOrOdd {
    public static void isEvenOrOdd(int n){
        if((n & 1) == 0){
            System.out.println(n + " is Even");
        }else{
            System.out.println(n + " is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEvenOrOdd(n);   
    }
}
