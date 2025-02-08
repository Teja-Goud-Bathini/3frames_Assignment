package com.youtube.javapuzzle.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SlaveSwaggerConfig {
    @Bean
    public GroupedOpenApi customOpenAPI() {
        return GroupedOpenApi.builder()
                .group("debezium-slave-mysql-api") 
                .packagesToScan("com.teja.bathini.controller") 
                .build();
    }


}
