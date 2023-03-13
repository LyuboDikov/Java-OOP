package Interfaces_And_Abstraction.Lab.SayHelloExtend;

public class Chinese extends BasePerson {
    public Chinese(String name) {
        super(name);
    }
    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
