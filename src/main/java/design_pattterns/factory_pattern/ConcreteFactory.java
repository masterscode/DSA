package design_pattterns.factory_pattern;

public class ConcreteFactory extends Factory {
    private ConcreteFactory(){}
    @Override
    public FactoryProduct create(String product){
        return product.equalsIgnoreCase("productone")?
                new FactoryProductOne("made from sub-creator", "the body is found here")
                :new FactoryProductTwo();
    }


    public static void main(String[] args) {
        FactoryProduct factoryProduct = new ConcreteFactory().create("productone");
        System.out.println(factoryProduct.toString());
    }
}
