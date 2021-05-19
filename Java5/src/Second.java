public class Second {
    public void timSecond(int arr[]) {
        int max = 0;
        int second = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            }
            else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }
        System.out.println("\nSố lớn thứ 2 là:  "+second);
        System.out.print("Chỉ số của số lớn thứ 2 là:");
        for (int j = 0; j < arr.length; j++){
            if(arr[j]==second){
                System.out.print("\t"+j);
            }
        }
    }
}
