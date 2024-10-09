package pe.edu.vallegrande.imagen.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .servers(Arrays.asList(
                        new Server().url("https://sturdy-spoon-qwq97j7ww4phxgpw-8080.app.github.dev/"),
                        new Server().url("http://localhost:8080/")
                ))
                .info(new Info()
                        .title("Generador de Imagenes")
                        .description("Luis Angel Tasayco Quispe")
                        .version("1.0.0")
                );
    }
}
