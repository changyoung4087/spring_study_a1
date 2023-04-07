package config_proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect // 공통기능을 적용할 클래스에 Aspect를 사용
public class ProxyCalculator2 {

    @Pointcut("execution(* exam02_proxy..*(..))") // 공통기능을 정의할 범위 Pointcut 으로 적용
    public void publicTarget() {  }

    /**
     * 반환값 매개변수 예외처리 꼭 암기
     */
    @Around("publicTarget()") // 공통기능 수행 메서드 Around
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("핵심기능 수행 전");

        Object result = joinPoint.proceed(); // factorial

        System.out.println("핵심기능 수행 후");

        return result;
    }
}
