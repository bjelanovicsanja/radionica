import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringsPractise {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        returnChar("Bagolovci", 2);
        dateTime();
        doesStringStartWith("Pocetak provjera", "Sanja");
        doesStringEndWith("Zavrsetak stringa", "stringa");
        privateInfo();
        trimString();
        countWords();


    }

    public static void returnChar(String s, int x) {
        char aChar = s.charAt(x);
        System.out.println(aChar);
    }

    public static void dateTime() {
        String pattern = "MMMM dd,yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm a");
        Date time = new Date();
        System.out.println(date + "\n" + formatter.format(time));
    }

    public static boolean doesStringStartWith(String actual, String word) {
        boolean test;
        if (actual.startsWith(word)) {
            System.out.println("String starts with this string.");
            test = true;
        } else {
            System.out.println("String does not starts with this string.");
            test = false;
        }
        return test;
    }

    public static boolean doesStringEndWith(String actual, String word) {
        boolean test;
        if (actual.endsWith(word)) {
            System.out.println("String ends with this string.");
            test = true;
        } else {
            System.out.println("String does not end with this string.");
            test = false;
        }
        return test;
    }

    public static void privateInfo() {
        String s = "Sanja Bjelanovic 24 Podgorica";
        String[] arr = s.split(" ");
        for (String x : arr) {
            System.out.println(x);
        }
    }

    public static void trimString() {
        String s = "           ovo je string             ";
        String trim = s.trim();
        System.out.println(trim);
    }

    public static int countWords() {
        System.out.println("Input a string: ");
        String str = scanner.nextLine();
        if (str == null || str.isEmpty())
            return 0;
        String words[] = str.split("\\s+");
        System.out.println("Number of words in string is: " + words.length);
        return words.length;
    }

}
