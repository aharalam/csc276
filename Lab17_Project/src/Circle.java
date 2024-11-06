public class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void calcArea() {
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }
}
