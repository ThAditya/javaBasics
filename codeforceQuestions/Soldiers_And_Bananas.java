package codeforceQuestions;
import java.util.*;

public class Soldiers_And_Bananas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += a*i;
        }
        if(sum <= b){
            System.out.println(0);
        }else{
            System.out.println(sum - b);
        }

    }
}
