package JavaBasic;

import java.util.Scanner;

public class Bai2 {
    public void validatePassword() {
        Scanner sc = new Scanner(System.in);
        String pw = "";
        System.out.println("Nhập mật khẩu: ");
        pw = sc.nextLine();
        if (pw.length() < 10) {
            System.out.println("Mật khẩu yếu");
        } else {
            if (pw.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*.,\\d-_?&]{10,}$")) {
                System.out.println("Mật khẩu mạnh");
            } else System.out.println("Mật khẩu chưa đủ mạnh");
        }
    }
}

