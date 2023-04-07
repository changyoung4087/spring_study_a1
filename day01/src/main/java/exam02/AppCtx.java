package exam02;

import models_member.JoinService;
import models_member.MemberDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean
    public MemberDAO memberDao() {
        return new MemberDAO();
    }
    @Bean
    public JoinService joinService(){
        JoinService joinservice = new JoinService(memberDao());
        return joinService();
    }
}
