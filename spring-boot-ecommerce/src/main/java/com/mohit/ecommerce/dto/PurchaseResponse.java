package com.mohit.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    //final because @Data only generates constructor for final fields
    private final String orderTrackingNumber;
}
