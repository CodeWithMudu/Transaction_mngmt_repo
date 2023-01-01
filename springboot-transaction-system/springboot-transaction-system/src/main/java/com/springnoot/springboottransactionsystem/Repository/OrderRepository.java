package com.springnoot.springboottransactionsystem.Repository;

import com.springnoot.springboottransactionsystem.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
