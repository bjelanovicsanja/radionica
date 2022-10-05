public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    //method for calculating area on square

    public double areaCalculation(double side) {
        double area = 0;
        area = side * 4;
        return area;
    }

}