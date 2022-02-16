package design_pattterns.factory_pattern;

/**
 * @implNote for factory products I think abstract classes are better compared
 * to using an interface
 */
public abstract class Factory {
    private String channel;

    public abstract FactoryProduct create(String product);
}
