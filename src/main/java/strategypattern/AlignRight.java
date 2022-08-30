package strategypattern;

public class AlignRight implements AlignStrategy{

    @Override
    public void doSomething() {
        System.out.println("Right");
    }
}
