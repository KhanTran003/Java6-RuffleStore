package poly.rufflestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import poly.rufflestore.entity.Account;


public interface AccountDAO extends JpaRepository<Account, String> {

}
