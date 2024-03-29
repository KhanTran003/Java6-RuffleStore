package poly.rufflestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import poly.rufflestore.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String> {

}
