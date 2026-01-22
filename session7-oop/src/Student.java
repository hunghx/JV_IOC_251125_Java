/*
Lớp sinh viên
- Thuộc tính : mã sinh viên, tên sinh viên, ngày sinh,so điện thoại, email, giới tính

- Phương thức : nói, ăn, uống, làm bài tập, điểm danh
 */
public class Student {
    // Thuộc tính
    String studentId;
    String name;
    String dateOfBirth;
    String phoneNumber;
    String email;
    SexEnum sex;
    // Phương thức khởi tạo
    public Student(){
        // phương thức khởi tạo ko tham số , mặc định nếu ko khai báo
    }
    public Student(String studentId){
        this.studentId = studentId;
    }

    public Student(String studentId, String name, String dateOfBirth, String phoneNumber, String email, SexEnum sex) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.sex = sex;
    }

    // Các phương thức khác
    public void eat(){
        System.out.println(name+ " "+ sex + " is eating.");
    }
    public void drink(){
        System.out.println(name + " is drinking.");
    }
    public void talk(){
        System.out.println(name + " is talking.");
    }
    public void doHomework(){
        System.out.println(name + " is doing homework.");
    }
    public void attendClass(){
        System.out.println(name + " is attending class.");
    }
}