package exam2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        // 객체생성
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // 모두 싱글톤 객체
        Message message = ctx.getBean(Message.class);
        message.send("메세지 !! ");
        Message message2 = ctx.getBean(Message.class);
        System.out.println(message == message2);

        ctx.close();
    }
}
