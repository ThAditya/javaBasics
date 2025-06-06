package BitManipulation;

public class examplesOfOperators {
    public static void main(String[] args) {

        //And Operator
        System.out.println(5 & 6);

        //Or Operator
        System.out.println(5 | 6);

        //XOR Operator
        System.out.println(5 ^ 6);

        // compliment
        System.out.println(~0);

        // BitManipulation
        // Binary Left Shift
        // a << b = a+2^b;
        System.out.println(5 << 2);
        
        // Binary Right Shift
        // a >> b = a/2^b;
        System.out.println(5 >> 2);
        System.out.println(6 >> 1);
    
    
    }
}
