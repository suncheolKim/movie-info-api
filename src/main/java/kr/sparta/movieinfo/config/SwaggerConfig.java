package kr.sparta.movieinfo.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    static final String AUTH = "Authorization";

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1")
                .packagesToScan("kr.sparta.movieinfo")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI springOpenApi() {
        // Security Scheme 정의
        SecurityScheme securityScheme = new SecurityScheme()
                .name(AUTH) // 헤더 이름
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT"); // JWT 형식 명시

        // Security Requirement 정의
        SecurityRequirement securityRequirement = new SecurityRequirement()
                .addList(AUTH);

        return new OpenAPI()
                .info(new Info()
                        .title("MovieInfoAPI")
                        .version("v0.0.1")
                        .description("Movie Info API"))
                .externalDocs(new ExternalDocumentation()
                        .description("Movie Info API Documentation"))
                .addSecurityItem(securityRequirement)
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes(AUTH, securityScheme))
                ;
    }
}
