package com.springnoot.springboottransactionsystem.Repository;

import com.springnoot.springboottransactionsystem.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

}
