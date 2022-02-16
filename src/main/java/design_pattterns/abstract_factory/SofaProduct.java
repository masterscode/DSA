package design_pattterns.abstract_factory;

public interface SofaProduct {
    int totalLegs();
    int totalSeats();
    default boolean hasLegs(){
        return true;
    }
}
