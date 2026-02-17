package Recursion;

import java.util.Scanner;

public class DuplicateString {

    public static void removeDuplicate(String str, int i, StringBuilder newStr, boolean map[]){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar-'a'] == true){
            removeDuplicate(str, i+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicate(str, i+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i=0;
        StringBuilder newStr = new StringBuilder("");
        boolean map[] = new boolean[26];
        removeDuplicate(str, i, newStr, map);
    }
}
