package ra.bt;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(100, "Java Programming");
        Student student = new Student(1001, "John Smith", course);

        course.showCourse();
        student.displayInfo();
    }
}
