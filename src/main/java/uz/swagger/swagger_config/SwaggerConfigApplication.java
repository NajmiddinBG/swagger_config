package uz.swagger.swagger_config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import uz.swagger.swagger_config.property.OpenApiProperties;
import uz.swagger.swagger_config.property.ServerProperties;


@SpringBootApplication
@OpenAPIDefinition
@EnableConfigurationProperties(
        {OpenApiProperties.class, ServerProperties.class}
)
@EnableScheduling
public class SwaggerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerConfigApplication.class, args);
    }

}
