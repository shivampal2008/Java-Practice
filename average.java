import java.util.Scanner;

public class average {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        float a = sc.nextFloat();
        System.out.println("enter 2nd number");
        float b = sc.nextFloat();
        System.out.println("enter 3rd number");
        float c = sc.nextFloat();

        float d = (a + b + c )/ 3;
        System.out.println("the average is " + d);
    }
}
