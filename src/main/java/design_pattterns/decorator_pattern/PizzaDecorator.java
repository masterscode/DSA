package design_pattterns.decorator_pattern;

public abstract class PizzaDecorator implements Pizza {

    Pizza pizza;

    protected PizzaDecorator(Pizza p) {
        this.pizza = p;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public Double getPrice() {
        return pizza.getPrice();
    }
}
