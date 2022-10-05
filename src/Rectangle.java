public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //method for calculating area on rectangle

    public double areaCalculation(double length, double width) {
        double area = 0;
        area = (2 * length) + (2 * width);
        return area;
    }
}