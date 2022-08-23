import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    private String name;
    private List<Image> imageList;
    private List<Table> tableList;
    private List<Paragraph> paragraphList;

    public SubChapter(String name) {
        this.name = name;
        imageList=new ArrayList<>();
        tableList=new ArrayList<>();
        paragraphList=new ArrayList<>();
    }

    public void createNewParagraph(String paragraph){
        paragraphList.add(new Paragraph(paragraph));
    }

    public void createNewTable(String table){
        tableList.add(new Table(table));
    }

    public void createNewImage(String img){
        imageList.add(new Image(img));
    }

    public void print(){
        for(Paragraph p:paragraphList)
            p.print();
        for(Table t:tableList)
            t.print();
        for(Image i:imageList)
            i.print();
    }
}
