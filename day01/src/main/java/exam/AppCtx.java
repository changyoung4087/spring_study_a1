package exam;

import org.springframework.context.annotation.Configuration;

@Configuration // 객체관리 설정
public class AppCtx {
    public Hello hello() {
        Hello hello = new Hello();
        return hello;
    }
}
