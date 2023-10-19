package ConfigClass;

import org.springframework.stereotype.Component;

@Component
public class V12Engine implements parkinglot.Engine {
    private String name = "powerOverwhelmingStuff";


    public void start() {
        System.out.println("Engine starts...");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
