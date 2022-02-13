package design_pattterns.factory_pattern;

public class SubFactoryCreator extends FactoryCreator{
    @Override
    public FactoryProduct create(){
        return new FactoryProductOne("made from sub-creator", "the body is found here");
    }
}
