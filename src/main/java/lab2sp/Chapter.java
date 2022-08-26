package lab2sp;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    private int subchapterIndex=-1;

    public Chapter(String name) {
        subChapters=new ArrayList<>();
        this.name = name;
    }

    public void print(){
        for(SubChapter e:subChapters)
            e.print();
    }

    public int createSubChapter(String name){
        subChapters.add(new SubChapter(name));
        subchapterIndex++;
        return subchapterIndex;
    }
    public SubChapter getSubChapter(int index){
        return subChapters.get(index);
    }
}
