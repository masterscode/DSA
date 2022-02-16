package design_pattterns.factory_pattern;
import lombok.ToString;

@ToString
public class FactoryProductTwo extends FactoryProduct{
    public FactoryProductTwo(){
        this.subject = "Factory Product two subject";
        this.body = "Factory Product two body";
    }
    public FactoryProductTwo(String subject, String body){
        this.subject = subject;
        this.body = body;
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
