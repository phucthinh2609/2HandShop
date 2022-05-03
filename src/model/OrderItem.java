package model;

public class OrderItem {
    private long id;
    private double price;
    private int quantity;
//    private long orderId;
    private int clothId;
    private String clothName;
    private double total;

    public OrderItem(){
    }

    public OrderItem(long id, double price, int quantity, int clothId, String clothName, double total){
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.clothId = clothId;
        this.clothName = clothName;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getClothId() {
        return clothId;
    }

    public void setClothId(int clothId) {
        this.clothId = clothId;
    }

    public String getClothName() {
        return clothName;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", clothId=" + clothId +
                ", clothName='" + clothName + '\'' +
                ", total=" + total +
                '}';
    }
}
