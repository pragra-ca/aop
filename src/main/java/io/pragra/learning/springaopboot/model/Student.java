package io.pragra.learning.springaopboot.model;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void initStudent(){
        System.out.println("***********************************");
        System.out.println("            INIT STUDENT           ");
        System.out.println("***********************************");
    }

    public void destroy(){
        System.out.println("***********************************");
        System.out.println("           DESTROY STUDENT         ");
        System.out.println("***********************************");
    }
}
