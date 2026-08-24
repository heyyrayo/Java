public class StarPattern09 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            printWing(row, n);
            System.out.println();
        }
        for (int row = n; row >= 1; row--) {
            printWing(row, n);
            System.out.println();
        }
    }

    private static void printWing(int row, int n) {
        for (int star = 1; star <= row; star++) {
            System.out.print("*");
        }
        for (int space = 1; space <= 2 * (n - row); space++) {
            System.out.print(" ");
        }
        for (int star = 1; star <= row; star++) {
            System.out.print("*");
        }
    }
}
