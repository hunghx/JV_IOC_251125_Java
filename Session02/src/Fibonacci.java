public class Fibonacci {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,21,34,55
        int f0 = 0;
        int f1 = 1;
        // tìm fn
        int n = 10;
        int fk = 0, fk_1 = f1, fk_2 =f0;
        // f2 = f1+f0
        // f3 = f2+f1
        for (int i = 1; i < n ; i++) {
            fk = fk_1 +fk_2;
            fk_2 = fk_1;
            fk_1 = fk;
        }
        // fk chính là fn
        System.out.println(fk);

    }
}
