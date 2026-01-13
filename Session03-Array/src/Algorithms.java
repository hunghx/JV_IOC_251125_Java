import java.util.Arrays;
import java.util.Random;

public class Algorithms {
    public static void main(String[] args) {
        // Thuật toán tìm kiếm tuyến tính
        // Sử dụng vòng lặp for để duyệt + kiểm tra điều kiện tìm kiếm với IF
        // tìm ra các số chia hết cho 3 trong 1 mảng số nguyên

        // tạo random 1 mảng số nguyên 100 phần tử
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

//        // in mảng
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] %3 == 0) {
//                System.out.printf("%d ", array[i]);
//            }
//        }
        // Tạo mảng lưu trữ 20 số nguyên số đầu tiên
        // Tìm và lưu 20 số nguyên tố đó vào mảng đã tạo
//        int[] arrayPrime = new int[20];
//        int n = 2, count = 0;
//        while(count < 20){
//            boolean isPrime = true;
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                    if (n % i == 0){
//                        // ko phải số nguyên tố
//                        isPrime = false;
//                        break;
//                    }
//            }
//            if(isPrime){
//                // là số nguyên tố
//                arrayPrime[count++] = n;
//            }
//            n++;
//        }
//        System.out.println(Arrays.toString(arrayPrime));

//        // Thuật toán sắp xếp nổi bọt :
//        for (int i = 0; i < array.length - 1  ; i++) {
//            for (int j = 0; j < array.length - i - 1 ; j++) {
//                if (array[j] > array[j+1]){
//                    // đổi chỗ
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));

        // 7,4,6,1,3 -- tăng dần
        // [4,7],6,1,3
        // 4,[6,7],1,3
        // 4,6 [1,7],3
        // 4,6,1,[3,7]

        // lần 2 : nổi số 6
        Arrays.sort(array); // quicksort

    }
}
