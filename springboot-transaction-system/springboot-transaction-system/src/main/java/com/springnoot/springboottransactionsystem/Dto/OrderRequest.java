package com.springnoot.springboottransactionsystem.Dto;

import com.springnoot.springboottransactionsystem.Entity.Order;
import com.springnoot.springboottransactionsystem.Entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
