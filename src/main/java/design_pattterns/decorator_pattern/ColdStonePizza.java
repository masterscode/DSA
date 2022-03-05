package design_pattterns.decorator_pattern;


import lombok.ToString;

@ToString
public class ColdStonePizza extends PizzaDecorator{
    public ColdStonePizza(Pizza p) {
        super(p);
    }

    @Override
    public String getDescription() {
        return "this is coldstone pizza";
    }

    @Override
    public Double getPrice() {
        return 800.0;
    }
}
