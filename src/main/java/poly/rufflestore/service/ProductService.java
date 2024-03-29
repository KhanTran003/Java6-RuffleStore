package poly.rufflestore.service;

import poly.rufflestore.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
     List<Product> findByCategoryId(String cid);

    List<Product> findAll();

    Product findById(Integer id);
}
