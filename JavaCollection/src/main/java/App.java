import lombok.AllArgsConstructor;

import java.util.*;

public class App {

    public static void main(String[] args) {
        PersonRepository repository = new PersonRepository();
        ProgrameExceptionHandling an = new ProgrameExceptionHandling();
//        System.out.println(an.isVowel('d'));
//       System.out.println(repository.Bai2());
//       System.out.println(repository.maleFemaleRatio());
//       System.out.println(repository.maleFemaleRatioByJob());
//       repository.addPerson();
//        repository.addPerson();
//        System.out.println("\n");
//        repository.editPerson();

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String vowel = "";
//        String constant = "";
//
//        for (int i = 0; i < str.length(); i++){
//            char c = str.charAt(i);
//            if(an.isVowel(c)){
//                vowel=vowel.concat(String.valueOf(c));
//                vowel=vowel.concat(" ");
//            }else if ( c !=' '){
//               constant= constant.concat(String.valueOf(c));
//               constant=constant.concat(" ");
//            }
//        }
//        System.out.print("vowel là: "+vowel);
//        System.out.println();
//        System.out.println("Constant là: "+constant);
    //Bai 2
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        String[] array = str1.split("\\ ");
        an.sort(array);
            for (int i = 0; i<array.length; i++){
                System.out.println(array[i]);
            }
        }
//    public static boolean isGreaterThan(String a, String b) {
//        int compare = a.compareToIgnoreCase(b);
//        if (compare < 0) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//    public static void sort(String[] array) {
//        for (int i = 0; i< array.length-1; i++){
//            for (int j = i+1; j <array.length; j++){
//                if (isGreaterThan(array[i],array[j])){
//                    String temp = array[i];
//                    array[i]= array[j];
//                    array[j]=temp;
//                }
//            }
//        }
//    }
}
