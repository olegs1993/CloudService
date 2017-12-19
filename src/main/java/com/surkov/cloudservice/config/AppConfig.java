package com.surkov.cloudservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(DbConfig.class)
@ComponentScan(basePackages = "com.surkov.cloudservice")
public class AppConfig {

}
