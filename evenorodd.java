import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("enter a number");
        int a = sc.nextInt();


        if(a%2==0){
            System.out.print("this number is even");

        }
        else{
            System.out.print("this number is odd");
        }
    }

    }

