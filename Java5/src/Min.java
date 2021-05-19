public class Min {
    public void timMin(int arr[]) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nGiá trị min là: "+min);
        System.out.print("Chỉ số của min là: ");
        for (int j = 0; j < arr.length; j++){
            if(arr[j]==min){
                System.out.print("\t"+j);
            }
        }
    }
}
