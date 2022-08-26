package proxypattern;

public class Author implements Element {

    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(name);
    }


}
