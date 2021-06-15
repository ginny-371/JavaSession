import java.util.Locale;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Bai1 {
    public void xuLyChuoi(String str){
        str=vietHoa(str);
        System.out.println("Viết hoa hết ký tự đầu: " +str);
        str=chuanHoa(str);
        System.out.println("viết hoa ký tự đầu tiên và sau dấm chấm: " + str);

    }
    public static String vietHoa(String str) {
        String[] temp= str.split(" ");
        str="";
        for(int i=0;i<temp.length;i++) {
            str+=String.valueOf(temp[i].charAt(0)).toUpperCase()+temp[i].substring(1);
            if(i<temp.length-1)
                str+=" ";
        }
        return str;
    }
    public static String chuanHoa(String str) {
        str =str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        String[] temp= str.split(" ");
        str="";
        for ( int i =0; i<temp.length; i++){
            if (temp[i].endsWith(".")){
                temp[i+1]=String.valueOf(temp[i+1].charAt(0)).toUpperCase()+temp[i+1].substring(1);
            }
        }
        for (int i=0; i<temp.length;i++){
            str+=String.valueOf(temp[i]);
            if(i<temp.length-1)
                str+=" ";
        }
        return str;
    }
}
