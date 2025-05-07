package com.saturn.SpringBootAop.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.saturn.SpringBootAop.services.impl.ShipmentServiceImpl.*(..))")
    public void beforeShipmentServiceMethod(JoinPoint joinPoint){
        log.info("Before method call: {}", joinPoint.getSignature());
    }
}
