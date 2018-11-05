package com.cg.student.service.starter.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket apiDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "SpringBootWithSwagger2Docs",
                "First Spring Boot Swagger2 Docs",
                "0.0.1-SNAPSHOT",
                "Cg Term And Services",
                 new Contact("Rahul Singh","http://localhost:8071/SpringWithSwagger/","rahul.ab.singh@capgemini.com"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}
