public class Bai8 {
    public void demSoTu(){
        char daucach = ' ';
        int dem = 0;
        String chuoi = "You only live       once, but if you do it right, once is enough";
        chuoi = chuoi.trim();
        chuoi = chuoi.replaceAll("\\s+", " ");
        for (int i=0; i< chuoi.length(); i++){
            if (chuoi.charAt(i) == daucach){
                dem++;
            }
        }
        System.out.println("Số từ trong câu là "+(dem+1));
    }
}

