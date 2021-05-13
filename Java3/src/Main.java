import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main fB = new Main();
        fB.inFizzBuzz();

        Main inW = new Main();
        inW.inWhile();

        //Check một số có phải số nguyên tố không
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int i = sc.nextInt();
        if (isPrimeNumber(i)) {
            System.out.println(i + " là số nguyên tố");
        } else System.out.println(i + " không là số nguyên tố");
    }


        //In các số nguyên tố nhỏ hơn 100
        /*System.out.print("Các só nguyên tố nhỏ hơn 100 là: ");
        for (int i= 0; i<100;i++){
            if (isPrimeNumber(i)){
                System.out.print(i+"\t");
            }
        }*/

    public void soChan() {
        int sum = 0;
        System.out.print("Day so chan tu 0-50: ");
        for (int j = 0; j < 51; j++) {
            if (j % 2 == 0) {
                System.out.print("\t" + j);
                sum += j;
            }
        }
        System.out.println("\nTong là : " + sum);
    }

    public void inFizzBuzz() {
        for (int k = 1; k < 101; k++) {
            if (k % 3 == 0) {
                if (k % 5 == 0) {
                    System.out.println(k+" FizzBuzz");
                }
                else System.out.println(k+" Fizz");
            }
            else {
                if (k%5==0) {
                    System.out.println(k+" Buzz");
                }
                System.out.println(k+" không chia hết cho 3 và 5");
            }
        }
    }

    public void inWhile(){
        int l=50;
        while(l>=0){
                System.out.println(l);
                l = l - 2;
        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}


