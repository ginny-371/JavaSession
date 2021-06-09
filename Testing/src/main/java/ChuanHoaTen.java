import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class ChuanHoaTen{
    public void formatFullName(){
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            check = true;
            System.out.println("Nhập tên của bạn: ");
            String fname = scanner.nextLine();
            System.out.println("Tên bạn đã nhập: \n"+fname);
            for(char c : fname.toCharArray()){
                if(isDigit(c)){
                    System.out.println("Ôi nhập lại nhé vì bạn nhập cả số vào tên rồi");
                    check =  false;
                    break;
                }
            }
            if(check){
                fname = chuannHoa(fname);
                System.out.println("Chuỗi sau khi chuẩn hóa là:\n"+fname);
                break;
            }
        }
    }
    static String chuannHoa(String st) {
        st=st.trim();
        st = st.replaceAll("\\s+", " ");
        String[] temp= st.split(" ");
        st="";
        for(int i=0;i<temp.length;i++) {
            st+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                st+=" ";
        }
        return st;
    }
}
