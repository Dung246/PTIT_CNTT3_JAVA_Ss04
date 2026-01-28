package BTVN;

import java.util.Date;
import java.util.regex.Pattern;

public class BTTH {
    public static void main(String[] args) {

        String bookId = "LIB-2024-S";
        String isbn = "0123456789";
        String rawTitle = "  cấu trúc dữ   liệu và   giải   thuật ";
        String rawAuthor = "  nguyỄn   vĂn   a ";
        int publishYear = 2023;

        if (!Pattern.matches("LIB-\\d{4}-S", bookId)) {
            System.out.println("Mã sách không hợp lệ");
            return;
        }

        if (!Pattern.matches("\\d{10}", isbn)) {
            System.out.println("ISBN không hợp lệ");
            return;
        }

        Date now = new Date();
        int currentYear = now.getYear() + 1900;
        if (!Pattern.matches("\\d{4}", String.valueOf(publishYear)) || publishYear > currentYear) {
            System.out.println("Năm xuất bản không hợp lệ");
            return;
        }

        String title = formatName(rawTitle);
        String author = formatName(rawAuthor);

        StringBuilder citation = new StringBuilder();
        citation.append("[")
                .append(bookId)
                .append("] - ")
                .append(title)
                .append(" - ")
                .append(author)
                .append(" (")
                .append(publishYear)
                .append(")");

        System.out.println("----- KẾT QUẢ BIÊN MỤC -----");
        System.out.println("Mã sách chuẩn: " + bookId);
        System.out.println("ISBN-10: " + isbn);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Năm XB: " + publishYear);
        System.out.println("Trích dẫn: " + citation);
    }

    public static String formatName(String input) {
        input = input.trim().replaceAll("\\s+", " ");
        String[] words = input.toLowerCase().split(" ");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        return result.trim();
    }
}
