import java.util.Arrays;
import java.util.Scanner;
class Bank {

private long[] balance;

public Bank(long[] balance){
    this.balance = balance;
}

public static boolean transfer(int account1, int account2, long money){
        if(account1 < 1 || account1 > balance.length) return false;
        if(account2 < 1 || account2 > balance.length) return false;

        if(account1[balance - 1] < money) return false;
        
        account1[balance - 1] -= money;
        account2[balance - 2] += money;
    }

    public static boolean withdraw(int account, long money){
        if(account < 1 || account > balance.length) return false;
        if(account[balance - 1] < money) return false;
        
        account[balance - 1] -= money;
        return true;
    }
    
    public static boolean deposit(int account, int money){
        if(account < 1 || account > balance.length) return false;
        
        account[balance - 1] += money;
        return true;
        
    }
    
    public void printBalances(){
        System.out.println(Arrays.toString(balance));
    }
}
public class SimpleBankSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] balances = new Long[n];
        for(int i=0; i<n;i++){
            balances[i] = sc.nextLong();
        }

        Bank bank = new Bank(balances);

        while(true){
            int choice = sc.nextInt();

            if(choice == 1){
                int account1 = sc.nextInt();
                int account2 = sc.nextInt();
        
                long money = sc.nextLong();
                
                System.out.println(bank.transfer(account1, account2, money));
            }else if(choice == 2){
                int account = sc.nextInt();
                long money = sc.nextLong();
                System.out.println(bank.withdraw(account, money));
            }else if(choice == 3){
                int account = sc.nextInt();
                long money = sc.nextLong();
                System.out.println(bank.deposit(account, money));
            }else if(choice == 4){
                bank.printBalances();
            }else if(choice == 5){
                System.out.println("Exiting....");
            }else{
                System.out.println("Invalid Input");
            }
        }
        
    }
}
