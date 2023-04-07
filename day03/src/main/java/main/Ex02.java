package main;

import config_proxy.AppCtx;
import exam02_proxy.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    public static void main(String[] args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class);
        long result = cal.factorial(10);
        System.out.println(result);

        result = cal.factorial(10);
        System.out.println(result);
        result = cal.factorial(10);
        System.out.println(result);
        result = cal.factorial(10);
        System.out.println(result);
        result = cal.factorial(10);
        System.out.println(result);
    }
}
