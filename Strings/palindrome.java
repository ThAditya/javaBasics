import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String str){
        int i=0,j = str.length()-1;
        while(i < j){
            char ci = str.charAt(i);
            char cj = str.charAt(j);

            

            // for converting lowercase to uppercase
            if(ci >= 'A' && ci <= 'Z') ci = (char)(ci - 'A' + 'a');
            if(cj >= 'A' && cj <= 'Z') cj = (char)(cj - 'A' + 'a');

            // skip if element is not from a-z OR 0-9
            if(!((ci >= 'a' && ci <= 'z') || (ci >= '0' && ci <= '9'))){
                i++;
                continue;
            }
            
            //skip if element is not from a-z OR 0-9
            if(!((cj >= 'a' && cj <= 'z') || (cj >= '0' && cj <= '9'))){
                j--;
                continue;
            }

            if(ci != cj){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));
    }
}
