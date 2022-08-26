package lab2sp;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    private String name;
   private List<Element> elementList;

    public SubChapter(String name) {
        this.name = name;
       elementList=new ArrayList<>();
    }

    public void createNewParagraph(String paragraph){
        elementList.add(new Paragraph(paragraph));
    }

    public void createNewTable(String table){
        elementList.add(new Table(table));
    }

    public void createNewImage(String img){
        elementList.add(new Image(img));
    }

    public void print(){
        System.out.println(name);
        for(Element el:elementList)
            el.print();
    }
}
