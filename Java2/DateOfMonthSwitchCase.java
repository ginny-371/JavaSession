import java.util.Scanner;

public class DateOfMonthSwitchCase {
    public void printDateOfBirth() {
        Scanner month = new Scanner(System.in);
        System.out.println("Enter month: ");
        int number = month.nextInt(); //đọc kết quả vừa đc nhập vào.

        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " +number+" có 31 ngày");
                break;
            case 2:
                System.out.println("Thang 2 có 28 or 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " +number+" có 30 ngày");
                break;
            default:
                System.out.println("Không phải tháng");
                break;
        }
    }
}

