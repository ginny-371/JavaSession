public class HamTang {
    public double tinhHamTang1(int n) {
        double tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += 1.0 / i;
        }
        return tong;
    }

    public float tinhHamTang2(int n) {
        float tong = 0, t = 0;
        for (int i = 0; i <= n; i++) {
            t = 2 * i;
            tong = tong + (float) (t + 1) / (t + 2);
        }
        return tong;
    }

    public void daoSo(int n) {
        int y = 0;
        while (n > 0) {
            y = n % 10;
            n = n / 10;
            System.out.print(y);
        }
    }

    public void laSoDaoNguoc(int n) {
        int y = 0;
        while (n > 0) {
            y = n % 10 + y * 10;
            n = n / 10;
        }
        System.out.println("số sau khi đảo là: "+y);
    }
}
