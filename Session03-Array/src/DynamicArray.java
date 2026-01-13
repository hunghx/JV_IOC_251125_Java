import java.util.Arrays;

public class DynamicArray {
    // Mảng trong Java là cố định
    static final int MAX = 1000;
    // Quản lí mảng : thêm, sửa , xóa , tìm kiếm phần tử trong 1 mảng
    public static void main(String[] args) {

        int[] arr = new int[MAX];
        for (int i = 1; i <=6 ; i++) {
            arr[i-1] = i;
        }
        int n = 6;

        // thực hiện các thao tác làm vic cơ bản với mảng
        // chèn
        add(arr,n, 100,2);
        System.out.println(Arrays.toString(arr));
        n++;
        // xoa theo vi tri: dịch các phần  tử bên phải vị trí xóa sang trái 1 ô và giảm kích thước
    }

    public static void add(int[] arr, int n, int value, int idx){
        // 1,2,100,3,4,5 => chen 100 tai idx = 2
        // 1,2, ,3,4,5
        if (n >= MAX){
            System.err.println("Mang da day !!");
        }else {
            // dich cac phan ben phải vị cần chen sang phải 1 ô
            for (int i = n; i > idx ; i--) {
                arr[i] = arr[i-1];
            }
            // gán vào vị trí chèn
            arr[idx] = value;
        }
    }

}
