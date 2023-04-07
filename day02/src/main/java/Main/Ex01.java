package Main;

import config.AppCtx;
import config.AppCtx2;
import models.member.JoinService;
import models.member.ListService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
         /** 객체 생성 */                                                                /** 가변 매개변수 */
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class, AppCtx2.class);
                                                                                        /** import 가능. */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        /** 동일한 소스 */
        JoinService joinService = ctx.getBean(JoinService.class);
        //JoinService joinService = ctx.getBean("joinService", JoinService.class);
        /** 동일한 소스 */
        ListService listService = ctx.getBean("listService", ListService.class);

        Member member = new Member();
        member.setUserId("double4087");
        member.setUserPw("123456");
        member.setUserNm("박창영");
        joinService.join(member);

        System.out.println("***** : " + joinService);
        listService.print();

        ctx.close();
    }
}
