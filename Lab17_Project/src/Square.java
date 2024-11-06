public class Square extends Shape {
    protected double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public void calcArea() {
        area = side * side;
        System.out.println("Area of the square: " + area);
    }
}
