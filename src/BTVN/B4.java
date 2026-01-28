package BTVN;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thẻ: ");
        String cardID = sc.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{9}$");
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            if (!cardID.substring(0, 2).matches("[A-Z]{2}")) {
                System.out.println("Hai ký tự đầu phải là chữ cái in hoa");
            } else if (!cardID.substring(2).matches("\\d{9}")) {
                System.out.println("Phần sau phải gồm đúng 9 chữ số");
            } else {
                System.out.println("Định dạng mã thẻ không hợp lệ");
            }
        }
    }
}
