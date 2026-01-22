package ra.bth;

import java.util.Scanner;

public class StudentManager {
    private static Student[] students;
    private static int size;
    private static final int MAX_SIZE = 100;

    static {
        // khởi tao mảng 100 sinh viên
        students = new Student[MAX_SIZE];
        Student s1 = new Student(1,"Nguyen Van A", "11/11/2006","anv@gmail.com","0989743654",true);
        students[0] = s1;
        size = 1;
    }
//    public StudentManager() {
//        // khởi tao mảng 100 sinh viên
//        students = new Student[MAX_SIZE];
//        Student s1 = new Student(1,"Nguyen Van A", "11/11/2006","anv@gmail.com","0989743654",true);
//        students[0] = s1;
//        size = 1;
//    }

    public static void showListStudent(){
        // kểm tra mảng ko có sinh viên
        if(size == 0){
            System.out.println("Chưa có sinh viên nào trong danh sách");
            return;
        }
        // in tiêu đề bảng
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n", "-".repeat(6), "-".repeat(17),
                "-".repeat(12), "-".repeat(17), "-".repeat(12), "-".repeat(7));
        System.out.printf("| %-4s | %-15s | %-10s | %-15s | %-10s | %-5s |\n",
                "ID", "Tên Sinh Viên", "Ngày Sinh", "Email", "Số ĐT", "Sex");
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n", "-".repeat(6), "-".repeat(17),
                "-".repeat(12), "-".repeat(17), "-".repeat(12), "-".repeat(7));
        // duyệt mảng
        for (int i = 0; i <size ; i++) {
            students[i].displayData();
        }
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n", "-".repeat(6), "-".repeat(17),
                "-".repeat(12), "-".repeat(17), "-".repeat(12), "-".repeat(7));

    }
    public static void addStudent(Scanner sc){
        int n;
        System.out.println("Nhập số lượng sinh viên muốn thêm: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("--- Nhập thông tin sinh viên thứ %d ---\n", i+1);
            Student newStudent = new Student();
            newStudent.inputData(sc);

            // id tự tăng
            newStudent.setId(getMaxId()+1);

            // thêm sinh viên vào cuối
            students[size] = newStudent;
            size++;
        }
        // Nhập thông tin của sinh viên

        System.out.printf("Đã thêm %d sinh viên thành công!\n", n);
    }
    public static void updateStudent(){
    }
    public static void removeStudent(){

    }

    // tìm id lớn nhất
    private static int getMaxId(){
        int idMax = 0;
        for (int i = 0; i < size; i++) {
            if(students[i].getId() > idMax){
                idMax = students[i].getId();
            }
        }
        return idMax;
    }
}
