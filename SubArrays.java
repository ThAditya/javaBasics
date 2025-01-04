import java.util.*;
public class SubArrays {

    public static void printSubArrays(int num[]){
        int tp = 0, sum =0, min = Integer.MAX_VALUE, max =Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]);
                    sum = sum + num[k];
                }
                System.out.println();
                tp++;
                
            }
            System.out.println("sum of SubArray is: "  + sum);
            System.out.println();
            if (min > sum) min = sum;
            if (max < sum) max = sum;
            sum = 0;
        }


        System.out.println("Total number of SubArrays: "+tp + ", Maximum: " + max + ", Minimum: " + min );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length:");
        int n = sc.nextInt();
        System.out.println("Elements: ");
        int num[] = new int[n];

        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

        printSubArrays(num);
    }
}
