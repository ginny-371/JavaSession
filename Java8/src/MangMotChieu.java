import java.util.Scanner;

public class MangMotChieu {
    static boolean isPrimeNumber(int n){
        if (n<2){
            return false;
        }
        for (int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void inSoNguyenToCuaMang (int array[]){
        int tong=0;
        System.out.println("In ra các số nguyên tố của mảng ");
        for (int i=0;i<array.length;i++){
            if (isPrimeNumber(array[i])){
                System.out.print(array[i]);
                tong=tong+array[i];
            }
        }
        System.out.println("Tổng của các số nguyên trong mảng là: "+tong);
    }

    static void suaPhanTuCuaMang(int array[]){
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập k:");
        int k = sc.nextInt();
        if (k<0||k>array.length){
            System.out.println("Không tồn tại vị trí K");
        }
        else {
            System.out.println("Nhập giá trị muốn thay đổi: ");
            m=sc.nextInt();
            array[k]=m;
        }
        for (int i=0;i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
