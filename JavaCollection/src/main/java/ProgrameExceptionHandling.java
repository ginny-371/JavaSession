public class ProgrameExceptionHandling extends Exception {
    public static boolean isVowel(char c) {
        if (c == 'e' || c == 'o' || c == 'a' || c == 'i' || c == 'U' || c == 'E' || c == 'O' || c == 'A' || c == 'I') {
            return true;
        } else return false;
    }

    public boolean isGreaterThan(String a, String b) {
        int compare = a.compareToIgnoreCase(b);
        if (compare < 0) {
            return false;
        } else {
            return true;
        }
    }
    public void sort(String[] array) {
        for (int i = 0; i< array.length-1; i++){
            for (int j = i+1; j <array.length; j++){
                if (isGreaterThan(array[i],array[j])){
                    String temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
