import javax.swing.JOptionPane;

public class CourseTest {
    public static void main(String[] args) {
        // Testing if everything works
        System.out.println("Testing that everything works:");
        Course defaultCourse = new Course();
        Course customCourse1 = new Course("CSC", "137");
        Course customCourse2 = new Course("CSC", "230");

        defaultCourse.displayCourse();
        customCourse1.displayCourse();
        customCourse2.displayCourse();

        System.out.println("\nUsing JOptionPane:");
        String prefix = JOptionPane.showInputDialog("What is your course prefix?");
        String code = JOptionPane.showInputDialog("What is your course code?");

        Course customCourse3 = new Course(prefix, code);

        customCourse3.displayCourse();
    }
}
