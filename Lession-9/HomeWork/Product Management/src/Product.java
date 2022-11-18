import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private String detail;
    private double price;
    private String unit;
    private int quantity;
    private static int AUTO_ID = 100;

    public Product() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void inputInfo() {
        System.out.print("Tên sảp phẩm: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Mô tả: ");
        this.detail = new Scanner(System.in).nextLine();
        inputQuantity();
        inputPrice();
        System.out.print("Đơn vị tính: ");
        this.unit = new Scanner(System.in).nextLine();
    }

    private void inputPrice() {
        System.out.print("Giá: ");
        double n;
        do {
            n = new Scanner(System.in).nextDouble();
            if (n>0){
                break;
            }
            System.out.print("Không hợp lệ, nhập lại: ");
        }while (true);
        this.price = n;
    }

    public void inputQuantity() {
        System.out.print("Số lượng: ");
        int n;
        do {
            n = new Scanner(System.in).nextInt();
            if (n>0){
                break;
            }
            System.out.print("Không hợp lệ, nhập lại: ");
        }while (true);
        this.quantity = n;
    }
}
