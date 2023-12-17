package com.ensias.scolarite;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
//@EnableSwagger2
public class Tp3Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp3Application.class, args);
	}
//	@Bean
//    public Docket productApi() {
//       return new Docket(DocumentationType.SWAGGER_2).select()
//          .apis(RequestHandlerSelectors.basePackage("com.tutorialspoint.swaggerdemo")).build();
//    }

}
