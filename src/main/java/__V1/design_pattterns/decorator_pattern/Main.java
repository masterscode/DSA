package __V1.design_pattterns.decorator_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        //

        Pizza pizza = new  ColdStonePizza(new BasicPizza());

      log.info(pizza.getDescription());

    }
}
