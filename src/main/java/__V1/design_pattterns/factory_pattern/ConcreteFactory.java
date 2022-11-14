package __V1.design_pattterns.factory_pattern;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteFactory extends Factory {
    private ConcreteFactory(){}
    @Override
    public FactoryProduct create(String product){
        return product.equalsIgnoreCase("productone")?
                new FactoryProductOne("made from sub-creator", "the body is found here")
                :new FactoryProductTwo();
    }
    public FactoryProduct create(){
        return channel.equalsIgnoreCase("productone")?
                new FactoryProductOne("made from sub-creator", "the body is found here")
                :new FactoryProductTwo();
    }


    public static void main(String[] args) {
        FactoryProduct factoryProduct = new ConcreteFactory().create("productone");
        FactoryProduct product = new ConcreteFactory().create();
        log.info(factoryProduct.toString());
    }
}
