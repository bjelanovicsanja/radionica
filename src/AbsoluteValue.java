import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        System.out.println("Test conflict");
        double number = input.nextDouble();
        System.out.println("Number is " + number + " and abs of that number is " + Math.abs(number));
    }
}
