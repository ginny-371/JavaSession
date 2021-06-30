package JavaBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {
    public void monthOfYear() throws CheckingException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap tháng: ");
            int month = sc.nextInt();
            sc.nextLine();
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("Tháng " + month + " có 31 ngày");
                        break;
                    case 2:
                        System.out.println("Thang 2 có 28 or 29 ngày");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Tháng " + month + " có 30 ngày");
                        break;
                    default:
                        System.out.println("Không phải tháng");
                        break;
                }
        }
        catch (InputMismatchException e){
            System.out.println("Tháng phải là 1 số");
        }
    }
}
