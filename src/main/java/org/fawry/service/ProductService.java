package org.fawry.service;

import org.fawry.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(int id);

    void  addProduct(Product product);

    Product updateProduct(int id, Product product);

    void deleteProduct(int id);

    Product getProductByName(String name);

}
