import java.util.Scanner;

public class MethodsTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        vowelConsonant();
        System.out.println("\n");
        priceAndDiscount();
        System.out.println("\n");
        powerOfNumber(3, 4);
        System.out.println("\n");
        palindrome("radar");
        System.out.println("\n");
        sumOfDigits();
        System.out.println("\n");
        numberOfVowels("sanja");
        System.out.println("\n");
        reverseNumber();

    }

    public static void vowelConsonant() {
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Character is an vowel");
        } else {
            System.out.println("Character is a consonant");
        }
    }

    public static void priceAndDiscount() {
        int price, discount, finalPrice;
        System.out.println("Enter price of product: ");
        price = scanner.nextInt();
        System.out.println("Enter discount of product: ");
        discount = scanner.nextInt();
        finalPrice = (price * discount) / 100;
        System.out.println("Final price of product with discount is: " + finalPrice);
    }

    public static double powerOfNumber(int base, int exponent) {
        double result = Math.pow(base, exponent);
        System.out.println("Result is: " + result);
        return result;
    }

    public static String palindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
        return s;
    }

    public static void sumOfDigits() {
        int number, sum = 0, digit = 0;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }

    public static String numberOfVowels(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Sum of vowels is: " + count);
        return word;
    }

    public static void reverseNumber() {
        int number;
        int reverse = 0;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of number is: " + reverse);
    }
}
