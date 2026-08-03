import java.util.Scanner;

public class takinginput
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int firstNum=sc.nextInt();
        System.out.println("enter second number");
        int secondNum=sc.nextInt();
        int ans=firstNum+secondNum;
        System.out.println("answer is " + ans);
        sc.close();
    }
}
