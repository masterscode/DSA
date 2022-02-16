package design_pattterns.abstract_factory;

public interface ChairProduct {
    int totalLegs();
    default boolean hasLegs(){
        return true;
    }
}
