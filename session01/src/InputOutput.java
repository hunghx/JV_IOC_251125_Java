import java.util.Scanner;

public class InputOutput {
    // Màu chữ cơ bản (Regular Colors)
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    public static void main(String[] args) {
        // Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        // nhạp số (kiểu nguyên thủy)
        System.out.println("Nhap 1 so nguyen");
        int number = Integer.parseInt(sc.nextLine());// tranh viec bị nuot dong nhap
//        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Number = "+number);
        String name = "Nguyen Van A";
//        sc.nextLine();
        System.out.println("Nhap ten cua ban : ");
        name = sc.nextLine();
        System.out.println("Name : " + name);

        // Xuát du lieu ra màn hình
        System.out.println("In chuoi binh thuong");
//        System.out.printf("Hello , toi ten la %-20s , nam nay toi %-10d tuoi ",name, number);
        // ki tu dai dien : %d, %s, %f, %c, %b
        // ki tu dieu kien: \n, \t
        // ki tu % va ki tu \ : %% , \\
        // ker bang sinh vien: ma SV, ho ten, can nang, tuoi, gioi tinh\
        System.out.println("+------------+-----------------+----------+-------+------------+");
        System.out.printf("| %-10s | %-15s | %-8s | %-5s | %-10s |\n","Ma SV","Ho ten","Can nang","Tuoi","Gioi tinh");
        System.out.println("+------------+-----------------+----------+-------+------------+");
        System.out.printf("| %-10s | %-15s | %-8.1f | %-5d | %-10s |\n","SV001","Nguyen Van A",49.9,20,"Nam");
        System.out.println("+------------+-----------------+----------+-------+------------+");

        System.out.println("❤🧡💛💚💙💜🤎🖤🤍");
        // in mau : mau ANSI
        System.out.printf("%sHello, đay la mau do", RED);

    }
}
