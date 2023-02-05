import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting inut from the user
        int num = sc.nextInt();

        // getting product and quotient 
        int product = BitwiseShiftingOperators.multiply(num);
        int quotient = BitwiseShiftingOperators.divide(num);

        // closing resource
        sc.close();
        
        // printing product and quotient
        System.out.println(product + "," + quotient);
    }
}
