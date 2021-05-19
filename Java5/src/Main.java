import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng n = ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng nhé: ");
        for ( int i=0; i<n; i++){
            arr[i]= scanner.nextInt();
        }

        Max max = new Max();
        max.timMax(arr);

        Min min = new Min();
        min.timMin(arr);

        Second second = new Second();
        second.timSecond(arr);

    }
}
