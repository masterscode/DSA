package __V1.design_pattterns.flyweight_pattern;

public interface Vehicle {
    void start();

    void stop();

    Color getColor();

    Engine getEngine();
}
