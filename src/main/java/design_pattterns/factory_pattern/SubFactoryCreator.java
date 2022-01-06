package design_pattterns.factory_pattern;

public class SubFactoryCreator extends FactoryCreator{
    @Override
    public   ProductInterface create(){
        return new ProductOne("made from sub-creator", "the body is found here");
    }
}
