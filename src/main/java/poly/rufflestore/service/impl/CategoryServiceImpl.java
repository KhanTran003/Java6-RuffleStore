package poly.rufflestore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.rufflestore.dao.CategoryDAO;
import poly.rufflestore.entity.Category;
import poly.rufflestore.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDAO cDAO;

    @Override
    public List<Category>findAll(){
        return cDAO.findAll();
    }

}
