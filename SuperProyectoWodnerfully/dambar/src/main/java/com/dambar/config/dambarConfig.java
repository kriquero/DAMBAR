package com.dambar.config;




        import io.swagger.v3.oas.models.Components;
        import io.swagger.v3.oas.models.OpenAPI;
        import io.swagger.v3.oas.models.info.Contact;
        import io.swagger.v3.oas.models.info.Info;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

@Configuration
public class dambarConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("MyShop API")
                        .description("Ejemplo de API REST")
                        .contact(new Contact()
                                .name("IMZ")
                                .email("imz@iesmarcoszaragoza.es")
                                .url("www.imz.es"))
                        .version("1.0"));
    }
}