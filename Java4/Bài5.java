public class Bài5 {
    public void indexString(){
        char kytu = 'i';
        int dem = 0;
        String chuoi = "You only live once, but if you do it right, once is enough";
        System.out.print("Vị trí của "+kytu+" trong mảng là: ");
        for (int i=0; i< chuoi.length(); i++){
            if (chuoi.charAt(i) == kytu){
                System.out.printf(i+"\t");
                dem++;
            }
        }
        System.out.println("Số lần xuất hiện "+kytu+ " là " +dem);
    }
}
