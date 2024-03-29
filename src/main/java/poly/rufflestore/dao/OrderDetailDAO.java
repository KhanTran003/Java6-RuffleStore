package poly.rufflestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import poly.rufflestore.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {
}
