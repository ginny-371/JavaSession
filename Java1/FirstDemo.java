public class FirstDemo {
    public static void main(String args[]){
        Rectangle calcul = new Rectangle();
        System.out.println("Chu vi hinh vuong là: "+ calcul.chuVi());
        System.out.println("Dien tich hinh vuong la: "+ calcul.dienTich());

        Circle circleCal = new Circle();
        System.out.println("Chu vi hình tròn là: "+ circleCal.chuVi());
        System.out.println("Dien tich hinh vuong la: "+ circleCal.dienTich());
    }
}
