package poly.rufflestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import poly.rufflestore.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long> {
}
