//public class rhombus {
//    public static void main(String[] arg){
//
//        for (int row =1;row>5;row++){
//            for(int column=1;column>=5-row;column++){
//                System.out.print(" ");
//
//            }
//            for(int column=1;column<=5;column++){
//                System.out.print("*");
//            }
//
//        }
//        System.out.println();
//
//    }
//}

public class rhombus {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            // Print spaces
            for (int column = 1; column <= 5 - row; column++) {
                System.out.print(" ");
            }

            // Print stars
            for (int column = 1; column <= 5; column++) {
                System.out.print(" * ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
