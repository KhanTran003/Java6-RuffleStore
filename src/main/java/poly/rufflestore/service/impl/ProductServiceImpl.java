package poly.rufflestore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.rufflestore.dao.ProductDAO;
import poly.rufflestore.entity.Product;
import poly.rufflestore.service.ProductService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDAO pDAO;

    @Override
    public List<Product> findAll() {

        return pDAO.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return pDAO.findById(id).get();
    }

    @Override
    public List<Product> findByCategoryId(String cid) {
        return pDAO.findByCategoryId(cid);
    }
}
