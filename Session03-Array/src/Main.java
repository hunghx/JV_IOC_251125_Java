import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai báo mảng số nguyên có 10 phân tử
        int [] arrInt = new int[10];
        int [] arrInt1 = new int[]{1,2,3,4,5,6}; // cú pháp đầy đủ

        // 2 thành phần của mảng : Phân tử và vị tri
        // Lấy phần tử dựa theo vị trí
        System.out.println("Phan tu tai index =2 là : "+ arrInt[2]);
        arrInt[2] = 100;
        System.out.println("Phan tu tai index =2 là : "+ arrInt[2]);

        // Mảng 2 chiểu
        int[][] arr2D = new int[10][5];
        int[][] arr2D1 = {{1,2,3,4,5},{6,7,8,9,0}}; // {A,B}
        // phan tủ có giá trị = 5
        System.out.println("array "+ arr2D1[0][4]);

        // Duyệt mảng : duyệt qua lần lượt từng giá trị trong mảng
        for (int i = 0; i < arrInt1.length; i++) {
            System.out.println("Array[i] = "+ arrInt1[i]);
        }

        for (int i = 0; i < arr2D1.length; i++) {
            for (int j = 0; j < arr2D1[i].length; j++) {
                System.out.println("Array[i][j] = "+ arr2D1[i][j]);
            }
        }

        // Tạo mảng lưu trữ danh sách điểm thi của 10 môn học nhập từ bàn phím
        // Duyệt mảng thực hiện tính : Điểm trung bình, điểm cao nhất, điểm thấp nhất của sinh viên

        double[] points = new double[10];
        // nhập điểm
        for (int i = 0; i < 10; i++) {
            System.out.printf("Nhap diem só thu %d : " , (i+1));
            points[i] = Double.parseDouble(sc.nextLine());
        }
        double sum = 0, min=points[0], max = points[0];
        // thực hiện tính toán
        for (int i = 0; i < points.length ; i++) {
            sum+= points[i];
            if (points[i] > max){
                max = points[i];
            }
            if (points[i] < min){
                min = points[i];
            }
        }
        System.out.printf("Diểm trung bình là %.2f \n",sum/points.length);
        System.out.printf("Diểm lơn nhất là %.2f \n",max);
        System.out.printf("Diểm nhỏ nhất là %.2f \n",min);
    }
}
