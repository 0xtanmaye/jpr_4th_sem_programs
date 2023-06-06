public class DisplayPyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        int k = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}