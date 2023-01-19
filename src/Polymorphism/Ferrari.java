package Polymorphism;

public class Ferrari extends Car{
    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ferrari has started.";
    }

    @Override
    public String accelerate() {
        return "Ferrari is accelerating.";
    }

    @Override
    public String brake() {
        return "Ferrari is braking.";
    }
}
