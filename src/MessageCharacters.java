import java.util.Scanner;
public class MessageCharacters {
    public static void main(String[] args) {
        System.out.println("Enter a message : ");
        Scanner scan = new Scanner(System.in);
        String message;
        message = scan.nextLine();
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