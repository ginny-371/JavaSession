import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần chỉnh sửa nha: ");
        String str = sc.nextLine();
        ChinhSuaChuoi scn = new ChinhSuaChuoi();
        scn.XoaKyTuTrung(str);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ho ten");
//        String HoTen = sc.nextLine();
//        System.out.println("Nhap tuoi");
//        String Tuoi = sc.nextLine();
//        System.out.println("Nhap dia chỉ: ");
//        String DiaChi = sc.nextLine();
//        NhapThongTinCaNhan inThongTin = new NhapThongTinCaNhan();
//        inThongTin.inThongTinCaNhan(HoTen,Tuoi,DiaChi);
    }
}
