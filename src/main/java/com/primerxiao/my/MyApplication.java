package com.primerxiao.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
@EnableWebSecurity
public class MyApplication {


    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
