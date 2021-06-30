package JavaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class ListStaff {
    ArrayList<Staff> listStaff = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //Add JavaBasic.Staff
    public void addStaff() {
        listStaff.add(new Staff("NV1","Xinh", 29, "Hai Bà Trưng, Hà Nội", "0122123434"));
        listStaff.add(new Staff("NV2", "Dong", 25, "Hoàng Mai", "0922123434"));
        listStaff.add(new Staff("NV3", "Brian", 25, "Vĩnh Tuy, Hà Nội", "0122123434"));
    }
    // Update JavaBasic.Staff
    public void updateStaff() {
        Boolean flag = false;
        System.out.println("Nhập tên nhân viên bạn muốn tìm kiếm: ");
        String name = sc.nextLine();
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).name.contains(name)) {
                listStaff.set(i, new Staff(listStaff.get(i).id, "Lan", 29, "Hai Bà Trưng, Hà Nội", "0122123434"));
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Không tìm thấy nhân viên");
        }else printStaff();
    }
    // Remove JavaBasic.Staff
    public void removeStaff(){
        boolean flag2 = false;
        System.out.println("Nhập id bạn muốn tìm kiếm: ");
        String id = sc.nextLine();
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).id.contains(id)) {
                listStaff.remove(listStaff.get(i));
                flag2 = true;
            }
        }
        if (flag2 == false) {
            System.out.println("Không tìm thấy nhân viên");
        }else printStaff();
    }
    // PrintStaff
    public void printStaff(){
        for(Staff x:listStaff){
            System.out.println(x);
        }
    }
}
