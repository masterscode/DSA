package design_pattterns.factory_pattern;

public class FactoryProductOne extends FactoryProduct {


    public FactoryProductOne(){
        this.subject = "Product One subject";
        this.body =  "Product One body";
    }

    public FactoryProductOne(String subject, String body){
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getBody() {
        return body;
    }
}
