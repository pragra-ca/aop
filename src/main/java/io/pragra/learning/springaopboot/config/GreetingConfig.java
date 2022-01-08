package io.pragra.learning.springaopboot.config;

import io.pragra.learning.springaopboot.model.Greeting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:pragra.properties")
public class GreetingConfig {
    @Bean
    public Greeting greeting(@Value("${greeting}") String greet){
        Greeting greeting = new Greeting();
        greeting.setGreeting(greet);
        return greeting;
    }

}
