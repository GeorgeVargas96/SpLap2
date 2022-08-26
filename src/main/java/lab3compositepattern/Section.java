package lab3compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{

    protected String title;
    protected List<Element> elementList=new ArrayList<>();

    public Section(String title){
        this.title=title;
    }


    @Override
    public void print() {
        System.out.println(title);

        for(Element el:elementList)
            el.print();

    }


    public void addContent(Element el) {
        elementList.add(el);
    }


    public void remove(Element el) {

        elementList.remove(el);
    }

    public Element get(int index) {

        if(index<0||index>elementList.size())
            return null;
        return elementList.get(index);
    }
}
