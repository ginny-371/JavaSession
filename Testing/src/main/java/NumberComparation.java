import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberComparation {
    public void compareNumber() throws CheckingException {
        Scanner sc = new Scanner(System.in);
        try {
            Random rd = new Random();
            int a = rd.nextInt(41)+10;
            System.out.println(a);
            System.out.println("Nhập số từ bàn phím: ");
            int b = sc.nextInt();
            while (b<10||b>50){
                System.out.println("Nhập số từ 10 --> 50 bạn nhé: ");
                b= sc.nextInt();
            }
            if (a>b){
                System.out.println("Số random lớn hơn");
            } else if (a<b) {
                System.out.println("Số nhập vào từ bàn phím lớn hơn");
            }else System.out.println(" 2 số bằng nhau nhé");
        }catch (InputMismatchException e){
            throw new CheckingException("Số nhập vào phải là 1 số");
        }

    }
}
