package org.ecommerce.frontendservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"META-INF/rr/**/*.xml"})
public class FrontendServiceApp {
    public static void main(String[] args)
    {
      SpringApplication.run(FrontendServiceApp.class, args);
    }
}