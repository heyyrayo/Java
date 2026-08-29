public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int originalNumber = number;
        int reversed = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}
