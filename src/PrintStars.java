import java.util.Scanner;
public class PrintStars {
    public static void main(String args[])
    {
        System.out.println("Enter a number from 1 to 6: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("* ");
        }
            System.out.println();
        }
    }
