package scanning.parkinglot;

import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component(value="Bumblebee")
public class VolkswagenBeetle implements Car {
    private Engine engine;

    public VolkswagenBeetle(Engine engine){
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car starts...");
    }


}
