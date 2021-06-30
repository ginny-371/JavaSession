package JavaBasic;

public class Product {
    int productID;
    String productName;
    int quantity;
    double price;

    public Product(int productID, String productName, int quantity, double price){
        this.productID = productID;
        this.productName =productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "JavaBasic.Product { " +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
