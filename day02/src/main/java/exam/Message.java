package exam;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {

    public void send(String msg){
        System.out.printf("전송 메세지 : %s%n", msg);
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterPropertySet!!!");
    }

    @Override
    public void destroy() throws Exception {
        // 자원해제
        System.out.println("Distroy !!");
    }
}
