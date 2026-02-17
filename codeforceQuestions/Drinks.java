package codeforceQuestions;
import java.util.Scanner;
public class Drinks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
double sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        double div = sum/n;
        System.out.println(div);
    }   
}