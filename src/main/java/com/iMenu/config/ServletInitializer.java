package com.iMenu.config;

import com.iMenu.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by sabaa on 12/14/15.
 */
public class ServletInitializer extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder application){
        return application.sources(Application.class);
    }
}
