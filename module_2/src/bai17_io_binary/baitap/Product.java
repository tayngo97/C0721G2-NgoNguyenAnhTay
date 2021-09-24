package bai17_io_binary.baitap;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String branch;
    private int price;
    private TypeProduct typeProduct;

    public Product(int id, String name, String branch, int price) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.price = price;
    }

    public Product(int id, String name, String branch, int price, TypeProduct typeProduct) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.price = price;
        this.typeProduct = typeProduct;
    }

    public int getId() {
        return id;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", price=" + price +
                ", typeProduct=" + typeProduct +
                '}';
    }
}
