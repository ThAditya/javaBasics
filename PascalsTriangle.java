import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle{

    public List<List<Integer>> pascalTri(int n){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    int val = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    row.add(val);
                }
            }
            list.add(row);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PascalsTriangle pt = new PascalsTriangle();
        List<List<Integer>> result = pt.pascalTri(n);
        System.out.println(result);
    }
}