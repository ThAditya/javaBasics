package codeforceQuestions;

import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextInt();
            long m = sc.nextInt();
            long mv = ((m-(n%m))%m);
            
            System.out.println(mv);
        }
    }
}
