public class Test {
    public static void main(String[] args) {
        // Regex kiểm tra số điện thoại di động Việt Nam
        String regex = "^(0|\\+84)(3[2-9]|5[6-9]|7[0|6-9]|8[1-9]|9[0-9])[0-9]{7}$";

        // 10 test case (số điện thoại + kết quả mong đợi)
        String[][] testCases = {
                {"0912345678", "true"},      // hợp lệ
                {"+84912345678", "true"},   // hợp lệ
                {"0321234567", "true"},     // hợp lệ
                {"0561234567", "true"},     // hợp lệ
                {"0812345678", "true"},     // hợp lệ
                {"0123456789", "false"},    // đầu số cũ, không hợp lệ
                {"091234567", "false"},     // thiếu số
                {"09123456789", "false"},   // thừa số
                {"+84123456789", "false"},  // đầu số không hợp lệ
                {"09876abcde", "false"}     // chứa ký tự không phải số
        };

        // Kiểm thử từng case
        for (String[] tc : testCases) {
            boolean result = tc[0].matches(regex);
            System.out.println(tc[0] + " -> " + result + " (expected: " + tc[1] + ")");
        }
    }

}
