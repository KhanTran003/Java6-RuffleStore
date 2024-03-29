package poly.rufflestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import poly.rufflestore.entity.Role;

public interface RoleDAO extends JpaRepository<Role, String> {
}
