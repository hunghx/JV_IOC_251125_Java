import java.util.Scanner;

public class Bai2 {
        // 1. Không để trống (không chỉ chứa khoảng trắng)
        public static final String NOT_EMPTY = "^(?!\\s*$).+";

        // 2. Không chứa ký tự đặc biệt (chỉ cho phép chữ cái, số và khoảng trắng)
        public static final String NO_SPECIAL_CHAR = "^[a-zA-Z0-9\\s]+$";

        // 3. Không chứa ký tự số (chỉ cho phép chữ cái và khoảng trắng)
        public static final String NO_DIGIT = "^[a-zA-Z\\s]+$";

        // 4. Chỉ chứa toàn ký tự số
        public static final String ONLY_DIGITS = "^[0-9]+$";

        // 5. Chỉ chứa toàn ký tự chữ cái (không số, không ký tự đặc biệt, không khoảng trắng)
        public static final String ONLY_LETTERS = "^[a-zA-Z]+$";

        // 6. Regex kiểm tra số điện thoại di động Việt Nam
        public static final String VIETNAM_PHONE = "^(0|\\+84)(3[2-9]|5[6-9]|7[0|6-9]|8[1-9]|9[0-9])[0-9]{7}$";

    public static void main(String[] args) {
        System.out.println("snchvsdhcvj$".matches(NO_SPECIAL_CHAR));

        String input = null;
        do{
            input = new Scanner(System.in).nextLine();
            if(input.isBlank()){
                System.err.println("Chuỗi không được để trống, vui lòng nhập lại:");
            } else if (input.length()<6) {
                System.err.println("Chuỗi phải có ít nhất 6 ký tự, vui lòng nhập lại:");
            }
        }while (input.isBlank()|| input.length()<6);
        System.out.println("Chuỗi hợp lệ: " + input);
    }
   /*
    Bài tập 2 :
    + Kiểm tra 1 chuỗi người dùng nhập vào có thỏa mãn 1 trong các điều kiện sau
    - ko để trống (chỉ chứa khoảng trắng)
    - ko chứa kí tự đặc biệt
    - ko chứa kí tự số
    - chỉ chứa toán kí tự số
    - chỉ chứa toàn kí tự chữ cái (ko phải số,. ko phải kí tự đặc biệt)

    Bài tập 3 :
    Viết logic nhập vào 1 chuỗi input :
    Nếu chuỗi để trống hoặc chuỗi có ít hơn 6 kí tự thì in ra lỗi tương ứng
    và bắt nhập lại.
    Nếu nhập đúng thì in ra màn hình kết quả

    */

}
