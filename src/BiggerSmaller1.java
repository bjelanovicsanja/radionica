import java.util.Scanner;
public class BiggerSmaller1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = input.nextInt();
        System.out.println("Enter second number:");
        int y = input.nextInt();
        System.out.println("Bigger number is: " + Math.max(x,y) + " and smaller is: " + Math.min(x,y));
    }
}