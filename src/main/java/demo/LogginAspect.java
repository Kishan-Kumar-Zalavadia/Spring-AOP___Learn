package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
    //Point cuts Ex: Before, After, AfterReturing, etc
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
//        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument: "+arg);
    }

    //* means any
    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){
    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("After Returning: "+retVal);
    }

    @AfterReturning(value = "execution(* *.*.quantity(..))", returning = "retVal")
    public void afterReturning2(int retVal){
        System.out.println("After Returning-2: "+retVal);
    }
}
