import java.util.Scanner;

public class BaiTongHop {

    public static void main(String[] args) {
        int[] arr = null;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        boolean isActive = false;
        while(true){
                 System.out.println("""
                -------------MENU--------------------
                1. Nhập số lượng phần tử cần khởi tạo (số phần tử thực tế và giá trị)
                2. Tìm và in ra giá trị lớn nhất, nhỏ nhất
                3. Tìm giá trị lớn thứ 2
                4. Tìm ra các số chính phương trong mảng
                5. Tính tổng lũy thừa bậc 3 của các số trong mảng
                6. Thoát
                """);
                 int choice;
            System.out.println("Nhap chuc nang : ");
            choice = Integer.parseInt(sc.nextLine());
            if(choice>=2 &&choice<=5){
                if (!isActive){
                    System.err.println("Ban phai chon chuc nang 1 truoc");
                    continue;
                }
            }
            switch (choice) {
                case 1:
                    isActive = true;
                    System.out.println("Nhap so luong phan tu : ");
                    n = Integer.parseInt(sc.nextLine());
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Nhap arr[%d] = ", i);
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2: {

                }
                break;
                case 3:
                {
                    // tìm số lơn thư 2
                    int max1 = arr[0], max2= arr[0];
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > max1){
                            max2 = max1;
                            max1 = arr[i];
                        }else {
                            if (arr[i]> max2){
                                max2 = arr[i];
                            }
                        }
                    }
                    System.out.printf("Gia tri lon thu 2 tỏng mang la %d \n", max2);
                }
                    break;
                case 4:
                {
                    for (int i = 0; i < n; i++) {
                        double a = Math.sqrt(arr[i]);
                        int b = (int)a;
                        if(a-b == 0){
                            // sô chinh phuong
                            System.out.printf(" %d", arr[i]);
                        }
                    }
                }
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Thoat chuong trìn!!!h");
                    sc.close();
                    return;
                default:
                    System.err.println("Lua chon ko hop le !!!");
            }
        }


    }
}
