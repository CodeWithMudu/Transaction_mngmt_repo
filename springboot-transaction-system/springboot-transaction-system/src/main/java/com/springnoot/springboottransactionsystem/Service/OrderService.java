package com.springnoot.springboottransactionsystem.Service;

import com.springnoot.springboottransactionsystem.Dto.OrderRequest;
import com.springnoot.springboottransactionsystem.Dto.OrderResponse;

public interface OrderService {

    OrderResponse placeOrder_ServiceInterface(OrderRequest orderRequest);

}
