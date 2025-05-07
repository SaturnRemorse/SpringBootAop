package com.saturn.SpringBootAop.services.impl;

import com.saturn.SpringBootAop.services.ShipmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Override
    public String orderPackage(Long orderId) {
        //log.info("order Package is called...");

        try{
            log.info("Processing order...");
            Thread.sleep(1000);

        }catch (InterruptedException e){
            log.info("Error occured while processing order",e);
        }
        return "order has been processed successfully orderId "+orderId;
    }

    @Override
    public String trackPackage(Long orderId) {
        //log.info("track Package called");

        try{
            log.info("Tracking order");
            Thread.sleep(500);
            throw new RuntimeException("Exception occured at runtime");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
