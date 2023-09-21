package com.crud.learnjpapostgres.config;

// import io.swagger.v3.oas.models.OpenAPI;
// import io.swagger.v3.oas.models.info.Contact;
// import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableSwagger2
public class BeanConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

//    @Bean
//    public OpenAPI openAPI () {
//        return new OpenAPI().info(new Info()
//                        .title("ekopras.engineer")
//                        .description("Demo for Spring Boot")
//                        .version("1.0.0")
//                        .contact(new Contact()
//                                .name("Ekopras")
//                                .url("https://ekopras.engineer/")
//                                .email("admin@ekopras.engineer")));
//    }


}
