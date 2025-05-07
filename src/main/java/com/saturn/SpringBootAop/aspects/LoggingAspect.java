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

//    @Before("execution(* com.saturn.SpringBootAop.services.impl.ShipmentServiceImpl.*(..))")
//    public void beforeShipmentServiceMethod(JoinPoint joinPoint){
//        log.info("Before method call: {}", joinPoint.getSignature());
//    }

    @Before("execution(* com.saturn.SpringBootAop.services.impl.ShipmentServiceImpl.orderPackage(..))")
    public void beforeOrderPackage(){
        log.info("Before orderPackage called from LoggingAspect");
    }

    @Before("within(com.saturn.SpringBootAop.services.impl.*)")
    public void withinServiceImpl(){
        log.info("Within service impl");
    }

    @Before("@annotation(org.springframework.transaction.annotation.Transactional)")
    public void beforeTranscationAnnotation(){
        log.info("transaction annotated function");
    }

    @Before("@annotation(com.saturn.SpringBootAop.aspects.MyLogging)")
    public void beforeMyLoggingAnnotation(){
        log.info("MyLogging annotated function");
    }
}
