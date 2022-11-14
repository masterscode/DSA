package __V1.design_pattterns.flyweight_pattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Car implements Vehicle{
    private Color color;
    private Engine engine;

    @Override
    public void start() {
        System.out.println("vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("vehicle stopped");
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Engine getEngine() {
        return this.engine;
    }
}
