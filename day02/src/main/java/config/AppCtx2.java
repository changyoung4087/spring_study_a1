package config;

import models.member.MemberDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx2 {
    @Bean
    public MemberDAO memberDao(){
        return new MemberDAO();
    }
}
