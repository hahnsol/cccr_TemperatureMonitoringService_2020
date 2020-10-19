package com.cccr.armtong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
public class WebConfig {
    
    // @Bean
    // public InternalResourceViewResolver getInternalResourceViewResolver() {
        
    //     // 이게 원래는 static으로 처음 시작되는 데, static은 html만 집어넣을 수 있어서, /WEB-INF/jsp/ (jsp)가 처음으로 되도록 경로 변경!
    //     // InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    //     // resolver.setPrefix("/WEB-INF/jsp/");
    //     // resolver.setSuffix(".jsp");
    //     // resolver.setOrder(1000);
    //     // return resolver;
    // }


    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setCacheable(false);
        templateResolver.setPrefix("/WEB-INF/jsp/");
        templateResolver.setSuffix(".jsp");
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        springTemplateEngine.addTemplateResolver(templateResolver());
        return springTemplateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setOrder(1);
        return viewResolver;
    }


}
