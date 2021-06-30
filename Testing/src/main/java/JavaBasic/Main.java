package JavaBasic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CheckingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách bạn muốn thao tác: ");
        System.out.println("JavaBasic.Staff: Ấn 1");
        System.out.println("JavaBasic.Product: Ấn 2");
        int bt = sc.nextInt();
switch (bt) {
    case 1: {
        ListStaff staff = new ListStaff();
        staff.addStaff();
        System.out.println("In danh sách sau khi add: ");staff.printStaff();
        staff.updateStaff();
        staff.removeStaff();
        break;
    }
    case 2: {
        System.out.println();
        ListProducts products = new ListProducts();
        products.addProduct();
        System.out.println("In danh sách sau khi add: ");products.printProduct();
        products.updateProduct();
        System.out.println("In danh sách sau khi update: ");products.printProduct();
        products.removeProduct();
        System.out.println("In danh sách sau khi xóa: ");products.printProduct();
        break;
    } default:
        System.out.println("Nhập sai rồi");
}



            //Bai 1
//        JavaBasic.BMIException tc = new JavaBasic.BMIException();
//        System.out.println("Chỉ số BMI là: "+tc.tinhBMI());
            //Bai 2
//        JavaBasic.NumberComparation nc = new JavaBasic.NumberComparation();
//        nc.compareNumber();
            //Bai 3
//        JavaBasic.DanhsachNhanVien dsnv = new JavaBasic.DanhsachNhanVien();
//        dsnv.nhapNhanVien();

            //JavaBasic.Bai1
//        String str = new String("You Only Live Once. But if You do it right. One is Enough");
//        JavaBasic.Bai1 b1 = new JavaBasic.Bai1();
//        b1.xuLyChuoi(str);

            //JavaBasic.Bai2
//        JavaBasic.Bai2 b2 = new JavaBasic.Bai2();
//        b2.validatePassword();

//        //JavaBasic.Bai3
//        JavaBasic.Bai3 b3 = new JavaBasic.Bai3();
//        b3.monthOfYear();


//        StringBuilder str = new StringBuilder();
//        StringBuilder str2 = new StringBuilder("Hello Java");
//        StringBuilder str3 = new StringBuilder(50);
//        System.out.println("Trước khi nối: "+str2);
//        str2.append(" và Đông");
//        System.out.println("Sau khi nối: "+str2);
//
//        Example strTest = new Example();
//        System.out.println(strTest.usingInsert(str2));
//        System.out.println(strTest.usingReverse(str2));
//        int i = str2.indexOf("a");
//        System.out.println("Vị trí đầu tiền của chữ a là :" +i);
//        int j = str2.lastIndexOf("a");
//        System.out.println("Vị trí cuối cùng của chữ a là :" +j);
//        System.out.println("Dung lượng chuỗi là:"+str2.capacity());
//        System.out.println("Kích thước chuỗi là:"+str2.length());

//        String [] arr = str2.toString().split("\\s");
//        for (int k = arr.length-1; k>=0; k--){
//            System.out.println(arr[k]);
//        }


//        String rev = new String("Tống Thị Đông");
//        String getS = new String();
//        for ( int i =rev.length()-1; i>=0; i--){
//            getS = getS+ rev.charAt(i);
//        }
//        System.out.println(getS);
//        JavaBasic.ChuanHoaTen cht = new JavaBasic.ChuanHoaTen();
//        cht.chuannHoa("Tống  thị Đông   ");
//        cht.formatFullName();

    }
}
