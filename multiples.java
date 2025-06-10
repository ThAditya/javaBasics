import java.util.Scanner;

public class multiples{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a%b == 0){
            System.out.println("Multiples");
        }else if(b%a == 0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }
    }
}