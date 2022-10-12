import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringsPractise {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        dateTime();
        privateInfo();
        trimString();
        countWords();
    }

//    public static int returnIndex(String[] str, int index) {
//        if(str == null){
//            return -1;
//        }
//        int len = str.length;
//        int i = 0;
//        while(i < len){
//            if(str[i] == index){
//                return i;
//            }else{
//                return i+1;
//            }
//        }
//        return -1;
//    }

    public static void dateTime() {
        String pattern = "MMMM dd,yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm a");
        Date time = new Date();
        System.out.println(date + "\n" + formatter.format(time));
    }

    public static void doesStringStartWith() {

    }

    public static void doesStringEndWith() {

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
