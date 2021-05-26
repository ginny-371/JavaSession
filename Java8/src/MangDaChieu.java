import java.util.Scanner;

public class MangDaChieu {
    static void taoMang( int n, int m, int arr[][]){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.println("Nhập giá trị cho mảng vị trí "+i+""+j);
                arr[i][j]= sc.nextInt();
            }
        }
    }

    static void inMang (int arr[][]){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void listPhanTuDuongCheoChinh(int array[][]){
        int n= array.length;
        int m= array[0].length;
        int sum=0;
        System.out.print("Đường chéo chính là: ");
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if ( i==j){
                    System.out.print(array[i][j]+" ");
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Tổng đường chéo chính là: "+sum);
    }

    public void sapXepHang2(int array[][]){
        int n= array.length;
        if (n<2) System.out.println("Mảng có 1 hàng");
        else {
            int temp=0;
            System.out.println("Mảng sau khi sắp xếp hàng 2 là: ");
            for (int i=0; i<array[1].length-1; i++){
                for (int j=i+1; j<array[1].length; j++){
                    if (array[1][j]<array[1][i]){
                        temp=array[1][i];
                        array[1][i]=array[1][j];
                        array[1][j]=temp;
                    }
                }
                inMang(array);
            }
        }
    }
}
