public class StarPattern02 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = n; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
