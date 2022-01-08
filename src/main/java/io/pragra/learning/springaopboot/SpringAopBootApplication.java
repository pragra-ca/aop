package io.pragra.learning.springaopboot;

import io.pragra.learning.springaopboot.config.AppConfig;
import io.pragra.learning.springaopboot.config.GreetingConfig;
import io.pragra.learning.springaopboot.model.Car;
import io.pragra.learning.springaopboot.model.Greeting;
import io.pragra.learning.springaopboot.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
    Bean Life Cycle (init - destroy)
    Bean Scope
 */

@Slf4j
public class SpringAopBootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringAopBootApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.springaopboot.config");
        Greeting greeting = context.getBean("greeting", Greeting.class);
        log.info("This the greeting {} class ", greeting);
        log.debug("Car  --> {}  ", context.getBean(Car.class));
        ((ConfigurableApplicationContext) context).registerShutdownHook();

        Student student  = context.getBean("student", Student.class);
        Student student2  = context.getBean("student", Student.class);
        log.warn("Student Bean-1 {} ", student);
        log.warn("Student Bean-2 {} ", student2);
    }

}
