package design_pattterns.abstract_factory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ItalianChair implements ChairProduct{
    @Override
    public int totalLegs() {
        return 2;
    }

    @Override
    public boolean hasLegs() {
        return ChairProduct.super.hasLegs();
    }
}
