public class Programer extends Amplitudo {
    public static void main(String[] args) {

        Programer Sanja = new Programer();
        System.out.println(Sanja.bonus + Sanja.getSalary());
    }

    private int bonus = 100;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}