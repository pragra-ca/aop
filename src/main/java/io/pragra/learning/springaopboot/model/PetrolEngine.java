package io.pragra.learning.springaopboot.model;

public class PetrolEngine implements IEngine{
    @Override
    public String getEngineType() {
        return "PetrolEngine";
    }
}
