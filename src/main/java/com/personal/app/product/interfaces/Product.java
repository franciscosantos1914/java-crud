package com.personal.app.product.interfaces;

public class Product {

    public String id;
    public String name;
    public Float price;
    public Byte quantity;

    public Product(String id, String name, Float price, Byte quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Float getPrice() {
        return this.price;
    }

    public Byte getQuantity() {
        return this.quantity;
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPrice(Float price) {
        this.price = price;
    }

    private void setQuantity(Byte quantity) {
        this.quantity = quantity;
    }
}
