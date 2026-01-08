import java.util.Scanner;

public class DecisionMarking {
    public static void main(String[] args) {
        // IF , ELSE IF, ELSE
        // điều kiện phải là 1 biều thức trả về kiểu boolean
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("Nhap gia tri cua a : ");
        a = Integer.parseInt(sc.nextLine());
//        if(a>0){
//            // thuc hien khi điều kiện đúng
//            System.out.println("A lon hon 0 !");
//        }else if(a > -10){
//            System.out.println("A nhỏ hơn hoặc bằng 0 và lớn hơn -10");
//        }else{
//            System.out.println("A nhỏ hơn hoặc bằng -10");
//        }

        // toán tử ba ngôi
//        int result = a>0 ? 0: a>-10 ? 1 : 2;
//        switch (result){
//            case 0:
//            case 1:
//            default:
//
//        }

        // Switch
        // Biểu thức xét điều kiện phải tr về giá trị : number, numeric, char, string
        switch (a){
            // xet tung trường hợp
            case 0:
            {
                // thuc hien khi a = 0
                System.out.println("a băng 0");
                break;
            }
            case 1:
            {
                // thuc hien khi a = 1
                System.out.println("a băng 1");
                break;
            }
            default:
                System.out.println("ko có truong họp nao thỏa mãn");
        }
//        if(a == 0){
//
//        } else if (a==1) {
//
//        }else {
//
//        }

    }
}
