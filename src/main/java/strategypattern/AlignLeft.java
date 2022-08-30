package strategypattern;

public class AlignLeft implements AlignStrategy{
    @Override
    public void doSomething() {
        System.out.println("Left");
    }
}
