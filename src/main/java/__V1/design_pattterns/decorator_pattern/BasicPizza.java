package __V1.design_pattterns.decorator_pattern;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class BasicPizza implements Pizza{
    @Override
    public String getDescription() {
        return "basic pizza";
    }

    @Override
    public Double getPrice() {
        return 1.00;
    }
}
