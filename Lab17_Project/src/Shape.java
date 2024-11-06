public class Shape {
    protected double area;
    protected double perimeter;

    public Shape() {
        area = 0;
        perimeter = 0;
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void calcArea() {
        System.out.println("don't do this again");
    }
}
