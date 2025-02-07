import java.util.*;
public class palindrome {

    public static boolean palindromeOrNot(int n){
        int temp = n, ret = 0;
        while(n!= 0){
            int rev = n%10;
            ret = ret*10 + rev;
            n = n/10;
        }
        if(temp == ret){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(palindromeOrNot(n));
        
    }
}

