package strategypattern;

public class Book extends Section {

    private String bookTitle;



    public Book(String title) {

        super(title);
    }




    public void addAuthor(Author a){
        elementList.add(a);
    }
}
