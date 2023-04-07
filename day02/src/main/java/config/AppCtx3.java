package config;

import models.member.MemberDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Configuration
/** 클래스 제외 */
/** @ComponentScan(basePackages = "models.member", excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes={ManualBean.class})) */
/** @ComponentScan(basePackages = "models.member", excludeFilters = @ComponentScan.Filter(type=FilterType.ANNOTATION, classes={MemberDAO.class})) */
/** 클래스 제외 */
@ComponentScan(basePackages = "models.member",
        excludeFilters = {
            @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes = {MemberDAO.class}),
            @ComponentScan.Filter(type=FilterType.ASPECTJ, pattern="models.member.**Service")
            })
// Bean의 이름.. :: 클래스명
public class AppCtx3 {

    @Bean // 서비스에서 지원하는 메서드는 Bean표시를 해주어야 함.
    // Bean 의 이름 ::: dateTimeFormatter
    public DateTimeFormatter dateTimeFormatter(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return formatter;
    }
}
