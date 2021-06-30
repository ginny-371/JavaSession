package JavaBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DanhsachNhanVien {
    public void nhapNhanVien() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap so lượng nhân viên: ");
            int number = sc.nextInt();
            sc.nextLine();
            String[] arr = new String[number];
            for ( int i=0; i<arr.length; i++){
                System.out.println("Nhập mã nhân viên: ");
                arr[i]= sc.nextLine();
                if ( arr[i].matches("NV\\d{7}")){
                    for (int j =0; j< i;j++){
                        if(arr[j].equals(arr[i])) {
                            throw new CheckingException("Trùng mã nhân viên rồi bạn ơi");
                        }
                    }
                } else {
                    throw new CheckingException("Nhập sai format rồi, nhập lại đi nhé");
                }
            }
            for (int i=0;i<arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println(arr);
        }catch (InputMismatchException ex1){
            System.out.println("Số lượng nhân viên phải là một số"+ ex1.getCause());
        }catch (NegativeArraySizeException ex2){
            System.out.println("Kicks thươc mang phải lớn hơn 0");
        } catch (CheckingException ex1) {
            System.out.println(ex1.getMessage());
        }
    }
}
