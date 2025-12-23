package Recursion;

import java.util.Scanner;

public class lengthOfString {

    public static int findLength(String str){
        if(str.length() == 0){
            return 0;
        }

        return findLength(str.substring(1))+1;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(findLength(str));
    }
}
