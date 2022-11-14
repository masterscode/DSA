package __V1.design_pattterns.abstract_factory;

public class ItalianFurnitureFactory extends FunitureFactory{
    private static ItalianFurnitureFactory instance;

    private ItalianFurnitureFactory(){}

    @Override
    public ChairProduct createChair() {
        return new ItalianChair();
    }

    @Override
    public SofaProduct createSofa() {
        return new ItalianSofa();
    }

    public static ItalianFurnitureFactory getInstance(){
         instance = instance == null ? new ItalianFurnitureFactory() : instance;
         return instance;
    }
}
