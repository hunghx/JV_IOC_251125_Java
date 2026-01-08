public class Baitap2 {
    public static void main(String[] args) {
        System.out.println("+-------------------MENU-----------------+");
        System.out.println("1.Tính tổng n so tự nhiên đầu tiên");
        System.out.println("2.Tính thuong 2 số a và b");
        int choice;
        System.out.println("Nhap vao lựa chọn :");
        choice = Integer.parseInt(Main.sc.nextLine());
        switch (choice){
            case 1:
            {
                int n;
                System.out.println("Nhap vao so tu nhien n");
                n = Integer.parseInt(Main.sc.nextLine());
                System.out.printf("Tong cua %d so tu nhien dau tien la %d !\n",n, n*(n+1)/2);
                break;
            }
            case 2:
            {
                double a,b;
                System.out.println("Nhap so a : ");
                a = Double.parseDouble(Main.sc.nextLine());
                System.out.println("Nhap so b : ");
                b = Double.parseDouble(Main.sc.nextLine());
                if(b ==0){
                    System.err.println("ko the chia cho 0");
                }else {
                    System.out.printf("%.1f chia cho %.1f băng %.1f",a,b,a/b);
                }
                break;
            }
            default:
                System.err.println("Ko có lua chon hop le");
        }
    }
}
