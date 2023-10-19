package ConfigClass;

import parkinglot.Engine;


public class ChevroletCamaro implements parkinglot.Car {
    private String name = "wheelsOfDevil";
    private parkinglot.Engine engine;


    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Car starts...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}
