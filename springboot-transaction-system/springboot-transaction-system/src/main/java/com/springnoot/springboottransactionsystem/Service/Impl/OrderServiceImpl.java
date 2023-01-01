package com.springnoot.springboottransactionsystem.Service.Impl;

import com.springnoot.springboottransactionsystem.Dto.OrderRequest;
import com.springnoot.springboottransactionsystem.Dto.OrderResponse;
import com.springnoot.springboottransactionsystem.Entity.Order;
import com.springnoot.springboottransactionsystem.Entity.Payment;
import com.springnoot.springboottransactionsystem.Exception.PaymentException;
import com.springnoot.springboottransactionsystem.Repository.OrderRepository;
import com.springnoot.springboottransactionsystem.Repository.PaymentRepository;
import com.springnoot.springboottransactionsystem.Service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }


    @Override
    @Transactional
    public OrderResponse placeOrder_ServiceInterface(OrderRequest orderRequest) {

        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        order.setOrderTackingNumber(UUID.randomUUID().toString());
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if (!payment.getType().equals("DEBIT")) {
            throw  new PaymentException("Payment type not supported");
        }

        payment.setId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTrackingNumber(orderResponse.getOrderTrackingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return  orderResponse;

    }
}
