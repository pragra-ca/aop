package io.pragra.learning.springaopboot;

import io.pragra.learning.springaopboot.config.AppConfig;
import io.pragra.learning.springaopboot.config.GreetingConfig;
import io.pragra.learning.springaopboot.model.Car;
import io.pragra.learning.springaopboot.model.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Slf4j
public class SpringAopBootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringAopBootApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.springaopboot.config");
        Greeting greeting = context.getBean("greeting", Greeting.class);
        log.info("This the greeting {} class ", greeting);
        log.debug("Car  --> {}  ", context.getBean(Car.class));
    }

}
