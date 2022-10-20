import java.util.Random;
import java.util.Scanner;

public class DecisionLoopsPractice {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        positiveOrNegative();
        biggest();
        printDay();
        randomNumber();
    }

    public static void positiveOrNegative() {
        int number, result;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        result = Integer.signum(number);
        if (result == 1) {
            System.out.println("Number is positive.");
        } else if (result == -1) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is 0. ");
        }
    }

    public static void biggest() {

        double n1 = -8.5, n2 = 2.3, n3 = 4.9;

        if (n1 >= n2) {
            if (n1 >= n3)
                System.out.println(n1 + " is the biggest number.");
            else
                System.out.println(n3 + " is the biggest number.");
        } else {
            if (n2 >= n3)
                System.out.println(n2 + " is the biggest number.");
            else
                System.out.println(n3 + " is the biggest number.");
        }
    }

    public static void printDay() {
        System.out.println("Input number: ");
        int day = scanner.nextInt();
        String nameOfDay = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid number";
        };
        System.out.println(nameOfDay);
    }

    public static void randomNumber() {
        Random random = new Random();
        int rand = 0;
        while (true) {
            rand = random.nextInt(101);
            if (rand != 0) break;
        }
        if (rand % 2 == 0) {
            System.out.println(rand + " number is even.");
        } else {
            System.out.println(rand + " number is odd.");
        }
    }
}
