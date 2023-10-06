package com.softgun.toolbeltsoftgun.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    public static String API_VERSION = "1.0.0";


    @Bean
    public OpenAPI openAPI() {


        return new OpenAPI().info(new Info().title("Softgun Tool Belt API").description("API para o serviço Tool Belt")

                        .version(API_VERSION).license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation().description("Softgun ToolBelt API Wiki Documentation").url("https://softgun.com/"));
    }

}
