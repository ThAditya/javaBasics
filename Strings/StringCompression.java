import java.util.*;

public class StringCompression {

    public static String compression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer cnt=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                cnt++;
                i++;
            }
            sb.append(str.charAt(i));
            if(cnt >1){
                sb.append(cnt.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression(str));
    }
}
