package org.fawry.repoistory;

import jakarta.ejb.Singleton;
import org.fawry.excptions.CustomExceptions.ResourceNotFoundException;
import org.fawry.model.Product;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class ProductRepositoryImpl implements ProductRepository {

  List<Product> products = new ArrayList<>();

  @Override
  public Product findProductById(int id) {

    Product product = products.get(id - 1);

    return product;
  }

  @Override
  public List<Product> findAll() {
    return products;
  }

  @Override
  public void add(Product product) {
    int id = products.size()+1;
    product.setId(id);
    products.add(product);
    System.out.println("product added: " + product);
  }

  @Override
  public Product update(int id, Product product) {

    Product oldProduct = findProductById(id);

    oldProduct.setName(product.getName());
    oldProduct.setDescription(product.getDescription());
    oldProduct.setPrice(product.getPrice());
    oldProduct.setQuantity(product.getQuantity());

    return oldProduct;

  }

  public int getProductListSize(){
    return products.size();
  }


}
