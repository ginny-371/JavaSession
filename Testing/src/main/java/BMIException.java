import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIException {
    static Float tinhBMI() throws CheckingException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap chieu cao: ");
            float height = sc.nextFloat();
            System.out.println("Nhap can nang: ");
            float weight = sc.nextFloat();
            if (height<=0||weight<=0) throw new CheckingException("Chiều cao/Cân nặng phải lớn hơn 0");
            Float BMI = weight/(height*height);
            return BMI;
        }catch (InputMismatchException e1){
            throw new CheckingException("Cân nặng/Chiều cao phải là 1 số");
        }
    }
}
