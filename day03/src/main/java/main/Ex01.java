package main;

import config_proxy.AppCtx;
import exam02_proxy.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class);
        long result = cal.factorial(10);
        System.out.printf("cal : %d%n", result);

        Calculator cal2 = ctx.getBean(Calculator.class);
        long result2 = cal2.factorial(10);
        System.out.printf("cal2 : %d%n", result);

        ctx.close();
    }
}
