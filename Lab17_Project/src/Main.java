 import java.util.ArrayList;
 import java.util.Arrays;


 public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>(Arrays.asList(new Shape(), new Circle(3), new Square(7), new Triangle(1, 2)));

        for (Shape shape : shapes) {
            shape.draw();
            shape.calcArea();
        }
    }
}
