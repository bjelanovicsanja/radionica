import java.util.Scanner;
public class Bigger {
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        if (num1 == num2)
            System.out.println ("both are equal");
        else if (num1 > num2)
            System.out.println (num1 + " is bigger");
        else
            System.out.println (num2 + " is bigger");
    }
}