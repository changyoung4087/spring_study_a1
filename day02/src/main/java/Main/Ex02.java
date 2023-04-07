package Main;

import config.AppCtx;
import config.AppCtx3;
import models.member.InfoService;
import models.member.JoinService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx3.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        Member member = new Member();
        member.setUserId("double4087");
        member.setUserPw("123456");
        member.setUserNm("박창영");
        joinService.join(member);

        infoService.print(member.getUserId());

        ctx.close();
    }
}
