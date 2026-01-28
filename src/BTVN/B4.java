package BTVN;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B4 {
    public static void main(String[] args) {
        String cardID = "TV202312345";
        Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{9}$");
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            if (!cardID.startsWith("TV")) {
                System.out.println("Thiếu TV");
            } else {
                System.out.println("Mã thẻ hợp lệ!");
            }
        } else {
            if (!cardID.substring(0, 2).matches("[A-Z]{2}")) {
                System.out.println("Tiền tố không hợp lệ");
            } else if (!cardID.substring(2, 6).matches("\\d{4}")) {
                System.out.println("Năm không hợp lệ");
            } else {
                System.out.println("Định dạng sai");
            }
        }
    }
}

