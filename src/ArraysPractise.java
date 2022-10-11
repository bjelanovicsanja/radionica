
import java.util.Scanner;
import java.util.Arrays;


public class ArraysPractise {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 7, 8, 89};
        sumArray(arr);
        averageArray(arr);
        checkValue(arr, 89);

        int[] sortArray = new int[]{2, 5, -5, -2, 300, 6, 8, 25, 9999, 1, 0};
        Arrays.sort(sortArray);
        System.out.println("Sorted array is: " + Arrays.toString(sortArray));

        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 3, 4, 5, 6};
        int[] c = {1, 2, 3, 4, 5, 6};
        if (Arrays.equals(a, b)) {
            System.out.println("Arrays a and b are equals. ");
        } else if (Arrays.equals(a, c)) {
            System.out.println("Arrays a and c are equals. ");
        } else {
            System.out.println("Arrays b and c are equals. ");
        }

    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements of array is: " + sum);
        return sum;
    }

    public static void averageArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Average of array is: " + average);
    }

    public static void checkValue(int[] arr, int element) {
        boolean test = false;
        for (int el : arr) {
            if (el == element) {
                test = true;
                break;
            }
        }
        if (test == true) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element does not exist.");
        }

    }
}
