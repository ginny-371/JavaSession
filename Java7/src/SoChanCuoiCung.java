import java.util.Scanner;

public class SoChanCuoiCung {
    public void timSoChanCuoiCung(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n=sc.nextInt();
        int arrayA[]=new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i=0; i<n; i++){
            arrayA[i]=sc.nextInt();
        }

        for (int i=n-1; i>=0;i--){
            if (arrayA[i]%2==0){
                System.out.println("Số chẵn cuối cùng là "+arrayA[i]);
                break;
            }
        }
        System.out.println("-1");
    }
}
