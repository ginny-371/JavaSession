import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CheckingException {
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Thịt Gà", 10, 45.000));
        listProduct.add(new Product(2, "Thịt lợn", 10, 90.000));
        listProduct.add(new Product(3, "Thịt Bò", 10, 200.000));
        //In ra các sản phẩm
        System.out.println("in các sản phẩm");
        for(Product x:listProduct){
            System.out.println(x);
        }
        //Tìm kiếm sản phẩm theo tên
        System.out.println("Tìm kiếm sản phẩm thịt gà");
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).productName=="Thịt Gà") {
                System.out.println(listProduct.get(i));
            }
        }
        //Sửa sản phẩm
        System.out.println("Sửa sản phẩm");
        for(int i = 0; i<listProduct.size(); i++){
            if(listProduct.get(i).productID ==1){
//                listProduct.get(i).productName="Thịt gà";
                listProduct.set(i,new Product(listProduct.get(i).productID,"Thịt gà",listProduct.get(i).quantity,listProduct.get(i).price));
            }
        }
        System.out.println("In danh sách sản phẩm sau khi edit");
        for(Product x:listProduct){
            System.out.println(x);
        }
        //Xóa sản phẩm
        for(int i = 0; i<listProduct.size(); i++){
            if(listProduct.get(i).productID ==1){
                listProduct.remove(listProduct.get(i));
            }
        }
        System.out.println("in thông tin sau khi Xóa");
        for(Product x:listProduct){
            System.out.println(x);
        }

        ArrayList<Staff> listStaff = new ArrayList<>();
        listStaff.add(new Staff("NV1","Dong",29, "Hai Bà Trưng, Hà Nội", "0122123434"));
        listStaff.add(new Staff("NV2","Ngoc",25,"Hoàng Mai","0922123434"));
        listStaff.add(new Staff("NV3","Brian",25,"Vĩnh Tuy, Hà Nội","0122123434"));

        for(Staff x:listStaff){
            System.out.println(x);
        }
        Scanner sc = new Scanner(System.in);
        Boolean flag = false;
        System.out.println("Nhập tên nhân viên bạn muốn tìm kiếm: ");
        String name = sc.nextLine();
        for(int i = 0; i<listStaff.size(); i++){
            if(listStaff.get(i).name.contains(name)) {
                listStaff.set(i, new Staff(listStaff.get(i).id, "Lan", 29, "Hai Bà Trưng, Hà Nội", "0122123434"));
                flag = true;
            }
        }
        if (flag==false){
            System.out.println("Không tìm thấy nhân viên");
        }

        boolean flag2 = false;
        System.out.println("Nhập id bạn muốn tìm kiếm: ");
        String id = sc.nextLine();
        for(int i = 0; i<listStaff.size(); i++){
            if(listStaff.get(i).id.contains(id)) {
                listStaff.remove(listStaff.get(i));
                flag2 = true;
            }
        }
        if (flag2==false){
            System.out.println("Không tìm thấy nhân viên");
        }
        System.out.println("In danh sách sau khi xóa nhân viên id= "+id);
        for(Staff x:listStaff){
            System.out.println(x);
        }

            //Bai 1
//        BMIException tc = new BMIException();
//        System.out.println("Chỉ số BMI là: "+tc.tinhBMI());
            //Bai 2
//        NumberComparation nc = new NumberComparation();
//        nc.compareNumber();
            //Bai 3
//        DanhsachNhanVien dsnv = new DanhsachNhanVien();
//        dsnv.nhapNhanVien();

            //Bai1
//        String str = new String("You Only Live Once. But if You do it right. One is Enough");
//        Bai1 b1 = new Bai1();
//        b1.xuLyChuoi(str);

            //Bai2
//        Bai2 b2 = new Bai2();
//        b2.validatePassword();

//        //Bai3
//        Bai3 b3 = new Bai3();
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
//        ChuanHoaTen cht = new ChuanHoaTen();
//        cht.chuannHoa("Tống  thị Đông   ");
//        cht.formatFullName();

    }
}
