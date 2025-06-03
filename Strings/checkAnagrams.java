import java.util.Arrays;
import java.util.Scanner;

public class checkAnagrams {

    public static void anagramOrNot(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){

            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();
            
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean result = Arrays.equals(str1Array, str2Array);
            
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams");
            }else{
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }else{
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        anagramOrNot(str1, str2);
    }
}
