package io.pragra.learning.springaopboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@AllArgsConstructor
@Slf4j
public class Car {
    final String make;
    String model;
    IEngine engine;

    @PostConstruct
    public void init(){
        log.debug("Initialing Car Bean");
    }

    @PreDestroy
    public void destroy(){
        log.debug("Destroying Bean");
    }
}
