package ra.edu;

public final class Math {

    // static : tham chiếu trc tiếp tới vùng nhớ static : tồn trại trước khi hàm main chạy
    static final int a = 50;
    String name = "Nguyen Van A";
    public static void main(String[] args) {
        // 8 kieu nguyên : pass by value
        // Kiểu Wrapper class : pass by reference
        int a  = 10;
        Integer b = 10;
        // Autoboxing và unboxing
        b = a;
        a = b;

        System.out.println(a);
//        a = 100;
        // System.out.println(name);// lôi vì ko có vùng nhớ
    }

    final int sum(int a, int b){
        return a + b;
    }
}
