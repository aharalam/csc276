public class Course {
    private String prefix;
    private String code;

    // Define a default constructor
    public Course() {
        prefix = "CSC";
        code = "276";
    }

    // Define a second constructor that takes two parameters for the corresponding instane variables
    public Course(String prefix, String code) {
        this.prefix = prefix;
        this.code = code;
    }

    // Getter methods
    public String getPrefix() {
        return prefix;
    }

    public String getCode() {
        return code;
    }

    // Setter methods
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void displayCourse() {
        System.out.println("Course name: " + prefix + " " + code);
    }
}
