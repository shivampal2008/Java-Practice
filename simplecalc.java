

import java.util.Scanner;

public class simplecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        float a = sc.nextFloat();
        System.out.println("enter 2nd number");
        float b = sc.nextFloat();
        float c = a+b;
        System.out.println("addition is " +c);
        c=a*b;
        System.out.println("multiplication is " +c);
        c=a-b;
        System.out.println("subtraction is " +c);
        c=a/b;
        System.out.println("division is " +c);
        sc.close();
    }
}
