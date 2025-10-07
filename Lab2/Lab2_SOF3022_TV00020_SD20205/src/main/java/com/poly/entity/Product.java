package com.poly.entity;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getter và Setter cho name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter và Setter cho price
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    // Thêm toString() cho tiện debug
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

