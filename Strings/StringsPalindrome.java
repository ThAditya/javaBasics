import java.util.Scanner;

public class StringsPalindrome{
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str));
    }
}