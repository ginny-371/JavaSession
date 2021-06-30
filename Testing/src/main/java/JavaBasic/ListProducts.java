package JavaBasic;

import java.util.ArrayList;

public class ListProducts {
    ArrayList<Product> listProduct = new ArrayList<>();
    public void addProduct(){
        listProduct.add(new Product(1, "Thịt Gà", 10, 45.000));
        listProduct.add(new Product(2, "Thịt lợn", 10, 90.000));
        listProduct.add(new Product(3, "Thịt Bò", 10, 200.000));
    }

    //In ra các sản phẩm
    public void printProduct() {
        System.out.println("In các sản phẩm");
        for (Product x : listProduct) {
            System.out.println(x);
        }
    }
    //Update sản phẩm
    public void updateProduct(){
        System.out.println("Tìm kiếm sản phẩm thịt gà");
        for (int i = 0; i < listProduct.size(); i++) {
        if (listProduct.get(i).productName=="Thịt Gà") {
            System.out.println(listProduct.get(i));
            }
        }
        System.out.println("Sửa sản phẩm");
        for(int i = 0; i<listProduct.size(); i++){
        if(listProduct.get(i).productID ==1){
//                listProduct.get(i).productName="Thịt gà";
            listProduct.set(i,new Product(listProduct.get(i).productID,"Thịt gà",listProduct.get(i).quantity,listProduct.get(i).price));
            }
        }
    }
    //Xóa sản phẩm

    public void removeProduct() {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).productID == 1) {
                listProduct.remove(listProduct.get(i));
            }
        }
        System.out.println("in thông tin sau khi Xóa");
        for (Product x : listProduct) {
            System.out.println(x);
        }
    }
}
