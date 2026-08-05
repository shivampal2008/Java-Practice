public class inverted_triangle {
    public static void main(String[] args) {
        int n  =4;
        for(int row=1;row<=n;row++){
            for(int column=1;column<=row-1;column++){
                System.out.print(" ");
            }
            for(int column=1;column<=2*n-2*row+1;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
