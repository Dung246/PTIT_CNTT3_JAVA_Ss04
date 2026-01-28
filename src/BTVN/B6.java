package BTVN;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B6{
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        String[] blacklist = {"tệ", "ngu ngốc", "không đáng đọc"};
        for (String word : blacklist) {
            String regex = "(?i)" + word;
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(review);

            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                String stars = "*".repeat(matcher.group().length());
                matcher.appendReplacement(sb, stars);
            }
            matcher.appendTail(sb);
            review = sb.toString();
        }

        if (review.length() > 200) {
            String cut = review.substring(0, 200);
            int lastSpace = cut.lastIndexOf(" ");
            review = cut.substring(0, lastSpace) + "...";
        }

        System.out.println("Review sau khi xử lý: " + review);
    }
}
