package config_proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Order(1)
@Aspect // 공통 기능을 적용할 클래스
public class CachedProxy {

    private Map<Long, Object> cacheData = new HashMap<>();

    @Around("config_proxy.CommonPointcut.cachedTarget()")
    //@Around("execution(* exam02_proxy..*(long))") // 사용가능
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs(); // 배열
        Long num = (Long)args[0];
        if(cacheData.containsKey(num)){ // 기본 데이터가 있으면 캐시 데이터 사용
            System.out.printf("[%d] 캐시 사용%n", num);
            return cacheData.get(num);
        }

        Object result = joinPoint.proceed(); // 다음 프록시가 있으면 프록시 수행 없으면 종료.

        // 없으면 캐시에 기록
        cacheData.put(num, result);
        System.out.printf("[%d] 캐시 추가%n", num);

        return result;
    }
}
