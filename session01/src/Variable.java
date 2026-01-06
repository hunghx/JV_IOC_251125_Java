public class Variable {
    public static void main(String[] args) {
        // cú pháp khai báo va khoi tao
        // datatype + name = value ;
        int number = 10;
        int numberA, numberB, positive, $number, _number;
        float point = 7.5f;
        double mark = 7.5;
        System.out.println("Gia tri cua number = " + number);
        System.out.println("Gia tri cua point = "+point);
        System.out.println("Gia tri cua mark ="+ mark);
        // hằng số
        final byte choice = 10;
        System.out.println("Gia tri cua choice ="+ choice);
        // phép gán : thay doi gia tri bien
        point = 10.5f;
        point = 10/3;
        boolean check = true;
        mark = number; // ép kiểu ngầm định
        number = (int) mark; // tran du lieu -> ép kiểu tuong
        // toan tư gán
        point -= 1.5; // point = point - 1.5
        // Toán tử so sánh
        // toán tử logic : || , &&, !
        boolean result = false || false || 2 > 3 ||false; // result = true
        boolean rs = 2>3 && 3>4 && 4>5;
        boolean not = !(5>4 && 6>7); // false

        // toán tử tăng giảm : ++,-- : tiền tố(sau khi tăng hoặc giảm) và hậu tố(trước khi tăng/giảm)
        int a =10;
        a--; // a =9
        System.out.println("a-- = "+(a--));// in ra 9, a=8
        System.out.println((a--) % 3 + (a++) + (a--) * (a++)); // in ra bnh
        // a = ? sau khi in ra
        System.out.println(a);
        // toán tử 3 ngôi
        int dtb = 5>4? 100 : 0;

    }
}
