public class Baitap1 {
    public static void main(String[] args) {
        double height, weight , bmi;
        System.out.println("Nhap chieu cao :");
        height = Double.parseDouble(Main.sc.nextLine());
        System.out.println("Nhap can nang ");
        weight = Double.parseDouble(Main.sc.nextLine());

        // tinh bmi
        bmi = weight/(height*height);
        if (bmi<16){
            System.out.println("Gầy cấp độ 3");
        }else if(bmi<17){
            System.out.println("Gầy cấp độ 2");
        }else if(bmi<18.5){
            System.out.println("Gầy cấp độ 1");
        }else if(bmi<25){
            System.out.println("Bình thường");
        }else if(bmi<30){
            System.out.println("Béo phì");
        }else if(bmi<35){
            System.out.println("Béo phì độ 1");
        }else if(bmi<40){
            System.out.println("Béo phì độ 2");
        }else {
            System.out.println("Béo phì độ 3");
        }
    }
}
