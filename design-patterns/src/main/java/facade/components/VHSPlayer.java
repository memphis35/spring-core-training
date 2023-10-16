package facade.components;

public interface VHSPlayer {

    void turnOn();

    void pushCassette(Cassette cassette);

    void play();

    void stop();

    Cassette rejectCassette();

    void turnOff();
}
