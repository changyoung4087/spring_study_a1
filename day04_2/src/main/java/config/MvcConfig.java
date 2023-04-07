package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc // 100여줄?? 의 설정을 다 해줌.
public class MvcConfig implements WebMvcConfigurer {
    /** 설정 Start ***************************************************************************** */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // templet 설정
        registry.jsp("/WEB-INF/view/", ".jsp");
    }
    /** 설정 End ******************************************************************************* */
}
