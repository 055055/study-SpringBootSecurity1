package com.example.springsecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {

    //컨트롤러에 특별한 로직 없이, 그냥 매핑해줘서 화면으로 이어지는 거면 이렇게 해줘도 된다.
    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello").setViewName("hello");
    }*/

}
