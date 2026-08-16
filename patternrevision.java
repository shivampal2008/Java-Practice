
public class patternrevision {

    public static void main(String[] args) {
        int n = 4;
//        for (int row=1;row<=n;row++){
//            for(int col=1;col<=n-row;col++){
//                System.out.print(" ");
//            }
//            for(int col=1;col<=n;col++){
//                System.out.print("*");
//            }
//
//            System.out.println(" ");
//        }




//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=(n-row)+1;col++){
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }




//        for(int row=1;row<=n;row++){
//            for (int col=1;col<=n-row;col++){
//                System.out.print(" ");
//            }
//            for(int col=1;col<=2*row-1;col++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row-1;col++){
//                System.out.print(" ");
//            }
//            for(int col=1;col<=(2*n)-(2*row)+1;col++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }


//            for(int row=1;row<=n;row++){
//                for(int col=1;col<=n;col++){
//                    if(row==1||row==n) {
//                        System.out.print("* ");
//                    }
//
//                        else{
//                            if(col==1||col==n) {
//                                System.out.print("*   ");
//                            }
//                                else{
//                                    System.out.print(" ");
//                                }
//
//                        }
//
//                }
//                System.out.println(" ");
//            }



//        for (int row = 1; row <= n; row++) {
//
//            if (row == 1 || row == 2 || row == n) {
//
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//
//            } else {
//
//                System.out.print("* ");
//
//                for (int col = 1; col <= row - 2; col++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=n-row;col++){
//                System.out.print(" ");
//            }
//            if(row==1||row==n){
//                for(int col=1;col<=2*row-1;col++){
//                    System.out.print("*");
//                }
//            }
//            else{
//                System.out.print("*");
//                for(int col=1;col<=2*row-3;col++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }



//    for(int row=1;row<=n;row++){
//        for(int col=1;col<=n-row;col++){
//            System.out.print(" ");
//        }
//        for(int col=1;col<=2*row-1;col++){
//            System.out.print("*");
//        }
//        System.out.println(" ");
//
//    }
//
//for(int row=1;row<=n;row++){
//    if(row==1){
//        continue;
//    }
//    for(int col=1;col<=row-1;col++){
//        System.out.print(" ");
//    }
//    for(int col=1;col<=2*n-2*row+1;col++){
//        System.out.print("*");
//
//    }
//    System.out.println(" ");
//}






//
//     for(int row=1;row<=n;row++){
//         //part 1
//         for(int col=1;col<=row;col++){
//             System.out.print("*");
//         }
//
//
////part 2
//     for(int col=1;col<=2*n-2*row+1;col++) {
//         System.out.print(" ");
//     }
//     //part3
//    for(int col=1;col<=row;col++){
//        System.out.print("*");
//    }
//            System.out.println(" ");
//     }
//     //part4
//    for(int row=1;row<=n;row++){
//        for(int col=1;col<=n-row+1;col++){
//            System.out.print("*");
//        }
//        //part5
//        for(int col=1;col<=2*(row-1);col++){
//            System.out.print(" ");
//        }
//        //part6
//        for(int col=1;col<=n-row+1;col++){
//            System.out.print("*");
//        }
//        System.out.println(" ");
//    }


//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print(col+" ");
//            }
//            System.out.println(" ");
//        }


//        int count=1;
//        for(int row=1;row<=n;row++) {
//            for (int col = 1; col <= row; col++) {
//            System.out.print(count+" ");
//            count++;
//            }
//            System.out.println(" ");
//        }



//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row-1;col++){
//                System.out.print(" ");
//            }
//            for(int col=1;col<=(2*n)-(2*row)+1;col++){
//                System.out.print("*");
//
//            }
//            System.out.println("  ");
//        }
//        for(int row=1;row<=n;row++){
//            if(row==1){
//                continue;
//            }
//            for(int col=1;col<=n-row;col++){
//                System.out.print(" ");
//            }
//            for(int col=1;col<=(2*row)-1;col++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                if(i == j || i + j == n - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }









    }
}
