public class MNETraffic implements CentralTraffic, EuropeTraffic {
    public static void main(String[] args) {
        CentralTraffic ct = new MNETraffic();
        ct.redLight();
        ct.yellowLight();
        ct.greenLight();

        EuropeTraffic et = new MNETraffic();
        et.trainSymbol();
        et.exclamationSign();
        System.out.println("Max speed is " + MAX_SPPED);

    }

    @Override
    public void redLight() {
        System.out.println("Stop!");
    }

    @Override
    public void yellowLight() {
        System.out.println("Wait!");
    }

    @Override
    public void greenLight() {
        System.out.println("Go!");
    }

    @Override
    public void trainSymbol() {
        System.out.println("This is a train symbol.");
    }

    @Override
    public void exclamationSign() {
        System.out.println("This is a exclamation sign.");
    }
}
