public class Max {
    public void timMax(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Giá trị max là: "+max);
        System.out.print("Chỉ số của max là: ");
        for (int j = 0; j < arr.length; j++){
            if(arr[j]==max){
                System.out.print("\t"+j);
            }
        }
    }
}
