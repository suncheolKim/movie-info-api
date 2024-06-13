package kr.sparta.movieinfo.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
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
        return new OpenAPI()
                .info(new Info()
                        .title("MovieInfoAPI")
                        .version("v0.0.1")
                        .description("Movie Info API"))
                .externalDocs(new ExternalDocumentation()
                        .description("Movie Info API Documentation"));
    }
}
