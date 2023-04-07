package config_proxy;

import exam02_proxy.Calculator;
import exam02_proxy.ImplCalculator;
import exam02_proxy.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
/**내부에서 프록시가 만들어지고 안보이는 코드 이~~ 만큼 생성*/
@EnableAspectJAutoProxy // 인터페이스 기반 프록시
//@EnableAspectJAutoProxy(proxyTargetClass=true) // 클래스기반 프록세
public class AppCtx {
//      오류확인
//    public Calculator calculator(){
//        return new RecCalculator();
//    }

//    @Bean
//    public ImplCalculator calculator() {
//        return new ImplCalculator();
//    }
//    @Bean
//    public RecCalculator calculator2() {
//        return new RecCalculator();
//    }
    @Bean
    public CachedProxy cachedProxy(){
        return new CachedProxy();
    }
    @Bean
    public ProxyCalculator2 proxyCalculator2() {
        return new ProxyCalculator2();
    }

    @Bean
    public CommonPointcut commonPointcut(){
        return new CommonPointcut();
    }
}