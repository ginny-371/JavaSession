import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Bài 1");
        System.out.print("Nhập số hàng, cột của ma trận vuông: ");
        n = sc.nextInt();
        int m = n;
        int[][] mangA = new int[n][m];
        int[] mangB = new int[n];
        for (int i = 0; i < n; i++) {
            mangB[i] = sc.nextInt();
        }
//        MangDaChieu inMang = new MangDaChieu();
//        inMang.taoMang(n,m,mangA);
//        inMang.inMang(mangA);
//        inMang.listPhanTuDuongCheoChinh(mangA);
//        inMang.sapXepHang2(mangA);

        MangMotChieu mc = new MangMotChieu();
        //System.out.println(mc.isPrimeNumber(6));
        mc.inSoNguyenToCuaMang(mangB);
        mc.suaPhanTuCuaMang(mangB);
    }
}
