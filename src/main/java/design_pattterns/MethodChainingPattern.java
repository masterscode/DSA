package design_pattterns;


public class MethodChainingPattern {
    private String chainingName;
    private String prop;

    public MethodChainingPattern setChainingName(String name){
        this.chainingName = name;
        return this;
    }

    public MethodChainingPattern setProp(String prop){
        this.prop = prop;
        return this;
    }

    public String getChainingName(){
        return this.chainingName;
    }

    public String getProp(){
        return this.prop;
    }


    public static void main(String[] args) {
        var methodChain = new MethodChainingPattern().setChainingName("name of ").getChainingName();
        System.out.println(methodChain);
    }
}
