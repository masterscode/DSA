package design_pattterns.factory_pattern;

public class ProductOne implements ProductInterface {
    private String subject;
    private String body;

    public ProductOne(){
        subject = "Product One subject";
        body =  "Product One body";
    }

    public ProductOne(String subject, String body){
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
