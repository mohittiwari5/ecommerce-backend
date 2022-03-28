package com.mohit.ecommerce.dto;

import com.mohit.ecommerce.entity.Address;
import com.mohit.ecommerce.entity.Customer;
import com.mohit.ecommerce.entity.Order;
import com.mohit.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
