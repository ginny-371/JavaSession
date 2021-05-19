public class Second {
    public void timSecond(int arr[]) {
        int max = arr[0];
        int second = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] != max) {
                if (arr[k]>second)
                second = arr[k];
            }
        }
        System.out.println("\nSố lớn thứ 2 là "+second);
        System.out.print("Chỉ số của số lớn thứ 2 là: ");
        for (int j = 0; j < arr.length; j++){
            if(arr[j]==second){
                System.out.print("\t"+j);
            }
        }
    }
}
