import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // whilePrimeNumber();
       // doWhilePrimeNumber();
        forPrimeNumber();
        Factorial x = new Factorial();
        x.countFactorial(6);
    }

    //Bai 1 dùng While
    static void whilePrimeNumber() {
        PrimeNumber pm = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Nhập n = ");
        int n = sc.nextInt();

        //List ra n số nguyên tố đầu tiên.
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (pm.isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }

        //In ra các số nguyên tố nhỏ hơn 100
        System.out.printf("\n Các só nguyên tố nhỏ hơn 100 là: ");
        int j = 0;
        while (j < 100) {
            if (pm.isPrimeNumber(j)) {
                System.out.print(j + "\t");
            }
            j++;
        }

    }
    // Bài 1 dùng do while
    static void doWhilePrimeNumber() {
        PrimeNumber pm = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Nhập n = ");
        int n = sc.nextInt();

        //List ra n số nguyên tố đầu tiên.
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0;
        int i = 2;
        do {
            if (pm.isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
            while (dem < n);
        //In ra các số nguyên tố nhỏ hơn 100
        System.out.println("\n Các só nguyên tố nhỏ hơn 100 là: ");
        int j = 0;
        do {
            if (pm.isPrimeNumber(j)) {
                System.out.print(j + "\t");
            }
            j++;
        }
        while (j < 100);
    }
    // Bài 1 làm theo for
    static void forPrimeNumber() {
        PrimeNumber pm = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Nhập n = ");
        int n = sc.nextInt();

        //List ra n số nguyên tố đầu tiên.
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem=0;
        for (int i=0; dem<n; i++)
            if (pm.isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
        //In ra các số nguyên tố nhỏ hơn 100
        System.out.print("Các só nguyên tố nhỏ hơn 100 là: ");
        for (int j= 0; j<100;j++){
            if (pm.isPrimeNumber(j)){
                System.out.print(j+"\t");
            }
        }
    }
}



