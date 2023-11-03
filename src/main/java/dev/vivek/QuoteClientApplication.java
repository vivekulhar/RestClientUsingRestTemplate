package dev.vivek;

import dev.vivek.service.QuoteClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuoteClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(QuoteClientApplication.class, args);

    }

}
