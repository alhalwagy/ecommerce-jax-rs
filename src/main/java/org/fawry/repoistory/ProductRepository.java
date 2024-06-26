package org.fawry.repoistory;

import org.fawry.model.Product;

import java.util.List;

public interface ProductRepository {

    Product findProductById(int id);

    List<Product> findAll();

    void add(Product product);

    Product update(int id, Product product);

    int getProductListSize();

}
