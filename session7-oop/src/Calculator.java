public final class Calculator {
    // Thuộc tính
    int count = 0;
    static int number = 10; // vùng nhớ tĩnh đã được cấp phát

    static int sum(final int a, int b) {
        return a + b;
    }
    public final void display(){
        // phương thức ko thể bị ghi đè
    }
    public static void main(String[] args) {
        System.out.println(number);
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        cal1.number = 100;
        System.out.println(Calculator.number);
        System.out.println(cal1.number);
        System.out.println(cal2.number);

        System.out.println(Calculator.sum(2,3));
    }
}
