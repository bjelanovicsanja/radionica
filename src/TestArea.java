public class TestArea {
    static Rectangle r = new Rectangle(7.10, 12.10);
    static Square s = new Square(6);

    public static void main(String[] args) {
        double squareArea = s.areaCalculation(s.getSide());
        double areaRectangle = r.areaCalculation(r.getWidth(), r.getLength());
        System.out.println("Area for Square is: " + squareArea + " " + "and area for Rectangle is: " + areaRectangle);

    }
}