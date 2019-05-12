package com.kunyao.spring;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Startup {

    public static void main(String[] args){
        new SpringApplicationBuilder().web(WebApplicationType.SERVLET).run(args);
    }
}
