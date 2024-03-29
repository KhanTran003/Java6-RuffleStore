package poly.rufflestore.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import poly.rufflestore.entity.Authority;


public interface AuthorityDAO extends JpaRepository<Authority, Integer> {
}
