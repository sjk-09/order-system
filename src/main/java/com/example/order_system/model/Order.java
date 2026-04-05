package com.example.order_system.model;

public class Order {
    private String productName;
    private int quantity;
    private double price;
    private int total;

    // 생성자
    public Order() {}

    public Order(String productName, int quantity, double price, int total) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    // getter / setter
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }
}
