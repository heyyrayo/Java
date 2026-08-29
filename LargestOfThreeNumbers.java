public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 12;
        int b = 45;
        int c = 30;

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        System.out.println("Largest number is: " + largest);
    }
}
