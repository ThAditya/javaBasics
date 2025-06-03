import java.util.Scanner;

public class countLowercase {

    public static int lowercase(String str){
        int count = 0;
        int n = str.length();

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            } 
            
        }

        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(lowercase(str));
    }
}
