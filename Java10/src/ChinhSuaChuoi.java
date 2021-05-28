import java.util.ArrayList;
import java.util.Scanner;

public class ChinhSuaChuoi {
    public void XoaKyTuTrung(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);
            if (str1.indexOf(character) <0) {
                str1=str1+character;
            }
        }
        System.out.println(str1);
    }
}
