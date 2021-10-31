package service.impl;

import model.Product;
import service.IProductService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
//    private static Map<Integer, Product> productMap;
//
//    static {
//        productMap = new HashMap<>();
//        productMap.put(123, new Product( 123, "Milk", 12000));
//        productMap.put(124, new Product( 124, "Candy", 15000));
//        productMap.put(125, new Product( 125, "Sugar", 17000));
//        productMap.put(126, new Product( 126, "Cake", 19000));
//    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
//        return new ArrayList<>(productMap.values());
        try {
            Statement statement = BaseRepository.connection.createStatement();
          ResultSet resultSet = statement.executeQuery("select id,name,price\n" +
                    "from product;");
          Product product = null;
          while (resultSet.next()){
              product = new Product();
              product.setId(resultSet.getInt("id"));
              product.setName(resultSet.getString("name"));
              product.setPrice(resultSet.getInt("price"));
              productList.add(product);
          }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public void save(Product product) {
//        productMap.put(product.getId(),product);
    }

    @Override
    public Product findByName(String name) {
        List<Product> productList = findAll();
        for (Product product: productList) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }



    public Product findById(int id){
        List<Product> productList = findAll();
        for (Product product: productList) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id,Product product) {
//         productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
//        productMap.remove(id);
    }
}
