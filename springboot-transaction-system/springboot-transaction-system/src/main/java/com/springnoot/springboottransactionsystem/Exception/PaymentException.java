package com.springnoot.springboottransactionsystem.Exception;

import com.springnoot.springboottransactionsystem.Entity.Payment;

public class PaymentException extends  RuntimeException{
    public PaymentException (String message) {
        super(message);
    }
}
