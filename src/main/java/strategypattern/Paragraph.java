package strategypattern;

public class Paragraph implements Element {

    private String text;

    private AlignStrategy strategy;


    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        if(strategy!=null)
        strategy.doSomething();
        System.out.println("Paragraph: "+text);

    }

    public void setStrategy(AlignStrategy strategy){
        this.strategy=strategy;
    }


}
