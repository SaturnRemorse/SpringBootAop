package com.saturn.SpringBootAop.services;

public interface ShipmentService {

    String orderPackage(Long orderId);
    String trackPackage(Long orderId);
}
