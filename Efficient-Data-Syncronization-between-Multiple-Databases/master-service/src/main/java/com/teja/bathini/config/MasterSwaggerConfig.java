package com.youtube.javapuzzle.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MasterSwaggerConfig {
    @Bean
    public GroupedOpenApi customOpenAPI() {
        return GroupedOpenApi.builder()
                .group("debezium-master-postgresql-api") 
                .packagesToScan("com.teja.bathini.controller") 
                .build();
    }


}
