package io.pragra.learning.springaopboot.config;

import io.pragra.learning.springaopboot.model.Car;
import io.pragra.learning.springaopboot.model.DieselEngine;
import io.pragra.learning.springaopboot.model.PetrolEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@PropertySource("classpath:pragra.properties")
@Configuration
public class AppConfig {

    @Value("${make}")
    private String make;

    @Value("${model}")
    private String model;

    @Bean
    public DieselEngine dieselEngine(){
        return new DieselEngine();
    }

    @Bean
    public PetrolEngine petrolEngine(){
        return new PetrolEngine();
    }

    @Bean
    public Car car(){
        return new Car(make,model, petrolEngine());
    }
}
