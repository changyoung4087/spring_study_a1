package exam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        // 객체생성
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // 스프링 컨테이너에서 객체가 있는지 조회
        Message message = ctx.getBean(Message.class);
        message.send("메시지");

        // 객체 소멸 Distroy 메서드 실행시점.
        ctx.close();
    }
}
