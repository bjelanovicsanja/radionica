import java.util.Scanner;
public class PrintStars {
    public static void main(String args[]) {
        System.out.println("Enter a number from 1 to 6: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
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
}
