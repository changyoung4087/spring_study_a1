package main;

import config.AppCtx;
import lombok.extern.java.Log;
import models.member.Member;
import models.member.MemberDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@Log
public class Ex01 {
    public static void main(String[] args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        MemberDAO memberDao = ctx.getBean(MemberDAO.class);
        Member member = new Member();
        member.setUserId("double40877");
        member.setUserPw("123456");
        member.setUserNm("박창영2");
        long userNo = memberDao.insert(member);
//        boolean result = memberDao.insert(member);
        System.out.println("추가 성공 : " + userNo);

//        boolean result = memberDao.delete("double40877");
//        System.out.println("삭제 성공 : " + result);

//        List<Member> members = memberDao.gets();
//        members.stream().forEach(System.out::println);

//        Member member = memberDao.get("double408777");
//        if(member != null){
//            log.info(member.toString());
//        }

//        long total = memberDao.getTotal();
//        log.info("총 회원 수 : " + total);

        ctx.close();
    }
}
