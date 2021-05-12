import java.util.Scanner;

public class GiaiPhuongTrinh {
    public void timGiatri(){
        Scanner nhapA = new Scanner(System.in);
        System.out.println("Nhap a = ");
        float a = nhapA.nextInt();

        Scanner nhapB = new Scanner(System.in);
        System.out.println("Nhap b = ");
        float b = nhapB.nextInt();

        Scanner nhapC = new Scanner(System.in);
        System.out.println("Nhap c = ");
        float c = nhapC.nextInt();

        float x1;
        float delta = b*b - 4*a*c;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }

}
