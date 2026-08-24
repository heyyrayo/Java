public class StarPattern12 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = n; row >= 1; row--) {
            printRow(row, n);
        }
        for (int row = 2; row <= n; row++) {
            printRow(row, n);
        }
    }

    private static void printRow(int row, int n) {
        for (int space = 1; space <= n - row; space++) {
            System.out.print(" ");
        }
        for (int star = 1; star <= 2 * row - 1; star++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
