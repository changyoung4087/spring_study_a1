package config;


import models.member.InfoService;
import models.member.JoinService;
import models.member.ListService;
import models.member.MemberDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.time.format.DateTimeFormatter;

@Configuration @Import(AppCtx2.class)
public class AppCtx {
    /** @Bean :: 스프링이 알 수 있게 해주는 애노테이션 */
    @Bean // @Qualifier("mDao2") // 리턴값이 같을 경우 오류가 날 수 있음으로 리턴하는값이 여기라고 명시해줌.
    public MemberDAO memberDao(){
        return new MemberDAO();
    }

    @Bean
    public JoinService joinService(){
        /** 의존성 주입 */
        /*JoinService joinService = new JoinService();
        joinService.setMemberDao(memberDao());
        return joinService;*/

        /** 의존성 자동주입 :: @Autowired */
        return new JoinService();
    }
    @Bean // 관리 객체라고 알려줌.
    public ListService listService(){
        return new ListService();
    }

//    @Bean
//    public InfoService infoService(){
//        return new InfoService();
//    }
    @Bean
    public DateTimeFormatter dateTimeFormatter(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return formatter;
    }
}
