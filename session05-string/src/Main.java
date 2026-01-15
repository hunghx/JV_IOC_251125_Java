
public class Main {
    public static void main(String[] args) {
        // String là 1 Class trong Java
        String name = "Nguyen Van A";
        // String trong Java vừa tính nguyên thủy vừa có tính tham chiếu
        // Cách 1 : Khởi tạo trực tiếp
        String str1 = "Hello World"; // khởi tạo theo hướng nguyên thủy (String pool)
        String str2 = "Hello World";

        // in ra địa chỉ của biến
        System.out.println("Địa chỉ str1: " + System.identityHashCode(str1));
        System.out.println("Địa chỉ str2: " + System.identityHashCode(str2));

        // Cách 2 : Khởi tạo thông qua từ khóa new (Cấp phát động)
        String str3 = new String("Hello World"); // khởi tạo theo hướng tham chiếu (Heap)
        String str4 = new String("Hello World");

        // in ra địa chỉ của biến
        System.out.println("Địa chỉ str3: " + System.identityHashCode(str3));
        System.out.println("Địa chỉ str4: " + System.identityHashCode(str4));

        // Các phương thức thường dùng của String :
        // length(), charAt(), substring(), indexOf(), toLowerCase(), toUpperCase(), trim(), replace(), split()
        // equals(), equalsIgnoreCase(), compareTo(), contains()


    }
}