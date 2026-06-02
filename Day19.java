public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            // 1. Print leading spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // 2. Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // 3. Print decreasing numbers from i-1 down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
