package design_pattterns.factory_pattern;

public class FactoryProductTwo extends FactoryProduct{
    public FactoryProductTwo(){
        this.subject = "Factory Product two subject";
        this.body = "Factory Product two body";
    }
    @Override
    String getSubject() {
        return subject;
    }

    @Override
    String getBody() {
        return body;
    }
}
