public class Conversion {
    public static void main(String[] args) {
        stringToInt();
        intToString();
    }

    public static void stringToInt() {
        String s = "100";
        System.out.println(s + 100);
        int i = Integer.parseInt(s);
        System.out.println(i + 100);
        String st = "200";
        Integer in = Integer.valueOf(st);
        System.out.println(in + 200);
    }

    public static void intToString() {
        int i = 300;
        String s = String.format("%d", i);
        int number = 700;
        String s1 = Integer.toString(number);
        int number2 = 900;
        String s2 = String.valueOf(number2);
        System.out.println(s + " " + s1 + " " + s2);
    }
}
