import java.util.*;
public class pairsInArray {
    public static void pairs(int nums[]){
        int tp = 0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print( "(" + curr + ',' + nums[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is: " + tp);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length:");
        int n = sc.nextInt();
        System.out.println("Elements: ");
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        pairs(nums);
    }
}
