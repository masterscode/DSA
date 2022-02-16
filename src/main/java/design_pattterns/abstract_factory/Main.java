package design_pattterns.abstract_factory;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ChairProduct chairProduct = ItalianFurnitureFactory.getInstance().createChair();
        log.info(chairProduct.toString());
    }
}
