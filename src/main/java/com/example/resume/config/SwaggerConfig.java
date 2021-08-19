package com.example.resume.config;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private final String apiVersion;
    private final String apiTitle;

    public SwaggerConfig(@Value("${api.version}") String apiVersion,
                         @Value("${api.title}") String apiTitle) {
        this.apiTitle = apiTitle;
        this.apiVersion = apiVersion;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(this.apiTitle)
                .version(this.apiVersion)
                .build();
    }

    @Bean
    public Docket api() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .tags(
                        new Tag("education", "Контроллер, отвечающий за образование")
                )
                .select().paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.example.resume.controllers"))
                .build();

        return docket;
    }

}
