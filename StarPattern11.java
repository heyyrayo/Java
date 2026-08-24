public class StarPattern11 {
    public static void main(String[] args) {
        int n = 5;
        int middle = (n + 1) / 2;

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                if (row == middle || column == middle) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
