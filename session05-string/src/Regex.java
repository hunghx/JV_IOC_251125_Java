import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String REGEX_EMAIL = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX_EMAIL);
        Matcher m = p.matcher("hunghx@gmail.com".toUpperCase());
        boolean b = m.matches();

        boolean isMatch = Pattern.matches(REGEX_EMAIL, "hunghx@gmail.com".toUpperCase());

        boolean isMatch2 = "hunghx@gmail.com".toUpperCase().matches(REGEX_EMAIL);
        System.out.println("isMatch = " + isMatch);

        // Cho phép số bắt đầu bằng 0 hoặc +84, theo sau là 9 chữ số
        String regex = "^(0|\\+84)(3[2-9]|5[6-9]|7[0|6-9]|8[1-9]|9[0-9])[0-9]{7}$";
        String phoneNumber = "016942022789";
        boolean isPhoneMatch = phoneNumber.matches(regex);
        System.out.println("isPhoneMatch = " + isPhoneMatch);
    }
}
