package mwsu.springframework.service;

import mwsu.springframework.domain.Product;

import java.util.List;

/**
 * Created by bingyang.wei on 5/24/2017.
 */
public interface ProductService {
    Product getProduct(Integer id);
    List<Product> listProducts();
}
