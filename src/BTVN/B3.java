package BTVN;

import java.util.Date;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };
        Date now = new Date();
        int day = now.getDate();
        int month = now.getMonth() + 1;
        int year = now.getYear() + 1900;
        String today = day + "/" + month + "/" + year;

        long startBuilder = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();
        builder.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        builder.append("Ngày tạo: ").append(today).append("\n");

        for (String t : transactions) {
            builder.append("Giao dịch: ").append(t).append("\n");
        }

        long endBuilder = System.currentTimeMillis();

        long startString = System.currentTimeMillis();

        String report = "";
        report += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        report += "Ngày tạo: " + today + "\n";

        for (String t : transactions) {
            report += "Giao dịch: " + t + "\n";
        }

        long endString = System.currentTimeMillis();

        System.out.println(builder.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endBuilder - startBuilder));
        System.out.println("Số thời gian thực thi đối với String: " + (endString - startString));

        sc.close();
    }
}
