package com.codewithhalan.stores;

public class OrderService {

    public void placeOrder(){
        var paymentService = new StripePaymentService();
        paymentService.processPayment( 10);

    }
}
