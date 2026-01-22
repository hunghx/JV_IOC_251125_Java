import java.util.Scanner;

public class Product {
    /*
    -- Bài tập 1:
Khai báo lớp Product gồm :
- thuộc tính : Mã sản phẩm, tên sản phẩm, mô tả, giá tiền, tồn kho, trạng thái (ẩn/hiện)
- phương thức :
	+ Hàm tạo ko có tham số
	+ Hàm tạo đầy đủ tham số
	+ phương thức displayInfo để in ra toàn bộ thông tin
	+ phương thức inputData để nhập tất cả thông tin
     */
    private String productId;
    private String productName;
    private String description;
    private double price;
    private int stock;
    private boolean isVisible;

    public Product() {
        this("P003", "Default Product", "This is a default product description.", 0.0, 0, true);
    }

    public Product(String productId, String productName, String description, double price, int stock, boolean isVisible) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.isVisible = isVisible;
    }
    public void displayInfo(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Visibility: " + (isVisible ? "Visible" : "Hidden"));
    }
    public void inputData(Scanner sc){
        System.out.print("Enter Product ID: ");
        productId = sc.nextLine();
        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();
        System.out.print("Enter Description: ");
        description = sc.nextLine();
        System.out.print("Enter Price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Stock: ");
        stock = Integer.parseInt(sc.nextLine());
        System.out.print("Is the product visible? (true/false): ");
        isVisible = Boolean.parseBoolean(sc.nextLine());
    }

    // ko dùng hàm tạo để tạo đối tượng
    public Product createProduct(){
        return this;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.err.println("Price cannot be negative. Setting to 0.");
        }else {
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
