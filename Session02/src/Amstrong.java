public class Amstrong {
    public static void main(String[] args) {
        //Amstrong là số có các ch số lũy thừa bậc 3 cộng lại  = chính nó
        // 153 = 1^3+ 3^3+ 5^3
        // B1 : lấy ra các chữ số
        int n =153;
        int temp = n;
        int sum =0;
        while(temp !=0){
            // lấy chữ số cuôi
            int ch = temp % 10;
            sum += ch*ch*ch;
            temp = temp/10 ;// chia lấy nguyên
        }
        // có đc tổng
        if(sum == n){

        }
    }
}
