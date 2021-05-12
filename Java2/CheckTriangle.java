import java.util.Scanner;

public class CheckTriangle {
    public void isTriangle(){
        Scanner canh1 = new Scanner(System.in);
        System.out.println("Canh 1: ");
        int a = canh1.nextInt();

        Scanner canh2 = new Scanner(System.in);
        System.out.println("Canh 2: ");
        int b = canh2.nextInt();

        Scanner canh3 = new Scanner(System.in);
        System.out.println("Canh 3: ");
        int c = canh3.nextInt();

        if ((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println("Là 3 cạnh của tam giác");
        }
        else {
            System.out.println("Không là 3 cạnh của tam giác");
        }
    }
}
