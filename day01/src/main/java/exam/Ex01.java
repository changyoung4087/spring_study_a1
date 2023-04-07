package exam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Hello hello = ctx.getBean("hello", Hello.class);
        hello.greet("박창영");

        Hello hello2 = ctx.getBean("hello", Hello.class);
        hello2.greet("김경희");

        System.out.println(hello == hello2); // 싱글톤 패턴으로 관리
        ctx.close();
    }
}
