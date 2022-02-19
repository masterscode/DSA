package design_pattterns.factory_pattern;

/**
 * @implNote for factory products I think abstract classes are better compared
 * to using an interface
 */
public abstract class Factory {
    protected String channel = "productone";

    public abstract FactoryProduct create(String product);
}
