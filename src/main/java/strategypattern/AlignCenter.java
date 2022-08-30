package strategypattern;

public class AlignCenter implements AlignStrategy{
    @Override
    public void doSomething() {
        System.out.println("Center");
    }
}
