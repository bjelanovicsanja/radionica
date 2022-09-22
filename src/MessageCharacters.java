import java.util.Scanner;
public class MessageCharacters {
    public static void main(String[] args) {
        System.out.println("Enter a message : ");
        Scanner scan = new Scanner(System.in);
        String message;
        message=scan.nextLine();
        if(message.length() >= 6 && message.length() <= 10){
            System.out.println("Your message is between 6 and 10. Well done!");
        } else {
            System.out.println("Your message is not between 6 and 10. Try again!");
        }
        System.out.println("Message is: " + message);
    }
}