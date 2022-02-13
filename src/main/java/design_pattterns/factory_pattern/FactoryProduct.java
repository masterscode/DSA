package design_pattterns.factory_pattern;

public abstract class FactoryProduct {
    protected String subject;
    protected String body;

    abstract String getSubject();

    abstract String getBody();
}
