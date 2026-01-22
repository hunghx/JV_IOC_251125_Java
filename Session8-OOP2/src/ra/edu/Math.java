package ra.edu;

public final class Math {

    // static : tham chiếu trc tiếp tới vùng nhớ static : tồn trại trước khi hàm main chạy
    static final int a = 50;
    String name = "Nguyen Van A";
    public static void main(String[] args) {
        System.out.println(a);
//        a = 100;
        // System.out.println(name);// lôi vì ko có vùng nhớ
    }

    final int sum(int a, int b){
        return a + b;
    }
}
