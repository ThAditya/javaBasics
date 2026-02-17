import java.util.*;

public class ShortestPath {

    public static float getPath(String path){
        int x =0, y=0;

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            if(dir == 'S') y--;

            else if(dir == 'N') y++;
            
            else if(dir == 'W') x--;

            else x++;
            
        }

        int x2 = x*x;
        int y2 = y*y;
        
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();

        System.out.println(getPath(path));
    }
}
