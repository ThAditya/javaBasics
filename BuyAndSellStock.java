import java.util.Scanner;

public class BuyAndSellStock {

    public static int printStock(int[] arr){

        int buyStock = Integer.MAX_VALUE;
        int max = 0;

        // loop for finding the maximum profit from each day
        for(int i=0;i<arr.length;i++){
            // if the buyStock is lower than the current price, subtract the buyStock from the current price
            if(buyStock < arr[i]) {
                int profit = arr[i] - buyStock;
                max = Math.max(max, profit);
                 
            }else{
                buyStock = arr[i]; // if the stock price is lower than the buyStock, update the buyStock
            }

        }

        return  max;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Days");
        int n = sc.nextInt();

        System.out.println("Stock values on each day");
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("maximum profit on Selling stock: " + printStock(arr));
    }
}
