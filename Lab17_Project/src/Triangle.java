public class Triangle extends Shape {
    protected double base;
    protected double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public void calcArea() {
        area = (base * height) / 2;
        System.out.println("Area of the triangle: " + area);
    }
}
