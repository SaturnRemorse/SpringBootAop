package com.saturn.SpringBootAop.service.impl;

import com.saturn.SpringBootAop.services.impl.ShipmentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShipmentServiceImplTest {

    @Autowired
    private ShipmentServiceImpl shipmentService;

    @Test
    void aopTestOrder(){
        shipmentService.orderPackage(4L);
    }

    @Test
    void aopTestTrack(){
        shipmentService.trackPackage(4L);
    }
}

