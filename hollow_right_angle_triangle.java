public class hollow_right_angle_triangle {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            if (row == 1 || row == 2 || row == n) {

                for (int column = 1; column <= row; column++) {
                    System.out.print("* ");
                }

            } else {

                System.out.print("* ");

                for (int column = 1; column <= row - 2; column++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}