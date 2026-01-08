public class Demo {
    public static void main(String[] args) {
        // Bài toán mẹo :
        // Kỹ năng : tích lũy
        // Đếm ước :
        int temp = 0;
        for (int i = 1; i <= 100; i++) {
            if(100 % i ==0){
                temp++;
            }
        }
        // có đc số đếm
        // tính tổng, tích, ...

        // cắm cờ
        // Ví dụ : kiểm xem trong 1000 số đầu tiên có số nào chia hết cho cho cả 3 số: 111, 222, 333
        boolean flag = true; // cắm cờ
        for (int i = 1; i <= 1000; i++) {
            if(i %111 ==0 && i % 222 ==0 && i %333 ==0){
                flag = false;
                break; // tôi uu vòng lap
            }
        }
        // kêt luạn
        if(flag){

        }else {

        }

        // Kiểm tra số nguyên tố
        int n ;
        System.out.println("Nhap so n");
        n = Main.sc.nextInt();

        boolean isPrime = true ; // gia su la so nguyen to
        if(n<2){
            isPrime = false;
        }else {
            int count = 0;
            for (int i = 1; i <=n; i++) {
                if(n%i ==0){
                    count++;
                }
            }
            if(count > 2){
                flag = false;
            }
        }
        if (flag){
            // so nguyen to
        }else {
            // ko phải
        }

    }
}
