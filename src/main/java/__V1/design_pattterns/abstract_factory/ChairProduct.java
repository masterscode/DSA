package __V1.design_pattterns.abstract_factory;

public interface ChairProduct {
    int totalLegs();
    default boolean hasLegs(){
        return true;
    }
}
