package exam2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx {
    @Bean(initMethod = "init", destroyMethod = "close")
    @Scope("prototype") // 싱글톤 객체가 아닌 모든 객체가 새로 생성이 됨.
    // 주소비교 false 나옴.
    public Message message(){
        return new Message();
    }
}
