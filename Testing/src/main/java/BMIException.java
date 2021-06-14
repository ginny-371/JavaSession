import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIException {
    static double tinhBMI() {
        double bmi = 0;
        double weight = 0;
        double height = 0;
        Scanner scanner = new Scanner(System.in);

        while (weight <= 0){
            try{
                System.out.println("Nhập cân nặng: ");
                weight = scanner.nextDouble();
            }catch(Exception e){
                System.out.println("Cân nặng là một số");
                System.exit(0);
            }
        }

        while (height <= 0){
            try{
                System.out.println("Nhập chiều cao: ");
                height = scanner.nextDouble();
            }catch(Exception e){
                System.out.println("Chiều cao là một số");
                System.exit(0);
            }
        }

        bmi = weight / (height*height);

        return bmi;
    }
}
