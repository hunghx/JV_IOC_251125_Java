public class OperatorPractice {
    public static void main(String[] args) {
        // viết 1 logic khởi tạo 3 cạnh của 1 tam giác hợp lệ
        // sử dụng công thức heron để tính diện tích và chu vi của tam giác (math)
        double a=3,b=4,c=5;
        double p = a+b+c; // chu vi
        double s = Math.sqrt(p/2 * (p/2-a) * (p/2-b) * (p/2-c));
        System.out.println("Dien tich tma giac la : "+s);
        System.out.println("Chu vi tam giac la : "+p);

        // Viết 1 logic khoi tao 3 hệ số a,b,c cho phuong trinh bac 2 thoa man pt có 2 nghiem
        // ax^2+bx+c = 0 , delta = b^2 - 4ac , x1,x2 = (-b +- căn (delta))/2a
        // áp dung cong thức giai pt bac 2 tính nghiem cua phuong trinh
        a=1;
        b=-5;
        c=4;
        double delta = b*b -4*a*c;
        // tính nghiem
        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);
        System.out.println("Nghiem x1 = "+x1);
        System.out.println("Nghiem x2 = "+x2);
        // in cac ket qua ra man hinh dung sout()
    }
}
