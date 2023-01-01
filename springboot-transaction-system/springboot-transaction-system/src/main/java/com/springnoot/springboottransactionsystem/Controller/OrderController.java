package com.springnoot.springboottransactionsystem.Controller;

import com.springnoot.springboottransactionsystem.Dto.OrderRequest;
import com.springnoot.springboottransactionsystem.Dto.OrderResponse;
import com.springnoot.springboottransactionsystem.Service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/order")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody  OrderRequest orderRequest) {
        return  ResponseEntity.ok(orderService.placeOrder_ServiceInterface(orderRequest));
    }
}
