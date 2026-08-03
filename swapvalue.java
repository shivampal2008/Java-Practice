import java.util.Scanner;

public class swapvalue {

        public static void main(String[] a) {


            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number1: ");
            int A = sc.nextInt();
            System.out.print("Enter number2: ");
            int B  = sc.nextInt();
            int C = A;
             A =B;
             B= C;
             System.out.println(A);
             System.out.println(B);


        }
}
