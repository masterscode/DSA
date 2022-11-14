package __V1.design_pattterns.abstract_factory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ItalianSofa implements SofaProduct{
    @Override
    public int totalLegs() {
        return 4;
    }

    @Override
    public int totalSeats() {
        return 3;
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
