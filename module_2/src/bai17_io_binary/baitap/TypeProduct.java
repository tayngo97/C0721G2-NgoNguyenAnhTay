package bai17_io_binary.baitap;

import java.io.Serializable;

public class TypeProduct implements Serializable {
    private String id;
    private String name ;

    public TypeProduct(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TypeProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
