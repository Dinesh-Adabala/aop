package com.neoteric.aop.crosscutconcent.aspect;

import com.neoteric.aop.crosscutconcent.model.Department;
import com.neoteric.aop.crosscutconcent.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class GeneralInterceptorAspect {
    private ThreadLocal<Long> startTime = new ThreadLocal<>();
   // @Pointcut("execution(* com.neoteric.aop.crosscutconcent.controller.*.*(..))")
   // @Pointcut("within(com.neoteric.aop.crosscutconcent.service.*)")
    //@Pointcut("this(com.neoteric.aop.crosscutconcent.service.DepartmentService)")
    @Pointcut("@annotation(com.neoteric.aop.crosscutconcent.annotation.AdsAnnotation)")
    public void loggingPointCut(){

    }

    /*@Before("loggingPointCut()")
    public void before( JoinPoint joinPoint ){
        startTime.set(System.currentTimeMillis());
        log.info("Before method invoked::"+joinPoint.getSignature());
    }
    @After("loggingPointCut()")
    public void after( JoinPoint joinPoint ){
        long executionTime = System.currentTimeMillis() - startTime.get();
        log.info("After method invoked::"+joinPoint.getSignature() + "excuted in : "+executionTime);
        startTime.remove();
    }*/

   /* @AfterReturning(value = "execution(* com.neoteric.aop.crosscutconcent.controller.*.*(..))",
            returning = "employee")
    public void after( JoinPoint joinPoint, Employee employee ){
        log.info("After method invoked::"+employee);
    }

    @AfterThrowing(value = "execution(* com.neoteric.aop.crosscutconcent.controller.*.*(..))",
            throwing = "e")
    public void after( JoinPoint joinPoint, Exception e ){
        log.info("After method invoked::"+e.getMessage());
    }*/


    @Around("loggingPointCut()")
    public Object around( ProceedingJoinPoint joinPoint ) throws Throwable {
        log.info("Before method invoked::"+joinPoint.getArgs()[0]);
        Object object = joinPoint.proceed();

        if(object instanceof Employee){
            log.info("After method invoked..."+joinPoint.getArgs()[0]);
        }else if(object instanceof Department){
            log.info("After method invoked..."+joinPoint.getArgs()[0]);
        }

        return object;
    }
}
