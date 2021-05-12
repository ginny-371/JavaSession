import java.util.Scanner;

public class DateOfMonthIfElse {
    public void printDateOfMonth(){
        Scanner month = new Scanner(System.in);
        System.out.println("Enter month: ");
        int number = month.nextInt();
        if (number==1||number==3||number==5||number==7||number==8||number==10||number==12) {
            System.out.println("Tháng "+number+ " có 31 ngày");
        }
        else if (number==2) {
            System.out.println("Tháng 2 có 28 hoặc 29 ngày");
        }
        else if (number==4||number==6||number==9|number==11) {
            System.out.println("Tháng "+number+ " có 30 ngày");
        }
        else {
            System.out.println("Khong phai thang trong năm");
        }
    }
}
