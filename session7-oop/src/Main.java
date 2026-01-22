import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Jack";
        s.sex = SexEnum.MALE;
        s.eat();

        System.out.println(s.toString());

        // Khỏi tạo đối tượng
        Product p = null;
        p = new Product();
        // Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        p.inputData(sc);

        // hiển thị thông tin
        p.displayInfo();
        sc.close();

        Product p2 = new Product("P001", "Laptop", "High-end gaming laptop", 1500.0, 10, true);
    }
}