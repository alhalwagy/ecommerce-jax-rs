package org.fawry.rest;

import jakarta.ejb.Singleton;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.fawry.model.Product;
import org.fawry.service.ProductService;

import java.util.List;

@Path("products")
@Singleton
public class ProductConreoller {

    @Inject
    ProductService productService;

    @GET
    @Path("")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    @POST
    @Path("")
    @Produces({MediaType.APPLICATION_JSON})
    public String createProduct(@Valid Product product) {
        productService.addProduct(product);
        return "Product added successfully............";
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Product getProduct(@PathParam("id") int id) {
        return productService.getProductById(id);
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product updateProduct(@PathParam("id") int id, Product product) {

        return productService.updateProduct(id, product);
    }

}
