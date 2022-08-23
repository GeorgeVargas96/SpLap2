import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private Author author;
    private List<Chapter> chapterList;

    private int chapterIndex=-1;


    public Book(String title){
        this.title = title;
        this.chapterList=new ArrayList<>();
    }

    public void print(){
        for(Chapter e:chapterList){
            e.print();
        }
    }

    public void addAuthor(Author author){
        this.author=author;
    }

    public int createChapter(String chapterName){
        chapterList.add(new Chapter(chapterName));
        chapterIndex++;
        return chapterIndex;
    }

    public Chapter getChapter(int index){
        return chapterList.get(index);
    }

}
