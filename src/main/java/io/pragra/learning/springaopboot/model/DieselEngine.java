package io.pragra.learning.springaopboot.model;

public class DieselEngine implements IEngine{
    @Override
    public String getEngineType() {
        return "DieselEngine";
    }
}
