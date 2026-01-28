package BTVN;

public class B1 {
    public static void main(String[] args) {
        String title = "   lập   TRÌNH   java   cơ   bản   ";
        String author = "  nguyỄn   vĂn   a  ";

        title = title.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");
        title = title.toUpperCase();

        String[] words = author.toLowerCase().split(" ");
        String resultAuthor = "";
        for (String w : words) {
            resultAuthor += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        resultAuthor = resultAuthor.trim();
        String result = "[" + title + "] - Tác giả: " + resultAuthor;
        System.out.println(result);
    }
}
