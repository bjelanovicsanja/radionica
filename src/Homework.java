import java.util.Scanner;

public class Homework {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        messageCharacters();
        System.out.println("\n");
        printCalculation();
        System.out.println("\n");
        escaping();
        System.out.println("\n");
        mathCalculation();
        System.out.println("\n");
        absoluteValue();
        System.out.println("\n");
        biggerSmaller1();
        System.out.println("\n");
        biggerNumberOfTwo();
        System.out.println("\n");
        functionSolver();
        System.out.println("\n");
        printStars();
    }

    public static void printCalculation() {
        int a = 299;
        int b = 800;
        int sum = a + b;
        System.out.println("       " + a);
        System.out.println("+      " + b);
        System.out.println("----------");
        System.out.println("      " + sum);
    }

    public static void escaping() {
        System.out.println("Name\t" + "Height\t" + "Gender");
        System.out.println("----------------------");
        System.out.println("Anna\t" + "5\'4\"\t" + "F");
        System.out.println("Test\t" + "6\'2\"\t" + "M");
        System.out.println("Ben\t\t" + "5\'7\"\t" + "M");
    }

    public static void mathCalculation() {
        double a = 2.8, b = 3.1, c = 6.0;
        System.out.println("a+b=" + (a + b));
        System.out.println("|a|=" + Math.abs(a));
        System.out.println("Math(a)=" + Math.round(a));
        System.out.println("Ceil(a)=" + Math.ceil(a));
        System.out.println("Floor(a)=" + Math.floor(a));
        System.out.println("Exp(a)=" + Math.exp(a));
        System.out.println("Max=" + Math.max(a, b));
        System.out.println("Min=" + Math.min(a, b));
        System.out.println("2^c=" + Math.pow(2, c));
    }

    public static void absoluteValue() {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number is " + number + " and abs of that number is " + Math.abs(number));
    }

    public static void biggerSmaller1() {
        System.out.println("Enter first number:");
        int x = scanner.nextInt();
        System.out.println("Enter second number:");
        int y = scanner.nextInt();
        System.out.println("Bigger number is: " + Math.max(x, y) + " and smaller is: " + Math.min(x, y));
    }

    public static void biggerNumberOfTwo() {
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        if (num1 == num2)
            System.out.println("both are equal");
        else if (num1 > num2)
            System.out.println(num1 + " is bigger");
        else
            System.out.println(num2 + " is bigger");
    }

    public static void functionSolver() {
        System.out.println("Assign the value to x: ");
        int x = scanner.nextInt();
        int f, g;
        if (0 <= x && x <= 100) {
            f = 2 * x;
            g = x * x;
        } else {
            f = 0;
            g = 0;
        }
        System.out.println("f(x)=" + f);
        System.out.println("g(x)=" + g);
    }

    public static void printStars() {
        System.out.println("Enter a number from 1 to 6: ");
        int n = scanner.nextInt();
        String message = switch (n) {
            case 1 -> "*";
            case 2 -> "**";
            case 3 -> "***";
            case 4 -> "****";
            case 5 -> "*****";
            case 6 -> "*******";
            default -> "invalid number of ";
        };
        System.out.println("You enter " + message + " stars");
    }

    public static void messageCharacters() {
        System.out.println("Enter a message : ");
        String message;
        message = scanner.nextLine();
        if (message.length() >= 6) {
            if (message.length() <= 10) {
                System.out.println("Message is: " + message);
            } else {
                System.out.println("Your message have more than 10 characters. It has to be between 6 - 10 characters.");
            }
        } else {
            System.out.println("Your message have less than 6 characters. It has to be between 6-10 characters.");
        }
    }
}