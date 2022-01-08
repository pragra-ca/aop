package io.pragra.learning.springaopboot.config;

import io.pragra.learning.springaopboot.model.Greeting;
import io.pragra.learning.springaopboot.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@Configuration

//@PropertySource({"classpath:application.properties","classpath:pragra.properties"})
@PropertySources({
        @PropertySource(value = "classpath:application.properties"),
        @PropertySource(value = "classpath:pragra.properties")
        }
)
public class GreetingConfig {
    @Value("${app.name}")
    private String appName;

    @Bean
    public Greeting greeting(@Value("${greeting}") String greet){
        Greeting greeting = new Greeting();
        System.out.println(appName);
        greeting.setGreeting(greet);
        return greeting;
    }

    @Bean(initMethod = "initStudent", destroyMethod = "destroy")
    @Scope("prototype")
    public Student student(@Value("${student.name:DummyStudent}") String name){
        return new Student(name);
    }

}
