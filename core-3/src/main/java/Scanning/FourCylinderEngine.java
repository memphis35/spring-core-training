package Scanning;

import org.springframework.stereotype.Component;

@Component
public class FourCylinderEngine implements Engine {
    private final String name = "oldSchoolStuff";

    @Override
    public void start() {
        System.out.println("Engine: " + name + " starts...");
    }
    public String getName() {
        return name;
    }
}
