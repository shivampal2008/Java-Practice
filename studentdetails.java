import java.util.Scanner;

public class studentdetails {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter yoour name ");
        String name = sc.nextLine();
        System.out.println("enter your roll number");
        int roll = sc.nextInt();
        System.out.println("enter your age ");
        int age = sc.nextInt();
        System.out.println("enter your percentage ");
        float percentage = sc.nextFloat();
        System.out.println("-----student details-----");
        System.out.println("name:   "+name);
        System.out.println("roll:   "+roll);
        System.out.println("age:    "+age);
        System.out.println("percentage: "+percentage);


    }
}
