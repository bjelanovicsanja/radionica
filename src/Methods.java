public class Methods {
    public static void main(String[] args) {
        printName();

        String nameSurname= printNameAndSurname("Sanja Bjelanovic");

        System.out.println("My name and surname is " + nameSurname);

        int sum = calculate(3, 5);

        System.out.println("Suma je " + sum);

        int suma = calculate(1,2,3);

        System.out.println("Suma tri broja je " + suma);

        Methods method = new Methods();

        method.greetMe();
    }
    public static void printName() {
        System.out.println("Sanja");
    }
    public static String printNameAndSurname(String n) {
        System.out.println(n);
        return n;
    }
    public static int calculate(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
    public static int calculate(int num1, int num2, int num3){
        int suma = num1 + num2 + num3;
        return suma;
    }
    public void greetMe(){
        System.out.println("Hello");
    }
}