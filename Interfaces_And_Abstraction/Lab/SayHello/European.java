package Interfaces_And_Abstraction.Lab.SayHello;

public class European implements Person {
    private String name;

    public European(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String sayHello() {
        return "Hello";
    }
}