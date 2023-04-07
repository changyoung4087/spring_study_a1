package exam03.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        TestDao dao = ctx.getBean(TestDao.class);
        dao.insert();

        ctx.close();
    }
}
