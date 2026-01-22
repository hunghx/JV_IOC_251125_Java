package ra.edu;

public class Student {


    private String studentId;
    private String name;
    private int age;

//    public Student() {
//    }
//
//    public Student(String studentId, String name, int age) {
//        this.studentId = studentId;
//        this.name = name;
//        this.age = age;
//    }
    public Student(){
        studentId = "S00001";
        name = "Nguyễn Văn A";
        age = 18;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{\n"+
                "studentId : '" + studentId + "'" +
                ", \nname : '" + name + "'" +
                ", \nage : " + age +
                "\n}";
    }

    public void displayInfo(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        Student tenBien = new Student(); // khoi tạo đối tượng : tenBien là 1 instance của lớp Student
        System.out.println(tenBien);
        System.out.println(Math.a);
    }
}
