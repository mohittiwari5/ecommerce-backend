package com.mohit.ecommerce.service;

import com.mohit.ecommerce.dto.Purchase;
import com.mohit.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    public PurchaseResponse placeOrder(Purchase purchase);
}
