package design_pattterns.factory_pattern;

public abstract class FactoryCreator {
    public static void main(String[] args) {
        ProductInterface product = new SubFactoryCreator().create();
    }

    public abstract ProductInterface create();
}
